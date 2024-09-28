import java.util.*;
 class CalendarDemo
{
	public static void main(String[] args) throws Exception
	{
		Calendar cal=Calendar.getInstance();

		cal.add(Calendar.MONTH,5);
		System.out.println("year:"+cal.get(Calendar.YEAR));
		System.out.println("month:"+cal.get(Calendar.MONTH));
System.out.println("Day:"+cal.get(Calendar.DAY_OF_MONTH));

	}
}
