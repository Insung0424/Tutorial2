package ch13;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		MemberTreeSet arr = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		arr.addMember(memberHong);
		arr.addMember(memberLee);
		arr.addMember(memberKim);
		arr.addMember(memberKang);

		arr.showAllMember();
		
//		TreeSet<String> ts = new TreeSet<>();
//		ts.add("�̼���");
//		ts.add("������");
//		ts.add("ȫ�浿");
//		ts.add("������");
//		System.out.println(ts); //comparable�� �ڵ����� ��������
	}

}
