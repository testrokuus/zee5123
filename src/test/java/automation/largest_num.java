package automation;

public class largest_num {
	public static void main(String[] args) {
      
        int[] a = {9,4,5,6,7,1,1,1,2,2,3,3,3,4,4,6,6,6};
        for(int i=0;i<a.length;i++)
        {
        	int count=1;
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]==a[j])
        		{
        			count++;
        		}
        		else
        		{
        			break;
        		}
        		
        	}
        	if(count>1)
        	{
        		System.out.println(a[i] +"occurences"+count);
        		i+=(count-1);
                
        	}  
        }
    }
}

