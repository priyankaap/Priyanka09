import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessNum {

	public static void main(String[] args) {
		int num=50;
        int gnum=0;
        try {
        
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("enter number");
        
        gnum = Integer.parseInt ( input.readLine());

        while(num!=gnum){
            
          if(gnum<num)
           {
     System.out.println("enter bigger number");
    
     gnum = Integer.parseInt ( input.readLine());
     continue;  

     
   }
   else if(gnum>num){
     System.out.println("Enter lesser number");
     
     gnum = Integer.parseInt ( input.readLine());
     continue;  
           }
 }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }


	}

}
