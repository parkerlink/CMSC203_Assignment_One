import java.util.Scanner; 

public class Parker_Link_Assignment_One {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in); 
        String userInput;
        
        //Introduction to program
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
        System.out.println("First step: reboot your computer");
       

        boolean isValidInput = false;
        
        while(isValidInput == false) {
        	
        	 System.out.println("Are you able to connect with the internet? (yes or no)");
        	 userInput = sc.nextLine(); 

        	 if(userInput.equals("yes")) { //Checks to see if the user fixed their problem
        		 System.out.println("Restarting the computer seemed to work");
        		 return;
             }else if(userInput.equals("no")){
            	 isValidInput = true;
             }else {
            	 System.out.println("Invalid input, please try again. (yes or no)");
             }   	
        }
        
        //Resets the boolean so it can be used again
        isValidInput = false;
        
        //Moves to the second step
        System.out.println("Second step: reboot your router");
        
        while(isValidInput == false) {
        	
       	 System.out.println("Are you able to connect with the internet? (yes or no)");
       	 userInput = sc.nextLine(); 

       	 if(userInput.equals("yes")) { //Checks to see if the user fixed their problem
       		 System.out.println("Restarting your router seemed to work");
       		 return;
            }else if(userInput.equals("no")){
           	 isValidInput = true;
            }else {
           	 System.out.println("Invalid input, please try again. (yes or no)");
            }   	
        }
  	    isValidInput = false;
	    
	    //Moves to the fourth step
	    System.out.println("Fourth step: move your computer closer to your router");
	    
	    while(isValidInput == false) {
	    	
	   	 System.out.println("Are you able to connect with the internet? (yes or no)");
	   	 userInput = sc.nextLine(); 
	
	   	 if(userInput.equals("yes")) { //Checks to see if the user fixed their problem
	   		 System.out.println("Moving closer to your router seemed to work");
	   		 return;
	        }else if(userInput.equals("no")){
	       	 isValidInput = true;
	        }else {
	       	 System.out.println("Invalid input, please try again. (yes or no)");
	        }   	
	    }
	    
	    //Moves to the fifth step and final step
	    System.out.println("Fifth step: contact your ISP");
	    System.out.println("Make sure your ISP is hooked up to your router.");
	    
	    return;
        
	}
}
