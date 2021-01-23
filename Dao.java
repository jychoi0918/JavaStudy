package sist.com.util2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Dao {
	
	private Vector<Member> vector = new Vector<Member>(); //��ü ����	
	private static Dao dao;
	
	public static Dao getDao() { //Dao��� ��ü �̱����� �ϸ� ����ߴ� �� ��ü�� ȣ�� 
		if(dao==null)
			dao = new Dao();
			return dao;
			}
	
	public  void printIterator() {
		Iterator<Member>it = getDao().vector.iterator();//getDao=>�̱������� ���۵� Dao ȣ��!
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void memberAdd(Member member) {
		vector.addElement(member);
	}
	
	
	public int searchIndex(String id) {
		for (int i = 0; i < vector.size(); i++) {
				if(vector.get(i).getId().equals(id))return i;
		}                //elementAt
		return -1;
	}
	
	public Member getMember(int index) {
		return vector.elementAt(index);
	}
	
	public Vector<Member> getVector() {
		return vector;
	}

	public void setVector(Vector<Member> vector) {
		this.vector = vector;
	}

	//id �ִ��� ������ �Ǵ��ϴ� �޼ҵ� �ۼ�
	public boolean idCheck(String id) {
		for (int i = 0; i < vector.size(); i++) {
			if(vector.get(i).getId().equals(id)) return true; //��ġ�� id�� ������ true
		}
		return false;
	}
	
	
	
}
