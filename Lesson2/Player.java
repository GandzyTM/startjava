import java.util.Scanner;

public class Player {
    private int number;
    private String name;

    public Player() {
        Scanner scan = new Scanner(System.in);
        this.name = scan.next();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        Scanner scan = new Scanner(System.in);
        this.number = scan.nextInt();
    }
}
