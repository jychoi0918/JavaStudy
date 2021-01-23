package sist.com.util2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Enumeration;

import sist.com.obj.basic4.DeleteAction;
import sist.com.obj.basic5.Main;

//Vector, Map ,ArrayList,HashSet
//IOpackage
public class UtilEx7 {
	Scanner scanner = new Scanner(System.in);
	
		public void addMember() {
			Member member = new Member();  //Vector id에 동일한 게 있는지 판단해야합니다.
			String id = null;  
		do {
			System.out.println("ID: ");
			id = scanner.next();  
		}while(Dao.getDao().idCheck(id));
				member.setId(id);
			
			System.out.println("Name :");
			member.setName(scanner.next());	
			System.out.println("Email :");
			member.setEmail(scanner.next());	
			System.out.println("Addrees :");
			member.setAddress(scanner.next());
			
			Dao.getDao().memberAdd(member);
		}

		
		
		
		public void memberList() {
		//	System.out.println(Arrays.toString(Dao.getDao().getVector().toArray()));
		/*
		 * for(Member m : Dao.getDao().getVector()) { System.out.println(m);
		 */
			//Dao.printIterator();
		Iterator<Member> it = Dao.getDao().getVector().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
				}
		
			
			}
		
		public int searchData() {
			System.out.println("ID: ");
			return  Dao.getDao().searchIndex(scanner.next());
		}
		
		
		public void infoMember() {
		int index = searchData();
		System.out.println(index==-1?"No Suchelement":Dao.getDao().getMember(index));
		}
			
		public void deleteMember() {
			System.out.println("삭제할 ID를 적으세요");
			int index = searchData();
			if(index==-1)return;
			System.out.println(Dao.getDao().getVector().remove(index).getName().concat("님 삭제"));
		}
			
		public void modifyMember() {
			System.out.println("수정 할 ID를 적으세요");
			int index = searchData();
			if(index==-1)return;
			
			Member member = new Member();
			System.out.println("ID: ");
			member.setId(scanner.next());
			System.out.println("Name: ");
			member.setName(scanner.next());
			System.out.println("Email: ");
			member.setEmail(scanner.next());
			System.out.println("Address: ");
			member.setAddress(scanner.next());
			
			Dao.getDao().getVector().set(index, member);
			
			
		}
		
		public void print() {
			while(true) {
				System.out.println("1.회원가입  2.회원목록  3.회원 삭제  4. 회원 수정");
				switch (scanner.nextInt()) {
				case 1:
					addMember();
					break;
				case 2:
					memberList();
					break;
				case 3:
					deleteMember();
					break;
				case 4:
					modifyMember();
					break;

				default:
					break;
				}
			}
		}
		
		public static void main(String[] args) {
			UtilEx7 u = new UtilEx7();
			u.print();
			
		}
}
