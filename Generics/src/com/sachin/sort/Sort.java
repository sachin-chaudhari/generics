package com.sachin.sort;

public class Sort {
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length - i; j++)
			{
				if(array[i].compareTo(array[j]) > 0)
				{
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
