import java.util.Scanner;

public class Player {
    private int number;
    private String name;
    private boolean result;

    public Player() {
        Scanner scan = new Scanner(System.in);
        this.name = scan.next();
    }

    public String getName() {
        return name;
    }

    public void setNumber() {
        Scanner scan = new Scanner(System.in);
        this.number = scan.nextInt();
    }

    public int getNumber() {
        return number;
    }
}
