package dateex;

import java.util.Calendar;

public class CalendarEx {

	// 2020-03-18:22:11:05
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR); // 2020
		int month = cal.get(Calendar.MONTH)+1; // 4
		String mon = (month < 10) ? "0"+month : ""+month;
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		String h = (hour < 10) ? "0"+hour : ""+hour;
		
		int min = cal.get(Calendar.MINUTE);
		String m = (min < 10) ? "0"+min : ""+min;
		
		int sec = cal.get(Calendar.SECOND);
		String s = (sec < 10) ? "0"+sec : ""+sec;
		
		System.out.println(year+"-"+mon+"-"+day+":"+h+":"+m+":"+s);
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // ½Ì±ÛÅæ
		printCalendar("ÇöÀç", now);
	}

}
