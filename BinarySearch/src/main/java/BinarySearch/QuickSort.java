package BinarySearch;

import java.util.Stack;

public class QuickSort {

	public static int[] execute(int[] arr, int l, int r) {
		Stack<Integer> SL = new Stack<Integer>();
		Stack<Integer> SR = new Stack<Integer>();
		SL.push(l); SR.push(r);
		while(!SL.empty()) {
			int ll = SL.pop();
			int rr = SR.pop();
			int i = ll;
			int j = rr;
			int partition = arr[(i + j)/2];
			while(i <= j) {
				while(arr[i] < partition){
					i++ ;
				}
				while(arr[j] > partition) {
					j-- ;
				}
				if(i <= j) {
					if(i < j) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
					i++ ;
					j-- ;
				}
			}
			if(ll < j) {
				SL.push(ll);
				SR.push(j);
			}
			if(rr > i) {
				SL.push(i);
				SR.push(rr);
			}
		}
		return arr;
	}
}
