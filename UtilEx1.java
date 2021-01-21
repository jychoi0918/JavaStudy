package sist.com.util2;

import java.util.StringTokenizer;

public class UtilEx1 {
	
	//StrignBuffer사용하기
	public void actionEx1() {
		
	//append는 주소에 다시 값을 추가
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT EMPNO, ENMAE, SAL ")
		  .append("FROM EMP ")
		  .append("WHERE SAL = 3000 ")
		  .append("GROUP BY DEPTNO");
		//String sb2 = sb.append("Something"); sb2와 sb는 같은 곳을 가리킨다.
	
		sb.insert(0, 5>3); 	//(index, boolean)(불린 형식으로 넣는다) 기존 문자열에 삽입, boolean으로 넣으면 true, false(문자열 형식으로)
		sb.deleteCharAt(0); // True에서 0번째인 T가 날아감
		sb.delete(0, 4); 	// 0<x<4 구간 문자열 지움
		System.out.println(sb.capacity()); // capacity : 배열의 길이값
		sb.reverse();		// 뒤집기
		System.out.println(sb);
	}
	
	
	//문자열 끊어보기
	public void actionEx2(String data) {
		if(data.startsWith("[STONE]")) { // [STONE]으로 시작하면 true
			int x = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[0].split("=")[1]); // " "기준 0번째의 "="기준 1번째 값
			int y = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[1].split("=")[1]);
			//Integer.parseInt : 문자열을 숫자로 변환   substring("]"): 해당문자열부터 추출
			//추출 된 X=100 Y=250을  split(" ") :을 기준으로 잘라서, [0]번째 인덱스를 split(=) : 를 기준으로 배열을 만들어  [1]번째 문자        
			System.out.println(x + " + "+y+" = "+(x+y));
		}
	}
	
	public void actionEx3(String value) {				//string은  자기자신이 변하지 않음 새로운 스트링을 선언하여 변경된 자료를 넣어야함
		System.out.println(value.replace('a', 'z'));  // 
		System.out.println(value.replace("b", "UU")); // 문자열 변환
		String value1 = value.replace('a', 'z'); 
		// replace를 해서 변환된 값을 return 하는 것뿐이지 원본이 바뀌는 것은 아니다.
		//=> 그래서 value로 받음( 따로 받지않고, 다시 출력하면 값이 변하지 않는다.
		System.out.println(value1);
		System.out.println(value1.equals("ZBC")); // false
		System.out.println(value1.equals("ZBC".toLowerCase())); // 소문자로 변경, true
		System.out.println(value.trim().equals("zbc")); // trim은 문자열 좌우 공백 지워줌.
		System.out.println(value1.replace(" ", "").equals("zbc")); // 공백이 문자열 사이에 있을 경우 replace로 수정
		
	}
	//String 을 자르는 클래스
	public void actionEx4() {
		StringTokenizer s = new StringTokenizer("2021/9/1","/"); // 파라미터 없는 생성자는 무의미
		System.out.println(s.countTokens()); //토큰의 개수를 셀수 있다. 
		/*
		 * while(s.hasMoreElements()) { System.out.println(s.nextElement() instanceof
		 * Integer); // String은 Integer로 형변환할 수 없음. String으로 instanceof 해보면 true };
		 */
		
		  for(;s.hasMoreTokens();) { //위에 while문과 동시 실행하면 next가 다 돌은 상태이기 때문에 이게 안돌아감.
		  System.out.println(s.nextToken()); }
		 
	}
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
		//u.actionEx1();
		//u.actionEx2("[STONE]X=100 Y=250");
		//u.actionEx2("[WIN]BLUE");
		//u.actionEx3("abc");
		u.actionEx4();
		
	}
}
