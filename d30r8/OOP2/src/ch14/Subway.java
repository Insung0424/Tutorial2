package ch14;

public class Subway {
	int SubwayNum;
	int count;
	int money;
	
	public Subway(int SubwayNum) {
		this.SubwayNum=SubwayNum;
	}
	
	public void take(int money) {
		this.money=money;
		count++;
	}
	
	public void showSubwayInfo() {
		System.out.println(SubwayNum +"�� �°����� "+count +"�̰�, ������"+money+"�� �Դϴ�");
	}
}
