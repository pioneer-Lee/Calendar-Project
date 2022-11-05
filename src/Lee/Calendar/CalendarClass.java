package Lee.Calendar;
class CalendarClass {	
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LeapMAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public boolean isLeapYear(int inputYear) {
		if (inputYear % 400 == 0 || (inputYear % 4 == 0 && inputYear % 100 !=0))
			return true;
		else
			return false;
	}
	
	public int getMaxDaysOfMonth(int inputYear, int inputMonth) {
		if(isLeapYear(inputYear)) 
			return LeapMAX_DAYS[inputMonth - 1];
		else 
			return MAX_DAYS[inputMonth-1];
	}
	public int getMonthDays(int inputYear, int inputMonth) {
		int getAllMonthDays = 0;
		for(int i = 0; i<inputMonth; i++) {
			getAllMonthDays = getAllMonthDays + getMaxDaysOfMonth(inputYear, i+1);
		}return getAllMonthDays;
	}
	public int getAllDays(int inputYear, int inputMonth) {
		return (365 * (inputYear) + (inputYear/4 - inputYear/100) + inputYear/400) + getMonthDays(inputYear, inputMonth);
	}
	public int getFirstDay(int inputYear, int inputMonth) {
		int firstday = (getAllDays(inputYear, inputMonth) - getMaxDaysOfMonth(inputYear, inputMonth)) % 7;
	return firstday;
	}

	public void getCalendar(int inputYear, int inputMonth, String StartDate) {
		CalendarClass cal2 = new CalendarClass();
		int i = getFirstDay(inputYear, inputMonth);
		System.out.printf("   <<%4d년%3d월>>\n", inputYear, inputMonth);
		System.out.println
		(" SU MO TU WE TU FR SA\n" +
		 "---------------------");
		System.out.print(" ".repeat(i * 3));
			for (int j = 1; j <= cal2.getMaxDaysOfMonth(inputYear, inputMonth); j++) {
				System.out.printf("%3d", j);
				if((i + j) % 7 == 0) {
					System.out.println();
				}
		
}
			System.out.println();

}
}
