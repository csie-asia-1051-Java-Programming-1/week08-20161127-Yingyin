package hw;

import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
public class hw02 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int kind1=sca.nextInt();
	int n=sca.nextInt();
	int kind2=sca.nextInt();
	System.out.println(tokind2Decimal(kind2,tenDecimal(n,kind1,0),0));
	}
   public static int tenDecimal(int n,int kind1,int i)
   {
	   if(n>0)
		   return (int)(tenDecimal(n/10,kind1,i+1)+(n%10)*(Math.pow(kind1, i)));
	   return 0;
   }
   public static String tokind2Decimal(int kind2,int ten,int i)
   {
	   if(ten>0)
		   return tokind2Decimal(kind2,ten/kind2,i+1)+ten%kind2;
	   return "";
   }
}
