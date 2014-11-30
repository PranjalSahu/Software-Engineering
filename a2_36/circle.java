
public class circle implements shapes{
	      
	      public String name(){
	    	  return "circle";
	      }
          public void draw(){
        	  System.out.println("I am circle");
        	  
          }
          public void intersect(shapes A){
        	  System.out.println("Intersecting circle and "+A.name());
        	  
          }          
}
