package ex;

import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入进制：");
		int kind1=scan.nextInt();//第一个数属于哪种进制
		System.out.println("输入要转换的数字 n：");
		int n=scan.nextInt();
		System.out.println("输入要将 n 转换成为的进制：");
		int res=scan.nextInt();//转换为res进制
		int temp=0;//十进制
		int i=0;
		while(n>0){
			temp+=(n%10)*(Math.pow(kind1, i++));
			n/=10;
		}
		int ans[]=new int[100];//res进制结果
		int len=0;
		while(temp>0){
			ans[len++]=temp%res;
			temp/=res;
		}
		for(int j=len-1;j>=0;j--){
			System.out.print(ans[j]);
		}
	}

}
