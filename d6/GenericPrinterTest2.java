<<<<<<< HEAD
package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder  powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		//                (Powder)를 삽입해서 형변환을 하지않아도됨
		// GenericPrinter<T> 에서 T 자리에 Powder가 자동으로 변환
		// <> 는 다이아몬드연산자라고 함 
		System.out.println(powderPrinter.toString());
		
	}

}
=======
package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder  powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		//                (Powder)를 삽입해서 형변환을 하지않아도됨
		// GenericPrinter<T> 에서 T 자리에 Powder가 자동으로 변환
		// <> 는 다이아몬드연산자라고 함 
		System.out.println(powderPrinter.toString());
		
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
