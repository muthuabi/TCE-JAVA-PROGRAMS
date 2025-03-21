// package krish_java;
import java.util.Scanner;
public class NRooks {
	public static void display(int matrix[][],int R,int C)
	{
		for(int row=0;row<R;row++)
		{
			for(int col=0;col<C;col++)
			{
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println("");
		}
	}
//	boolean isPossible=false;
	static int possibles=0;
	public static void fillRooks(int matrix[][],int row,int col,int R,int C,boolean rowFlag[], boolean colFlag[])
	{
		if(row==R)
		{
			System.out.printf("\nPossibility %d\n",++possibles);
			display(matrix, R, C);
			System.out.println();
			return;
		}
		if(rowFlag[row])
		{
			fillRooks(matrix,row+1,col,R,C,rowFlag,colFlag);
		}
		for(col=0;col<C;col++)
		{
			if(!rowFlag[row] && !colFlag[col])
			{
				matrix[row][col]=1;
				rowFlag[row]=true;
				colFlag[col]=true;
				fillRooks(matrix, row+1, col, R, C, rowFlag, colFlag);
				matrix[row][col]=0;
				rowFlag[row]=false;
				colFlag[col]=false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int row,col;
		int matrix[][]=new int[R][C];
		boolean rowFlag[]=new boolean[R];
		boolean colFlag[]=new boolean[C];
		for(row=0;row<R;row++)
		{
			for(col=0;col<C;col++)
			{
				matrix[row][col]=sc.nextInt();
				if(matrix[row][col]==1)
					rowFlag[row]=true;
			}
		}
		fillRooks(matrix, 0, 0, R, C, rowFlag, colFlag);
		if(possibles==0)
			System.out.println("ImPossible");
	}

}
