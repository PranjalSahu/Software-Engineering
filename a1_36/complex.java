

class complex{
	double re;
	double img;

	complex(){                           //Normal constructor which takes no argument and gives  
		this.re=0;                       //gives 0+0i
		this.img=0;
	}
	
	complex(double real,double imag){   //constructor which takes arguments as the real and imaginary part of complex
		this.re=real;
		this.img=imag;
	}
	void printcomplex(char x)         //prints the x complex and takes char as argument to print which complex it is
	{
		System.out.print(x+".re="+this.re+" ,");
		if(this.img!=0)
		System.out.println(x+".img="+this.img);
		else
			System.out.println(x+".img="+0);
		System.out.println();
	}
	float myModulus(){                  //returns the modulus a complex upto 6 decimal places
		return (float)Math.sqrt(re*re+img*img);
	}
	float myangle(){
            if(this.re==0&&this.img>0)
               return (float)Math.PI/2;
           else if (this.re==0&&this.img<0)
              return -(float)Math.PI/2;
           else if(this.re==0&&this.img==0)
              return 0;
           else 
               return (float)Math.atan(this.img/this.re);
	}
	void mypolarform(){
		System.out.printf("a in polar form is %f angle %f degree\n\n",this.myModulus(),Math.toDegrees(this.myangle()));
	}
	complex myconjugate(){              //returns the conjugate of that complex
		 complex d=new complex(this.re,-1*this.img);
		 return d; 
	}
	complex myinverse(){                //returns the inverse of that complex
		complex d=new complex(this.re/(this.re*this.re+this.img*this.img),-1*this.img/(this.re*this.re+this.img*this.img));
		return d;
	}
	void Addcomplex(complex b)          //adds the complex b to the current OR this complex and updates this complex
	{
		update(this.re+b.re,this.img+b.img);
	}
	void Subtractcomplex(complex b)    //subtracts the complex b from current OR this complex and updates this complex
	{
		update(this.re-b.re,this.img-b.img);
	}
	void Multiplycomplex(complex b)   //multiples the complex b with the current OR this complex and updates this complex
	{
		update(this.re*b.re-this.img*b.img,this.re*b.img+this.img*b.re);
	}
	void Dividebycomplex(complex b)   //Divides this complex from the current or this complex and updates this complex
	{
                if(b.re==0&&b.img==0)
                {
                	System.out.println("Sorry division by 0 mathematicaly not defined");
                return;
                }
		       update((this.re*b.re+this.img*b.re)/(b.img*b.img+b.re*b.re),(this.img*b.re-this.re*b.img)/(b.img*b.img+b.re*b.re));                               
	}
	
	void update(double i,double j)   //updates this complex by the arguments given to it
	{
		re=i;img=j;
	}
	complex  Addcomplex(complex m,complex n){//adds two different complex and returns the sum
		complex c=new complex();             //takes both the complex as arguments
		c.re=m.re+n.re;
		c.img=m.img+n.img;
		return c;
	}
}
