package ch08;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderNumber = "202205300003";
		order.orderPhone = "01012345678";
		order.orderAddress = "seoul";
		order.orderDate = "20220530";
		order.orderHour = "201115";
		order.orderPrice = "35000";
		order.orderProductNumber = "0003";
		
		System.out.println("�ֹ�������ȣ :"+order.orderNumber);
		System.out.println("�ֹ��ڵ�����ȣ :"+order.orderPhone);
		System.out.println("�ֹ����ּ� :"+order.orderAddress);
		System.out.println("�ֹ���¥ :"+order.orderDate);
		System.out.println("�ֹ��ð� :"+order.orderHour);
		System.out.println("�ֹ����� :"+order.orderPrice);
		System.out.println("�ֹ���ȣ :"+order.orderProductNumber);
	}

}
