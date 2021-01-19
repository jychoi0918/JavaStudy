package sist.com.util;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;




public class UtillEx3 {
	public void utilMethod() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"찬미"); // key | value
		map.put(2,"찰리"); // key | value
		map.put(2,"졸리"); // key | value
		map.put(3,"피트"); // key | value
		
		
//		System.out.println(map.containsKey(10));
//		System.out.println(map.containsKey(1));
//		System.out.println(map.containsValue("졸리"));
		System.out.println(map);
		
		
	 Iterator<Entry<Integer, String>> i= map.entrySet().iterator(); //map안의 키와 밸류를 알기 위entrySet을 사용하여 iterator를 한다. 
	 // iterator 선언 엔트리를 받는 인터레이터 
	 while(i.hasNext()) { 
	  Entry<Integer,String>entry= i.next(); 
	  System.out.println(entry.getValue()+" "+entry.getKey()); 
	  }
	 
		/*
		 * System.out.println(map.get(1)); 
		 * System.out.println(map.equals.); // map method 찾아서 공부해보자
		 */
		
		
	//	Set<Entry <Integer, String>> s; map.entrySet();  // 이해를 못함.

		
		/*
		 * System.out.println(map.get(1)); //제거할때 index넘버를 치는것이 아니라 key값을 쳐야한다.
		 * Iterator<Integer> i =map.keySet().iterator(); //1. key set으로 반환 2. iterator
		 * 반복자! 3.
		 * 
		 * while(i.hasNext()) { Integer key = i.next();
		 * System.out.println("Key ="+key+" "+map.get(key)); }
		 */
	}
	public void utilMethod2() {
		HashMap<Integer,ArrayList<HashMap<String,Double>>> map = new HashMap<Integer, ArrayList<HashMap<String,Double>>>();
		ArrayList<HashMap<String, Double>> list1 = new ArrayList<HashMap<String, Double>>();
		
		list1.add(dataInput("찰리", 189.9));
		list1.add(dataInput("찬미", 170.5));
		list1.add(dataInput("수정", 169.5));
		list1.add(dataInput("인성", 169.9));
		
		ArrayList<HashMap<String, Double>> list2 = new ArrayList<HashMap<String, Double>>();
		list2.add(dataInput("성준", 189.9));
		list2.add(dataInput("승호", 178.5));
		list2.add(dataInput("준철", 169.5));
		list2.add(dataInput("지연", 168.9));
		list2.add(dataInput("수현", 169.9));

		ArrayList<HashMap<String, Double>> list3 = new ArrayList<HashMap<String, Double>>();
		list3.add(dataInput("성빈", 152.9));
		list3.add(dataInput("윤하", 150.8));
		list3.add(dataInput("효진", 170.9));
		
		map.put(1, list1);
		map.put(2, list2);
		map.put(3, list3);
	System.out.println();
		//	disp(map);
		
		
	}
	public void disp(HashMap<Integer,ArrayList<HashMap<String, Double>>>map) {
		/*
		 * map.keySet().iterator(); // 반복자. key set이 뭐징 for(Integer i : map.keySet()) {
		 * ArrayList<HashMap<String, Double>> a1 = map.get(i); for(HashMap<String,
		 * Double> m:a1) { for(Entry<String,Double> e :m.entrySet()) {
		 * System.out.println(e.getKey()+""+e.getValue()); } }
		 */
		
		Iterator<Entry<Integer, ArrayList<HashMap<String, Double>>>> i = map.entrySet().iterator();
		for(;i.hasNext();) {
			Entry<Integer, ArrayList<HashMap<String, Double>>>entry = i.next();
			for (HashMap<String, Double> aa :entry.getValue()) {
				for(Entry<String,Double>e:aa.entrySet()) {
					System.out.println(e.getKey()+""+e.getValue());
				}
			}
		
		
		
		
	/*	Iterator<Entry<Integer,ArrayList<HashMap<String, Double>>>> i = map.entrySet().iterator();
		
		while(i.hasNext()) {
			Entry<Integer,ArrayList<HashMap<String, Double>>> entry = i.next();
			System.out.println(entry.getValue());
	*/		
			
			}
			
		}
		
	
		
		public HashMap<String, Double> dataInput(String s, Double d){
	      
	      HashMap<String, Double>map=new HashMap<String,Double>();
	      map.put(s.concat(" Key:"), d);
	      return map;
	  }


	
	public static void main(String[] args) {
		UtillEx3 u = new UtillEx3();
		u.utilMethod2();
	}
}
