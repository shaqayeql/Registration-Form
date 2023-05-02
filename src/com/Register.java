package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register implements ActionListener {

    String fullName;
    String firstAddress;
    String secondAddress;
    int age;
    double height;
    double weight;

    JFrame frame;
    JTextField text1 , text2 , text3 , text4 , text5 , text6;


    public void createFrame(String title , int width , int height){
        frame = new JFrame();
        frame.setSize(width , height);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.gray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle(title);

    }

    public void createText(){
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text1.setBounds(70 , 50 , 300 , 30);
        text2.setBounds(70 , 100 , 300 , 30);
        text3.setBounds(70 , 150 , 300 , 30);
        text4.setBounds(70 , 200 , 300 , 30);
        text5.setBounds(70 , 250 , 300 , 30);
        text6.setBounds(70 , 300 , 300 , 30);
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);
        frame.add(text6);
    }

    public void createButton(String name , int x , int y , int weight , int height){
        JButton button = new JButton();
        button.setName(name);
        button.setText(name);
        button.setBounds(x , y , weight , height);
        button.addActionListener(this);
        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        fullName = text1.getText();
        firstAddress = text2.getText();
        secondAddress = text3.getText();

        try {
            Integer.parseInt(text4.getText());
            age = Integer.parseInt(text4.getText());
        } catch(NumberFormatException n){
            System.out.println("You should enter NUMBER for age!!!");
        }
        try {
            Double.parseDouble(text5.getText());
            height = Double.parseDouble(text5.getText());
        } catch(NumberFormatException n){
            System.out.println("You should enter NUMBER for height!!!");
        }
        try {
            Double.parseDouble(text6.getText());
            weight = Double.parseDouble(text6.getText());
        } catch(NumberFormatException n){
            System.out.println("You should enter NUMBER for weight!!!");
        }

        int flag=0;

        if(button.getName() == "ثبت نام"){
            if(fullName.length() < 3) {
                System.out.println("Name should be more than 3 letters!!!");
                flag = 1;
            }
            if(firstAddress.equals(secondAddress)) {
                System.out.println("Address1 and Address2 shouldn't be same!!!");
                flag = 1;
            }
            if(age < 18) {
                System.out.println("Age shouldn't be less than 18!!!");
                flag = 1;
            }
            if(height < 100) {
                System.out.println("Height shouldn't be less than 100!!!");
                flag = 1;
            }
            if(weight < 40) {
                System.out.println("Weight shouldn't be less than 40!!!");
                flag = 1;
            }
            if(flag == 0){
                System.out.println("FullName: " + fullName);
                System.out.println("FirstAddress: " + firstAddress);
                System.out.println("SecondAddress: " + secondAddress);
                System.out.println("Age: " + age);
                System.out.println("Height: " + height);
                System.out.println("Weight: " + weight + "\n");
            }
        }
    }
}
