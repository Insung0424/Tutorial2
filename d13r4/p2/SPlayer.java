package p2;

public class SPlayer implements PlayerLevel{

	@Override
	public void run() {
		System.out.println("can run");
	}

	@Override
	public void jump() {
		System.out.println("can  jump");
	}

	@Override
	public void turn() {
		System.out.println("can turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("I'm S level");		
	}

}
