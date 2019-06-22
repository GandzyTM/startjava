public class Wolf {
    char sex;
    String name;
    float weight;
    int age;
    String color;

    void go() {

    }

    void sit() {

    }

    void run() {

    }

    void howl() {

    }

    void hunt() {

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
    }
}
