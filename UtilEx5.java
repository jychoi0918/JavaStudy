package sist.com.util2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class UtilEx5 {
	 public void listMethod1() {
	 Vector<String> v1 = new Vector<String>();
		v1.addElement("딸기");
		v1.addElement("수박");
		v1.addElement("멜론");
		v1.addElement("땅콩");
		
		
		
		ListIterator<String> i = v1.listIterator();
		i.next();							// index 0 표츌하며 index 1 가리킨다.
		System.out.println(i.previous());   // 이전의 next가  표출한 것으로 되돌아가기
		System.out.println(i.nextIndex());	// next의 index 버전(표출하며 다음것 가리키기)
		
	 
		while(i.hasNext()) 
			System.out.println(i.next());	
		//이전 것이 있다면
		while(i.hasPrevious())
			System.out.println(i.previous());
//		
		
		
		  System.out.println(i.next()); 		// cursor | lastRet | Countmod //
		  System.out.println(i.previous()); 	// 옮겨놓은 cursor의 이전으로 돌아가기 (뒤로가기 
		  System.out.println(i.hasPrevious());  // previous의 상태의 이전 값이 있느뇨?

//---------------Vector 출력의 여러 방법---------------------
		
		for(int ii = 0; ii<v1.size();ii++) {
			System.out.println(v1.get(ii));
			System.out.println(v1.elementAt(ii));	
		}
		
		for(String s :v1) {
			System.out.println(s);
			
		}
		
		Iterator<String> j =v1.iterator();
		for(;j.hasNext();) {
			System.out.println(i.next());
		}
		//열거 반복자 조상? 워드 정리 찾아보기
		Enumeration<String>e = v1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
//---------------------------------------------------------------//		
		
		StringTokenizer s; // 뭐지 이건?
		
		System.out.println(v1.firstElement());//첫번째 요소 출력
		int r = v1.indexOf("딸기")+v1.indexOf("수박"); 
		System.out.println(r);
		
		
		v1.insertElementAt("낑깡", 0); //삽입
		v1.set( 0, "블루베리");		  //삭제
		System.out.println(v1);
		
		
    //	<나의 시도>	
	//	v1.notifyAll(); //뭐가 나오는지 모르겠어.
		v1.remove(0);
		System.out.println(v1);
		
		v1.capacity();//뭘까
		System.out.println(v1);
		
		v1.ensureCapacity(5);
		
	
		
	 }

	 public static void main(String[] args) {
		UtilEx5 u = new UtilEx5();
		u.listMethod1();
		}
}
