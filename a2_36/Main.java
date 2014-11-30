import java.io.*;
import java.util.Random; 

public class Main {
public static void main(String args[]) throws IOException{
	    
	    int i,n,a,b;
	    Random rand = new Random();
		System.out.println("Please enter the number of objects to be created");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		
		n=Integer.parseInt(number);
		shapes list[]=new shapes[n];
		
		for(i=0;i<list.length;++i){
			switch(rand.nextInt(4)+1){
			case 1: list[i]=new circle();
			continue;
			case 2: list[i]=new rectangle();
			continue;
			case 3: list[i]=new square();
			continue;
			case 4: list[i]=new triangle();
			continue;
			}
		}
		System.out.println("PRINTING THE OBJECTS");
		for(i=0;i<n;++i){
			System.out.printf(i+1+". ");
			list[i].draw();
		  }
		System.out.printf("\n");
		System.out.println("INTERSECTING DIFFERENT PAIRS OF OBJECT");
		for(i=0;i<n;++i){
			a=rand.nextInt(n);
			b=rand.nextInt(n);
			list[a].intersect(list[b]);
			}
		
		}
}

