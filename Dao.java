package sist.com.util2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Dao {
	
	private Vector<Member> vector = new Vector<Member>(); //객체 생성	
	private static Dao dao;
	
	public static Dao getDao() { //Dao라는 객체 싱글톤을 하면 사용했던 한 객체를 호출 
		if(dao==null)
			dao = new Dao();
			return dao;
			}
	
	public  void printIterator() {
		Iterator<Member>it = getDao().vector.iterator();//getDao=>싱글톤으로 제작된 Dao 호출!
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

	//id 있는지 없는지 판단하는 메소드 작성
	public boolean idCheck(String id) {
		for (int i = 0; i < vector.size(); i++) {
			if(vector.get(i).getId().equals(id)) return true; //겹치는 id가 있으면 true
		}
		return false;
	}
	
	
	
}
