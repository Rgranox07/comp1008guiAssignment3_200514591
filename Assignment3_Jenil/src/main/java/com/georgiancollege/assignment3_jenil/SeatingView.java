//Jenilkumar Shah
//200514591

package com.georgiancollege.assignment3_jenil;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import java.util.Random;

//Initiating main class
public class SeatingView {

    //Inputs from GUI
    @FXML
    TextField Name;                     //For student Name

    @FXML
    Label ErrorMsg;                     //For Displaying error

    @FXML
    ColorPicker Color;                  //Color Selector

    @FXML
    Rectangle ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9;                        //Inputs for Seat Selector

    @FXML
    Label n1,n2,n3,n4,n5,n6,n7,n8,n9;                                     //Name for the seat allotted

    ArrayList<Object> ColorName = new ArrayList<>();                      //Initiating ArrayList to store the color

    ArrayList<Integer> StudentName = new ArrayList<>();                   //Initiating ArrayList to store the Student Name


    @FXML
    protected void clickingButton(){
        ErrorMsg.setText("SEAT ALLOTTED :)");                             //Default message when the seat in allotted
        if (Name.getText().isEmpty()){
            ErrorMsg.setText("PLEASE INPUT STUDENT'S NAME :/");           //Message print when name is not inputted
        }else{
            seatAvailability();
        }
    }

    private void seatAvailability(){
        Random random = new Random();                                     //Initiating Random to get random number to fill the seat
        int numberRandom = random.nextInt(9);

        if (StudentName.size() < 9){                                     //Condition for Random length
            if (StudentName.contains(numberRandom)){
                seatAvailability();
            }else{
                seatAllot(numberRandom);                                 //Calling method seatAllot
            }
        }else{
            ErrorMsg.setText("ALL THE SEATS ARE FILLED :(");             //Error when all the seats are filled
        }
    }

    //Method for Seat allotment system
    private void seatAllot(int i){
        if (ColorName.contains(Color.getValue())){
            ErrorMsg.setText("SELECTED COLOR IS ALREADY IN USE :/");     //Error when seat is allotted
        }else{
            //Comparing my numberRandom int with the Random number to fill the seat randomly
            if(i==0){
                ps1.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n1.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==1){
                ps2.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n2.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);
            }
            if(i==2){
                ps3.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n3.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==3){
                ps4.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n4.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==4){
                ps5.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n5.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==5){
                ps6.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n6.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==6){
                ps7.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n7.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==7){
                ps8.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n8.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }
            if(i==8){
                ps9.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n9.setText(Name.getText());
                ColorName.add(Color.getValue());
                StudentName.add(i);

            }

        }
    }



}
