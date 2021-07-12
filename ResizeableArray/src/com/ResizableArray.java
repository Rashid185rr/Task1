package com;
	
public class ResizableArray {

	private int data[];
	private int count;
	private int size;
	
	public ResizableArray()
	{
		data = new int[1];
		count = 0;
		size = 1;
	}

	
	public void add(int data1)
	{

		if (count == size) {
			IncreaseSize();
		}
		data[count] = data1;
		count++;
	}

	
	public void IncreaseSize()
	{
		
		int temp[] = null;
		if (count == size) {

 
			temp = new int[size * 2];
			{
				for (int i = 0; i < size; i++) {
					// copy all data value into temp
					temp[i] = data[i];
				}
			}
		}

		data = temp;
		size = size * 2;
	}

	
	

	public void addAt(int index, int data1)
	{

		if (count == size) {
			IncreaseSize();
		}

		for (int i = count - 1; i >= index; i--) {


			data[i + 1] = data[i];
		}

		data[index] = data1;
		count++;
	}

 	public void remove()
	{
		if (count > 0) {
			data[count - 1] = 0;
			count--;
		}
	}

	public void removeAt(int index)
	{
		if (count > 0) {
			for (int i = index; i < count - 1; i++) {

				data[i] = data[i + 1];
			}
			data[count - 1] = 0;
			count--;
		}
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}
 	
}