package com.example.demo.core.java;

import java.util.regex.Pattern;

public class JavaPrograms {

    public static void main(String[] args) {
        String panNumber=CustomConstant.PAN;
        boolean panMatches=validatePan(panNumber);
        if (panMatches){
            System.out.println(CustomConstant.MSG_PAN_MATCHED);
        }else {
            System.out.println(CustomConstant.MSG_PAN_NOT_MATCHED);
        }
    }

    private static boolean validatePan(String panNumber) {
        return Pattern.compile(CustomConstant.PAN_PATTERN).matcher(panNumber).matches();
    }
}
