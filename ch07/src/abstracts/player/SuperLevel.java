package abstracts.player;

//고급자
public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴을 할 줄 압니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==고급자 레벨입니다==");
	}

}
