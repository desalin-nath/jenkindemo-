package com.picnic.tentt;

public class fibonacciSeries {
	public static void main(String[] args) {
		System.out.println("desy");
		
//		=with scanner====
		
//		 int n, a = 0, b = 0, c = 1;
//	        Scanner s = new Scanner(System.in);
//	        System.out.print("Enter value of n:");
//	        n = s.nextInt();
//	        System.out.print("Fibonacci Series:");
//	        for(int i = 1; i <= n; i++)
//	        {
//	            a = b;
//	            b = c;
//	            c = a + b;
//	            System.out.print(a+" ");
//	        }
//	    }
//		=without scanner====
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		}

}





