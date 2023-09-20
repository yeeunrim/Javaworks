package abstracts.player;

public class PlayerMain {

	public static void main(String[] args) {
		
		//player 인스턴스 생성
		//초급자
		Player player = new Player();
		player.play(1);
		
		//중급자
		AdvancedLevel aLevel = new AdvancedLevel();
		player.setLevel(aLevel);
		player.play(2);
		
		//고급자
		SuperLevel sLevel = new SuperLevel();
		player.setLevel(sLevel);
		player.play(3);
		
	}

}
