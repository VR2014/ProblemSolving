package access_modifers;

public  class Demo {
	public int rollNumber = 10;
	protected String str = "Vamsi";
	int defaulter = 10;
	private String chr = "Kishore Reddy";

	public void printAccessDemo() {
		System.out.println(" public : WithInSameClass " + rollNumber);
		System.out.println(" protected : WithInSameClass  " + str);
		System.out.println(" default : WithInSameClass " + defaulter);
		System.out.println(" private : WithInSameClass" + chr);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.printAccessDemo();
	}
}