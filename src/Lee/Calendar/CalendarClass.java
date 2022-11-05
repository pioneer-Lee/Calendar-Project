package Lee.Calendar;
class CalendarClass {	
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LeapMAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	String[] StartDate = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
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
	public int getStartDateOfMonth(String inputStartDate) {
		switch(inputStartDate) {
		case "Mo":
			return 1;
		case "Tu":
			return 2;
		case "We":
			return 3;
		case "Th":
			return 4;
		case "Fr":
			return 5;
		case "Sa":
			return 6;
		default:
			return 0;
			
		}
		
			
	}
	

 
	public void getCalendar(int inputYear, int inputMonth, String inputStartDate) {
		CalendarClass cal2 = new CalendarClass();
		int i = getStartDateOfMonth(inputStartDate);
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
