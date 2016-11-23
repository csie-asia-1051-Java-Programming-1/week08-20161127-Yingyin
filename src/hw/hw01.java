package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
public class hw01 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int n=sca.nextInt();
	System.out.println(tobinary(n));
	}

	public static String tobinary(int n) {
		if(n>0)
		return tobinary(n/2)+n%2;
		return "";
	}

}
