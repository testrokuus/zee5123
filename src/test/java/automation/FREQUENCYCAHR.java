package automation;

public class FREQUENCYCAHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="i am an qa enginner";
          
          char ch[]=s.toCharArray();
          
          for(char c='a';c<='z';c++)
          {
        	  int count=0;
        	  for(int i=0;i<ch.length;i++)
        	  {
        	  if(ch[i]==c)
        	  {
        		  count++;
        	  }
        	  if(count>0)
              {
            	  System.out.println(c +"==============="+count);
              } 
          }
        	  
        	  
	}
          
}
}
