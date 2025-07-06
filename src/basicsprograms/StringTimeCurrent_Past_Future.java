package basicsprograms;

import java.util.Date;

public class StringTimeCurrent_Past_Future {

	public static void main(String[] args) 
	{
		Date d=new Date();
		long t=d.getTime(); //Epoch Time
		System.out.println(t); //Epoch Time
		
		Date d2=new Date(d.getTime()); //Current Time
		System.out.println(d2);
		
		String d3=d2.toString();
		String day=d3.substring(0, 3); //Current Day
		System.out.println(day);
		
		String date=d3.substring(8, 10); //Current Date
		System.out.println(date);
		
		String year=d3.substring(d3.length()-4); //Current Year
		System.out.println(year);
		
		String month=d3.substring(4, 7); //Current Month
		System.out.println(month);
		
		String today=date.concat("-").concat(month).concat("-").concat(year); //Current dd-yy-yyyy
		System.out.println(today);
		
		Date future=new Date(d.getTime()+(1000*60*60*24*4)); //Future Time(Milisecond*Second*Minutes*Hours*Days)
		System.out.println(future);
		
		Date past=new Date(d.getTime()-(1000*60*60*24*4)); //Past Time(Milisecond*Second*Minutes*Hours*Days)
		System.out.println(past);
	}

}
