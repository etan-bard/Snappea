package com.snappeasort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SnappeaSorter 
{
		//1) Do a scan thru of of the list to grab highest/lowest values

		//2) Create bins based off of user input

		//3) Assign ranges to bins

		//4) Pass Over (for each bin {scan array/place in bin if in range})

		//5) Recurse with sqrt of bin!

		//5.1) if bin is less than or equal to 1 value(return value)

		//6) Back out and rebuild array
	
	public static ArrayList<Double> sort(ArrayList<Double> data, int bins)
	{
		if(data.size() <= 2)
		{
			// base case, do a simple swap if needed.
			System.exit(0);
		}
		
		System.out.println(data.size());
		double min = Collections.min(data);
		double max = Collections.max(data);
		double interval = (max - min) / bins;
		
		// Create the bins
		for(int i = 0; i < max; i += interval)
		{
			ArrayList<Double> subset = new ArrayList<Double>();
			for(Double d : data) 
			{
				if(i + interval > d) {
					subset.add(d);
				}
			}
			sort(subset, (int)Math.round(Math.sqrt(bins)));
		}
		
		return data;
	}
}
