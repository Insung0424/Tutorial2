package Task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

////p157
//class Person{
//String name;
//float height;
//float weight;
//public Person() {}
//public Person(String name) {
//	this.name = name;
//}
//public Person(String name,float height,float weight) {
//	this.name=name;
//	this.height=height;
//	this.weight=weight;
//}
//}

////p172,p173
//class Person{
//String name;
//int age;
//Person(){
//	this("�̸�����",1); // �ٸ������� ȣ��,�׻� �����ڳ��� ù�κ� 
//}
//Person(String name,int age){
//	this.name=name;
//	this.age=age;
//}
//Person returnItSelf() {
//	return this;
//}
//}

////p182
//class Student{
//public static int serialNum=1000;
//public int studentId;
//public String studentName;
//public int grade;
//public String address;
//public String getStudentName() {
//	return studentName;
//}
//public void setStudentName(String s) {
//	this.studentName=s;
//}
//}

////p207~210
//class Book{
//private String bookName;
//private String author;
//Book(){}
//Book(String bookName,String author){
//	this.bookName=bookName;
//	this.author=author;
//}
//public String getBookName() {
//	return bookName;
//}
//public void setBookName(String bookName) {
//	this.bookName = bookName;
//}
//public String getAuthor() {
//	return author;
//}
//public void setAuthor(String author) {
//	this.author = author;
//}
//public void showBookInfo() {
//	System.out.println(bookName+" "+author);
//}
//}

////p260
//class Animal{
//void move() {
//	System.out.println("animal");
//}
//}
//class Human extends Animal{
//void move() {
//	System.out.println("Human");
//}
//}
//class Tiger extends Animal{
//void move() {
//	System.out.println("Tiger");
//}
//}
//class Eagle extends Animal{
//void move() {
//	System.out.println("Eagle");
//}
//}

////p279
////Q5
//class Shape{
//	public void draw() {
//		System.out.println("Shape");
//	}
//}
//class Circle extends Shape{
//	public void draw() {
//		System.out.println("Circle");
//	}
//}
//class Triangle extends Shape{
//	public void draw() {
//		System.out.println("Triangle");
//	}
//}

////p298~304
//abstract class PlayerLevel{
//abstract void run();
//abstract void jump();
//abstract void turn();
//abstract void showLevelMessage();
//final void go(int a) {
//	run();
//	for(int i=0;i<a;i++) {
//		jump();
//	}
//	turn();
//}
//}
//class BeginnerLevel extends PlayerLevel{
//@Override
//void run() {
//	System.out.println("br");
//}
//@Override
//void jump() {
//	System.out.println("bj");
//}
//@Override
//void turn() {
//	System.out.println("bt");
//}
//@Override
//void showLevelMessage() {
//	System.out.println("b");
//}
//}
//class AdvancedLevel extends PlayerLevel{
//@Override
//void run() {
//	System.out.println("ar");
//}
//@Override
//void jump() {
//	System.out.println("aj");
//}
//@Override
//void turn() {
//	System.out.println("at");
//}
//@Override
//void showLevelMessage() {
//	System.out.println("a");
//}
//}
//class SuperLevel extends PlayerLevel{
//@Override
//void run() {
//	System.out.println("sr");
//}
//@Override
//void jump() {
//	System.out.println("sj");
//}
//@Override
//void turn() {
//	System.out.println("st");
//}
//@Override
//void showLevelMessage() {
//	System.out.println("s");
//}
//}
//class Player{
//private PlayerLevel level;
//Player(){
//	level = new BeginnerLevel();
//	level.showLevelMessage();
//}
//public PlayerLevel getLevel() {
//	return level;
//}
//void upgradeLevel(PlayerLevel level){
//	this.level = level;
//	level.showLevelMessage();
//}
//void play(int i) {
//	level.go(i);
//}
//}

////p322~325
//interface Scheduler{
//	public void getNextCall();
//	public void sendCallToAgent();
//}
//class RoundRobin implements Scheduler{
//	@Override
//	public void getNextCall() {
//		System.out.println("������� ��⿭���� ��ȭ�� ������ ��");
//	}
//	@Override
//	public void sendCallToAgent() {
//		System.out.println("���� ���� �������� ���");
//	}
//}
//class LeastJob implements Scheduler{
//	@Override
//	public void getNextCall() {
//		System.out.println("������� ��⿭���� ��ȭ�� ������ ��");
//	}
//	@Override
//	public void sendCallToAgent() {
//		System.out.println("�������� ���ų� ���� �������� �Ҵ�");
//	}
//}
//class PriorityAllocation implements Scheduler{
//	@Override
//	public void getNextCall() {
//		System.out.println("������� ���� ���� ��ȭ �켱");
//	}
//	@Override
//	public void sendCallToAgent() {
//		System.out.println("���� �ɷ��� ���� ���� �켱 ���");
//	}
//}

////p354,356
//class Book{
//	int bookNumber;
//	String bookTitle;
//	Book(int bookNumber,String bookTitle){
//		this.bookNumber=bookNumber;
//		this.bookTitle=bookTitle;
//	}
//	public String toString() {
//		return bookTitle+","+bookNumber;
//	}
//}

public class Main {
////p260
//public void moveAnimal(Animal animal) {
//	animal.move();
//}

public static void main(String[] args) throws IOException, ClassNotFoundException {

//	String [] str = {"33","56","996","3.14"};
//	try {
//		for(int i=0;i<str.length;i++) {
//			int j=Integer.parseInt(str[i]);
//			System.out.println(j);
//		}
//	}catch(Exception e) {
//		System.out.println("ERROR");
//	}

	
////	p53
//	char ch1 ='A';
//	System.out.println(ch1);//A
//	System.out.println((int)ch1);//65
//	char ch2 =66;
//	System.out.println(ch2);//B
//	System.out.println((int)ch2);//66
//	char ch3 =67;
//	System.out.println(ch3);//C
//	System.out.println((int)ch3);//67
	
////	p65
//	byte bNum=10;
//	int iNum=bNum; //�ڵ�
//	System.out.println(bNum);//10
//	System.out.println(iNum);//10
//	int iNum2=20;
//	float fNum = iNum2;
//	System.out.println(iNum);//10
//	System.out.println(fNum);//20.0
//	double dNum;
//	dNum=fNum+iNum;
//	System.out.println(dNum);//30.0
	
////	p68
//	double dNum1 = 1.2;
//	float fNum2 = 0.9F;//float�� F�ٿ������
//	int iNum3=(int)dNum1+(int)fNum2;
//	int iNum4=(int)(dNum1+fNum2);
//	System.out.println(iNum3); //1 -> 1+0
//	System.out.println(iNum4); //2 -> 1.2+0.9
	
////3
//	byte a = 127;
//	int b = 100;
//	System.out.println((byte)(a+b));//-29
//	227 -> 2 : 1 1 1 0 0 0 1 1 
//		�Ǿ���1�� ��ȣ��Ʈ
//			   8 7 6 5 4 3 2 1
//		����    0 0 0 1 1 1 0 1
//			   -    16+8+4+  1 -> -29

////4
//	Scanner sc = new Scanner(System.in);
//	int s=0,in;
//	while((in = sc.nextInt()) != 0) {
//		s+=in;
//	}
//	System.out.println(s);
	
////p117
//	for(int i=2;i<10;i++) { // < �� <= �� ���� �˾ƺ���
//		for(int j=1;j<10;j++) {
//			System.out.println(i + "X" + j + "="+(i*j));
//		}
//		System.out.println();
//	}
	
////p121
//	int sum=0,num;
//	for(num=0;/*���Ǿ���*/;num++) {
//		sum+=num;
//		if(sum>=100) {
//			break;
//		}
//	}
//	System.out.println("num " + num);
//	System.out.println("sum " + sum);
	
////p123
////Q1
//	int num1=10;
//	int num2=2;
//	char operator='+';
//	switch(operator) {
//	case '+':
//		System.out.println(num1+num2);
//		break;
//	case '-':
//		System.out.println(num1-num2);
//		break;
//	case '*':
//		System.out.println(num1*num2);
//		break;
//	case '/':
//		System.out.println(num1/num2);
//		break;
//	}
////Q2
//	for(int i=2;i<10;i++) { 
//		for(int j=1;j<10;j++) {
//			if(i%2==1) {
//				continue;
//			}
//			System.out.println(i + "X" + j + "="+(i*j));
//		}
//		System.out.println();
//	}
////Q3
//	for(int i=2;i<10;i++) { 
//		for(int j=1;j<10;j++) {
//			if(j == i) { 
//				System.out.println(i + "X" + j + "="+(i*j));
//				break;
//			}
//			System.out.println(i + "X" + j + "="+(i*j));
//		}
//		System.out.println();
//	}
////Q4
//	for(int i=0;i<4;i++) { 
//		for(int j=3;j>i;j--) {
//			System.out.print(" ");
//		}
//		for(int j=0;j<i*2+1;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
////Q5 - Q4����
//	for(int i=0;i<4;i++) { //���
//		for(int j=3;j>i;j--) {
//			System.out.print(" ");
//		}
//		for(int j=0;j<i*2+1;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for(int i=0;i<3;i++) { //�ϴ�
//		for(int j=0;j<i+1;j++) {
//			System.out.print(" ");
//		}
//		for(int j=6;j>i*2+1;j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
//	5
//	int c=0;
//	int i;
//	while(true) {
//		i=sc.nextInt();
//		if(i == 0) {
//			break;
//		}
//		c++;
//	}
//	System.out.println(c);
	
////p158
//	Person personKim = new Person(); //�⺻�������ʿ�
//	personKim.name = "������";
//	personKim.height = 85.5F;
//	personKim.weight = 180.0F;
//	
//	Person personLee = new Person("�̼���",175,75);
	
////	p172,p173
//	Person noName=new Person();
//	System.out.println(noName.name);//�̸�����
//	System.out.println(noName.age);//1
//	Person p = noName.returnItSelf();
//	System.out.println(p);
//	//Practice.Person@7d6f77cc 
//	System.out.println(noName);
//	//Practice.Person@7d6f77cc
	
////	p183
//	Student studentLee = new Student();
//	studentLee.setStudentName("������");
//	System.out.println(studentLee.serialNum);//1000
//	studentLee.serialNum++;// 1000 ++ 
//	Student studentSon = new Student();
//	studentSon.setStudentName("�ռ���");
//	System.out.println(studentSon.serialNum);//1001
//	System.out.println(studentLee.serialNum);//1001
//	//�����Ǳ� ������ ���� ���� ����
	
////6
//	Scanner sc = new Scanner(System.in);
//	int ar[]=new int[5];
//	int max = ar[0];
//	for(int i=0;i<ar.length;i++) {
//		int num = sc.nextInt();
//		ar[i] = num;
//		if(max < ar[i]) {
//			max = ar[i];
//		}
//	}
//	System.out.println(max);
	
////	p207~210
//	Book[] library=new Book[5];//��ü�迭����
//	for(int i=0;i<library.length;i++) {
//		System.out.println(library[i]); // null X 5
//	}
//	library[0]=new Book("�¹���","������");
//	library[1]=new Book("���̾�","�츣�� �켼");
//	library[2]=new Book("��� �� ���ΰ�","���ù�");
//	library[3]=new Book("����","�ڰ渮");
//	library[4]=new Book("�����","�������丮");
//	for(int i=0;i<library.length;i++) {
//		library[i].showBookInfo();// å 5�� �������
//	}
//	for(int i=0;i<library.length;i++) {
//		System.out.println(library[i]); //�ּҰ����
//	}
	
////	p218
//	String[] strArray = {"Java","Android","C","JavaScript","python"};
//	for(String s:strArray) {
//		System.out.println(s); // �迭�� ���� �ڷ���?
//	}
	
////	p260
//	Main aTest = new Main(); 
//	aTest.moveAnimal(new Human());
//	aTest.moveAnimal(new Tiger());
//	aTest.moveAnimal(new Eagle());
	
////	p279
////	Q5
//	ArrayList<Shape> list = new ArrayList</*��������*/>();
//	list.add(new Circle()); // list . �߰� (��ü����)
//	list.add(new Triangle());
//	list.add(new Shape());
//	for(Shape s:list) {
//		s.draw();
//	}
	
////p298~304
//	Player player = new Player(); //�⺻�÷��̾����
//	player.play(1); 
	
//	AdvancedLevel adplayer = new AdvancedLevel();
//	player.upgradeLevel(adplayer); //������ ��ĳ����?
//	player.play(2);
	
//	SuperLevel splayer = new SuperLevel();
//	player.upgradeLevel(splayer);
//	player.play(3);
	
////p322~325
//	System.out.println("Please select a method of allocating telephone counselors");
//	System.out.println("R : One by one");
//	System.out.println("L : Low-Waiting Counsellors First");
//	System.out.println("P : High-priority customers High-skilled consultants");
//	
//	int ch = System.in.read(); // throws�� ó��
//	Scheduler scheduler = null;//������ ��
//	
//	if (ch == 'R' || ch == 'r') { //��ҹ��� ���о��ϰ� �� �� �Էµǰ���
//		scheduler = new RoundRobin(); 
//	}
//	else if (ch == 'L' || ch == 'l') {//��ҹ��� ���о��ϰ� �� �� �Էµǰ���
//		scheduler = new LeastJob();
//	}
//	else if (ch == 'P' || ch == 'p') {//��ҹ��� ���о��ϰ� �� �� �Էµǰ���
//		scheduler = new PriorityAllocation();
//	}
//	else {
//		System.out.println("This feature is not supported.");
//		return; //��������
//	}
//	
//	scheduler.getNextCall(); 	//�Է��� ���� Ŭ������ �����ǰ�
//	scheduler.sendCallToAgent();//�ش�Ŭ������ �޼ҵ尡 ȣ���
	
////p354,356
//	Book book1 = new Book(200,"����"); 
//	System.out.println(book1);//�ڵ����� toString() ȣ��
//	System.out.println(book1.toString());//����,200 
	
////p506~507
//	IDFormat test = new IDFormat();
//	String userId = null;
//	try {
//		test.setUserId(userId);
//	}catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
//	userId = "1234567";
//	try {
//		test.setUserId(userId);
//	}catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
	
////p525
//	try(FileInputStream fis = new FileInputStream("input.txt")) {
//		int i;//�о�ö� ��ȯ���� int��
//		while((i=fis.read()) != -1) { // ���̻������� ������ -1 ��ȯ
//			System.out.println((char)i);
//		}
//		System.out.println("end");
//	}catch(FileNotFoundException e) { //������ ã�� ������
//		e.printStackTrace();
//	}catch(IOException e) { //����� ����
//		e.printStackTrace();
//	}

////p531
//	FileOutputStream fos = new FileOutputStream("output.txt",true);
//	try(fos) {
//		byte[] bs = new byte[26];
//		byte data = 65;
//		for(int i =0;i<bs.length;i++) {
//			bs[i] = data;
//			data++;
//		}
//		fos.write(bs);// output.txt �� �ۼ� 
//	}catch(IOException e) { //����� ����
//		e.printStackTrace();
//	}
//	System.out.println("��¿Ϸ�");
	
////p536
//	try(FileReader fr = new FileReader("reader.txt")){ 
//		//���ڴ����� �о���� ��Ʈ��
//		int i;
//		while((i=fr.read()) != -1) {
//			System.out.println((char)i);
//		}
//	}catch(IOException e) { 
//		e.printStackTrace();
//	}
	
////p538	
//	try(FileWriter fw = new FileWriter("writer.txt")){ 
//		fw.write('A');
//		char buf[]= {'B','C','D','E','F','G'};
//		fw.write(buf);
//		fw.write("�ȳ��ϼ���. �� �����׿�");
//		fw.write(buf, 1, 2); // ù��° ���� index ��ġ , �ι�° ����
//		fw.write("65"); 
//	}catch(IOException e) { 
//		e.printStackTrace();
//	}
//	System.out.println("��¿Ϸ�");
	
////	p551
//	Person personAhn = new Person("�����","��ǥ�̻�");
//	Person personKim = new Person("��ö��","���̻�");
//	try(FileOutputStream fos = new FileOutputStream("serial.out");
//			ObjectOutputStream oos = new ObjectOutputStream(fos)){
//		oos.writeObject(personAhn);
//		oos.writeObject(personKim);
//	}catch(IOException e) { 
//		e.printStackTrace();
//	}
//
//	try(FileInputStream fis = new FileInputStream("serial.out");
//			ObjectInputStream ois = new ObjectInputStream(fis)){
//		Person p1 = (Person) ois.readObject(); // throw ClassNotFoundException
//		Person p2 = (Person) ois.readObject(); 
//		// �ֻ��� Object������ �о�����Ƿ� Person ���� �ٿ� ĳ����
//		
//		System.out.println(p1);
//		System.out.println(p2);
//	}catch(IOException e) { 
//		e.printStackTrace();
//	}
			
	
	
	}
}
////p506~507
//class IDFormat{
//private String userId;
//public String getUserId() {
//	return userId;
//}
//public void setUserId(String id) throws IDFormatException{
//	if(id == null) {
//		throw new IDFormatException("null");
//	}
//	else if(id.length() < 8 || id.length() > 20) {
//		throw new IDFormatException("over 7 and under 20");
//	}
//	this.userId = id;
//}
//}
//class IDFormatException extends Exception{
//IDFormatException(String m){
//	super(m);
//}
//}

////p551
//class Person implements Serializable{ 
//					// ����ȭǥ��
//	private static final long serialVersionUID = -1503252402544036183L;
//	String name;
//	String job;
//	public Person() {}
//	public Person(String name,String job) {
//		this.name=name;
//		this.job=job;
//	}
//	public String toString() {
//		return name+","+job;
//	}
//}