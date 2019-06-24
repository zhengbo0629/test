package prac;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
			public static void main(String[] args) {
			Date  d=	new  Date();
		System.out.println("d"+d);
			int  year=d.getYear();
			System.out.println(year);
			
			String  a="15 04:19:51";
		String  b=	a.substring(0, 2);
			System.out.println("b="+b);
			
			int  x=1;
			String  q=String.valueOf(x);
			
			int  y=2;
			int  z=3;
		String w=	String.valueOf(y);
			String e=String.valueOf(z);
			System.out.println(x+y+z);
			System.out.println(q+"nian "+w+e);
			
			
			
			
			
			
			
			
			}
		
		
		
}
