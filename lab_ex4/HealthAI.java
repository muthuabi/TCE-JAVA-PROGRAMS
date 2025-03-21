package lab_ex4;

import java.util.Scanner;
class HealthDiagnosis {
String diagnose(int age, double temp, boolean cough, int oxygenLevel, int bp, int feverDays) {
if (temp > 101 && cough && oxygenLevel < 90)
return "High Risk: Possible Severe Infection! Seek Immediate Medical Attention.";
if (feverDays > 3 && temp > 100)
return "Warning: Prolonged Fever Detected! Medical Checkup Recommended.";
if (temp > 99 && age > 60)
return "Moderate Risk: Mild Fever and Age Factor. Monitor Health Closely!";
if (bp > 140)
return "Warning: High Blood Pressure Detected! Consult a Doctor.";
return "Healthy Condition! Maintain a Balanced Lifestyle.";
}
}
public class HealthAI {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
HealthDiagnosis ai = new HealthDiagnosis();
System.out.println("Welcome to AI Health Diagnosis!");
System.out.print("Are you experiencing fever? (yes/no): ");
String feverResponse = sc.next().toLowerCase();
double temp = 98.6;int feverDays = 0;
if (feverResponse.equals("yes")) {
System.out.print("How many days have you had a fever? ");
feverDays = sc.nextInt();
System.out.print("What is your current body temperature (°F)? ");
temp = sc.nextDouble();}
System.out.print("Do you have a cough? (yes/no): ");
boolean cough = sc.next().equalsIgnoreCase("yes");
System.out.print("Enter your age: ");
int age = sc.nextInt();
System.out.print("Enter your Oxygen Level (%): ");
int oxygenLevel = sc.nextInt();
System.out.print("Enter your Blood Pressure (Systolic Value): ");
int bp = sc.nextInt();
String result = ai.diagnose(age, temp, cough, oxygenLevel, bp, feverDays);
System.out.println("Diagnosis Result: " + result);
sc.close();
}
}
