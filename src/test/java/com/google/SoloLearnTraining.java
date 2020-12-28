package com.google;

public class SoloLearnTraining {
    public static void main(String[] args) {
        int age = 6, time =3;
        int child = age + time;

        if (child < 9 && time >=2) {
            System.out.println("Go home!");
        }
        else {
            System.out.println("You can buy VODKA!");
        }

        if(age % 2 == 1) {
            if (age ==3) {
                System.out.println("три");
            }
            else if (age == 5) {
                System.out.println("пять");
            }
            System.out.println("First IF сработал");
        }
        else {
            if (age == 2) {
                System.out.println("два");
            }
            else if (age ==4) {
                System.out.println("четыре");
            }

            System.out.println("Second IF сработал");
        }

        switch (child) {
            case 7:
                System.out.println("7");
                break;
            case 96005:
                System.out.println("96005");
                break;
            case 8787:
                System.out.println("8787");
                break;
            default:
                System.out.println("9");
        }
    }
}
