package ua.com.dzlobenets.son.app;

import java.util.*;

public class Main{
	
	
	public static void main(String[] args) throws Exception {
		final Map<String, Integer> stisticMembers = new HashMap<>();
		final String[] members = new String[]{
			"Mother", //0
			"Father",// 1
			"Sister",//2
			"Brother"//3
		};
		
		for(int i  = 10; i > 0; i--){
			final double rand = Math.random();				
			final double indexDouble = rand * 3;
			//System.out.println(indexDouble);
			
			
			final int indexInt = (int)Math.round(indexDouble);
			final String member = members[indexInt];
			
			Integer count = stisticMembers.getOrDefault(member, 0);
			count = count + 1;
			stisticMembers.put(member, count);
			
			
			System.out.println("Hello," + member);
			Thread.sleep(2000);
		}
		
		
		System.out.println(stisticMembers);
	}
}
