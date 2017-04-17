package com.sachin.utils;

public class Utils {

	public static <T> void displayArray(T[] array)
	{
		System.out.println("Array : ");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
