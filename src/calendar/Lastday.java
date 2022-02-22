package calendar;
import java.util.Scanner;

public class Lastday {

	private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else	
			return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
		return MAX_DAYS[month];
		}
	}
	
	public static void main(String[] args) {
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Lastday last = new Lastday();
		System.out.println("연도를 입력하세요.");
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		int year = scanner.nextInt();		
		
		System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, last.getMaxDaysOfMonth(year, month));
		scanner.close();
		
	}
}
	;