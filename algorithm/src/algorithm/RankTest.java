package algorithm;

public class RankTest {

	public static void main(String[] args) {
		//순위 정하기
		//초기화 : rank -> 1, 1, 1, 1, 1
		//비교하다가 본인보다 큰 수가 나오면 1증가
		int[] score = {70, 90, 60, 50, 80};
		int[] rank = new int[5]; // 0, 0, 0, 0, 0
		
		//중첩 for문(행, 열)
		for(int i=0; i<score.length; i++) {
			int count = 1;
			for(int j=0; j<score.length; j++) {
				if(score[i]	< score[j]) {
					count++;
				} //if 끝
			} //for(j) 끝
			rank[i] = count; //순위에 따른 저장
		} //for(i) 끝
		
		//순위 출력
		for(int i=0; i<rank.length; i++) {
			System.out.println("score[" + i + "]={" + score[i] + "}은 " 
					+ rank[i] + "등이다."); //rank -> 3 1 4 2 5
		}

	}

}
