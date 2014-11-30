
public class rectangle implements shapes {
	
	public String name(){
  	  return "rectangle";
    }
    public void draw(){
  	  System.out.println("I am rectangle");
  	  
    }
    public void intersect(shapes A){
  	  System.out.println("Intersecting rectangle and "+A.name());
    }
}
