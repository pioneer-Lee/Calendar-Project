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

		System.out.println("반복횟수를 입력하세요");
		int inputRepeat = scanner.nextInt();
		System.out.println("월을 입력하세요");
		for(int i = 1; i <= inputRepeat; i++) {
			int inputMonth = scanner.nextInt();
			System.out.println(c2.getMaxDaysOfMonth(inputMonth)); 
		}
		scanner.close();
	}
}
		

