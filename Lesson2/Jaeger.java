class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private int heatPoints;

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public int getHeatPoints() {
        return heatPoints;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight
                    , int armor, int speed, int strength, int heatPoints) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.armor = armor;
        this.speed = speed;
        this.strength = strength;
        this.heatPoints = heatPoints;
    }

    public void run() {
        System.out.println("Running...");
    }

    public void go() {
        System.out.println("Going...");
    }

    public void jump() {
        System.out.println("Jumping...");
    }

    protected void shoot() {
        System.out.println("Shooting...");
    }
}