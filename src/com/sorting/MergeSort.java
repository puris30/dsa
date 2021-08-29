package com.sorting;

public class MergeSort {
//	
	public void sort(int []arr,int l,int r)
	{//this condition is to stop dividing by 2 when only when element is left otherwise stack overflow
		if(l<r)
	{
		int m=(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		merge(arr,l,m,r);
	}
	}
	
	public void merge(int []arr,int l,int m,int n)
	{
		int size1=m-l+1;
		int size2=n-m;
	int [] leftarr=new int[size1];
	int [] rightarr=new int[size2];;
	
	
	
	for(int i=0;i<size1;++i)
	{
		leftarr[i]=arr[l+i];
	}
	for(int j=0;j<size2;++j)
	{
		rightarr[j]=arr[m+j+1];
	}
	
	int i=0,j=0;
	int k=l;
	while(i<size1&&j<size2)
	{
		if(leftarr[i]<rightarr[j])
		{
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		else {
			arr[k]=rightarr[j];
			j++;
			k++;}
	}
	while(i<size1)
	{
		arr[k]=leftarr[i];
		i++;
		k++;
	}
	while(j<size2)
	{
		arr[k]=rightarr[j];
		j++;
		k++;
	}
	
	
	
	}
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
		MergeSort merge=new MergeSort();
		merge.sort(arr, 0, 5);
		merge.print(arr);
	}

}
