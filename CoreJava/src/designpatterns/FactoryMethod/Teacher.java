package designpatterns.FactoryMethod;

public class Teacher implements ProffesionFactoryMethod {

	@Override
	public void printFromWhere() {
		System.out.println("Teacher object returned");
	}

}
