package edu.monmouth.cs176.s1319673.mp1;


public class IncomeTaxForm {
	String name;
	int maritalStatus;
	
	double wages;
	double witholding;
	double taxableIncome;
	double deduction;
	double federalTax;
	double taxDue;
	
	public IncomeTaxForm(String name, int maritalStatus) {
		this.name = name;
		this.maritalStatus = maritalStatus;
		
		if (maritalStatus == 1) {
			deduction = 12000;
		}
		else if (maritalStatus == 2) {
			deduction = 24000;
		}
	}
	
	public void enterWages(double wages, double witholding) {
		this.wages = wages;
		this.witholding = witholding;
		
		taxableIncome = wages - deduction;

		if (deduction == 12000) {
			if ((wages >= 0) && (taxableIncome <= 10000)){
				federalTax = taxableIncome * 0.1;
			}
			else if ((taxableIncome >= 10001) && (taxableIncome <= 40000)){
				federalTax = 1000 + (0.12 * (taxableIncome - 10000));	
			}
			else if ((taxableIncome >= 40001) && (taxableIncome <= 85000)){
				federalTax = 4600 + (0.22 * (taxableIncome - 40000));
			}
			else if (taxableIncome > 85000){
				federalTax = 14500 + (0.24 * (taxableIncome - 85000));
			}
			
		}
		
		if (deduction == 24000) {
			if ((taxableIncome >= 0) && (taxableIncome <= 20000)){
				federalTax = taxableIncome * 0.1;
			}
			else if ((taxableIncome >= 20001) && (taxableIncome <= 80000)){
				federalTax = 2000 + (0.12 * (taxableIncome - 20000));	
			}
			else if (taxableIncome > 80000){
				federalTax = 9200 + (0.22 * (taxableIncome - 80000));
			}
			
			
		}
		
		taxDue = federalTax - witholding;
		if (taxDue < 0) {
			taxDue = Math.abs(taxDue);
		}
		
		
		
		
	}
		
		public void printForm() {
			if (wages < 120000) {
				System.out.println(name);
				System.out.printf("Wages: $%,d\n", (int) wages);
				System.out.printf("Deduction: $%,d\n", (int) deduction);
				System.out.printf("Taxable Income: $%,d\n", (int) taxableIncome);
				System.out.printf("Federal Tax: $%,d\n", (int) federalTax);
				System.out.printf("Tax refund: $%,d\n", (int) taxDue);
			}
			
			else {
				System.out.println("Error: Income too high to use this form");
			}
			
			System.out.println("");
	}
}







































/*

package edu.monmouth.cs176.s1319673.mp1;


public class IncomeTaxForm {
	String name;
	int maritalStatus;
	double wages;
	double witholding;
	double taxableIncome;
	double deduction;
	double tax;
	double taxDue;
	
	public IncomeTaxForm(String name, int maritalStatus) {
		this.name = name;
		System.out.println(name);
		
		if (maritalStatus == 1) {
			deduction = 12000;
		}
		else if (maritalStatus == 2) {
			deduction = 24000;
		}
	}
	
	public void enterWages(double wages, double witholding) {
		System.out.println("Wages: $" + Math.round(wages));
		taxableIncome = wages - deduction;

		if (deduction == 12000) {
			if ((wages >= 0) && (taxableIncome <= 10000)){
				tax = taxableIncome * 0.1;
			}
			else if ((taxableIncome >= 10001) && (taxableIncome <= 40000)){
				tax = 1000 + (0.12 * (taxableIncome - 10000));	
			}
			else if ((taxableIncome >= 40001) && (taxableIncome <= 85000)){
				tax = 4600 + (0.22 * (taxableIncome - 40000));
			}
			else if (taxableIncome > 85000){
				tax = 14500 + (0.24 * (taxableIncome - 85000));
			}
			System.out.println("Federal tax: $" + Math.round(tax));
		}
		
		if (deduction == 24000) {
			if ((taxableIncome >= 0) && (taxableIncome <= 20000)){
				tax = taxableIncome * 0.1;
			}
			else if ((taxableIncome >= 20001) && (taxableIncome <= 80000)){
				tax = 2000 + (0.12 * (taxableIncome - 20000));	
			}
			else if (taxableIncome > 80000){
				tax = 9200 + (0.22 * (taxableIncome - 80000));
			}
			
			
		}
		
		taxDue = tax - witholding;
		
		
		if (wages < 120000) {
			System.out.println("Deduction: $" + Math.round(deduction));	
			System.out.println("Taxable Income: $" + Math.round(taxableIncome));
			System.out.println("Federal tax: $" + Math.round(tax));
			System.out.println("Tax Due: $" + Math.round(taxDue));
		}
		else {
			System.out.println("Error: Income too high to use this form");
		}
		
		System.out.println("");
		
	}
}*/
