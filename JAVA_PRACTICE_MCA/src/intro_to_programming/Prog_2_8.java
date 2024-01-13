package intro_to_programming;
import java.util.*;

/*
 * 8. An election is contested by 5 candidates. The candidates are numbered 1-5 and the voting
		is done by marking the candidate number on the ballot paper. Write a program to read the
		ballots and count the votes casts for each candidate using an array variable count. In case,
		a number read is outside the range 1 – 5, the ballot should be considered as a ‘spoilt ballot’
		and the program should also count the number of spoilt ballot.
 */

public class Prog_2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candidatesCount[] = {0,0,0,0,0};
		int spoiltBallot = 0;
		
		System.out.println("Enter number of voters = ");
		int voter = sc.nextInt();
		
		System.out.println("Vote for A (1)\nVote for B (2)\nVote for C (3)\nVote for D (4)\nVote for E (5)");
		
		for(int i = 0; i < voter; i++) {
			System.out.println("Vote = ");
			int vote = sc.nextInt();
			if(vote == 1)
				candidatesCount[0]++;
			else if(vote == 2)
				candidatesCount[1]++;
			else if(vote == 3)
				candidatesCount[2]++;
			else if(vote == 4)
				candidatesCount[3]++;
			else if(vote == 5)
				candidatesCount[4]++;
			else
				spoiltBallot++;
		}
		
		System.out.println("A - > "+candidatesCount[0]);
		System.out.println("B - > "+candidatesCount[1]);
		System.out.println("C - > "+candidatesCount[2]);
		System.out.println("D - > "+candidatesCount[3]);
		System.out.println("E - > "+candidatesCount[4]);
		System.out.println("Spoilt - > "+spoiltBallot);
		

	}

}
