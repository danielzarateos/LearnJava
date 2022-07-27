package VariableManipulation;

public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean canIGraduate = creditsEarned > creditsToGraduate; 
    System.out.print(canIGraduate);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.print(creditsToGraduate < creditsAfterSeminar);

	}
}