package org.cap.demo2;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	public static void display(List<Integer> list){
		list.stream().count();
		System.out.println("no of elements"+list.stream().count());
	}
	
	public static void main(String args[]) {
		display(Arrays.asList(12,33,56,41,23,47,52,85));
		
		
	}
}
