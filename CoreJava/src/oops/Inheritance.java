package oops;

import javax.management.remote.SubjectDelegationPermission;

public class Inheritance {
	public static void main(String[] args) {
		Admin d = new Admin();
		d.readOnly();
		d.readAndWrite();
		d.readWriteAnddelete();

	}

}

class guest {
	public void readOnly() {
		System.out.println("can read");
	}
}

class Dev extends guest {
	public void readAndWrite() {
		System.out.println("can write");
	}
}

class Admin extends Dev {
		
	public void readWriteAnddelete() {
		super.readOnly();
		System.out.println("he/she can delete the application");
	}
	
	public void readOnly() {
		System.out.println("Admin read Access");
		
	}
}