
public class SubsetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,40,50,60};
		int[] b = {10,20,60};
		int j=0;
		int x=0;
		for(int i=0; i<b.length; i++)
		{
			for(j=0; j<a.length; j++)
			{
				if(b[i]==a[j])
					break;
			}
			
			if(j== a.length)
			{
				x=1;
				System.out.println("Given array is not a subset");
				break;
			}
		}
		if(x==0)
		{
			System.out.println("Given array is the subset of main array");
		}
	}

}
