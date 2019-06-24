package prac;

import java.util.ArrayList;
import java.util.List;

public class ListMap {
		public static void main(String[] args) {
		List  list=new  ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		 int b=0;
		for (int i = 0; i < list.size(); i++) {
			 int a=(int)list.get(i);
			 System.out.println("a="+a);
			b+=a;
			
			 
			/*
			 * int b=+a; System.out.println("b="+b);
			 */
		}
		
		System.out.println("b="+b);
	
		
		
	
		
		
			
		}
}
