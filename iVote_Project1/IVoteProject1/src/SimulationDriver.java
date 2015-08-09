import java.util.Random;

public class SimulationDriver{

	public static void main(String[] args)  {
		
		int totalStudent = 0;
		int noOfStudents;
		StudentID studentID = new StudentID();
		Student student = new Student();
		Question queans = new Question();
		IVoteService iVote = new IVoteService();
		
		Random rand = new Random();
		
		System.out.println("Hetal Sakaria \n\n");
		
		System.out.println("\t CS356\n ");
		
		System.out.println("Post Question Type and Ans");
		
		Candidate candidate = new Candidate();

		/************************************************
		 * Candidate class generate question type
		 * If random number =1, it will be multiple choice
		 * If random number = 2, it will be boolean choice
		 *************************************************/

		if(candidate.getQuesType() == 1){
			
//			System.out.print(" Question Type is Multiple Choice " + candidate.getQuesType());
			System.out.print(" Question Type:  Multiple Choice  ");

			candidate.aKey.add((" "+ candidate.multipleChoiceAnswer()));
			System.out.println("Ans:  " + candidate.aKey.get(0) + "\n\n");
			//setAns
			//display for student
			
			System.out.println("----------------------------------\n");
			

			System.out.println("Choose your answere [A,B,C,or D]: ");
			System.out.println("StudentID"    +  "\tAnswer ");
			
			noOfStudents = student.generateNoOfStudents();
			
			while(totalStudent< noOfStudents){
				
					String stID = studentID.studentID();
	
					System.out.print(stID + "  "+"\t"+ student.multipleChoiceAnswer());
					
					totalStudent++;
					System.out.println("");

				}
		
		}
		
		//boolean
		else{
			System.out.print(" Question Type: Boolean  ");// + candidate.getQuesType() + "  ");
			candidate.aKey.add(""+ candidate.booleanAnswer());
			System.out.println("Ans:  " + candidate.aKey.get(0) + "\n\n");
			System.out.println("----------------------------------\n");

			System.out.println("Choose your answere [T/F]: ");
			System.out.println("StudentID"    +  "\tAnswer ");
			noOfStudents = student.generateNoOfStudents();

			while(totalStudent< noOfStudents){
				String stID = studentID.studentID();

				System.out.print(stID + "  "+"\t"+ student.booleanAnswer());
				totalStudent++;
				System.out.println("");
			}
		
		}

		System.out.println("--------------------------------\n");
		//iVote Service result.
		
		System.out.println("--------------------------------\n");

	}

}
