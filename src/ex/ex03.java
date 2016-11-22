package ex;

import java.util.Scanner;

/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

public class ex03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,m1,n2,m2;
		n1=scan.nextInt();
		m1=scan.nextInt();
		n2=scan.nextInt();
		m2=scan.nextInt();
		int arr1[][]=new int[n1][m1];
		int arr2[][]=new int[n2][m2];
		int ans[][]=new int[n1][m2];
		for(int i=0;i<n1;i++){
			for(int j=0;j<m1;j++){
				arr1[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<n2;i++){
			for(int j=0;j<m2;j++){
				arr2[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<n1;i++){
			for(int j=0;j<m2;j++){
				int temp=0;
				for(int k1=0;k1<m1;k1++){
					temp+=(arr1[i][k1]*arr2[k1][j]);
				}
				ans[i][j]=temp;
			}
		}
		for(int i=0;i<n1;i++){
			for(int j=0;j<m2;j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}

}
