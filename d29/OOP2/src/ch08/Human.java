package ch08;

public class Human {
	public int height;
	public int weight;
	public String sex;
	public String name;
	public int age;
	public Human(int height,int weight,String sex,String name,int age) {
		this.height=height;
		this.weight=weight;
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public String showInfo() {
		return "Ű��"+height+"�̰� �����԰� "+weight+"ų���� "+sex+"�� �ֽ��ϴ�. "
	+"�̸��� "+name+"�̰� ���̴� "+age+"�� �Դϴ�.";
	}
}
