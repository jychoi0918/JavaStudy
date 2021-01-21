package sist.com.util2;

import java.util.Stack;

public class UtilEx4 {
	
	public void stackMethod() {
		Stack<String> stack = new Stack<String>(); // ��������
		stack.push("A"); // ������� stack�� ����
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack.pop()); 		// stack�� �� �����ִ� data ǥ���ϸ� ����(pop!)
		System.out.println(stack.peek());		// �״��� ���� ����⿡ �ִ� peek�� ǥ��
		System.out.println(stack.peek()); 		// ���� �����ϰ� ���� ����⿡ �ִ� peek ǥ��
		System.out.println(stack.pop()); 		// �� ���� ������ �ִ� data ǥ�� �ϸ� �Ͷ߸���!
		System.out.println(stack.pop()); 		// 2��° �� B �����鼭 B ���
		System.out.println(stack.peek()); 		// �����ִ� A���
		System.out.println(stack.search("A"));	// ���� �� �Ʒ��� 1�� �����Ѵ�. 
		stack.clear();							// û�Ҹ� �մϴ�.				
		System.out.println(stack.empty()); // true
	}
	
	public static void main(String[] args) {
		UtilEx4 u = new UtilEx4();
		u.stackMethod();
	}
}
