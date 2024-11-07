package designpatterns.FactoryMethod;

public class Doctor implements ProffesionFactoryMethod {

	@Override
	public void printFromWhere() {
		System.out.println("From Doc objet returned ");
	}

}
