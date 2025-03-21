package lab_ex6;

import java.util.Arrays;
import java.util.Scanner;

class ResumeCandidates {
    protected String name, qualification, role;
    protected int exp, eligibility_score;
    protected String[] skills;
    protected boolean isOk;
    Scanner sc = new Scanner(System.in);

    public ResumeCandidates() {
        this.isOk = false;
        this.eligibility_score = 0;
    }

    public ResumeCandidates(String name, String qualification, String role, int exp, String[] skills) {
        this.name = name;
        this.qualification = qualification;
        this.role = role;
        this.exp = exp;
        this.skills = skills;
        this.eligibility_score = 0;
        this.isOk = false;
    }

    public void getResumeDetails() {
        System.out.println("Fill Your Resume Details");
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Qualification (Degree): ");
        this.qualification = sc.nextLine();
        System.out.print("Role: ");
        this.role = sc.nextLine();
        System.out.print("Experience: ");
        this.exp = sc.nextInt();
        sc.nextLine();
        System.out.println("Skills (Separated by Comma): ");
        this.skills = sc.nextLine().split(",");
    }

    public void displayResume() {
        System.out.println("------------------Resume--------------------");
        System.out.print("Name: " + this.name);
        System.out.println("\tQualification: " + this.qualification);
        System.out.print("Role: " + this.role);
        System.out.println("\tExperience: " + this.exp);
        System.out.println("Skills: " + String.join(",", this.skills));
        System.out.print("Eligibility Score: " + this.eligibility_score);
        System.out.println("\tIs Eligible: " + this.isOk);
        System.out.println("---------------------------------------------");
    }
}

class ResumeEval extends ResumeCandidates {
    protected String[] rskills;
    protected String rqual, rrole;
    protected int rexp;

    public ResumeEval() {
        rskills = new String[]{"C", "C++", "Java", "Python"};
        rqual = "MCA";
        rexp = 2;
        rrole = "Developer";
    }
    public void getRequirements()
    {
        System.out.println("\nEnter Required Job Criteria");
        System.out.print("Required Qualification: ");
        String rqual = sc.nextLine();
        System.out.print("Required Experience: ");
        int rexp = sc.nextInt();
        sc.nextLine();
        System.out.print("Required Role: ");
        String rrole = sc.nextLine();
        System.out.println("Required Skills (Separated by Comma): ");
        String[] rskills = sc.nextLine().split(",");
        this.rqual = rqual;
        this.rexp = rexp;
        this.rrole = rrole;
        this.rskills = rskills;
 
    }
    public ResumeCandidates[] assignEligiblityScores(ResumeCandidates[] in_cands,int rscore) {
        for (ResumeCandidates obj : in_cands) {
            if (obj.exp >= rexp) obj.eligibility_score += 25;
            if (obj.qualification.equalsIgnoreCase(rqual)) obj.eligibility_score += 25;
            if (obj.role.equalsIgnoreCase(rrole)) obj.eligibility_score += 25;

            int sk_point = 0;
            int tot_point = rskills.length;
            for (String sk : obj.skills) {
                for (String rk : rskills) {
                    if (sk.equalsIgnoreCase(rk)) sk_point++;
                }
            }
            obj.eligibility_score += (sk_point * 25) / tot_point;
            obj.isOk = obj.eligibility_score >= rscore;
        }
        return in_cands;
    }
}

public class ResumeScreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResumeEval evaluator=new ResumeEval();
        evaluator.getRequirements();
        System.out.print("Enter the No of Candidates: ");
        int N = sc.nextInt();
        sc.nextLine();
        ResumeCandidates[] rcands = new ResumeCandidates[N];
        for (int i = 0; i < N; i++) {
            rcands[i] = new ResumeCandidates();
            rcands[i].getResumeDetails();
        }
        evaluator.assignEligiblityScores(rcands,60);

        Arrays.sort(rcands, (a, b) -> Integer.compare(b.eligibility_score, a.eligibility_score));

        for (ResumeCandidates candidate : rcands) {
            candidate.displayResume();
            System.out.println();
        }
        sc.close();
    }
}
