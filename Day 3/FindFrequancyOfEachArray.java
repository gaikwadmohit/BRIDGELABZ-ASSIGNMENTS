package day3Assignment;

public class FindFrequancyOfEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,2,3,4,5,2,3,4,5,6,8};
		int [] visitedarr=new int[arr.length];
		int visited =-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
					visitedarr[j]=visited;
				}
				
			}
		
		if( visitedarr [i]!=visited)
		{
			visitedarr[i]=count;
			
			}
		}
				for(int i=0;i<arr.length;i++)
				{
					if(visitedarr[i]!=visited)
				{
						System.out.println("Frequancy "+ arr[i]+ ":" +visitedarr[i]);
				}
				}

}

}
