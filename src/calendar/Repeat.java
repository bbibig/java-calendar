package calendar;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		System.out.println("반복횟수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int repeat = scanner.nextInt();

		for (int i = 0; i < repeat; i++) {
			System.out.println("월을 입력하세요.");
			int month = scanner.nextInt();
			Lastday last = new Lastday();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, last.getMaxDaysOfMonth(month));
		}
		
		System.out.println("Bye!");
		scanner.close();
	}
}
