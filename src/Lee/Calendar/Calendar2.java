package Lee.Calendar;

import java.util.Scanner;

public class Calendar2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CalendarClass cal2 = new CalendarClass();


		while (true) {
			System.out.println("연도를 입력하세요\nYear> ");
			int inputYear = scanner.nextInt();
			System.out.println("월을 입력하세요\nMonth> ");
			int inputMonth = scanner.nextInt();
			System.out.println("시작일 입력하세요\nSu Mo Tu We Th Fr Sa 중 택1> ");
			String inputStartDate = scanner.next();

			if (1 <= inputMonth && inputMonth <= 12) {
				cal2.getCalendar(inputYear, inputMonth, inputStartDate);
			} 
			else if (inputMonth == -1) {
				System.out.println("have a nice day~");
				break;
			} 
			else {
				System.out.println("월은 1 ~ 12만 입력 가능합니다 종료하고 싶으면 -1을 입력하세요");
				System.out.println("년, 월을 입력하세요");
			}

		}
		scanner.close();

	}
}