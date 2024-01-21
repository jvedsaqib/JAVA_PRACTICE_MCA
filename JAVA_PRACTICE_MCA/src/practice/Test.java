package practice;

class Table  
{      
 void printTable(int n){    
   synchronized(this){//synchronized block    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(1000);    
      }catch(Exception e){System.out.println(e);}    
     }    
   }    
 }  
}    

public class Test {

	public static void main(String[] args) {
		Table t = new Table();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				t.printTable(5);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				t.printTable(5);
			}
		});
		
		t1.start();
		t2.start();
	}

}
