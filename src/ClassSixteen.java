import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

//class Fruit{
//	void fruit() {
//		System.out.println("����");
//	}
//}
//class Apple extends Fruit{
//	void apple() {
//		System.out.println("���");
//	}
//}
//class PineApple extends Apple{
//	void pineapple() {
//		System.out.println("���ξ���");
//	}
//}
//class PhoneNum{
//	String name;
//	String phone;
//	PhoneNum(String name,String phone){
//		this.name=name;
//		this.phone=phone;
//	}
//	void show() {
//		System.out.println("�̸� "+name);
//		System.out.println("��ȣ "+phone);
//	}
//}
//class School extends PhoneNum{
//	String major;
//	School(String name,String phone,String major){
//		super(name,phone);
//		this.major = major;
//	}
//	void show() {//�������̵�
//		super.show();
//		System.out.println("���� "+major);
//	}
//}
//class Worker extends PhoneNum{
//	String grade;
//	Worker(String name,String phone,String grade){
//		super(name,phone);
//		this.grade=grade;
//	}
//	void show() {
//		super.show();
//		System.out.println("���� "+grade);
//	}
//}
//class Arr{
//	PhoneNum [] arr;
//	int r;
//	Arr(int r){
//		arr = new PhoneNum [r];//��ü�迭����
//		r=0;//�ε����� ���� 0���� �ʱ�ȭ
//	}
//	void add(PhoneNum p) {
//		arr[r++]=p; // �迭�� ��ü�� �߰��ϰ��� r������
//	}
//	
//	void all() {
//		for(int i=0;i<arr.length;i++) {
//			arr[i].show();
//		}	
//	}
//	void friend(char c) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸� ");
//		String name=sc.next();
//		System.out.println("��ȣ ");
//		String phone=sc.next();
//		switch(c) {
//		case 'A':
//			System.out.println("���� ");
//			String major=sc.next();
//			add(new School(name,phone,major)); // ������
//			break;
//		case 'B':
//			System.out.println("���� ");
//			String grade=sc.next();
//			add(new Worker(name,phone,grade));
//			break;
//		}
//	}
//
//}
//class Th extends Thread{
//	String name;
//	Th(String name){
//		this.name=name;
//	}
//	@Override
//	public void run() { //������ ���� (����)�޼ҵ�(�������ڵ�) �ݵ�� �־����
////		System.out.println(name);
//		for(int i=0;i<10;i++) {
//			System.out.println(name);
//			try {
//				sleep(100);
//			}catch(Exception e) {}
//		}
//	}
//	
//}
//class Th implements Runnable{
//	String name;
//	Th(String name){
//		this.name=name;
//	}
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println(name);
//			try {
//				Thread.sleep(100); //�������̽����� run�� �������̵�
//				//Thread Ŭ������ �ۼ�
//			}catch(Exception e) {}
//		}
//	}
//}
//class Music extends Thread{
//	String n;
//	Music(String s){
//		n=s;
//	}
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println(n);
//		}
//	}
//}
//class Movie implements Runnable{
//	String a;
//	Movie(String b){
//		a=b;
//	}
//	public void run() {
//		System.out.println(a);
//	}
//}
//class Th implements Runnable{
//	
//	public void th1() {
//		System.out.println("BB");
//		th2();
//	}
//	public void th2() {
//		System.out.println("CC");
//	}
//
//	public void run() {
//		System.out.println("AA");
//		th1();
//	}	
//}
//class Th extends Thread{
//	String w;
//	Th(String a,int n){
//		w=a;
//		setPriority(n);//������ �켱 ���� ����
//	}
//	public void run() {
//		System.out.println(w);
//		System.out.println(getPriority());
//	}
//}
//class Share{
//	void pr(String s) {
//		for(int i=0;i<s.length();i++) {
//			System.out.print(s.charAt(i));
//		}
//		System.out.println();
//	}
//}
//class Tt1 extends Thread{
//	String []arr;
//	Share s;
//	Tt1(Share s,String []arr){
//		this.arr = arr;
//		this.s = s;
//	}
//	public void run() {
//		for(int i=0;i<arr.length;i++) {
//			s.pr(arr[i]);
//		}
//	}
//}
public class ClassSixteen {
//	static void pr(Fruit f) {
//		if(f instanceof PineApple) {
//			((PineApple) f).pineapple(); //�θ�� �ڽ��Լ��� ����x
//			//downcasting �������
//		}
//		else if(f instanceof Apple) {
//			((Apple) f).apple();
//		}
//		else {
//			f.fruit();
//		}
//	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Fruit f=new Fruit();
//		Apple a=new Apple();
//		PineApple p=new PineApple();
//		pr(f);
//		pr(a);
//		pr(p);
		
//		Arr ar = new Arr(5);
//		while(true) {
//			System.out.println("A.�б� ģ�� ����");
//			System.out.println("B.�б� ģ�� ����");
//			System.out.println("C.����");
//			System.out.println("D.���");
//			System.out.println("���� �Է�");
//			Scanner sc=new Scanner(System.in);
//			char c = sc.next().charAt(0);
//			switch(c) {
//			case 'A':
//				ar.friend(c);
//				break;
//			case 'B':
//				ar.friend(c);
//				break;
//			case 'C':
//				System.out.println("����");
//				return; //��ȯ������ ������ �Լ� ���� 
//			case 'D':
//				ar.all();
//			}//switch
//			
//		}//while
	
//		Th t1 = new Th("������1");
//		Th t2 = new Th("������2");
//		//Thread th1=new Thread(t1);
//		new Thread(t1).start();// run(); �� ȣ��
//		new Thread(t2).start();//������ �۵� ����(JVM������ �����ٵǱ� ������)
//		// ȣ������� ����Ʈ ����
		
//		Music m=new Music("���");
//		m.start(); //10�� ���
//		Movie mv = new Movie("��ȭ");
//		Thread t = new Thread(mv);
//		t.start(); //1�� ���
//		
//		try {
//			m.join(); // join : �ش� �����尡 ����Ǳ� ��ٸ�
//			t.join();
//		}catch(Exception e) {}
		
//		System.out.println("thread");
//		Th t = new Th();
//		Thread t1 = new Thread(t);
//		t1.start();
//		try {
//			t1.join();
//		}catch(Exception e) {}
//		System.out.println("end");
////join ���� ���� ���� �ʾ��� �� / join���� �������� ��
////		thread 					thread
////		end    					AA
////		AA						BB		
////		BB						CC
////		CC						end  
		
//		Th t1 =new Th("tom",Thread.MAX_PRIORITY);
//									//�켱����
//		Th t2 =new Th("lee",Thread.MIN_PRIORITY);
//		Th t3 =new Th("kim",Thread.NORM_PRIORITY);
//		
//		t1.start(); //join �� ������ �켱������ ������ �ʴ°�쵵 �߻�
//		t2.start();
//		t3.start();
		
//		Share s = new Share();
//		String eng[]= {"java","python","Jsp","Ruby","C#"};
//		String kor[]= {"�ڹ�","���̽�","���̿�����","���","����"};
//		Tt1 t1=new Tt1(s,eng); //���
//		Thread t2 = new Tt1(s,kor); //up
//		t1.start();
//		t2.start();
		
//		1
//		Book b1=new Book("���� �ż���", "�ô��� �佽��");
//		Book b2=new Book("�� �غ�");
//		Book b3=new Book();
		
//		2
//		ITFriend it=new ITFriend("ȫ�浿","010-111-1111","��ǻ��");
//	    it.show();
		
//		3
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		for(int i=0;i<5;i++) {
//			try {
//				sum+=sc.nextInt();
//			}catch(Exception e) {
//				sc.next();
//				i--;
//				continue;
//			}
//		}
//		System.out.println(sum);
		
////		4
//		Double a = new Double(9.5);
//		//Double a = 9.5; //autoBoxing
////		4-1
//		String s = Double.toString(a);
//		//String s = a.toString();
////		4-2
//		double d = Double.parseDouble(s);
//		//double d = a.doubleValue();
		
////		5
//		Circle a = new Circle(30);
//		Circle b = new Circle(30);
//		System.out.println("������ " + a);
//		System.out.println("������ " + b);
//		if (a.equals(b)) {
//			System.out.println("���� ��");
//		}
//		else {
//			System.out.println("�ٸ� ��");
//		}
		
//		6
//		Po p = new Point();
//		p.pr(30000, "java");
//		p.pr("python");
		
		
//		ObjectOutputStream obp = null;
//		obp = new ObjectOutputStream(new FileOutputStream("obj.txt"));
//		//��ü�� ���Ͽ� ���� : ����ȭ
//		obp.writeObject(new Rec(4,7)); //��ü����
//		obp.writeObject(new Rec(8,5));
//		obp.writeObject(new String("glgl"));
//
//		obp.close();
		
//		ObjectInputStream obi = new ObjectInputStream(new FileInputStream("obj.txt"));
//		//���Ͽ� ������ ��ü�� �о��: ������ȭ
//		Rec r1 = (Rec) obi.readObject(); //��ü�� �о���Ƿ� �ٿ�ĳ����
//		Rec r2 = (Rec) obi.readObject(); //��ü�� �о���Ƿ� �ٿ�ĳ����
//		String r3 = (String) obi.readObject(); //��ü�� �о���Ƿ� �ٿ�ĳ����
//		
//		//��ü�� �̿��� ����Լ��� ����
//		r1.show();
//		r2.show();
//		System.out.println(r3); //string�̹Ƿ� �׳� ���
//		
//		obi.close();
		
	}

}
//class Rec implements Serializable{ 
//	//implements Serializable ���� run ����� error
//	int i,j;
//	Rec(int a,int b){
//		i=a;
//		j=b;
//	}
//	void show() {
//		System.out.println(i+" "+j);
//	}
//}
//interface Po{
//	public void pr(String s);
//	public void pr(int i,String s);
//}
//class Point implements Po{
//	public void pr(int i,String s) {
//		System.out.println(s+" å�� "+i+"��");
//	}
//	public void pr(String s) {
//		System.out.println(s);
//	}
//}
//class Circle{
//	int r;
//	Circle(int r){
//		this.r=r;
//	}
//	public String toString() {
////		return String.valueOf(r);
//		return r+"";
//	}
////	@Override
////	public boolean equals(Object obj) {
////		if(obj instanceof Circle) {
////			Circle c = (Circle) obj;
////			if(this.r == c.r) {
////				return true;
////			}
////			else {
////				return false;
////			}
////		}
////		return false;
////	}
//	public boolean equals(Circle c) {
//		if(this.r == c.r) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//class Friend {
//	private String name;
//	private String phone;
//	Friend(String name, String phone) {
//		this.name = name;
//		this.phone = phone;
//	}
//	String get() {
//		return name + " " + phone;
//	}
//}
//class ITFriend extends Friend{
//	private String device;
//	ITFriend(String name,String phone,String device){
//		super(name,phone);
//		this.device=device;
//	}
//	public void show() {
//		System.out.println(this.device
//				+" "
//				+super.get().substring(0,3)
//				+" ��ȣ "
//				+super.get().substring(4));
//	}
//}
//class Book{
//	String title;
//	String author;
//	Book(){
//		System.out.println("������ ȣ��!");
//	}
//	Book(String title){
//		this(title,"�۰� �̻�");
//	}
//	Book(String title,String author){
//		this.title=title;
//		this.author=author;
//		System.out.println(title+ " " + author);
//	}
//}