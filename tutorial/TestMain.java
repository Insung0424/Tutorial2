package Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Game g=new Game();
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �̸��� ������ �� �̸��� ������ �ִ� ���� ������ ����");
			System.out.println("���� ������ 1~10 �Դϴ�");
			System.out.println("1 : �̸� �߰�");
			System.out.println("2 : ���� ����");
			System.out.println("3 : �̸� ����");
			System.out.println("4 : ���� ����");
			
			int choose = s.nextInt();
			switch(choose) {
			case 1:
				g.in();
				break;
			case 2 :
				g.out();
				break;
			case 3:
				g.delete();
				break;	
			case 4:
				g.end();
				break;
			}		
		}	
		
	}
	
}

class Game{
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Person> ary = new ArrayList<Person>();
	// ArrayList �� Person ���� ��ü �迭����
	
	Game(){// Game ��ü ������ ���ÿ� ArrayList�� Person��ü 4�� �߰�
		ary.add(new Person("Tom",(int)(Math.random()*10+1)));
		ary.add(new Person("James",(int)(Math.random()*10+1)));
		ary.add(new Person("Bob",(int)(Math.random()*10+1)));
		ary.add(new Person("Eden",(int)(Math.random()*10+1)));
	}
	
	void in() { // ArrayList�� Person ��ü�� �߰��ϱ� ���� �Լ�
		while(true) {
			System.out.println("�̸��� �߰� �մϴ�. �߰��� �̸��� �Է����ּ���");
			System.out.println("��� �Ǵ� �޴��� ���ư���� 'stop'�� �Է����ּ���");
			
			String name = sc.next();
			if(name.equals("stop")) { // stop �Է¹����� in() �� Ż��
				break;
			}
			
			Person p = new Person(name,(int)(Math.random()*10+1));
			// ���ο� Person ��üp �� ���� (�Է¹��� name, 1~10������ ��)
			
			if(ary.size() == 5) { 
				// �迭 ũ�⸦ 5�� �������ϰ� �ϱ����� ����Ʈ�� �߰������ʰ� Ż��
				System.out.println("�� �̻� �߰��� �� �����ϴ�");
				break;
			}
			
			if(ary.contains(p)) { 
				// ���� ������ ��üp �� ������ ��ü�� ����Ʈ�� �ִ��� Ȯ��
				System.out.println("�̹� �ִ� �̸��Դϴ�");
			}
			else {
				// ����Ʈ�� ������ ��üp �߰�
				ary.add(p);
				System.out.println("�̸� �߰� �Ϸ�");
			}
		}
	}
	
	void out() {
		
		ArrayList<Person> copyarr = ary;
		/*
		 * ���� ��� ������ ��� �޴��� ���ư������� �ʿ��� ����Ȱ�ü����Ʈ
		 * 
		 * out() �Լ� �ٱ����� ����ȸ���Ʈ�� �ۼ��� in(),delete()�� ����
		 * ����Ʈ�� �߰�,������ �ݿ��ϱ� ���� ���� ���縦 �ؾ��� ��?
		 * ������ �׳� out()�� ���۵Ǵ� ���� �����ǰ� ������ ª�Ƽ�
		 */
		
		while(true) {
			Random r = new Random(); //���� ���� �� ������ ���� ��ü
			int n = r.nextInt(ary.size()); 
			//r.nextInt(������ ����Ʈ�� ũ�⺸�� �۰�) 
			
			Person p = ary.get(n); //����Ʈ���� n��° ��üp ��������
			String name = p.getName(); //��üp�� �̸� ����
			
			while(true) {
				// Ʋ���� �� �ٸ� �̸����� �Ѿ���ʰ� 
				//��� �����ϱ����� while(true) �ȿ��� ����
			
				System.out.println(name + " �� ������ �ִ� ����?");
				int id = p.getId(); //��üp�� �� ����
				
				System.out.println("���� �Է����ּ���");
				System.out.println("�޴��� ���ư���� '-1'�� �Է����ּ���");
				int i = sc.nextInt();
				
				if(i == -1) { 
					return; // whileŻ���� �ƴ� out()�Լ� ����
				}
				if(i == p.getId()) { 
				// �Է¹��� i �� ��üp�� �� ��
					
//					if(copyarr.get(n).getName().equals(p.getName())) {
					if(p.getName().equals(copyarr.get(n).getName())) {
						copyarr.remove(n);
						// ������ ���� �̸��� ����� ��ü����Ʈ���� ������ 
						// N��°�� �̸��� ���ٸ� �����Ѹ���Ʈ�� N��°�� ���� 
					}
					
					System.out.println("����");
					break;
				}
				else {
					System.out.println("Ʋ�Ƚ��ϴ�");
				}
			}
			
// 			����Ʈ�ȿ� �̸����� ������ �ִ� ���� ��� ������ ��� Ż��
			if(copyarr.isEmpty()) {
			// ����ȸ���Ʈ�� �ȿ� �ִ� ������ ��� �����Ǿ��ٸ� while(true)����
				System.out.println("��� �¾ҽ��ϴ�");
				break;
			}
			
		}
			
	}
	
	void delete() { //Person ��ü �� �����ؼ� ������ ���� �Լ�
		System.out.println("� �̸��� �����ұ��?");
		for(int a=0;a<ary.size();a++) {
			System.out.print(ary.get(a).getName()+" ");
						//����Ʈ�� a��°��ü�� �̸� ���
		}
		
		System.out.println("�� �߿��� ������ �̸��� �Է����ּ���");
		System.out.println("�޴��� ���ư���� 'stop'�� �Է����ּ���");
		String name = sc.next();
		
		for(int a=0;a<ary.size();a++) {
//			String copy = ary.get(a).getName();
			if(name.equals("stop")) {
				return;
			}
			
			if(name.equals(ary.get(a).getName())) {
				ary.remove(a); 
				System.out.println("�����Ǿ����ϴ�");
			}
		}
	}
	
	
	void end() {
		System.out.println("������ �����մϴ�");
		System.exit(0);
	}
	
}

class Person{
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) { 
		// Game �� in() �Լ����� ���� ������ ��üp �� 
		// ������ ��ü�� ����Ʈ�� �ִ��� Ȯ���ϱ� ���� ������
		Person p = (Person)obj;
		if(p.getId() == this.getId() 
				&& 
				p.getName().equals(this.name)) {
			return true;
		}
		return false;
	}
	
}
