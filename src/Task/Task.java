package Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

////5.
//class Circle{
//	int i;
//	Circle(int i){
//		this.i=i;
//	}
//	double area() {
//		return 3.14*i*i;
//	}
//	public String toString() {
//		return " "+i;
//	}
//	public boolean equals(Circle c) {
//		if(this.i == c.i) {
//			return true;
//		}
//		return false;
//	}
//}

////7.
//class Tv {
//	private int size;
//
//	Tv(int size) {
//		this.size = size;
//	}
//
//	protected int getsize() {
//		return size;
//	}
//}
//class Tv1 extends Tv{
//	private String s;
//	Tv1(int i,String s){
//		super(i);
//		this.s=s;
//	}
//	public void show() {
//		System.out.println(s+" "+getsize()+"��ġ Tv");
//	}
//}

////8.
//class Point{
//	int a,b;
//	Point(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
//	public String toString() {
//		return a+"."+b;
//	}
//}

////9.
//interface Re{
//	default void show() {
//		System.out.println("�簢��!!");
//	}
//	abstract int area();
//}
//class Rec implements Re{
//	int i,j;
//	Rec(int i,int j){
//		this.i=i;
//		this.j=j;
//	}
//	@Override
//	public int area() {
//		return i*j;
//	}
//}

////10.
//class Book{
//	String a,b;
//	Book(){
//		this("������","ȣ��!!");//this() �� ������ �� �����ڿ� ���� ������?
//	}
//	Book(String a){
//		this(a,"�۰��̻�"); //this() �� ������ �� �����ڿ� ���� ������?
//	}
//	Book(String a,String b){
//		this.a=a;
//		this.b=b;
//		System.out.println(a+" "+b); // ���⼭ ����� �ѹ���
//	}
//}

public class Task {

////	4.
//	static int adder(int i,int j){
//		return i+j;
//	}
//	static double exp(double i) {
//		return i*i;
//	}
	public static void main(String[] args) {
////		1. 10/4 �� ������� �Ҽ������� ����ض�
//		System.out.println((double)10/4);
		
////		2.while���� �̿��ؼ� 1���� 100���� ���� �� 5�ǹ���� ������ ���
//		int i=1;
//		int sum=0;
//		while(i <= 100) {
//			if(i%5 == 0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
////		3.0~30���� �� �߿��� 5�� ����� �����ϰ� ����ض�.
////		(���� �ݺ����� break, continue�� �� ����Ͽ� ���)
//		for(int i=0;;) {
//			if(i>=31) {
//				break;
//			}
//			if(i%5==0) {
//				i++; // �̺κ��� ������ ��� 0�� �ݺ���
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
////		4.main�Լ��� ���� adder, exp �Լ��� �ۼ��ض�.
//		int result=adder(10,20); //�� ���� �� ���
//		System.out.println(result);
//		System.out.println(exp(3.5));  //3.5�� ������ �� ���
		
////		5.equals(�� ���� ������ ������ ��), toString�޼ҵ带 
////		����Ͽ� �ϼ����Ѷ�.(�������� 30��)
//		Circle a = new Circle(30);
//		Circle b = new Circle(30);
//		System.out.println("������" + a);
//		System.out.println("������" + b);
//		if (a.equals(b)) {
//			System.out.println("���� ��");
//		} else {
//			System.out.println("�ٸ� ��");
//		}
		
////		6.Scanner�� �Է� ���� �̸�(���ڿ�), 
////		id(���ڿ�)�� �� �ٸ��� ����(test02.txt)�� �����ض�.
////		���׸��� �Է��ϸ� ������Ѷ�. ���׸��� �Է��ϱ� �������� ���ڿ��� 
////		���Ͽ� �����ض�.(break, FileWriter ���)
//		Scanner sc =new Scanner(System.in);
//		try {
//			FileWriter fw = new FileWriter("test02.txt");
//			String id;
//			while(true) {
//				id=sc.nextLine();
//				if(id.equals("�׸�")) {
//					break;
//				}
//				fw.write(id);
//				fw.write("\n");
//			}
//			fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();}
		
////		7.TvŬ������main()�� ���� TvŬ������ ��ӹ��� Tv1Ŭ�������ۼ��ض�.
//		Tv1 t=new Tv1(20, "�Ｚ");
//		t.show(); //�Ｚ 20��ġ Tv ���
		
////		8.main()�� ���� Ŭ������ �ۼ��ض�
//		Point p = new Point(3,4);
//		System.out.println(p); //3.4���
		
////		9.
////		main()�� ���� �������̽��� �ۼ��ض�. 
////		(�������̽����� Re, ��� �޼ҵ��� �������̽��ȿ��� �����ϰ� 
////				show�Լ��� default�� ����,area�� abstract�� ����)
//		Re r=new Rec(10,20);
//		r.show(); //"�簢��!!" ���
//		System.out.println("���� " + r.area());
		
////		10.���� main�Լ��� ���� �ۼ��ض�.
//		Book b1=new Book("���� �ż���", "�ô��� �佽��");
//		Book b2=new Book("�� �غ�");
//		Book b3=new Book(); 
		
////		11.
//		boolean b = false;
//		String s = Boolean.toString(b);
		
////		12.
//		String s = "36.5";
//		double d = Double.parseDouble(s);
		
////		13.
//		String s = "35";
//		double d = Integer.parseInt(s);
		
////		14.
////		���� main()�� ���� �߻� Ŭ�������߻�޼ҵ� �ۼ��ض�.
////		(total �Լ��� �迭 ��(1,2,3,4,5) ���� ���Ϲ޴� �Լ�)
//		Ab c=new Cd();
//		System.out.println(c.total(new int []{1,2,3,4,5}));
	}
}
////14.
//abstract class Ab{
//	abstract int total(int []a);
//}
//class Cd extends Ab{
//	int total(int []a) {
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum+=a[i];
//		}
//		return sum;
//	}
//}