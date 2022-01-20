import java.util.Scanner;
public class recursion4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number");
		int  n=scan.nextInt();
		printPath(n,"");
	}
	public static void printPath(int n,String Path) {
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(Path);
			return;
		}
		printPath(n-1,Path + "1");
		printPath(n-2,Path + "2");
		printPath(n-3,Path + "3");
	}
}
	
	
	// RECURSION PROBLEM 3
//	public static void main(String[] args) {
//		Scanner scan=new Scanner (System.in);
//		System.out.println("enter the string");
//		String  str=scan.next();
//		printSS(str,"");
//
//		
//	}
//	static String []codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//	public static void printSS(String ques,String ans) {
//		if(ques.length()==0) {
//			System.out.println(ans);
//			return;
//		}
//		char ch=ques.charAt(0);
//		String ros=ques.substring(1);
//		
//		String codeforch=codes[ch-'0'];
//		for(int i=0;i<codeforch.length();i++) {
//			char cho=codeforch.charAt(i);
//			printSS(ros,ans + cho);
//		}
//		
//	}
//	
//		
//		
//		
//	}


//  RECURSION PROBLEM 2
//		Scanner scan=new Scanner (System.in);
//		System.out.println("enter the string");
//		String str=scan.next();
//		printSS(str,"");
//	}
//	public static void printSS(String ques,String ans) {
//		if (ques.length()==0) {
//			System.out.println(ans);
//			return;
//		}
//		char ch=ques.charAt(0);
//		String ros=ques.substring(1);
//		
//		printSS(ros,ans +ch);
//		printSS(ros,ans + "");
//		
//	}
//}



// RECURSION PROBLEM 3
//	public static void main(String[] args) {
//		Scanner scan=new Scanner (System.in);
//		System.out.println("enter the string");
//		String str=scan.next();
//		
//		printPermutations(str,"");
//		
//
//	}
//	public static void printPermutations(String ques, String afs) {
//		if(ques.length()==0) {
//			System.out.println(afs);
//			return;
//		}
//		for(int i=0;i<ques.length();i++) {
//			char ch=ques.charAt(i);
//			String ql=ques.substring(0,i);
//			String qr=ques.substring(i+1);
//			String ros=ql+qr;
//			printPermutations(ros,afs+ch);
//		}
//		
//	}
//  
//}
