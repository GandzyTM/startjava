package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 9, 10, 10, 100);
        System.out.println(strikerEureka.getModelName() + " has next params:\narmor = " + strikerEureka.getArmor()
                + "\nstrength = " + strikerEureka.getStrength()
                + "\nspeed = " + strikerEureka.getSpeed()
                + "\nweight = " + strikerEureka.getWeight()
                + "\nheight = " + strikerEureka.getHeight()
        );
        strikerEureka.shoot();

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 10, 3, 10, 100);
        System.out.println(strikerEureka.getModelName() + " has next params:\narmor = " + chernoAlpha.getArmor()
                + "\nstrength = " + chernoAlpha.getStrength()
                + "\nspeed = " + chernoAlpha.getSpeed()
                + "\nweight = " + chernoAlpha.getWeight()
                + "\nheight = " + chernoAlpha.getHeight()
        );
        chernoAlpha.run();
    }
}

