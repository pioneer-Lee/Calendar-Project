package Lee.Calendar;

import java.util.Scanner;

public class Calendar2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CalendarClass cal2 = new CalendarClass();

		System.out.println("년, 월을 입력하세요");

		while (true) {
			int inputYear = scanner.nextInt();
			int inputMonth = scanner.nextInt();

			if (1 <= inputMonth && inputMonth <= 12) {
				if (cal2.getMaxDaysOfMonth(inputMonth) == 31) {
					cal2.getCalendar(inputYear, inputMonth);
				} else {
					cal2.getCalendar(inputYear, inputMonth);
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
