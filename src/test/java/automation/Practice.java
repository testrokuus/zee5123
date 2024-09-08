package automation;

public class Practice {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1,99,100,99,6,5,6,6,6,6,7,7,8,8,8};  
	        //Array fr will store frequencies of element  
	        int [] fr = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	  
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
	        }  
	        System.out.println("----------------------------------------"); 
      

	}

}
