package sist.com.util2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class UtilEx5 {
	 public void listMethod1() {
	 Vector<String> v1 = new Vector<String>();
		v1.addElement("����");
		v1.addElement("����");
		v1.addElement("���");
		v1.addElement("����");
		
		
		
		ListIterator<String> i = v1.listIterator();
		i.next();							// index 0 ǥ���ϸ� index 1 ����Ų��.
		System.out.println(i.previous());   // ������ next��  ǥ���� ������ �ǵ��ư���
		System.out.println(i.nextIndex());	// next�� index ����(ǥ���ϸ� ������ ����Ű��)
		
	 
		while(i.hasNext()) 
			System.out.println(i.next());	
		//���� ���� �ִٸ�
		while(i.hasPrevious())
			System.out.println(i.previous());
//		
		
		
		  System.out.println(i.next()); 		// cursor | lastRet | Countmod //
		  System.out.println(i.previous()); 	// �Űܳ��� cursor�� �������� ���ư��� (�ڷΰ��� 
		  System.out.println(i.hasPrevious());  // previous�� ������ ���� ���� �ִ���?

//---------------Vector ����� ���� ���---------------------
		
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
		//���� �ݺ��� ����? ���� ���� ã�ƺ���
		Enumeration<String>e = v1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
//---------------------------------------------------------------//		
		
		StringTokenizer s; // ���� �̰�?
		
		System.out.println(v1.firstElement());//ù��° ��� ���
		int r = v1.indexOf("����")+v1.indexOf("����"); 
		System.out.println(r);
		
		
		v1.insertElementAt("����", 0); //����
		v1.set( 0, "��纣��");		  //����
		System.out.println(v1);
		
		
    //	<���� �õ�>	
	//	v1.notifyAll(); //���� �������� �𸣰ھ�.
		v1.remove(0);
		System.out.println(v1);
		
		v1.capacity();//����
		System.out.println(v1);
		
		v1.ensureCapacity(5);
		
	
		
	 }

	 public static void main(String[] args) {
		UtilEx5 u = new UtilEx5();
		u.listMethod1();
		}
}
