package com.prodapt.basics;

public class SITotalAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=5000;
		int n=5;
		int r=15;
		int si;
		si=(p*n*r)/100;
		System.out.println("The simple interest is "+si);
		int totalAmt=p+si;
		System.out.println("The total amount is "+totalAmt);

	}

}
