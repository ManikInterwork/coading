import java.util.Scanner;

public class recursion5 {
	public static void main(String [] Args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of rows and columns");
	int n=scan.nextInt();
	
	int [][] arr=new int [n][n];
	
	printNQueens(arr,"",0);
	
	
	}
	public static void printNQueens(int [][] arr,String qsf,int row) {
		if(row==arr.length) {
			System.out.println(qsf);
			return;
		}
		for(int col=0;col<arr.length;col++) {
			if(isThatTheRightPlace(arr,row,col)==true) {
			arr[row][col]=1;
			printNQueens(arr,qsf + row + "-" + col + ",",row +1 );
			arr[row][col]=0;
		}
		}
	}
	public static boolean isThatTheRightPlace(int [][]arr,int row, int col) {
	for(int i=row-1,j=col;i>=0;i--) {
		if(arr[i][j]==1) {
			return false;
		}
	}
	for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
		if(arr[i][j]==1) {
			return false;
		}
	}
	for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++) {
		if(arr[i][j]==1) {
			return false;
		}
	}
	return true;
	
	}
}
	

//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the length of the array");
//		int n=scan.nextInt();
//		
//		int []arr=new int [n];
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		System.out.println("enter the target value");
//		int t=scan.nextInt();
//		
//		printTargetSumSubset(arr,0,"",0,t);
//		
//		
//	}
//	public static void printTargetSumSubset(int []maze,int idx, String set, int sum,int t) {
//		if(idx==maze.length) {
//		if(sum==t) {
//			System.out.println(set+ ".");
//		}
//			return;
//		}
//		
//		printTargetSumSubset(maze,idx+1,set + maze[idx] + "," ,sum + maze[idx] ,t );
//		printTargetSumSubset(maze,idx+1,set  ,sum ,t );
//	}
//}
	
	
	
	//RECURSION 5 PROBLEM 1 FLOOD FLOW
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int r=scan.nextInt();
//		System.out.println("enter the number of columns");
//		int c=scan.nextInt();
//		
//		int [][]arr=new int [r][c];
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				arr [i][j]=scan.nextInt();
//				
//			}
//		}
//		boolean [][] visited=new boolean[r][c];
//	    printFloodFlow(arr,0,0,"",visited);
//	}
//	public static void printFloodFlow(int [][] maze, int sr,int sc, String psf,boolean[][] visited) {
//		if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length ||  maze[sr][sc]==1 || visited[sr][sc]== true) {
//			return;
//		}
//		if(sr==maze.length-1 && sc==maze[0].length-1) {
//			System.out.println(psf);
//			return;
//			
//		}
//		
//		visited[sr][sc]=true;
//		printFloodFlow(maze,sr-1,sc,psf + "t",visited);
//		printFloodFlow(maze,sr,sc-1,psf + "l",visited);
//		printFloodFlow(maze,sr+1,sc,psf + "d",visited);
//		printFloodFlow(maze,sr,sc+1,psf + "r",visited);
//		visited[sr][sc]=false;		
//		
//		
//		
//		
//	}
//
//}
