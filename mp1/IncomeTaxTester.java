
package edu.monmouth.cs176.s1319673.mp1;

public class IncomeTaxTester {

	public static void main(String[] args) {
		IncomeTaxForm form1 = new IncomeTaxForm("Linda Redwood", 2);
		form1.enterWages(80500, 12000);
		
		IncomeTaxForm form2 = new IncomeTaxForm("Linda Redwood", 2);
		form2.enterWages(80500, 5000);
		
		

		form1.printForm();
		form2.printForm();
		
		
	}

}

























/*package edu.monmouth.cs176.s1319673.mp1;

public class IncomeTaxTester {

	public static void main(String[] args) {
		IncomeTaxForm form1 = new IncomeTaxForm("Michael Clark", 1);
		form1.enterWages(80500, 12000);
		
		IncomeTaxForm form2 = new IncomeTaxForm("Jane Smith", 2);
		form2.enterWages(80500, 24000);
		
		IncomeTaxForm form3 = new IncomeTaxForm("John Smith", 2);
		form3.enterWages(110000, 5000);
		

		//form1.printForm();
		//form2.printForm();
		//form3.printForm();
		
		
	}

}
*/