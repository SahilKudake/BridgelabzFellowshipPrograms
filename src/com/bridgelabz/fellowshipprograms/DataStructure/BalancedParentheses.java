package com.bridgelabz.fellowshipprograms.DataStructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class BalancedParentheses {

	public static void main(String[] args) {
		char exp[] = { '{', '[', '(', ')', ']', '}' };
		if (Utility.areBalanced(exp))
			System.out.println("Balanced");
		else
			System.out.println("not Balanced");

	}

}
