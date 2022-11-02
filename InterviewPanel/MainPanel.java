package Interview;

import java.util.Scanner;


enum Cases{
	AddCandidate,
	RemoveCandidate,
	Back;
	 static Cases get(Integer i) {
            return values()[i-1];
        }
}
	 
public class MainPanel {
	
		
	
public static void main(String[] args) {
	
	Interview interview=new Interview();
	boolean b=true;
	while(b)
	{
	System.out.println("1.AddCnadidate\n2.RemoveCandidate\n3.Back");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	Cases main_panel =Cases.get(input);
	switch(main_panel) {
	case AddCandidate :
	      {
		System.out.println("Enter Number of interviewers: ");
		int noOfPeoples=sc.nextInt();
			 interview.WaitingRoom(interview.addInterviewer(noOfPeoples));

		break;
	      }
	case RemoveCandidate :
	{   interview.removeInterviewer();
		break;
	}
	case Back :
	{
		b=false;
		break;
	}
	       	
	}
	}	
}
}
