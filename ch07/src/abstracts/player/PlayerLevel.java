package abstracts.player;

public abstract class PlayerLevel {
	
	//추상메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메서드 (수정 불가능하게 final 정의)
	public final void go(int count) {
		run();
		for(int i=0; i<count; i++) { //jump는 여러번 할 수 있다.
			jump();
		}
		turn();
	}
	
}
