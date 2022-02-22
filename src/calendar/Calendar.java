package calendar;

import java.util.Scanner;

public class Calendar {
	Lastday last = new Lastday();

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		// print blank space
		for (int j = 0; j < weekday; j++) {
			System.out.print("   ");
		}
		
		int maxDay = last.getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;

		// print first line
		for (int k = 1; k <= count; k++) {
			System.out.printf("%3d", k);
		}
		System.out.println();

		// print second line to last
		count++;
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim) {
				System.out.println();
			}
			
//		System.out.println(" 1  2  3  4  5  6  7\r\n" + " 8  9 10 11 12 13 14\r\n" + "15 16 17 18 19 20 21\r\n"
//				+ "22 23 24 25 26 27 28\r\n" + "29 30 31");
		}
		System.out.println();
	}
}
