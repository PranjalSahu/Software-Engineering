
//LAB ASSIGNMENT -1
//PROGRAM IN JAVA TO DEMONSTRATE THE VARIOUS OPERATIONS ON  COMPLEX NUMBERS
//ROLL NO.- 09CS1036
public class Main
{   
	public static void main(String args[])
	{                               //original a=1+2i
		                            //original b=3+4i
		complex a=new complex(0,-4);//creating complex 1+2i
		complex b=new complex(0,0);
		complex c=new complex();//creating default complex i.e. 0+0i
		
		System.out.println("Following are the three complex numbers a,b,c on which further operations will be done");
		System.out.println("x.re represents for real part of x");
		System.out.println("x.re represents for imginary part of x");
		System.out.println("To change the values of a,b,c please open the main.java and enter the new values in a,b,c");
		System.out.println("(The format to change the values is self explanatory)\n");
		
		a.printcomplex('a');
		b.printcomplex('b');               
		c.printcomplex('c'); 
		//modulus of a
		System.out.println("Modulus of a is "+a.myModulus());
		System.out.println();
		//angle or argument of a
		System.out.println("angle of a="+a.myangle()+ " radians");
        //complex a in its polar form
		System.out.println();
		a.mypolarform();
		//complex conjugate of a
		System.out.println("c the complex conjugate of a");
		c=a.myconjugate();
		c.printcomplex('c');
		//inverse of a
		System.out.println("c the inverse of a");
		c=a.myinverse();
		c.printcomplex('c');
		c.update(0,0);
		
		System.out.println("value of a after adding b to a");
		a.Addcomplex(b);
		a.printcomplex('a');
		
		a.update(1,2);
		System.out.println("value of a after subtracting b from original a");
		a.Subtractcomplex(b);
		a.printcomplex('a');
		
		System.out.println("value of a after it is updated to 100+200i");
		a.update(100,200);
		a.printcomplex('a');
		
		a.update(1,2);
		System.out.println("value of a after b is multiplied to original a");
		a.Multiplycomplex(b);
		a.printcomplex('a');
		
		a.update(1,2);
		System.out.println("value of a after original a is divided by b");
		a.Dividebycomplex(b);
		a.printcomplex('a');
		
		a.update(1,2);
		System.out.println("value of c equal to  a+b");
		c=c.Addcomplex(a,b);
		c.printcomplex('c');
		}
} 



