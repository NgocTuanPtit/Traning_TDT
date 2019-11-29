package check;

import java.util.Scanner;
import java.util.Stack;

public class CheckSyntax {

	public static boolean execute(String str) {
		Stack<Character> St_check = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				St_check.push(str.charAt(i));
			}else {
				if(!St_check.empty()) {
					char c = St_check.peek();
					if(str.charAt(i) == ')' && c != '(') {
						return false;
					}else {
						if(str.charAt(i) == ']' && c != '[') {
							return false;
						}else {
							if(str.charAt(i) == '}' && c != '{') {
								return false;
							}
						}
					}
					if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
						St_check.pop();
					}
				}else {
					if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Nhap vao chuoi cua ban:");
			String input = sc.nextLine();
			System.out.println(execute(input));
		}
		
//		Stack<Character> St_check = new Stack<Character>();
//		St_check.push('a');
//		St_check.push('b');
//		St_check.push('c');
//		System.out.println(St_check.peek());
//		System.out.println(St_check.peek());
//		St_check.pop();
//		System.out.println(St_check.peek());
	}
}
