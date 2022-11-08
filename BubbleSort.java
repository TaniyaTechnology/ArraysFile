
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,7,10,8,4,9,3,6};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length-i; j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j-1];
					a[j-1]=a[j];
					a[j]=tempVar;
				}
				
			}
		}
		for(int elem : a)
		{
			System.out.print(elem+ " ");
		}
	}

}
