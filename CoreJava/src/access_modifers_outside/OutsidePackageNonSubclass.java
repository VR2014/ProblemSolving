package access_modifers_outside;

import access_modifers.Demo;

public class OutsidePackageNonSubclass {

	public static void main(String[] args) {
		Demo d1 = new Demo();

		System.out.println(" public : OutsidePackageNonSubclass " + d1.rollNumber);
		// private,protected,default Not accessible for OutsidePackageNonSubclass
		// System.out.println(" protected : OutsidePackageNonSubclass " + d1.str);
		// System.out.println(" default : OutsidePackageNonSubclass " + d1.defaulter);
		// private Not accessible
		// System.out.println(" private : WithInSameClass" + d1.chr);
	}

}
