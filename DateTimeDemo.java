package h2_ScreenDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {
public static void main(String[] args) {
	
	
	 Date dt =Calendar.getInstance().getTime();

	 
	 DateFormat dtf = new SimpleDateFormat("dd-MMM-yyyy hh:mm;ss");

     String currentDateTime =dtf.format(dt);

     System.out.println(currentDateTime);













}
}
