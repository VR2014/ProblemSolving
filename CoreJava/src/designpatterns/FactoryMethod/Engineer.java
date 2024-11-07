package designpatterns.FactoryMethod;

public class Engineer implements ProffesionFactoryMethod {

	@Override
	public void printFromWhere() {
		System.out.println("Engineer object returned");
	}

}
