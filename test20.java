
public class test20 {

	public static void main(String[] args) {
		String levelString="Intermediate";  
	    int level=2;  
	    switch(levelString){     
	    case "Beginner": level=1;  
	    break;    
	    case "Intermediate": level=2;  
	    break;    
	    case "Expert": level=3;  
	    break;    
	    default: level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level);  

	}

}
