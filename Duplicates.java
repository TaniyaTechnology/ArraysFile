
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {2,7,8,2,7,9,8,1,9};
		 
		System.out.println("Duplicate elements in given array:");
		
		for (int i=0; i<ar.length-1; i++)
		{
			for (int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
					System.out.println(ar[j]);
			}
		}
		
	}

}
