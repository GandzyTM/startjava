public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setArmor(9);
        jaeger1.setHeight(76.2f);
        jaeger1.setWeight(1.850f);
        jaeger1.setMark("Mark-5");
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setOrigin("Australia");
        jaeger1.setSpeed(10);
        jaeger1.setStrength(10);
        jaeger1.setHeatPoints(100);

        jaeger2.setArmor(10);
        jaeger2.setStrength(10);
        jaeger2.setSpeed(3);
        jaeger2.setOrigin("Russia");
        jaeger2.setModelName("Cherno Alpha");
        jaeger2.setMark("Mark-1");
        jaeger2.setWeight(2.412f);
        jaeger2.setHeight(85.34f);
        jaeger2.setHeatPoints(100);
        
        System.out.println();
    }
}

