package com.cfs.Weather_App.service;

import com.cfs.Weather_App.Dto.Root;
import com.cfs.Weather_App.Dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apikey;

    @Value("${weather.api.url}")
    private String apiUrl;


    private RestTemplate template= new RestTemplate();

    public String test(){
        return "good";
    }
    public WeatherResponse getData(String city){
        String url = apiUrl + "?Key="+apikey+"&q="+city;
          Root response = template.getForObject(url,Root.class);
        WeatherResponse weatherResponse = new WeatherResponse();


        // ✅ Correctly set kar rahe hain alag-alag fields me
        weatherResponse.setCity(response.getLocation().getName());

       String condition = response.getCurrent().getCondition().getText();
        weatherResponse.setCondition(condition);
        weatherResponse.setTemperature(response.getCurrent().getTemp_f());

        return weatherResponse;
    }
}

