package calendar;

import java.util.Scanner;

public class Calendar {
	Lastday last = new Lastday();

	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		
		//get weekday automatically
		int weekday = getWeekDay(year, month, 1);
		
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

	private int getWeekDay(int year, int month, int day) {
		//기준 날짜 : 1970/Jan/1st = Thursday
		int syear = 1970;
		final int STANDARD_WEEKDAY = 3;
		
		int count = 0;
		
		for (int i = syear; i < year; i++) {
			int delta = last.isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		//월
		for (int i = 1; i < month; i++) {
			int delta = last.getMaxDaysOfMonth(year,i);
			count =+ delta;
		}
		
		count += day;
		
		//요일
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}
}
