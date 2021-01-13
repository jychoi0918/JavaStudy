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
		System.out.println("성적입력창 입니다.");
		do {
		System.out.println("학생번호  : ");
		 num = scanner.nextInt();
		
		}while(uniqueNum(num));
			score.setNo(num);
			System.out.println("학생이름 : ");
			score.setName(scanner.next());
			System.out.println("국어점수 : ");
			score.setKoreanScore(scanner.nextInt());
			System.out.println("영어점수 : ");
			score.setEnglishScore(scanner.nextInt());
			System.out.println("수학점수 : ");
			score.setMathScore(scanner.nextInt());
			
			score.findSum();
			System.out.println("총합 :"+score.getSum());
			score.findAvg();
			System.out.println("평균 :"+score.getAvg());
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
		System.out.println("석차확인 페이지 입니다.");
		System.out.println("번호 입력");
		int num =scanner.nextInt();
		if(search(num)==-1)return;
		int index = search(num);
		System.out.println(""+num+"번의 "+ score[index].getName()+"의 석차는");
		System.out.println(this.score[index].getRank()+"등입니다.");		
	}
	
	
	public void modify() {
		System.out.println("수정할 번호 ");
		int num = scanner.nextInt();
		int index = search(num);
		if(search(num)==-1)return;
		System.out.println("학생이름 : ");
		score[index].setName(scanner.next());
		System.out.println("국어점수 : ");
		score[index].setKoreanScore(scanner.nextInt());
		System.out.println("영어점수 : ");
		score[index].setEnglishScore(scanner.nextInt());
		System.out.println("수학점수 : ");
		score[index].setMathScore(scanner.nextInt());
		
		score[index].findSum();
		System.out.println("총합 :"+score[index].getSum());
		
		score[index].findAvg();
		System.out.println("평균 :"+score[index].getAvg());
		
		calculateRank();
	}
	
	
	public void checkInfo() {
		for(int i = 0 ;i < cnt;i++)
			System.out.println(score[i].toString());
	}
	
	
	public void menu() {
		System.out.println("3학년 11반 성적 처리 ");
		while(true) {
		System.out.println("1.성적입력   2.석차확인  3.성적 수정  4.전체 정보 확인");
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
