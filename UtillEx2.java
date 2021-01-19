package sist.com.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

//List,
public class UtillEx2 {

	
	public void process1() {
		String [] str = {"Java","Oracle","Java","Jsp","Spring","Spring","Spring"};
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
	
		for (int i = 0; i < str.length; i++) {
			if(!set1.add(str[i])) {     //중복되어서 저장되지 않으면
				if(!set2.add(str[i])) {
					set3.add(str[i]);
				}
			}
		}
	
		/*
		 * System.out.println(set1);
		 * System.out.println(set2); 
		 * System.out.println(set3);
		 * System.out.println(set1.add("Java"));//더해지지 않았다는 것이야!
		 * System.out.println(set1.add("Ja"));//안에 중복되는 값이 있어서 들어가진다!!
		 */
	
		/*
		 * Iterator<String> i1 = set1.iterator(); 
		 * while(i1.hasNext())
		 * System.out.println(i1.hasNext());
		 */
		
		/*
		 * System.out.println(set2.iterator().next()); // 똑같은 자리 반복!
		 * System.out.println(set2.iterator().next());
		 */
		
		//set2 = (HashSet<String>set1.clone()); 놓쳐 버렸다!
		
		
		/*
		 * set1.clear();
		 * System.out.println(set1.toString());
		 */
		
		System.out.println(set1);
		System.out.println(set1.contains("Java")); //set1이 "Java"라는 것을 가지고 있는가 확인가능
	}
	
	public void process2() {
		HashSet<Person>set1 =new HashSet<Person>(); //객체를 받는 자료구조
		Person p1 = new Person("한성준");
		Person p2 = new Person("한성준");
		Person p3 = new Person("한성준");
		
		/*
		 * set1.add(p1);
		 * set1.add(p1);
		 * set1.add(p1); //같은 내용 중복이 안된다!
		 */
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
	
//		set1.add(new Person("한성준"));
//		set1.add(new Person("한성준"));
//		set1.add(new Person("한성준"));
//		System.out.println(set1.size());
//		System.out.println(set1.contains(new Person("한성준"))); //false
	}
		public void process3() {
			HashSet<Double> set = new HashSet<Double>();
			HashSet<Double> set2 = new HashSet<Double>();
			HashSet<Double> set3 = new HashSet<Double>();
			
			set.add(36.5);
			set.add(35.8);
			set.add(39.5);
			
			set2.add(36.5);
			set2.add(35.8);
			set2.add(39.5);
			
			System.out.println(set);
			System.out.println(set.remove(36.5));
			System.out.println(set);
			//System.out.println(set3.equals(set2));
			//Spliterator<T> => 나중에?
		}
		
		
		
	
	
	public static void main(String[] args) {
		UtillEx2 u = new UtillEx2();
		u.process3();
	}
}
