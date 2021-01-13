package sist.com.obj.basic2;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreMain {
	Scanner scanner = new Scanner(System.in);
	Score []score= new Score[30];
	int cnt;

	
	
	public boolean uniqueNum(int no) {
	    for(int i = 0; i < cnt; i++) {
	    	if(score[i].no==no) return true;
	      }
	    return false;
	}	
	public void putGrade() {
		Score score = new Score();
		int num;
		System.out.println("�����Է�â �Դϴ�.");
		do {
		System.out.println("�л���ȣ  : ");
		 num = scanner.nextInt();
		
		}while(uniqueNum(num));
			score.setNo(num);
			System.out.println("�л��̸� : ");
			score.setName(scanner.next());
			System.out.println("�������� : ");
			score.setKoreanScore(scanner.nextInt());
			System.out.println("�������� : ");
			score.setEnglishScore(scanner.nextInt());
			System.out.println("�������� : ");
			score.setMathScore(scanner.nextInt());
			
			score.findSum();
			System.out.println("���� :"+score.getSum());
			score.findAvg();
			System.out.println("��� :"+score.getAvg());
			this.score[cnt++]=score;
			calculateRank();
			
			}
	

	public int search(int no) {
		int index=0;
		for (int i = 0; i < cnt; i++) {
			if(this.score[i].no==no) 
			return i;			
		}
		return -1;				
	}
	
	
	
	public void calculateRank() {
		int [] rank = new int [cnt];
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
			if(score[i].getSum()<score[j].getSum()) {
				rank[i]++;
			}		
		 } score[i].setRank(rank[i]+1); 
	   }
	}
	
	
	public void checkRank() {
		System.out.println("����Ȯ�� ������ �Դϴ�.");
		System.out.println("��ȣ �Է�");
		int num =scanner.nextInt();
		if(search(num)==-1)return;
		int index = search(num);
		System.out.println(""+num+"���� "+ score[index].getName()+"�� ������");
		System.out.println(this.score[index].getRank()+"���Դϴ�.");		
	}
	
	
	public void modify() {
		System.out.println("������ ��ȣ ");
		int num = scanner.nextInt();
		int index = search(num);
		if(search(num)==-1)return;
		System.out.println("�л��̸� : ");
		score[index].setName(scanner.next());
		System.out.println("�������� : ");
		score[index].setKoreanScore(scanner.nextInt());
		System.out.println("�������� : ");
		score[index].setEnglishScore(scanner.nextInt());
		System.out.println("�������� : ");
		score[index].setMathScore(scanner.nextInt());
		
		score[index].findSum();
		System.out.println("���� :"+score[index].getSum());
		
		score[index].findAvg();
		System.out.println("��� :"+score[index].getAvg());
		
		calculateRank();
	}
	
	
	public void checkInfo() {
		for(int i = 0 ;i < cnt;i++)
			System.out.println(score[i].toString());
	}
	
	
	public void menu() {
		System.out.println("3�г� 11�� ���� ó�� ");
		while(true) {
		System.out.println("1.�����Է�   2.����Ȯ��  3.���� ����  4.��ü ���� Ȯ��");
		switch (scanner.nextInt()) {
		case 1:	putGrade();			
			break;
		case 2: checkRank();				
			break;
		 case 3: modify();			
			break;
		 case 4: checkInfo();			
		 break;
		default:
			break;
		}
	}
}
	
	
	public static void main(String[] args) {
		  ScoreMain sm = new ScoreMain();
		  sm.menu();
		  
		
	}
}
