package sist.com.obj.basic2;

public class Score {
	int no;
	String name;
	int koreanScore;
	int englishScore;
	int mathScore;
	int sum;
	double avg;
	int rank;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = (double)avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int findSum() {
	     int sum = getEnglishScore()+getKoreanScore()+getMathScore();
	     this.sum = sum;
	     return this.sum;
	}
	
	public double findAvg() {
		double avg =  (double)(getEnglishScore()+getKoreanScore()+getMathScore())/3.0;
		this.avg = Math.round(avg*10)/10.0;
		return avg;
	}
	
	@Override
	public String toString() {
		return "[ 번호 : " + no + "번   이름 : " + name + "♥  국어 : " + koreanScore + "점   영어 : " + englishScore
				+ "점   수학 : " + mathScore + "점   합계 : " + sum + "점   평균 : " + avg + "점   등수 : " + rank + "등 ]";
	}
	
	

}
