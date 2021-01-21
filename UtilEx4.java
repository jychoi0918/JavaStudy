package sist.com.util2;

import java.util.Stack;

public class UtilEx4 {
	
	public void stackMethod() {
		Stack<String> stack = new Stack<String>(); // 선입후출
		stack.push("A"); // 순서대로 stack에 넣음
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack.pop()); 		// stack의 맨 위에있는 data 표출하며 삭제(pop!)
		System.out.println(stack.peek());		// 그다음 제일 꼭대기에 있는 peek을 표출
		System.out.println(stack.peek()); 		// 위와 동일하게 제일 꼭대기에 있는 peek 표출
		System.out.println(stack.pop()); 		// 그 다음 맨위에 있는 data 표출 하며 터뜨리기!
		System.out.println(stack.pop()); 		// 2번째 들어간 B 꺼내면서 B 출력
		System.out.println(stack.peek()); 		// 남아있는 A출력
		System.out.println(stack.search("A"));	// 스택 맨 아래는 1로 시작한다. 
		stack.clear();							// 청소를 합니다.				
		System.out.println(stack.empty()); // true
	}
	
	public static void main(String[] args) {
		UtilEx4 u = new UtilEx4();
		u.stackMethod();
	}
}
