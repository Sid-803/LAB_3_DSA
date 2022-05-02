package com.greatlearning.app;
//For a bracket open, there should be bracket close
//push for open and pop for close
import java.util.Stack;

public class BalancingBracket {

	public static boolean checkExpression(String expression) {	
	Stack<Character> expStack = new Stack<Character>();
		for(int i=0;i<expression.length();i++) {
			char exp = expression.charAt(i);
			if(exp=='('||exp=='['|| exp=='{') {
				expStack.push(exp);
				continue;
			}
			if(exp==')') {
				char expPop = expStack.pop();
				if(expPop!='(') {
					return false;
				}	
			}
			if(exp=='}') {
				char expPop = expStack.pop();
				if(expPop!='{') {
					return false;
				}	
			}
			if(exp==']') {
				char expPop = expStack.pop();
				if(expPop !='[') {
					return false;
				}
			}
		}
		return expStack.isEmpty();
	}
	
	public static void main(String[] args) {
		String expression = "([[{}]])"; 
		boolean checkExp = checkExpression(expression);
		if(checkExp) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
}


