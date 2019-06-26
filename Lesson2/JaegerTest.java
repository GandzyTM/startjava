public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setArmor(9);
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.850f);
        strikerEureka.setMark("Mark-5");
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setSpeed(10);
        strikerEureka.setStrength(10);
        strikerEureka.setHeatPoints(100);

        System.out.println(strikerEureka.getModelName() + " has next params:\narmor = " + strikerEureka.getArmor()
                + "\nstrength = " + strikerEureka.getStrength()
                + "\nspeed = " + strikerEureka.getSpeed()
                + "\nweight = " + strikerEureka.getWeight()
                + "\nheight = " + strikerEureka.getHeight()
        );
        strikerEureka.shoot();

        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setArmor(10);
        chernoAlpha.setStrength(10);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setHeatPoints(100);

        System.out.println();
    }
}

