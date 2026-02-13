package com.bnmit;

public class GreatestNumber {
public int findGreatest(int num1, int num2, int num3) {
	int greatest = num1;

	if(num2 > greatest) {
		greatest = num2;
	}

	if(num3 > greatest) {
		greatest = num3;
	}

	return greatest;
}

public static void main(String[] args) {
	GreatestNumber gn = new GreatestNumber();
	int a =10, b = 25, c = 15;
	int greatest = gn.findGreatest(a, b, c);
	System.out.println("The greatest number among " + a + ", " + b + ", and " + c + " is: " + greatest);
}
}
