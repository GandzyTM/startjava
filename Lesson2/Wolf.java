public class Wolf {
    private char sex;
    private String name;
    private float weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Go go go");
    }

    public void sit() {
        System.out.println("Sit down");
    }

    public void run() {
        System.out.println("Run run run");
    }

    public void howl() {
        System.out.println("Whoooo");
    }

    public void hunt() {
        System.out.println("Hunting");
    }
}

