package Lee.Calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		String InputValue = sc.nextLine();
		sc.close();
		String[] SplitValue = InputValue.split(" ");
		int first = Integer.parseInt(SplitValue[0]);
		int second = Integer.parseInt(SplitValue[1]);
		int sum = first + second;
		System.out.println("두 수의 합은 " + sum + "입니다.");

	}

}
