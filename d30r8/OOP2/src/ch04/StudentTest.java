package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//instance : new Ű���带 ����Ͽ� Ŭ������ �޸𸮿� ������ ����
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "seoul";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "sungnam";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);//ch04.Student@1c4af82c
		System.out.println(studentLee);
		//ch04.Student@379619aa
		//	��Ű��.Ŭ����@����޸��ּ�
		
	}

}
