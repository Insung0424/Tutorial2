package ch18;

public class CompanyTest {

	public static void main(String[] args) {
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		//���ϳ��� ��ü�� �����Ǵ� �̱��� ����
		System.out.println(company); //ch18.Company@1c4af82c
		System.out.println(company2);//ch18.Company@1c4af82c
		
	}

}
