package automation;

public class minvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {98,75,88,45,65,76};
       int max=0;
       int secmax=0;  
       for(int i=0;i<a.length;i++)
       {   
    	   if(a[i]>max)
    	   {
    		   max=a[i];
    		   secmax=max;
		   
    	   }
    	   else if(a[i]>secmax && a[i]!=max )
    	   {
    		   a[i]=secmax;
    	   }
    	   
       }
       System.out.println(secmax);

	}

}
