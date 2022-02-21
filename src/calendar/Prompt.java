package calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		Lastday last = new Lastday();

		int month = 1;
		while (true) {			
			System.out.println();
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();	
		if (month == -1) {
			break;
		}	
		if (month > 12) {
			continue;
		}
		cal.printCalendar(2022, month);
		}
		System.out.println("Bye!");
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}