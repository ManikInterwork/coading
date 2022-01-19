import java.util.Scanner;

public class recursion3 {
	public static void main(String [] Args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=scan.nextInt();
		
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("enter the element of an array");
	int e=scan.nextInt();
		
		int Li=getLastIndex(arr,0 ,e);
		System.out.println(Li);
		
		
}
	public static int getLastIndex(int [] arr,int idx,int e) {
		if(idx==arr.length) {
			return -1;
		}
		int lisa=getLastIndex(arr,idx+1,e);
		if(lisa==-1) {
			if(arr[idx]==e) {
				return idx;
			}
			else {
				return -1;
				
			}
		}
			else {
				return lisa;
			}
			
		
	
		
		
	
	

	}
}
	



    // RECURSION PROBLEM 4
//	public static void main(String [] Args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the size of an array");
//		int n=scan.nextInt();
//		
//		int []arr= new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		
//		System.out.println("enter the element of an array");
//		int e=scan.nextInt();
//		
//		int fi=getFirstIndex(arr,0 ,e);
//		System.out.println(fi);
//		
//		
//}
//	public static int getFirstIndex(int [] arr,int idx,int e) {
//		if(idx==arr.length) {
//			return -1;
//		}
//		if(arr[idx]==e) {
//			return idx;
//		}
//		else  {
//			int fisa=getFirstIndex(arr,idx+1,e);
//			return fisa;
//			
//		}
//				
//	}
//	
//	
//	
//}

//RECURSION 3 PROBLEM 3 MAX 

//	public static void main(String [] args) {
//		Scanner scan=new Scanner(System.in) ;
//		System.out.println("enter the size of an array");
//		int n=scan.nextInt();
//		
//		int [] arr= new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=scan.nextInt();
//		}
//		
//		int m=maxElementArray(arr, 0);
//		System.out.println(m);
//	}
//	public static int maxElementArray(int []arr,int idx) {
//		if(idx==arr.length-1) {
//			return arr[idx];
//		}
//		int misa=maxElementArray(arr,idx+1);
//		if(misa>arr[idx]) {
//			return misa;
//		}
//		else  {
//			return arr[idx];
//		}
//	}
//}

	
	//RECURSION 3 PROBLEM 1 AND 2
	
	//	public static void main(String[] Args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the size of an array");
//		int n=scan.nextInt();
//		
//		int []arr=new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=scan.nextInt();
//		}
//		printArray(arr,0);
//		
//	}
//	public static void printArray(int []arr,int idx) {
//		if(idx==arr.length) {
//			return;
//		}
//		
//		printArray(arr,idx+1);
//		System.out.println(arr[idx]);
//	}
//
//}
