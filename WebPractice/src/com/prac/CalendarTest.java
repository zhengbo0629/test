package com.prac;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
		public static void main(String[] args) {
			// create calendar objects.
		      Calendar cal = Calendar.getInstance();
		      Calendar future = Calendar.getInstance();
		      DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    
		      // print the current date
		      System.out.println("Current date: " +  df.format(cal.getTime()));

		      // change year in future calendar
		      future.set(Calendar.YEAR, 2020);
		      System.out.println("Year is " + future.get(Calendar.YEAR));

		      // check if calendar date is after current date
		      Date time = future.getTime();
		      String format = df.format(time);
		      if (future.after(cal)) {
		         System.out.println("Date= " + format + " is after current date.");
		      }

		      
		      DecimalFormat ds=(DecimalFormat)NumberFormat.getInstance(); 
				ds.setMaximumFractionDigits(2);
		      
		      
		      
		   }


		}

