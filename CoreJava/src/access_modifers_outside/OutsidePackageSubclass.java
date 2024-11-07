package access_modifers_outside;

import access_modifers.Demo;

public class OutsidePackageSubclass extends Demo {

	public static void main(String[] args) {

		OutsidePackageSubclass d1 = new OutsidePackageSubclass();

		System.out.println(" public : OutsidePackageSubclass " + d1.rollNumber);
		System.out.println(" protected : OutsidePackageSubclass " + d1.str);
		// private,default Not accessible for OutsidePackageNonSubclass
		// System.out.println(" default : OutsidePackageNonSubclass " + d1.defaulter);
		// private Not accessible
		// System.out.println(" private : WithInSameClass" + d1.chr);

	}
}
