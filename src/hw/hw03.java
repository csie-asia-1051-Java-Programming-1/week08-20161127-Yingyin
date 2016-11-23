package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
public class hw03 {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
    int n=sca.nextInt();
    System.out.println(sum(n));
	}
   public static int sum(int n)
   {
	   if(n>0)
		   return sum(n/2)+n%2;
	   return 0;
   }
}
