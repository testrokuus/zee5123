package automation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         File f = new File("abc\\def\\ghi");
//          FileWriter fr =new FileWriter(f);
          //BufferedWriter bf = new BufferedWriter(fr);
//          bf.write("nagendra");
//          bf.newLine();
//          bf.write(65);
//          bf.flush();
//          bf.close();
          
//          PrintWriter pf =new PrintWriter(fr);
//          pf.println("fuckoff");
//          pf.println(65);
//          pf.flush();
//          pf.close();
//            f.mkdir();
            
//            if(!f.exists())
//            {
//            	f.mkdir();
//            }
//            else
//            {
//            	System.out.println("folder already exists");
//            }
            
            //multiple folders
            f.mkdirs();
            
	}

}


