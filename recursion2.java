import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class recursion2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		ArrayList<String>Path=getPaths(n);
		System.out.println(Path);
	}
	
	 public static ArrayList<String>getPaths(int n){
		 if(n==0) {
			 ArrayList<String>bres=new ArrayList<>();
			 bres.add("");
			 return bres;
			 
		 }
		 else if(n<0) {
			 ArrayList<String>bres=new ArrayList<>();
			 return bres;
		 }
		 ArrayList<String>Path1=getPaths(n-1);
		 ArrayList<String>Path2=getPaths(n-2);
		 ArrayList<String>Path3=getPaths(n-3);
		 
		 ArrayList<String>yui=new ArrayList<>();
		 

		 for(String pathu:Path1) {
			 yui.add(1 + pathu);
		 }
		 for(String pathu:Path2) {
			 yui.add(2 + pathu);
		 }
		 for(String pathu:Path3) {
			 yui.add(2 + pathu);
		 }
		return yui;
	}
	
}

// MOBILE KEYPAD EXAMPLE RECURSION PROBLEM 2

//	public static void main(String [] Args) throws Exception {
//		Scanner scan =new Scanner(System.in);
//		System.out.println("enter the number");
//		String  str=scan.nextInt();
//		
//		ArrayList<String>word=gss(str);
//		System.out.println(word);
//		
//		
//	}
//	static String[] codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//	public static ArrayList<String>gss(String str){
//		if(str.length()==0) {
//			ArrayList<String>bres=new ArrayList<>();
//			bres.add("");
//			return bres;
//		}
//		
//		char ch=str.charAt(0);
//		String ros=str.substring(1);
//		 
//		ArrayList<String>rres=gss(ros);
//		
//		ArrayList<String>mres=new ArrayList<>();
//		String codeforch=codes[ch];
//		for(int i=0;i<codeforch.length();i++) {
//			char chcode=codeforch.charAt(i);
//			for(String rstr:rres) {
//				mres.add(chcode + rstr);
//			}
//			
//			
//		}
//		return mres;
//		
//		
//	}
//}
	
	//RECURSION 2 PROBLEM 1 
	
	
//	public static void main(String [] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the string");
//		String str=scan.next();
//		ArrayList<String>res=gss(str);
//		System.out.println(res);
//	}
//	public static ArrayList<String>gss(String str){
//		if(str.length()==0) {
//			ArrayList<String>bres=new ArrayList<>();
//			bres.add("");
//			return bres;
//		}
//		char ch=str.charAt(0);
//		String ros=str.substring(1);
//		ArrayList<String>rres=gss(ros);
//		
//		ArrayList<String>mres=new ArrayList<>();
//		for(String rstr:rres) {
//			mres.add(" " + rstr);
//			mres.add(ch + rstr);
//		}
//		return mres;
//	}
//	
//}

//	public static void main(String[] args) {
//		String str="hello";
//		System.out.println(str);
//		//char ch=str.charAt(0);
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			System.out.println(ch);
//		}
//		
//		
//		
//		
//		
//		
//
//	}

//}
