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
		map.put(1,"����"); // key | value
		map.put(2,"����"); // key | value
		map.put(2,"����"); // key | value
		map.put(3,"��Ʈ"); // key | value
		
		
//		System.out.println(map.containsKey(10));
//		System.out.println(map.containsKey(1));
//		System.out.println(map.containsValue("����"));
		System.out.println(map);
		
		
	 Iterator<Entry<Integer, String>> i= map.entrySet().iterator(); //map���� Ű�� ����� �˱� ��entrySet�� ����Ͽ� iterator�� �Ѵ�. 
	 // iterator ���� ��Ʈ���� �޴� ���ͷ����� 
	 while(i.hasNext()) { 
	  Entry<Integer,String>entry= i.next(); 
	  System.out.println(entry.getValue()+" "+entry.getKey()); 
	  }
	 
		/*
		 * System.out.println(map.get(1)); 
		 * System.out.println(map.equals.); // map method ã�Ƽ� �����غ���
		 */
		
		
	//	Set<Entry <Integer, String>> s; map.entrySet();  // ���ظ� ����.

		
		/*
		 * System.out.println(map.get(1)); //�����Ҷ� index�ѹ��� ġ�°��� �ƴ϶� key���� �ľ��Ѵ�.
		 * Iterator<Integer> i =map.keySet().iterator(); //1. key set���� ��ȯ 2. iterator
		 * �ݺ���! 3.
		 * 
		 * while(i.hasNext()) { Integer key = i.next();
		 * System.out.println("Key ="+key+" "+map.get(key)); }
		 */
	}
	public void utilMethod2() {
		HashMap<Integer,ArrayList<HashMap<String,Double>>> map = new HashMap<Integer, ArrayList<HashMap<String,Double>>>();
		ArrayList<HashMap<String, Double>> list1 = new ArrayList<HashMap<String, Double>>();
		
		list1.add(dataInput("����", 189.9));
		list1.add(dataInput("����", 170.5));
		list1.add(dataInput("����", 169.5));
		list1.add(dataInput("�μ�", 169.9));
		
		ArrayList<HashMap<String, Double>> list2 = new ArrayList<HashMap<String, Double>>();
		list2.add(dataInput("����", 189.9));
		list2.add(dataInput("��ȣ", 178.5));
		list2.add(dataInput("��ö", 169.5));
		list2.add(dataInput("����", 168.9));
		list2.add(dataInput("����", 169.9));

		ArrayList<HashMap<String, Double>> list3 = new ArrayList<HashMap<String, Double>>();
		list3.add(dataInput("����", 152.9));
		list3.add(dataInput("����", 150.8));
		list3.add(dataInput("ȿ��", 170.9));
		
		map.put(1, list1);
		map.put(2, list2);
		map.put(3, list3);
	System.out.println();
		//	disp(map);
		
		
	}
	public void disp(HashMap<Integer,ArrayList<HashMap<String, Double>>>map) {
		/*
		 * map.keySet().iterator(); // �ݺ���. key set�� ��¡ for(Integer i : map.keySet()) {
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
