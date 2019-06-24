package prac;

import java.util.HashMap;

public class Map {
		public static void main(String[] args) {
			HashMap<String,String>  map=new HashMap<String,String>();
			map.put("1", "aaa");
			map.put("2", "bbb");
			for (String string : map.keySet()) {
				if(string!=null) {
					System.out.println(string);
				break;
					
				}
				
			}
		}
}
