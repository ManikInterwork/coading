import java.util.Scanner;
public class recursion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of towers");
		int n=scan.nextInt();
		int toi1=scan.nextInt();
		int toi2=scan.nextInt();
		int toi3=scan.nextInt();
		
		toh(n,toi1,toi2,toi3);		
	}
	
	public static void toh(int n,int toi1,int toi2,int toi3) {
		if(n==0) {
			return ;
		}
		toh(n-1,toi1,toi3,toi2);
		System.out.println("[" + toi1 + "->" + toi2  +  "]");
		toh(n-1,toi3,toi2,toi1);
		
	}
	
}

           //RECURSION PROBLEM 6

//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		System.out.println("enter the power");
//		int p=scan.nextInt();
//		int pow= power(n,p);
//		System.out.println(pow);
//		
//	}
//	public static int power(int n,int p) {
//		if(n==0) {
//			return 1;
//		}
//		int fn=power(n,p/2);
//		int f= fn*fn;
//		return f;
//		
//		if(p % 2 ==1){ 
//			f=f*n;
//		}
//	}
//	
//}
	 
	

	
	//RECURSION PROBLEM 5
	
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		int p= raisedPower(n);
//		System.out.println(p);
//	}
//	public static int raisedPower(int n) {
//		if(n==0) {
//			return 1;
//		}
//		int fn=raisedPower(n-1);
//		int f= 2*fn;


//      return f;
//	}
//}




			//	//RECURSION PROBLEM 4
//	
//	
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		int f= factorial(n);
//		System.out.println(f);
//	}
//	public static int factorial(int n) {
//		if(n==1) {
//			return 1;
//		}
//		int fm1=factorial(n-1);
//		int fn= n * fm1;
//		return fn;
//	}
//	
//}
 




//			//RECURSION PROBLEM 3
//	
//	
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		printIncreasingDecreasing(n);
//	}
//	public static void printIncreasingDecreasing(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.println(n);
//		printIncreasingDecreasing(n-1);
//		System.out.println(n);
//	}
//}
	   
  


		// RECURSION PROBLEM 2

//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		printIncreasing(n);
//	}
//	public static void printIncreasing(int n) {
//		if(n==0) {
//			return;
//		}
//		printIncreasing(n-1);
//		System.out.println(n);
//	}
//}
	
	 


        //RECURSION PROBLEM 1

//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scan.nextInt();
//	    printDecreasing(n);
//				
//		}
//	public static void printDecreasing(int n) {
//		if(n==0) {
//			return;
//		}
//		
//		System.out.println(n);
//		printDecreasing(n-1);
//	}
//          
//	}


