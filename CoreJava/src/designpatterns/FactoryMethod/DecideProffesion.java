package designpatterns.FactoryMethod;

public class DecideProffesion {

	public ProffesionFactoryMethod makeProfession(String typeOfproffesion) {

		if (typeOfproffesion.equals("Doctor")) {
			return new Doctor();
		} else if (typeOfproffesion.equals("Engineer")) {
			return new Engineer();
		} else if (typeOfproffesion.equals("techer")) {
			return new Teacher();
		} else {
			return null;
		}

	}
}
