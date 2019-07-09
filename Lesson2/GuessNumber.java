import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	Random random = new Random();
	private int computerNum = random.nextInt(100);
	private int count;
	private String player1;
	private String player2;

	public GuessNumber(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void playGame() {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		while (count != 0) {
			if (count == 1) {
				Player player = new Player(player1);
				System.out.print(player1 + " please enter your number: ");
				player.setNumber(scan.nextInt());
				checkNum(player.getNumber());
				count = getCount();
			}

			if (count == 1) {
				Player player = new Player(player2);
				System.out.print(player2 + " please enter your number: ");
				player.setNumber(scan.nextInt());
				checkNum(player.getNumber());
				count = getCount();
			}
		}
	} // end void playGame

	private void checkNum(int userNum) {
		if (userNum < 0 || userNum > 100) {
			System.out.println("You entered number < 0 or > 100");
		}

		if (userNum >= 0 && userNum <= 100) {
			if (computerNum > userNum) {
				System.out.println("Entered number LESS than the hidden number. Next player ");
				setCount(1);
			} else if (computerNum < userNum) {
				System.out.println("Entered number GREATER than the hidden number. Next player ");
				setCount(1);
			} else if (computerNum == userNum) {
				System.out.println("You are right!!! it is a " + computerNum);
				setCount(0);
			}
		}
	}
}
