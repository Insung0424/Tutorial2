package ch10;

public class Test {

	public static void main(String[] args) {
		Array arr = new Array();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		arr.addMember(memberLee);
		arr.addMember(memberKim);
		arr.addMember(memberKang);
		arr.addMember(memberHong);

		arr.showAllMember();
		
		arr.removeMember(memberKim.getMemberId());
		arr.showAllMember();
	}

}
