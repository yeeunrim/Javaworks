package abstracts.player;

public class Player {
	
	//playerLevel을 참조
	//필
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new Beginner(); //기본적으로 초보자가 생성이 됨
		level.showLevelMessage(); //초보자입니다.
	}

	//레벨을 업그레이드 하는 메서드
	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage(); //레벨에 맞게 중급자, 상급자 내용이 출력
	}
	
	//player가 게임하는 play() 메서드
	public void play(int count) {
		level.go(count);
	}
	
}
