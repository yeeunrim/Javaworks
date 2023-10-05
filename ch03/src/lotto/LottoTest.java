package lotto;

import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45 -> 6개 생성
		// 배열의 크기 6개인 lotto 선언
		
		int[] lotto = new int[6];
		
		//lotto[0] = (int) (Math.random()*45) + 1;
		//System.out.println(lotto[0]);

		// 6개 동시에 생성
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45) + 1;
			
			// 중첩 for문 이용 - 중복 문제 해결
			for (int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; // 이전 인덱스로 이동
				}
				
				/*
				  7 9 3 9 20 16
				  i=0 ---> 7
				  i=1, j=0 ---> 9
				  i=2, j=1 ---> 3
				  i=3, j=2 ---> 9 (중복 - 재추첨)
				  i=4, j=3
				 */
			}
		}
		
		//6개 동시에 출력
		for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i] + " ");
		}
		
		System.out.println();		
		
		//파일 이름 출력 
		LottoTest lottoTest = new LottoTest();
		System.out.println(lottoTest); //lotto.LottoTest@2133c8f8
		
		//객체로 출력
		System.out.println(Arrays.toString(lotto)); 
		
	}

}
