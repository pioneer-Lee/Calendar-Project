package Lee.Calendar;

import java.util.Scanner;

public class Calendar2 {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int inputMonth) {
		return MAX_DAYS[inputMonth - 1];
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calendar2 c2 = new Calendar2();

		System.out.println("월을 입력하세요");

		while (true) {
			int inputMonth = scanner.nextInt();

			if (1 <= inputMonth && inputMonth <= 12) {
				if (c2.getMaxDaysOfMonth(inputMonth) == 31) {
					System.out.println(31);
				} else if (c2.getMaxDaysOfMonth(inputMonth) == 30) {
					System.out.println(30);
				} else {
					System.out.println("4n+2일 경우 29, 그 외 28");
				}
			} else if (inputMonth == -1) {
				System.out.println("have a nice day~");
				break;
			} else {
				System.out.println("1 ~ 12만 입력 가능합니다 종료하고 싶으면 -1을 입력하세요");
			}
		}

		scanner.close();
	}
}
