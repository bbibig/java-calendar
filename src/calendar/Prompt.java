package calendar;

import java.util.Scanner;

public class Prompt {
	
	public int firstDay(String week) {
		if (week.equals("su")) return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("we")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else
			return 0;
	}
		
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		Lastday last = new Lastday();

		int month = 1;
		int year = 1;
		
		while (true) {			
			System.out.println();
			System.out.println("연도을 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1)
				break;
			
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();	
			
		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		cal.printCalendar(year, month);
		}
		System.out.println("Bye!");
	}

	public static void main(String[] args) {
		//실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
