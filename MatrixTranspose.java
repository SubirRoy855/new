package twoDArray;

import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		System.out.println("Enter the colume: ");
		int colume=sc.nextInt();
		int[][] ar=new int[row][colume];
		System.out.println("Enter the value :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<colume;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		int[][] transpose=new int[colume][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colume;j++) {
				transpose[j][i]=ar[i][j];
			}
		}
		for(int i=0;i<colume;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
