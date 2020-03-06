package com.harsh.designpattern.structural.proxy;

import java.util.Scanner;

public class TestCommandExecutorProxy {

    public static  void main(String[] args){
        Scanner in=new Scanner(System.in);
        do{
            System.out.print("Enter username:");
            String name=in.nextLine();
            System.out.print("Ener password:");
            String pass=in.nextLine();
            CommandExecutorProxy proxy=new CommandExecutorProxy(name,pass);

            try {
                proxy.runCommand("ipconfig");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("Do you want to continue:");
        }while(in.nextLine().equalsIgnoreCase("Y"));


    }
}
