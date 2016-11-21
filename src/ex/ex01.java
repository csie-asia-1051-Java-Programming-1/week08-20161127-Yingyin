package ex;

import java.util.Scanner;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int vall=sca.nextInt();
	int b=(int) Math.ceil(Math.log(vall)/Math.log(2));
	System.out.println("b="+b);
    fun1(vall,b);
	}

	public static void fun1(int vall, int b) {
		int x=0;
		int data[]=new int[b];
		for(int i=b-1;i>=0;i--)
		{
			data[i]=(vall%2);
			vall/=2;
		}
		for(int i=0;i<b;i++)
		{
			  System.out.print(data[i]);
		}
	}

}
