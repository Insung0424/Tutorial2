package ch12;

public class Test {

	public static void main(String[] args) {
		MemberHashSet arr = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		arr.addMember(memberLee);
		arr.addMember(memberKim);
		arr.addMember(memberKang);

		arr.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");
		arr.addMember(memberHong);
		arr.showAllMember();
	}

}
