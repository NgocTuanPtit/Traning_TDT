package BinarySearch;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearch {

	public boolean executeBinarySearch(int arr[], int findValue) {
		Stack<Integer> SL = new Stack<Integer>();
		Stack<Integer> SR = new Stack<Integer>();
		SL.push(0); SR.push(arr.length - 1);
		while(!SL.empty()) {
			int ll = SL.pop();
			int rr = SR.pop();
			while(ll <= rr) {
				int mid = (ll + rr)/2;
				if(findValue == arr[mid]) {
					return true;
				}else {
					if(findValue > arr[mid]) {
						SL.push(mid + 1);
						SR.push(rr);
						break;
					}else {
						SL.push(ll);
						SR.push(mid -1);
						break;
					}
				}				
			}
		}
		return false;
	}
	
	public int[] generateAutoArray(int n) {
		int arr[] = new int[n];
		Random rd = new Random();
		int i = 0;
		while(i < n) {
			arr[i] = rd.nextInt(n);
			i++ ;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearch search = new BinarySearch();
		while(true) {
			System.out.print("Nhap vao so phan tu cua mang muon tao: ");
			int n = sc.nextInt();
			int arr[] = search.generateAutoArray(n);
			System.out.println("Mang da tao ra:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println("\nMang sau khi sort voi QuickSort:");
			QuickSort.execute(arr, 0, n-1);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println("\nNhap vao gia tri muon tim kiem: ");
			int findValue = sc.nextInt();
			System.out.println(search.executeBinarySearch(arr, findValue));
		}
		
	}
}
