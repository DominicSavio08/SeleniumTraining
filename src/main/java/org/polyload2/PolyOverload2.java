package org.polyload2;

public class PolyOverload2 {
	
	private void ug(String firstname , String lastname , String initial) {
		System.out.println("FIRST NAME IS : " + firstname);
		System.out.println("LAST NAME IS : " + lastname);
		System.out.println("INITIAL IS : " + initial);

	}
	private void ug(int age , long phone , double salary) {
		System.out.println("YOUR AGE IS : " + age);
		System.out.println("YOUR PHONE NUMBER IS : " + phone);
		System.out.println("YOUR SALARY IS : " + salary);
		
	}
	private void ug(float laptopprice , String add) {
		System.out.println("YOUR LAPTOP PRICE IS :" + laptopprice);
		System.out.println("YOUR ADDRESS IS : " + add);
		
	}
	public static void main(String[] args) {
		PolyOverload2 p = new PolyOverload2();
		p.ug("vinisten", "sanyo", "p");
		p.ug(26, 9080029161l, 35000d);
		p.ug(53500f, "Nagercoil");
		
	}
	

}
