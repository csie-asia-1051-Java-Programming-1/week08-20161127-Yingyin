package ex;

import java.util.Scanner;

/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

public class ex04 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		computer cop = new computer();
		float a=sca.nextFloat();
		char b=sca.next().charAt(0);
		float c=0;
		if(b=='+' || b=='*' || b=='/'){
			c=sca.nextInt();
			}
		System.out.println(computer.fun1(a,b,c));
	}		

}

  class computer{
	  
	  public static float fun1(float a,char b,float c){
		  float x=0;
		  switch(b){
		  case '+':
			  x=a+c;
			  break;
		  case '-':
			  x=a-c;
			  break;
		  case '*':
			  x=a*c;
			  break;
		  case '/':
			  x=a/c;
			  break;
		  case '^':
			  x=(float)Math.pow(a, 2);
			  break;
		  case '3':
			  x=(float)Math.pow(a, 3);
			  break;
		  case 'L':
			  x=(float)Math.sqrt(a);
			  break;
		  }
		return x;
	  }
  }