package com.driver;
public class Main {
    public static void main(String [] args)
    {
        RWOnly rw= new RWOnly();
        rw.name="Rushikesh";
        System.out.println(rw.name);
        //Error get -> make a name in RWOnly is public or protected or remove a private modifier
    }
}