
public class square implements shapes{
             
	public String name(){
  	  return "square";
    }
    public void draw(){
  	  System.out.println("I am square");
  	  
    }
    public void intersect(shapes A){
  	  System.out.println("Intersecting square and "+A.name());
  	  
    }  
}
