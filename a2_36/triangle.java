
public class triangle implements shapes  {
	public String name(){
	  	  return "triangle";
	    }
	    public void draw(){
	  	  System.out.println("I am triangle");
	  	  
	    }
	    public void intersect(shapes A){
	  	  System.out.println("Intersecting triangle and "+A.name());
	    }

}
