package com.testworks;

import java.util.ArrayList;
import java.util.Collection;

import com.snappeasort.SnappeaSorter;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		ArrayList<Double> data = new ArrayList<Double>();
		
		for(int i = 0; i < 100; i++)
		{
			data.add(Math.random()*10000.0);
		}
		
		SnappeaSorter.sort(data, 10);
	}
}
