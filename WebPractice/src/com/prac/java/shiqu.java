package com.prac.java;

import java.util.Calendar;

public class shiqu {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	    int offset = cal.get(Calendar.ZONE_OFFSET);
	    cal.add(Calendar.MILLISECOND, -offset);
	    Long timeStampUTC = cal.getTimeInMillis();
	    Long timeStamp = System.currentTimeMillis();
	    Long timeZone = (timeStamp - timeStampUTC) / (1000 * 3600); 
	    System.out.println(timeZone.intValue());
	}
	/*
	 * public static String getTimeZone(){
	 * 
	 * return String.valueOf(timeZone);
	 * 
	 * }
	 */

}
