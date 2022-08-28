package com.calculator;

import java.util.Scanner;

public class Calc {
	char ans='y';

	void meth1() {
		System.out.println("=======================Calculator=======================");
		for(;ans=='y';) {//to repeat the operations
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter operation                 ===>             ");
		char c=sc.next().charAt(0);//collecting operation
		int key=(byte)c;
		System.out.print("How many numbers want to enter  ===>             ");
		byte ac=sc.nextByte();//asking array length
		int a[] =new int[ac];
		System.out.print("Please enter"+ac+" numbers           ===>             ");
		for(int i=0;i<ac;i++) {//Initializing array
			a[i]=sc.nextInt();
		}
	//===============switch statement========================
		switch(key) {
	//===============
		case 43:
			int aa=0;
			for(int j=0;j<ac;j++) {
			aa=aa+a[j];
			}
			System.out.println("Addition                        ===>             "+aa);
			break;
	//=============== 
		case 45:
		    int sa=0;
			for(int j=0;j<ac;j++) {
				if(j==0)
			        sa=a[j];
				else
					sa=sa-a[j];
			}
			System.out.println("Subtraction                     ===>             "+sa);
			break;
	//===============
		case 42:
			int ma=1;
			for(int j=0;j<ac;j++) {
			ma=ma*a[j];
			}
			System.out.println("Multiplication                  ===>             "+ma);
			break;
	//===============		
		case 47:
			float da=0f;
			for(int j=0;j<ac;j++) {
				if(j==0)
			        da=(float)a[j];
				else
					da=(float)da/a[j];
			}
			System.out.println("Division                        ===>             "+da);
			break;
	//===============		
		case 37:
			int moa=a[0]%a[1];
			System.out.println("Modulus                         ===>             "+moa);
			break;
	//===============
		default:
			System.out.println("You have entered wrong operation");
			break;
		}
		System.out.println();
		System.out.println("     Do you want to perform another operaton??");
		System.out.print("     Press [y] if YES or Press [n] if NO               ");
		ans=sc.next().charAt(0);
		System.out.println("-------------------------------------------------------");
		}
		System.out.println("---------------------Thank You----------------------");
	}

	public static void main(String[] args) {
		Calc obj=new Calc();
		obj.meth1();
		
		
	}

}
