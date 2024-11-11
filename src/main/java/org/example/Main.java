package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge >= 13 && firstAge <= 19) {
            return true;
        } else if (secondAge >= 13 && secondAge <= 19) {
            return true;
        } else if (thirdAge >= 13 && thirdAge <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {

            return temp >= 25 && temp <= 45;
        } else {

            return temp >= 25 && temp <= 35;
        }
    }
    public static double area(double width, double height) {
        if (width<0 || height<0) {
            System.out.println("width veya height sıfırdan küçük olamaz! Width: " + width + "height: " + height);
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if(radius<0) {
            return -1;
        }
        return Math.PI*Math.pow(radius,2);
    }
}
