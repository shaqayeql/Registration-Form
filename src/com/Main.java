package com;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        register.createFrame("Registration Form" ,450 , 500);
        register.createText();
        register.createButton("ثبت نام" , 170 , 350 , 100 , 50);
    }
}
