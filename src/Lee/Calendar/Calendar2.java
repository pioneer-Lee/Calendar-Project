package Lee.Calendar;

import java.util.Scanner;

public class Calendar2 {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int inputMonth) {
		return MAX_DAYS[inputMonth - 1];
	}

	public static void getCalendar(int inputYear, int inputMonth) {
		Calendar2 cal2 = new Calendar2();
		System.out.printf("   <<%4d년%3d월>>\n", inputYear, inputMonth);
		System.out.println
		("SU MO TU WE TU FR SA\n" +
		 "--------------------\n" + 
		 " 1  2  3  4  5  6  7\n" +
		 " 8  9 10 11 12 13 14\n" +
		 "15 16 17 18 19 20 21\n" +
		 "22 23 24 25 26 27 28");
		for (int i = 1; i <= cal2.getMaxDaysOfMonth(inputMonth) - 28; i++) {
			System.out.print(i + 28 + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calendar2 cal2 = new Calendar2();

		System.out.println("년, 월을 입력하세요");

		while (true) {
			int inputYear = scanner.nextInt();
			int inputMonth = scanner.nextInt();

			if (1 <= inputMonth && inputMonth <= 12) {
				if (cal2.getMaxDaysOfMonth(inputMonth) == 31) {
					getCalendar(inputYear, inputMonth);
				} else {
					getCalendar(inputYear, inputMonth);
				}
			} else if (inputMonth == -1) {
				System.out.println("have a nice day~");
				break;
			} else {
				System.out.println("월은 1 ~ 12만 입력 가능합니다 종료하고 싶으면 -1을 입력하세요");
				System.out.println("년, 월을 입력하세요");
			}

		}
		scanner.close();

	}
}
