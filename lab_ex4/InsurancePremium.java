package lab_ex4;
import java.util.Scanner;
class Insurance {
double calculatePremium(int age, String health, String location, int policyYears, String planType) {
	double basePremium = 5000;
	if (age > 50) basePremium += 2000;
	if (health.equalsIgnoreCase("poor")) basePremium += 3000;
	if (location.equalsIgnoreCase("urban")) basePremium += 1000;
	if (planType.equalsIgnoreCase("Gold")) basePremium *= 1.5;
	else if (planType.equalsIgnoreCase("Platinum")) basePremium *= 2;
	return basePremium * policyYears;
}
}
public class InsurancePremium {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Insurance insurance = new Insurance();
System.out.print("Enter Age: ");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter Health Condition (Good/Poor): ");
String health = sc.nextLine();
System.out.print("Enter Location (Urban/Rural): ");
String location = sc.nextLine();
System.out.print("Enter Policy Duration (Years): ");
int years = sc.nextInt();
sc.nextLine();
System.out.print("Choose Plan (Basic/Gold/Platinum): ");
String planType = sc.nextLine();
double premium = insurance.calculatePremium(age, health, location, years, planType);
System.out.println("Total Insurance Premium for " + planType + " Plan: " + premium);
sc.close();
}
}
