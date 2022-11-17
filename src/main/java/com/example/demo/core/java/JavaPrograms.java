package com.example.demo.core.java;

import java.util.regex.Pattern;

public class JavaPrograms {

    public static void main(String[] args) {
        String panNumber=CustomConstant.PAN;
        boolean panMatches=validatePan(panNumber);
        if (panMatches){
            System.out.println(CustomConstant.MSG_PAN_CORRECT);
        }else {
            System.out.println(CustomConstant.MSG_PAN_NOT_CORRECT);
        }

        //code riddle 1
        /*List<String> strings = Arrays.asList("I", "heckin'", "love", "java");
        List<String> list = new ArrayList<>(strings);
        for (int i = 0; i < list.size(); i++) {
            if (i == 1) {
                list.remove(i);
            }
        }
        System.out.println(list);*/

        //code riddle 2
        /*for (;;) {
            System.out.println("test");
        }*/

        //code riddle 3
        //compile time error
        //System.out.println("\u0022\u0029\u003B\u0077\u0068\u0069\u006C\u0065\u0028\u0074\u0072\u0075\u0065\u0029\u002F\u002F");
                // System.out.println("\u004D\u0061\u0067\u0069\u0063\u0021");

        //code riddle 4
        //will compile, but prints noting
        /*if (1 == 2) {
            System.out.println("1 is 2");
        }*/

        //will this program execute successfully
        //ClassCastException
/*
        Car car=new Car();
        car.setColour("White");
        car.setMilage(10);
        car.setTyres(4);
        car.setSeats(4);
        Vehicle cloneable = new Vehicle(car);
        Car cloneVehicle = (Car) cloneable.clone();
        System.out.println(cloneVehicle.toString());
*/

       /* String s1 = "foobar";
        String s2 = "foobar";
        System.out.println(s1 == s2);      // true
        s2 = new String("foobar");
        System.out.println(s1 == s2);      // false
        System.out.println(s1.equals(s2)); // true*/

    }

    private static boolean validatePan(String panNumber) {
        return Pattern.compile(CustomConstant.PAN_PATTERN).matcher(panNumber).matches();
    }
}
