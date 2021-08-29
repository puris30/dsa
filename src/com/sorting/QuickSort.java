package com.sorting;

public class QuickSort {

	public int partition(int []arr,int low,int high)
	{
		
		int i=low-1;
		int pivot=arr[high];
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=pivot;
		arr[high]=temp;
		return i+1;
	}
	
	public void sort(int []arr,int low,int high)
	{if(low<high) {
		int pi=partition(arr,low,high);
		sort(arr,low,pi-1);
		sort(arr,pi+1,high);
	}}
	public void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[6];
		arr[0]=86;
		arr[1]=35;
		arr[2]=87;
		arr[3]=40;
		arr[4]=70;
		arr[5]=56;
		QuickSort quick=new QuickSort();
				quick.sort(arr, 0, 5);
		quick.print(arr);
	}
}
