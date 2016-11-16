package com.instanceofJava;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String original ="ebcda";
		char[] chars= original.toCharArray();
		Arrays.sort(chars);
		
		String sorted = new String(chars);
		System.out.println(sorted);
				

	}

}
