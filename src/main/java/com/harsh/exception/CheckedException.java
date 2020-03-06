package com.harsh.exception;

public class CheckedException {

public  static  void main(String[] args){
    CheckedException cex=new CheckedException();
cex.sum();
}

    public  void sum() {
    try {
        int sum = 1000 / 0;

    }catch (ArithmeticException ex){
        System.out.println("Arithmatic exception..");
    }catch (Exception ex){

    }
        System.out.println("Next statment");
    }

}
