package lab_ex6;

import java.util.Arrays;
import java.util.Scanner;
public class ResumeRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResumeEval evaluator = new ResumeEval();
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
        System.out.print("Enter Number of Top Candidates to Display: ");
        int topN = sc.nextInt();
        topN = Math.min(topN, N);

        System.out.println("\nTop " + topN + " Candidates:");
        for (int i = 0; i < topN; i++) {
        	if(!rcands[i].isOk)
        	System.out.println("-------- NOT ELIGIBILE --------");
            rcands[i].displayResume();
            System.out.println();
        }
        sc.close();
    }
}
