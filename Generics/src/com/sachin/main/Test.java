package com.sachin.main;

import java.util.Random;

import com.sachin.sort.Sort;
import com.sachin.utils.Utils;

public class Test {

	public static void main(String[] args) {
		Random rand = new Random();
		Integer[] randArray = new Integer[20];
		for(int i = 0; i < randArray.length; i++)
		{
			randArray[i] = rand.nextInt(20);
		}
		Utils.displayArray(randArray);
		Sort.bubbleSort(randArray);
		Utils.displayArray(randArray);

	}

}
