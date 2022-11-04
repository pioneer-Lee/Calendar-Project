package Lee.Calendar;
import java.util.Scanner;
public class Calendar2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("달을 입력하세요");
		int inputMonth = scanner.nextInt();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(1 <= inputMonth && inputMonth <= 12) {
			if(month[inputMonth-1] == 31) {
				System.out.println(31);
			}
			else if(month[inputMonth-1] == 30) {
				System.out.println(30);
			}
			else {
				System.out.println("if year = 4n + 2, 29 else 28");
			}
		}
			else {
				System.out.println(" 1에서 12사이만 입력하세요"); 
			}
		
		scanner.close();
	}

}
