package access_modifers;

public class WithinTheSamePackage {

	public static void main(String[] args) {

		Demo d1 = new Demo();

		System.out.println(" public : WithInSameClass " + d1.rollNumber);
		System.out.println(" protected : WithInSameClass  " + d1.str);
		System.out.println(" default : WithInSameClass " + d1.defaulter);
		// private Not accessible
		// System.out.println(" private : WithInSameClass" + d1.chr);
	}

}
