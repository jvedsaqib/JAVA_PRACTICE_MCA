package generics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

class Test{
    public static void main(String args[]){
    
    	try {
    		FileReader fr = new FileReader("D:\\Program\\TestInp.txt");
    		BufferedReader br = new BufferedReader(fr);
    		
    		ArrayList<String> l=new ArrayList<String>();
            String str;
            
            while((str = br.readLine()) != null){
                  l.add(str);
            }
            br.close();
            
            System.out.println("ORIGINAL : " + l);
            Collections.sort(l);
            System.out.println("SORTED : " + l);
            
            FileWriter fw = new FileWriter("D:\\Program\\TestInp.txt");
    		BufferedWriter bw = new BufferedWriter(fw);
    		
    		for(String s : l) {
    			bw.write(s);
    			bw.write("\n");
    		}
    		
    		bw.close();
    		
    		System.out.println("DONE");
    		
    	}catch(Exception e) {}
    	
    	
    	
    	
    	
    }
}
