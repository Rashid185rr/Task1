package com;


public class InsertionSort {
	
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}


	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}



	 public static void main(String args[]) {
	 
	 ResizableArray rs=new ResizableArray();

	 //Adding
	 
	  rs.add(6);
	  rs.add(187);
	  rs.add(87);
	  rs.add(287);
	  rs.add(299);
	  rs.add(32);
	  rs.add(87);
	  
	  //Removing 
	  
	  rs.removeAt(1);
	  rs.removeAt(2);
	  
	  
	 InsertionSort ob = new InsertionSort();
	 ob.sort(rs.getData());
	 
	  printArray(rs.getData()); 
	  
	 
	 }
	 
} 
