package important.topics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A_SeializationMain {

	public static void main(String[] args) {
		A_PersonSerializable a = new A_PersonSerializable();
		a.setAge(24);
		a.setName("Vamsi");
		try {
			FileOutputStream file = new FileOutputStream("D:\\PROGRESS\\person.ser");
			ObjectOutputStream stream = new ObjectOutputStream(file);
			stream.writeObject(a);
			stream.close();
			file.close();
			System.out.println("Object serialized successfully: " + a);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileInputStream file = new FileInputStream("D:\\PROGRESS\\person.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			A_PersonSerializable deserializedPerson = (A_PersonSerializable) in.readObject();
			in.close();
			file.close();
			System.out.println("Object deserialized successfully: " + deserializedPerson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
