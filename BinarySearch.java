public class BinarySearch {
	int index(int arr[], int key, int low, int high) {
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				high=mid-1;
			else 
				low=mid+1;
		}
		return -1;
	}
}
public class BinarySearchDemo {
	public static void main(String args[]) {
		BinarySearch bs=new BinarySearch();
		int arr[]= {2,6,15,43,49,57};
		int n=arr.length;
		int key=15;
		int r=bs.index(arr,key,0,n-1);
		if(r==-1)
			System.out.println("enf");
		else
			System.out.println("ef"+r);
			
		
	}

}

