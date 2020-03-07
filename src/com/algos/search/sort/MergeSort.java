package com.algos.search.sort;

public class MergeSort {

	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
		System.out.println("merge called");
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	  
	public static void mergeSort(int[] a, int n) {
		System.out.println("merge sort called");
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	 
	    merge(a, l, r, mid, n - mid);
	} 
	public static void main(String args[])  
	{  
	int arr[] = {90,23,101,45,65,23,67,89,34,23};  
	MergeSort.mergeSort(arr, arr.length);  
	  
	System.out.println("\nSorted array");  
	for(int i =0; i<arr.length;i++)  
	{  
	    System.out.println(arr[i]+"");  
	}  
	}  
	
}
