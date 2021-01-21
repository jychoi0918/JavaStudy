package sist.com.util2;

import java.util.ArrayList;
import java.util.Iterator;

// List
public class UtilEx2 {
	
	public void actionEx1() {
		ArrayList<String>list1 = new ArrayList<String>(); // elementData = {}
		ArrayList<String>list2 = new ArrayList<String>(5); // elementData [][][][][]
		list1.add("윤하짱");
		list1.add("윤하짱2");
		list1.add("윤하짱3");
		list2.add("JunFe");
		list2.add("지연짱");
		list2.add("수정짱");
		
		System.out.println(list2.size()); //3           현재 인덱스(가리키는 것) 마지막요소의 인덱스   이터레이터 만들어졋을때 기대되는 수                   
		
		Iterator<String> i = list1.iterator(); // 반복자  // cursor || lastRet || expectedModCount || ModCount : 실제갯수
		list1.remove(0); // ConcurrentModificationException	
						 //왜냐면,list1과 iterator가 가지고있는 expectedModCount 와 modCount가 다르기때문에
		//i.remove(); // IllegalStateExcepion -> iterator 사용도 안하고 삭제하지마라
		//mod
		
		i.next(); // 윤하짱
		i.next(); // 윤하짱2
		i.remove(); // 윤하짱 삭제
		System.out.println(i.next()); // 윤하짱3
		//System.out.println(i.hasNext()); // true
		//System.out.println(i.next());
//		i=list1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		//System.out.println(i.next()); // NoSuchElementException 다음것이 없어서요
		
		
		/*list1.add("윤하짱");			 // 반복자 만들어 놓고 add로 list1을 추가하면 반복자 개수랑 안맞아서 (expectedModCount 와 modCount)
		System.out.println(i.next()); 	 // ConcurrentModificationException*/
		}
	
	public void actionEx1P() {
		ArrayList<String>list1 = new ArrayList<String>(); // elementData = {}
		ArrayList<String>list2 = new ArrayList<String>(5); // elementData [][][][][]
		list1.add("윤하짱");
		list1.add("윤하짱2");
		list1.add("윤하짱3");
		
		list2.add("JunFe");
		list2.add("지연짱");
		list2.add("수정짱");
		
		Iterator<String> i = list1.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		i.remove();						//직전의 next가 표출한 값을 삭제
		System.out.println(list1);
		
	}
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
		//u.actionEx1();
		u.actionEx1P();
	}
	
}
