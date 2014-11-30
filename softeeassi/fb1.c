#include<stdio.h>
#include<math.h>
int main()
{
	int a,i,x=0,y=0;
   long int n=1148284322;
   double b;
	a=(int)sqrt(n);
	printf("%d ",a);
	
	for(i=0;i<=a;++i)
	{
		b=sqrt(n-i*i);
		if(b==(int)b)
		{
			++x;
		if(i==(int)b)
		++y;
		}
		
	}
	printf("%d ",x/2);
	/*if(a*a==N)
	flag=1;*///39221
	return 0;
	}
	