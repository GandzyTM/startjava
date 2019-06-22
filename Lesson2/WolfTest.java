class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setAge(14);
        wolf.setColor("Grey");
        wolf.setName("Muhtar");
        wolf.setSex('M');
        wolf.setWeight(45.7f);

        System.out.println(wolf.getName() + " has next params: "
                + "\nage: " + wolf.getAge()
                + "\ncolor: " + wolf.getColor()
                + "\nname: " + wolf.getName()
                + "\nsex: " + wolf.getSex()
                + "\nweight: " + wolf.getWeight());

        wolf.go();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}
