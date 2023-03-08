package Array;

public class Maxelement {

	public static void main(String[] args) {
		int array[]= {5,3,8,1,7,2};
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			
		}
				
		System.out.println(" the maximum number is :" +max);
	

}
}
