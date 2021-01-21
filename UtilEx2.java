package sist.com.util2;

import java.util.ArrayList;
import java.util.Iterator;

// List
public class UtilEx2 {
	
	public void actionEx1() {
		ArrayList<String>list1 = new ArrayList<String>(); // elementData = {}
		ArrayList<String>list2 = new ArrayList<String>(5); // elementData [][][][][]
		list1.add("����¯");
		list1.add("����¯2");
		list1.add("����¯3");
		list2.add("JunFe");
		list2.add("����¯");
		list2.add("����¯");
		
		System.out.println(list2.size()); //3           ���� �ε���(����Ű�� ��) ����������� �ε���   ���ͷ����� �������� ���Ǵ� ��                   
		
		Iterator<String> i = list1.iterator(); // �ݺ���  // cursor || lastRet || expectedModCount || ModCount : ��������
		list1.remove(0); // ConcurrentModificationException	
						 //�ֳĸ�,list1�� iterator�� �������ִ� expectedModCount �� modCount�� �ٸ��⶧����
		//i.remove(); // IllegalStateExcepion -> iterator ��뵵 ���ϰ� ������������
		//mod
		
		i.next(); // ����¯
		i.next(); // ����¯2
		i.remove(); // ����¯ ����
		System.out.println(i.next()); // ����¯3
		//System.out.println(i.hasNext()); // true
		//System.out.println(i.next());
//		i=list1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		//System.out.println(i.next()); // NoSuchElementException �������� �����
		
		
		/*list1.add("����¯");			 // �ݺ��� ����� ���� add�� list1�� �߰��ϸ� �ݺ��� ������ �ȸ¾Ƽ� (expectedModCount �� modCount)
		System.out.println(i.next()); 	 // ConcurrentModificationException*/
		}
	
	public void actionEx1P() {
		ArrayList<String>list1 = new ArrayList<String>(); // elementData = {}
		ArrayList<String>list2 = new ArrayList<String>(5); // elementData [][][][][]
		list1.add("����¯");
		list1.add("����¯2");
		list1.add("����¯3");
		
		list2.add("JunFe");
		list2.add("����¯");
		list2.add("����¯");
		
		Iterator<String> i = list1.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		i.remove();						//������ next�� ǥ���� ���� ����
		System.out.println(list1);
		
	}
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
		//u.actionEx1();
		u.actionEx1P();
	}
	
}
