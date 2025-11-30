package com.cfs.BookAPI.controller;

import com.cfs.BookAPI.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private Map<Long, Book> database= new HashMap<>();

    @GetMapping
    public ResponseEntity<List<Book>> getALllBooks(){
        return ResponseEntity.ok(new ArrayList<>(database.values()));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book newbook){
        database.put(newbook.getId(),newbook);
        return ResponseEntity.status(HttpStatus.CREATED).body(newbook);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookbyId(@PathVariable Long id){
        Book uniqiBook = database.get(id);
        if(uniqiBook==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(uniqiBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id,@RequestBody Book newbook ){
        Book existing= database.get(id);
        if(existing==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        database.put(id,newbook);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Book> updatePrice(@PathVariable Long id,@RequestBody double newprice ){
        Book existing= database.get(id);
        if(existing==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        existing.setPrice(newprice);
        database.put(id,existing);
        return ResponseEntity.ok(existing);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Book> updatePrice(@PathVariable Long id){
        Book existing= database.remove(id);
        if(existing==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.noContent().build();

    }
}
