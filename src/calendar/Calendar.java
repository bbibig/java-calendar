package calendar;

import java.util.Scanner;

public class Calendar {
	Lastday last = new Lastday();

	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		int maxDay = last.getMaxDaysOfMonth(month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}

//		System.out.println(" 1  2  3  4  5  6  7\r\n" + " 8  9 10 11 12 13 14\r\n" + "15 16 17 18 19 20 21\r\n"
//				+ "22 23 24 25 26 27 28\r\n" + "29 30 31");
		}

	}
}
