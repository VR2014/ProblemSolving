package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class A_Exception {

	public static void main(String[] args) throws IOException {
		files();
		add(5, 0);

	}

	public static void add(int a, int b) {
		System.out.println("program startred ");
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Exception Caused by :: " + ex.getMessage());
			ex.printStackTrace();
			throw ex;
		} finally {
			System.out.println("Finally Executed ");
		}

		System.out.println("program ends  ");
	}

	public static void files() throws IOException {
		System.out.println("method started");
		File file = new File("D:\\vamsi.txt");
		FileInputStream io = new FileInputStream(file);
		System.out.println(io.read());

	}
}
