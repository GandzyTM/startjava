public class Wolf {
    char sex;
    String name;
    float weight;
    int age;
    String color;

    void go() {
        System.out.println("Go go go");
    }

    void sit() {
        System.out.println("Sit down");
    }

    void run() {
        System.out.println("Run run run");
    }

    void howl() {
        System.out.println("Whoooo");
    }

    void hunt() {
        System.out.println("Hunting");
    }
}

class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.age = 14;
        wolf.color = "Grey";
        wolf.name = "Muhtar";
        wolf.sex = 'M';
        wolf.weight = 45.7f;

        System.out.println(wolf.name + " has next params: "
                + "\nage: " + wolf.age
                + "\ncolor: " + wolf.color
                + "\nname: " + wolf.name
                + "\nsex: " + wolf.sex
                + "\nweight: " + wolf.weight);
	
        wolf.go();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}

