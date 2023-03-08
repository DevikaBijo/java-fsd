package Array;

public class Count {

	public static void main(String[] args) {
		int array[]= {4,-4,6,8,-9,0,4,-7,56};
		int countp=0;
		int countn=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				countn++;
				
			}else
			{
				countp++;
				
			}
			
		}
		System.out.println("number of positive numbers:" +countp);
		System.out.println("number of negtive numbers: " +countn); 
	}	

}
