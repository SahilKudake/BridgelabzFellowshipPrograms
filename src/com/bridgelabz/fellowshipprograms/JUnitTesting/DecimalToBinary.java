package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print("Enter a decimal no to convert into binary: ");
		int num = Utility.IntegerInput();
		Utility.toBinary(num);

	}

}