package Task;

import java.util.Scanner;
import java.util.StringTokenizer;

class Grade{
	//1.1   =========================================================
	private int english,math,science; 
	
	//1.2   =========================================================
	public Grade(){}
	public Grade(int english,int math){
		this(english,math,0);
	}
	public Grade(int english,int math,int science){ 
		this.english=english;
		this.math=math;
		this.science=science;  
	}
	
	//1.3   =========================================================
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public int getScience() {
		return science;
	}
	public void avg() {
		double sum=0;
		sum += getEnglish();
		sum += getMath();
		sum += getScience();
		System.out.println(sum/3);
	}
	public String toString() {
		return "�������� "+getEnglish()
				+" �������� "
				+getMath()
				+" �������� "
				+getScience();
	}
}

//2
abstract class Calc{
	
//	2-1-A    =========================================================
	double op1,op2;
//	2-2-A   =========================================================
	public void set(double op1,double op2) {
		this.op1=op1;
		this.op2=op2;
	}
//	2-3-A   =========================================================
	abstract double calculate();
}
//2-B   =========================================================
class Add extends Calc{
	@Override
	double calculate() {
		return op1 + op2;
	}
}
class Sub extends Calc{
	@Override
	double calculate() {
		return op1 - op2;
	}
}
class Mul extends Calc{
	@Override
	double calculate() {
		return op1 * op2;
	}
}
class Div extends Calc{
	@Override
	double calculate() {
		return op1/op2;
	}
}

public class Test {

	public static void main(String[] args) {
		//1.4  =========================================================
		Grade arr[] = new Grade[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			try {
				System.out.println("���������Է�");
				int english = sc.nextInt();
				System.out.println("���������Է�");
				int math = sc.nextInt();
				System.out.println("���������Է�");
				int science = sc.nextInt();
				arr[i] = new Grade(english,math,science);
				System.out.println(arr[i]);
				System.out.println((i+1)+"���л��� ��������� ");
				arr[i].avg();
			}catch(Exception e) {
				System.out.println("�߸� �Է���");
				System.out.println("�ٽ� ó������ �Է�");
				sc.next();
				i--;
				continue;
			}
			
		}
		
		System.out.println("=========================���뼱=======================");

		
		//  2-c  ==================================================
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		while(true) {
			System.out.println("����2���� �����ڸ� �Է�");
			System.out.println("���� : 10 5 /");
			System.out.println("����� end");
			String str = scan.nextLine();
			st = new StringTokenizer(str," ");
			if(str.equals("end")) {
				break;
			}
			try {
				double a1 = Double.parseDouble(st.nextToken());
				double a2 = Double.parseDouble(st.nextToken());
				String c = st.nextToken();
			
				switch (c) {
				case "+":
					Add add = new Add();
					add.set(a1,a2);
					System.out.println("���� : "+add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.set(a1,a2);
					System.out.println("���� : "+sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.set(a1,a2);
					System.out.println("���� : "+mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.set(a1,a2);
					System.out.println("���� : "+div.calculate());
					break;
				default:
					System.out.println("�߸� �Է���");
					break;
				}
			}catch(Exception e) {
				System.out.println("�߸� �Է���");
				System.out.println(str);
				continue;
			}
		
		}
		
		System.out.println("=========================���뼱=======================");

//		3   =========================================================
		System.out.println("������ �迭�� ũ�� �Է�");
		while(true) {
			try {
				int x = sc.nextInt();
				int Intarr[] = new int[x];
				for(int i=0;i<Intarr.length;i++) {
					Intarr[i] = (int) (Math.random()*101);
				}
				for(int i=0;i<Intarr.length;i++) {
					System.out.printf((i+1)+"�� ���� : %d��\n",Intarr[i]);
				}
			}catch(Exception e) {
				System.out.println("�߸� �Է���,�ٽ� �Է�");
				sc.next();
				continue;
			}
			break;//		�̰� �ٵ� �������� ���ϴ°���
		}
		
	}
		
}
	

