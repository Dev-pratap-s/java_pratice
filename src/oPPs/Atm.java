package oPPs;

public class Atm {
    private String accountholdername;
    private int balance;

    Atm(String name, int pesa){
        this.accountholdername = name;
        this.balance= pesa;


    }

    void showbalance(){
        System.out.println("yuor current balance "+ balance);
    }

}
