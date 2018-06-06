package com.lenins.company;

public class Main {

    public static void main(String[] args) {
        int x5=0;

        for(int i=0;i<1000; i++){
            if(i%3==0 || i%5==0){
                x5 += i;
            }
        }
        System.out.println(x5);
        System.out.println();
    }
}
