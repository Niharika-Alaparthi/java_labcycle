import java.util.Arrays;
class MergeSort {
	 void mergeSort(int[] a, int n) {
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
	 void merge(int[] a, int[] l, int[] r, int left, int right) {
			 
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

}

public class MergeSortDemo {
	public static void main(String args[]) {
		MergeSort ms=new MergeSort();
		interchanges ic=new interchanges();
		int a[]= {149,143,115,157,102,106};
		int n=a.length;
		ms.mergeSort(a,n);
		System.out.println(Arrays.toString(a));
		System.out.println(ic.minSwaps(a,n));
	}

}
