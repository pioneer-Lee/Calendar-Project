package Lee.Calendar;

public class CalendarClass {	
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int inputMonth) {
		return MAX_DAYS[inputMonth - 1];
}

	public void getCalendar(int inputYear, int inputMonth) {
		CalendarClass cal2 = new CalendarClass();
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

}
