import java.util.*;
import java.util.Scanner;
class Solution
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        while(t>0)
        {
			int n=s.nextInt();
			        int a[]=new int[n];
        int b[]=new int[n];
      for(int i=0;i<n;i++)
      {
          a[i]=s.nextInt();

      }
        for(int i=0;i<n;i++)
      {
          b[i]=s.nextInt();

      }
   int   alen=a.length;
   int   blen=b.length;
        int c[]=new int[alen+blen];
      for(int i=0;i<n;i++)
      {
		  for(int j=i+1;j<n;j++)
		  {
			  if(a[i]>a[j])
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
	  }

	  for(int i=0;i<n;i++)
	        {
	  		  for(int j=i+1;j<n;j++)
	  		  {
	  			  if(b[i]>b[j])
	  			  {
	  				  int temp=b[i];
	  				  b[i]=b[j];
	  				  b[j]=temp;
	  			  }
	  		  }
	  }
	  System.arraycopy(a,0,c,0,alen);
	  System.arraycopy(b,0,c,alen,blen);



	  for(int i=0;i<c.length;i++)
	        {
	  		  for(int j=i+1;j<c.length;j++)
	  		  {
	  			  if(c[i]>c[j])
	  			  {
	  				  int temp=c[i];
	  				  c[i]=c[j];
	  				  c[j]=temp;
	  			  }
	  		  }
	  }
	  int sum=0;
	  sum=c[(c.length/2)-1]+c[c.length/2];
	  System.out.println(sum);
	  t--;
  }

    }
}