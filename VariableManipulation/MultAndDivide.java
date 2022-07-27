package VariableManipulation;

public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double paycheckAmount = 40 * 15.50;
    double balance = 20010.5;
    double hourlyRate = 15.5;
    double hoursWorked = balance / hourlyRate;
    int evenlyDivided = 10 / 5;
    //evenlyDivided holds 2, because 10 divided by 5 is 2
    int unevenlyDivided = 10 / 4;
    //unevenlyDivided holds 2, because 10 divided by 4 is 2.5
    double total = subtotal + (subtotal * tax);
    
    double perPerson = total / 4;
    System.out.println(perPerson);

	}
}