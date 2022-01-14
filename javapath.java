import java.util.Scanner;

public class javapath {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number 1");
		int n1=scan.nextInt();
		System.out.println("enter the number 2 ");
		int n2=scan.nextInt();
		System.out.println("enter the base");
		int b=scan.nextInt();
		int f=subsOfNumber(n1,n2,b);
		System.out.println(f);
	}
	public static int subsOfNumber(int n1, int n2,int b) {
		int rv=0;
		int c=0;
		int p=1;
		while(n1>0) {
		int d1=n1%10;
		n1=n1/10;
		
		int d2=n2%10;
		n2=n2/10;
		
		int d=0;
		d1=d1+c;
		if(d1>=d2) {
			c=0;
			d=d1-d2;
		}
		else {
			c=-1;
			d=d1+8-d2;
			
			
		}
		rv = rv+d*p;
		p=p*10;
				
		
	}
	return rv;
}
}
//	public static void main(String [] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number 1");
//		int n1=scan.nextInt();
//		System.out.println("enter the number 2 ");
//		int n2=scan.nextInt();
//		System.out.println("enter the base");
//		int b=scan.nextInt();
//		int f=sumOfNumber(n1,n2,b);
//		System.out.println(f);
//	}
//	public static int sumOfNumber(int n1, int n2,int b) {
//		int c=0;
//		int rv=0;
//		int p=1;
//		while(n1>0 || n2>0 || c>0) {
//			int dig1=n1%10;
//			int dig2=n2%10;
//			n1=n1/10;
//			n2=n2/10;
//			
//			int d=dig1+dig2+c;
//		     c=d/b;
//		     d=d%b;
//		     
//		     rv +=d *p;
//		     p=p*10;
//			
//		}
//		return rv;
//	}
//	
//}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String [] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		System.out.println("enter the base ");
//		int b=scan.nextInt();
//		System.out.println("enter the destination base");
//		int bd=scan.nextInt();
//		int f=getBaseToBase(n,b,bd);
//		System.out.println(f);
//		
//	}
//	public static int getBaseToBase(int n , int b, int bd ) {
//		
//		int dec=getBaseInValue(n,b);
//		int rv=getValueInBase(dec,bd);
//		
//		return rv;
//		
//	}
//	public static int getValueInBase(int n ,int b) {
//		int rv=0;
//		int p=1;
//		while(n>0) {
//			int dig=n%b;
//			n=n/b;
//			 
//			rv +=dig*p;
//			p=p*10;
//			
//		}
//		return rv;
//	}
//	
//	public static int getBaseInValue(int n ,int b) {
//		int rv=0;
//		int p=1;
//		while(n>0) {
//			int dig=n%10;
//			n=n/10;
//			 
//			rv +=dig*p;
//			p=p*8;
//			
//		}
//		return rv;
//	}
	
	 
//	}
	
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		System.out.println("enter the base");
//		int b=scan.nextInt();
//		int f=getValueInBase(n,b);
//		System.out.println(f);
//	
//	}
//	public static int getValueInBase(int n ,int b) {
//		int rv=0;
//		int p=1;
//		while(n>0) {
//			int dig=n%10;
//			n=n/10;
//			 
//			rv +=dig*p;
//			p=p*8;
//			
//		}
//		return rv;
//	}
//}
//	public static void main(String [] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=scan.nextInt();
//		System.out.println("enter the second number");
//		int d=scan.nextInt();
//		int f=getDigitFrequency(n,d);
//		System.out.println(f);
//	}
//	
//	public static int getDigitFrequency(int n ,int d) {
//		
//		int rv=0;
//		while(n>0) {
//			int dig =n%10;
//			n=n/10;
//			
//			if(dig==d) {
//				rv++;
//			}
//		}
//		return rv;
//	}
	
//}
		
	
//	public static String togglecase(String str) {
//		StringBuilder sb = new StringBuilder (str);  //without usuing stringbuilder the string str coud.nt work
//		
//		for(int i=0;i<sb.length();i++) {
//			char ch =sb.charAt(i);
//			
//			if(ch>= 'a' && ch <= 'z') {
//				
//				char uch =(char)('A'+ ch - 'a');    //we use (char) because operators after string return intiger values
//				sb.setCharAt(i,uch);  //to remember to update the char at i
//				
//				
//			}
//			else if(ch>='A' && ch<='Z') {
//				char lch =(char)('a'+ ch -'A');
//				sb.setCharAt(i,lch); //to remember
//			}
//			
//		}
//		return sb.toString();   //to remember
//	}
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//	
//		    Scanner scan=new Scanner(System.in);
//		    System.out.println("enter the string");
//		    String str = scan.next();
//		   System.out.println( togglecase(str));			
						
		
//	    Scanner scan=new Scanner(System.in);
//	public static String compression1(String str) {
//		String s = str.charAt(0) + "";
//		
//		for(int i=1;i<str.length();i++) {
//			char curr=str.charAt(i);
//			char prv=str.charAt(i-1);
//			
//			if(curr!=prv) {
//				s += curr;
//			} 
//			
//		}
//		
//		return s;
//	}
//	
//	public static String compression2(String str) {
//      String s = str.charAt(0) + "";
//        int count=1;
//		
//		for(int i=1;i<str.length();i++) {
//			char curr=str.charAt(i);
//			char prv=str.charAt(i-1);
//			
//			if(curr==prv) {
//				count++;
//			} 
//			else {
//				if (count>1) {
//				s+=count;
//				count=1;
//			}
//			s+=curr;
//		}
//		
//		
//	
//		if (count>1) {
//			s+=count;
//			count=1;
//		}
//		}
//		return s;
//	}
//	
//		
//		
//		
//		
//	
//	public static void main(String[] args) {
//    Scanner scan=new Scanner(System.in);
//    System.out.println("enter the string");
//    String str = scan.next();
//    System.out.println(compression1(str));
//	System.out.println(compression2(str));
				
//	public static boolean isPalindrome(String s) {
//		int i=0;
//		int j=s.length()-1;
//		while(i<=j) {
//			char ch1 = s.cha rAt(i);
//			char ch2 = s.charAt(j);
//			
//			if(ch1 != ch2) {
//				return false;
//				
//			}
//			else {
//				i++;
//				j--;
//			}
//		}
//		return true;
//	}
//
//	public static void solution(String s) {
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				String ss = s.substring(i,j);
//				if(isPalindrome(ss)==true) {
//					System.out.println(ss);
//					
//				}
//			}
//			
//		}
//		
//	}
//	
//		
//public static void main(String[] args) {	
//Scanner scan=new Scanner(System.in);
//System.out.println("enter the string");
//String str=scan.next();
// solution (str);
// 
 




//System.out.println("enter the number r");
//   int r= scan.nextInt();
//  System.out.println("enter the number c");
//  int c= scan.)nextInt();
//  int [][] arr= new int[r][c];
//  for(int i=0;i<r;i++) {
//	for(int j=0;j<c;j++) {
//	 arr[i][j]=scan.nextInt();
//	 }
//  }
  




//  int dir=0; //0:east ,1:south ,2:west ,3:north, 
//  int i=0;
//  int j=0;
//  
//  while (true) {
//	  dir= (dir+arr[i][j])%4;  //most imp line
//	  if(dir==0) {
//		  j++;
//		 
//	  }
//	  else if(dir==1) {
//		  i++;
//		  
//	  }
//	  else if(dir==2) {
//		  j--;
//		  
//	  }
//	  else if(dir==3) {
//		  i--;
//	  }
//	  if(i<0) {
//		  i++;
//		  break;
//		  
//	  }
//	  else if(j<0) {
//		  j++;
//		  break; 
//	  }
//	  else if(i==arr.length) {
//		  i--;
//		  break;
//	  }
//	  else if (j==arr[0].length) {
//		  j--;
//		  break;
//	  }
//		  
//	  
//  }
//  System.out.println(i);
//  System.out.println(j);
//  
  
  
//  int minr=0;
//  int minc=0;
//  int te=r*c;
//  int count=0;
//  
//  int maxr=arr.length-1;
//  int maxc=arr[0].length-1;
//  while(count<te) {
//	  //left wall
//	  for(int i= minr, j= minc;i<=maxr&&count<te;i++){
//		  System.out.println(arr[i][j]);
//		   count++;
//	  }
//		  minc++;
//	  
//	  //bottom wall
//	  for(int i= maxr, j= minc;j<=maxc&&count<te;j++){
//		  System.out.println(arr[i][j]);
//		  count++;
//	  }
//		  maxr--;
//	  
//	  
//	  //right wall
//	  for(int i= maxr, j= maxc;i>=minr&&count<te;i--){
//		  System.out.println(arr[i][j]);
//		  count++;
//	  }
//		  maxc--;
//	  
//	  
//	  // top wall
//	  for(int i= minr, j= maxc;j>=minc&&count<te;j--){
//		  System.out.println(arr[i][j]);
//		  count++;
//	  }
//		  minr++;
//	  
//  }
//  
  
  
  
  
  
//  for(int j=0;j<arr[0].length;j++) {
//	  if(j%2 == 0 ) {
//		  for(int i=0;i<arr.length;i++) {
//			  System.out.println(arr[i][j] );
//		  
//	  }
//	  }
//	  else {
//		  for (int i=arr.length-1;i>=0;i--) {
//			  System.out.println(arr[i][j]);
//			  
//		  }
//	  }
//	  
//  }
//		System.out.println("enter the number r1");
//	int r1= scan.nextInt();
//	System.out.println("enter the number c1");
//	int c1= scan.nextInt();
//	int [][] arr1= new int[r1][c1];
//	for(int i=0;i<r1;i++) {
//		for(int j=0;j<c1;j++) {
//		 arr1[i][j]=scan.nextInt();
//		}
//	
//	}
//	System.out.println("enter the number r2");
//	int r2= scan.nextInt();
//	System.out.println("enter the number c2");
//	int c2= scan.nextInt();
//	int [][] arr2= new int[r2][c2];
//	for(int i=0;i<r2;i++) {
//		for(int j=0;j<c2;j++) {
//		 arr2[i][j]=scan.nextInt();
//		}
//	
//	}
//	if(c1!=r2) {
//		System.out.println("invalid input");
//		return;
//	}
//		int [][]prd=new int[r1][c2];
//		for(int i=0;i<prd.length;i++) {
//			for(int j=0;j<prd[0].length;j++) {
//				for(int k=0;k<c1;k++) {
//					prd[i][j] += arr1[i][k] * arr2[k][j];
//				}
//				
//			}
//		}
//		for(int i=0;i<prd.length;i++) {
//			for (int j=0;j<prd[0].length;j++) {
//				System.out.print(prd[i][j] + " ");
//			}
//			System.out.println();
//		}
//	

//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			System.out.print(arr[i][j] + "\t");
//		}
//		System.out.println();
//	}
//	int a=0; 
//	int b=1;
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print(a + "\t");
//			int c=a+b;
//			a=b;
//			b=c;
//		}
//		System.out.println();
//	}
//	int value =1;
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print(value +"\t" );
//			value++;
//		}
//		System.out.println();
//	}
//	int os=n/2;
//	int is=-1;
//	for(int i=1;i<=n;i++) {
//		//System.out.println( os+ " ," + is);
//		for(int j=1;j<=os;j++) {
//			System.out.print("\t");
//		}
//		System.out.print("*\t");
//		for(int j=1;j<=is;j++) {
//			System.out.print("\t");
//		}
//		if(i>1 && i<n) {
//			System.out.print("*\t");
//			
//		}
//		if(i<=n/2) {
//			os--;
//			is +=2;
//		}
//		else {
//			os++;
//			is-=2;
//		}
//		System.out.println();
//	}
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			if (i==j || i+j==n+1){
//			System.out.print("*\t");
//			
//		}
//		else {
//			System.out.print("\t");
//		}
//		}
//		System.out.println();
//	
//	}
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			if (i==j){
//			System.out.print("*\t");
//			
//		}
//		else {
//			System.out.print("\t");
//		}
//		}
//		System.out.println();
//	
//	}
	
//	int sp=1;
//     int str=n/2+1;
//	for(int i=1;i<=n;i++) {
//	//System.out.println(sp + "" + str);
//		for(int j=1;j<=str;j++) {
//			System.out.print("*\t");
//			}
//		
//	for(int j=1;j<=sp;j++) {
//			System.out.print("\t");
//		}
//	for(int j=1;j<=str;j++) {
//	System.out.print("*\t");
//	}
//	if(i<=n/2) {
//			sp +=2;
//			str --;
//		}
//		else {
//			sp-=2;
//			str ++;
//		}
//		System.out.println();
//	}
	
//	int sp=n/2;
//	int str=1;
//	for(int i=1;i<=n;i++) {
//		//System.out.println(sp + "" + str);
//		for(int j=1;j<=sp;j++) {
//			System.out.print("\t");
//		}
//		for(int j=1;j<=str;j++) {
//			System.out.print("*\t");
//		}
//		if(i<=n/2) {
//			sp--;
//			str +=2;
//		}
//		else {
//			sp++;
//			str -=2;
//		}
//		System.out.println();
//	}
//	int sp = 0;
//	int str=n;
//	for(int i=1;i<=n;i++) {
//		//System.out.println(sp+" "+str);
//		for(int j=1;j<=sp;j++) {
//			System.out.print("\t");
//		}
//		for(int j=1;j<=str;j++) {
//			System.out.print("*\t");
//		}
//		sp++;
//		str--;
//		System.out.println();
//	}
	
//	int sp = n-1;
//	int str=1;
//	for(int i=1;i<=n;i++) {
//		//System.out.println(sp+" "+str);
//		for(int j=1;j<=sp;j++) {
//			System.out.print("\t");
//		}
//		for(int j=1;j<=str;j++) {
//			System.out.print("*\t");
//		}
//		sp--;
//		str++;
//		System.out.println();
//	}
//	
	
//	for(int i=n;i>=1;i--) {
//	for(int j=1;j<=i;j++) {
//			System.out.print("*\t");
//		}
//		System.out.println();
//	}
	
	
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*\t");
//			}
//			System.out.println();
//		}
	//	Scanner scan=new Scanner(System.in);
		

//		System.out.println("enter the number");
	//	int n= scan.nextInt();
//     	
//     	System.out.println("enter the k number");
//     	int k= scan.nextInt();
//     	int temp=n;
//     	int nod=0;
//     	while(temp>0) {
//     		temp=temp/10;
//     		nod++;
//     	}
//     	 
//     	int div=(int)Math.pow(10, k);
//     	int mul=(int)Math.pow(10,nod-k );
//     	 
//     	int q=n/div;
//     	
//     	int r=n%div;
//     	
//     	int fn= r*mul +q;
//     	System.out.println(fn);
//     	
     	
//     	System.out.println("enter the number");
//     	int arr[]=new int[k];
//     	for(int i=0;i<k;i++) {
//     	//	System.out.println("enter the number");
//     		 arr[i]=scan.nextInt();
//     	
//     	}
//     	for(int i=0;i<k;i++) {
//     		System.out.print(arr[i]);
//     	}
//     	System.out.println("enter the value of s");
//     	int s=scan.nextInt();
//     	int r=k-s;
//     	for(int i=k;i>r;i--) {
//     		System.out.print(arr[i]);
//     	}
//     	for(int i=0;i<s;i++) {
//     		System.out.println(arr[i]);
//     	}
     	
     	
//     	int count=0;
//     	while(n>0) {
//     		int dig = n%10;
//     		n=n/10;
//     		System.out.println(dig);
//     	}
     	
//     	int inv=0;
//     	int op=1;
//     	while(n!=0) {
//     		int od=n%10;
//     		int id = op;
//     		int ip = od;
//     		inv=inv+ id*(int)Math.pow(10,ip-1 );
//     				n=n/10;
//     		op++;
//     	}
//     	System.out.println(inv);
//     	
     	
//     	int count=0;
//		
//		while(n !=0) {
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);
//		int d= (int)Math.pow(10, count-1);
//		while(n!=0) {
//			int q = n/d;
//			System.out.println(q);
//			
//			n = n % d;
//			d = d / 10;
//		}
		
		
     	
//		int count=0;
//		
//		while(n !=0) {
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);
//		int a=0;
//		int b=1;
//	    for(int i=0;i<n;i++) {
//	    	System.out.println(a);
//	    	int c=a+b;
//	    	a=b;
//	    	b=c;
//	    	
//	    	
//	    }
		
		
//		System.out.println("enter the higher number");
//		int h= scan.nextInt();
//		for(int i=l;i<=h;i++) {
//			int count=0;
//			for(int div=2;div*div<=h;div++) {
//				if(i%div==0) {
//					count++;
//					break;
//				}
//				
//			}
//			if (count==0) {
//				System.out.println(i);
//			}
//			
//		}
		

//	}
//}
	
		
	
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n= scan.nextInt();
//		for(int i=0;i<n;i++) {
//			int t =  scan.nextInt();
//			int count=0;
//			for(int div=0;div<=t;div++) {
//				if(t%div==0) {
//					count++;
//				}
//			}
//			if(count == 2) {
//				System.out.println("prime");
//			}
//			else {
//				System.out.println("non prime");
//			}
//		}
//		
//	}
//}
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your age: ");
//		int age = sc.nextInt();
//		
//		 System.out.println(age);
//		System.out.println(19>18);
//		
//		if(age>18) {
//			System.out.println("you can vote");
//		} else {
//			System.out.println("you cannot vote");
//		}
		// switch case
//		char grade = 'r';
//		 
//		switch(grade) {
//		case 'a':
//			System.out.println("your grade is very good");
//			break;
//		case 'b':
//			System.out.println("vey good,keep learning");
//			break;
//		case 'c':
//			System.out.println("nice ,keep going");
//			break;
//		default:
//			System.out.println("invalid grade");
//			
//		}
//		System.out.println("manik"+i);
//			for(int i = 0; i<10; i++) {
//			
//		}
//		int a = 23;
//		while(true) {
//			System.out.println(a);
//			a++;
//			if( a>100 ) {
//			break;
//		}
//		}
		//array
//		int marks[]= new int[5];
//		marks[0]=23;
//		marks[1]=67;
//		marks[2]=45;
//		marks[3]=99;
//		marks[4]=100;
//		int marks[]= {23,67,45,99,100};
////		
//		for(i=0;i<marks.length;i++) {
//		System.out.println(marks[i]);
//		}
//	}
	//	int a[][]=new int[2][3];
		//or
//		int a[][]= {
//				{
//					1,2
//				},{
//					3,4
//				}
//		};
//	System.out.println(average(3,6));
//	}
////		System.out.println(a[1][0]);
//		
//			//methods or functions
//		//main is a datatype.functions are datatypes which are generated by ourselves and can be called whenever we want.
//	 System.out.println(average(3,6));
//	}
//	       static int average(int firstNumber , int secondNumber) {
//		int sum = firstNumber + secondNumber;
//		return sum/2;
		
	


 