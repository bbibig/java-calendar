package calendar;
import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lastday last = new Lastday();
		String PROMPT = "cal>";
		
		int month = 1;
		int year = 1;
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, last.getMaxDaysOfMonth(year, month));
		}
		
		System.out.println("Bye!");
		scanner.close();
	}
}
