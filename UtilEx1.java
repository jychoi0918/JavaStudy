package sist.com.util2;

import java.util.StringTokenizer;

public class UtilEx1 {
	
	//StrignBuffer����ϱ�
	public void actionEx1() {
		
	//append�� �ּҿ� �ٽ� ���� �߰�
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT EMPNO, ENMAE, SAL ")
		  .append("FROM EMP ")
		  .append("WHERE SAL = 3000 ")
		  .append("GROUP BY DEPTNO");
		//String sb2 = sb.append("Something"); sb2�� sb�� ���� ���� ����Ų��.
	
		sb.insert(0, 5>3); 	//(index, boolean)(�Ҹ� �������� �ִ´�) ���� ���ڿ��� ����, boolean���� ������ true, false(���ڿ� ��������)
		sb.deleteCharAt(0); // True���� 0��°�� T�� ���ư�
		sb.delete(0, 4); 	// 0<x<4 ���� ���ڿ� ����
		System.out.println(sb.capacity()); // capacity : �迭�� ���̰�
		sb.reverse();		// ������
		System.out.println(sb);
	}
	
	
	//���ڿ� �����
	public void actionEx2(String data) {
		if(data.startsWith("[STONE]")) { // [STONE]���� �����ϸ� true
			int x = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[0].split("=")[1]); // " "���� 0��°�� "="���� 1��° ��
			int y = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[1].split("=")[1]);
			//Integer.parseInt : ���ڿ��� ���ڷ� ��ȯ   substring("]"): �ش繮�ڿ����� ����
			//���� �� X=100 Y=250��  split(" ") :�� �������� �߶�, [0]��° �ε����� split(=) : �� �������� �迭�� �����  [1]��° ����        
			System.out.println(x + " + "+y+" = "+(x+y));
		}
	}
	
	public void actionEx3(String value) {				//string��  �ڱ��ڽ��� ������ ���� ���ο� ��Ʈ���� �����Ͽ� ����� �ڷḦ �־����
		System.out.println(value.replace('a', 'z'));  // 
		System.out.println(value.replace("b", "UU")); // ���ڿ� ��ȯ
		String value1 = value.replace('a', 'z'); 
		// replace�� �ؼ� ��ȯ�� ���� return �ϴ� �ͻ����� ������ �ٲ�� ���� �ƴϴ�.
		//=> �׷��� value�� ����( ���� �����ʰ�, �ٽ� ����ϸ� ���� ������ �ʴ´�.
		System.out.println(value1);
		System.out.println(value1.equals("ZBC")); // false
		System.out.println(value1.equals("ZBC".toLowerCase())); // �ҹ��ڷ� ����, true
		System.out.println(value.trim().equals("zbc")); // trim�� ���ڿ� �¿� ���� ������.
		System.out.println(value1.replace(" ", "").equals("zbc")); // ������ ���ڿ� ���̿� ���� ��� replace�� ����
		
	}
	//String �� �ڸ��� Ŭ����
	public void actionEx4() {
		StringTokenizer s = new StringTokenizer("2021/9/1","/"); // �Ķ���� ���� �����ڴ� ���ǹ�
		System.out.println(s.countTokens()); //��ū�� ������ ���� �ִ�. 
		/*
		 * while(s.hasMoreElements()) { System.out.println(s.nextElement() instanceof
		 * Integer); // String�� Integer�� ����ȯ�� �� ����. String���� instanceof �غ��� true };
		 */
		
		  for(;s.hasMoreTokens();) { //���� while���� ���� �����ϸ� next�� �� ���� �����̱� ������ �̰� �ȵ��ư�.
		  System.out.println(s.nextToken()); }
		 
	}
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
		//u.actionEx1();
		//u.actionEx2("[STONE]X=100 Y=250");
		//u.actionEx2("[WIN]BLUE");
		//u.actionEx3("abc");
		u.actionEx4();
		
	}
}
