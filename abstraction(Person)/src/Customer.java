public class Customer extends Person {
	
	public static void main(String[] args) {

	Person n = new Customer();

	n.setname("ali");
	System.out.println(n.getname());
	n.printinfo();
	}
	
	
    public void printBalance() {
		
	}
	
	public void printinfo() {
		System.out.println("info 2");
	}
	
}
