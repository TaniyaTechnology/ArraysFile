
public class MergeSort {
	public static void mergeSort(int[] a) {
		if(a==null) {
			return;
		}
		if(a.length>1) {
			int mid=a.length/2;
			int[] left = new int[mid];
			for(int i=0; i<mid; i++) {
				left[i]=a[i];
			}
			int[] right = new int[a.length-mid];
			for(int i=mid; i<a.length; i++ ) {
				right[i-mid] = a[i];
			}
			mergeSort(left);
			mergeSort(right);
			int i=0;
			int j=0;
			int k=0;
			while(i<left.length && j<right.length) {
				if(left[i] < right[j]) {
				   a[k] = left[i];
				   i++;
				}
				else
				{
					a[k] = right[j];
					j++;
				}
				k++;
			}
			while(i < left.length) {
				a[k]=left[i];
				i++;
				k++;
			}
			while(j<right.length) {
				a[k]=right[j];
				j++;
				k++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {15,10,65,35,20,30};
		mergeSort(a);
		System.out.println("The array after sorting is:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
