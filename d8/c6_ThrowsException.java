<<<<<<< HEAD
package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class LoadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

			ThrowsException test = new ThrowsException();
			try {
				test.LoadClass("a.txt", "java.lang.String");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			} catch (Exception e) {
				//최상위는 가장 마지막에 작성해야한다
			}
			System.out.println("end");
	}

}
=======
package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class LoadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

			ThrowsException test = new ThrowsException();
			try {
				test.LoadClass("a.txt", "java.lang.String");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			} catch (Exception e) {
				//최상위는 가장 마지막에 작성해야한다
			}
			System.out.println("end");
	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
