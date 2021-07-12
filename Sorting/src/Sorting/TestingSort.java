package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingSort {

	public static void main (String args[])
	{
		BubbleSort sort = new BubbleSort();
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,44,5,6,7,99));
		
		sort.sort(list);
		
		System.out.println(list);
		
		
	}
}
