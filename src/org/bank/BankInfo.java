package org.bank;

public class BankInfo extends AxisBank{
private void saving() {
	// TODO Auto-generated method stub
System.out.println("Savings:89");
}
private void fixed() {
	// TODO Auto-generated method stub
System.out.println("Fixed:65");
}
private void income() {
	// TODO Auto-generated method stub
System.out.println("Income:99");
}
public void deposit() {
	System.out.println("Deposit: 45");
}
public static void main(String[] args) {
	BankInfo bi = new BankInfo();
	bi.saving();
	bi.fixed();
	bi.income();
	
	bi.deposit();
}
}
