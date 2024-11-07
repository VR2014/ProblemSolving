package designpatterns.FactoryMethod;

public class Main {

	public static void main(String[] args) {
		DecideProffesion check = new DecideProffesion();

		ProffesionFactoryMethod doc = check.makeProfession("Doctor");

		doc.printFromWhere();
	}

}
