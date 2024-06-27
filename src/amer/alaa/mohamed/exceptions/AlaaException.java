package amer.alaa.mohamed.exceptions;

import javax.swing.text.TableView;

/*
* الميزة هنا انك بتروح تباصي الرسالة اللي انت عاوزها لل constructor تبع AlaaException
* */

public class AlaaException extends Exception {
    // You will need to create some constructors
    public AlaaException(){}

    public AlaaException(String message){
        super(message);
    }
    public AlaaException(String message, Throwable reason){
        super(message,reason);
    }


}

