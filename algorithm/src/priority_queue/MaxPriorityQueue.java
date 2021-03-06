package priority_queue;

import sort.SortUtils;

/** 
 * @author Apollo4634 
 * @create 2019/02/17
 * @see sort.HeapSort
 */

public class MaxPriorityQueue<T extends Comparable<? super T>> {

	private T[] arr;
	private int N;

	MaxPriorityQueue() {
		this.N = 0;
		this.arr = null;
	}
	
	@SuppressWarnings("unchecked")
	MaxPriorityQueue(int capacity) {
		this.N = capacity;
		this.arr = (T[]) new Object[N];
	}
	
	MaxPriorityQueue(T[] a) {
		this.arr = a;
		this.N = a.length;
		heapfy();
	}
	
	//上浮
	private void swim(int idx) {
		for (int i = idx; i>0 && SortUtils.less(arr[i-1],arr[i/2-1]); i /= 2)
			SortUtils.swap(arr, i-1, i/2-1);
	}
	
	//下沉
	private void sink(int idx) {
		int j;
		for (int i = idx; 2*i+1 < N; i = j) {
			if (2*i+2==N) j = N-1; 
			else j = SortUtils.less(arr[2*i+1],arr[2*i+2])? 2*i+2 : 2*i+1;

			if (!SortUtils.less(arr[i],arr[j])) break;
			SortUtils.swap(arr, i, j);
		}
	}

	//构造堆
	private void heapfy() {
		for (int i = (N-1)/2; i >= 0; i--) sink(i);
	}
	
	
	public void insert(int idx) {
		
	}

	public T max() {
		return (N>0)? arr[0] : null;
	}
	
	//delete the maxium element
	public T deleteMax() {
		T max = arr[0];
		N -= 1;
		SortUtils.swap(arr, 0, N);
		sink(0);
		return max;
	}

	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
}
