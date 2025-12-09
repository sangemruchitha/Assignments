package Assignments;

public class Assignment2_Arrays {
	public static void main(String args[])
	{
		
		//Array with knowing values
		String[][][] marks = {
				
				{
					{"Mathematics I","Physics Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng"},
					{"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"}
				},
				{
					{"Mathematics II","Mechanics Environmental Sci","Basic Electronics","Engineering Physics","Engineering Graphics"},
					{"Pass(82)","Pass(77)", "Pass(93)"," Fail(19)", "Fail(24)", "Pass(90)"}
				},
				{
					{"Data Structures"," Discrete Mathematics","Digital Electronics"," Operating Systems", "Signals and Systems"," Object-Oriented Prog"},
					{"Pass(88"," Pass(81)"," Pass(76)", "Fail(32)", "Pass(85)"," Pass(78)"}
				
				},
				{
					{"Algorithms"," ComputerNetworks","DatabaseSystems"," Microprocessors"," Communication Eng"," Software Engineering"},
					{"Pass(91)"," Pass(73)"," Fail(19)"," Pass(80)"," Pass(76)"," Pass(87)"}
				},
				{
					{"Probability &Stats","MachineLearning"," Compiler Design"," Theory of Computation"," Embedded Systems"," Computer Graphics"},
					{"Pass(86)","Pass(88)"," Pass(84)"," Pass(95)"," Pass(73)"," Pass(90)"}
				}								
		};
		
		System.out.println("Print Semester 2 Subject 4 "+marks[1][0][2]);
		System.out.println("Print Semester 2 Subject 5 "+marks[1][0][3]);
		System.out.println("the Status/Marks of Semester 4 Subject 3 "+marks[3][1][2]);
		System.out.println("the Status/Marks of Semester 4 Subject 6 "+marks[3][1][5]);
		
		//Array without knowing values
		String[][][] test = new String[5][2][6];
		test[0][0][0] = "Mathematics I";
		test[0][0][1] = "Physics";
		test[0][0][2] = "Chemistry";
		test[0][0][3] = "Computer Programming";
		test[0][0][4] = "Engineering Drawing";
		test[0][0][5] ="Basic Electrical Eng.";
		
		test[0][1][0] = "Pass(78)";
		test[0][1][1] = "Pass(85)";
		test[0][1][2] =	"Fail(21)";	
	    test[0][1][3] = "Pass(74)";
		test[0][1][4] = "Pass(88)";
		test[0][1][5] = "Pass(79)";
		
		test[1][0][0] = "Mathematics II";
		test[1][0][1] = "Mechanics";
		test[1][0][2] = "Environmental scl"; 
		test[1][0][3] = "Basic Electronics";
		test[1][0][4] = "Engineering Physics";
		test[1][0][5] = "Engineering Graphics";
		
		test[1][1][0] = "Pass(82)";
		test[1][1][1] = "Pass(77)";
		test[1][1][2] = "Pass(93)"; 
		test[1][1][3] = "Fail(19)";
		test[1][1][4] = "Fail(24)";
		test[1][1][5] = "Pass(90)";
		
		test[2][0][0] = "Data Structures";
		test[2][0][1] = "Discrete Mathematics";
		test[2][0][2] = "Digital Electronics"; 
		test[2][0][3] = "Operating Systems";
		test[2][0][4] = "Signals and Systems";
		test[2][0][5] = "Object-Oriented Prog";
		
		test[2][1][0] = "Pass(88}";
		test[2][1][1] = "Pass(81)";
		test[2][1][2] = "Pass(76)"; 
		test[2][1][3] = "Fail(32)";
		test[2][1][4] = "Pass(85)";
		test[2][1][5] = "Pass(78)";
		
		test[3][0][0] = "Algorithms";
		test[3][0][1] = "Computer Networks";
		test[3][0][2] = "Database Systems"; 
		test[3][0][3] = "Microprocessors";
		test[3][0][4] = "Communication Eng.";
		test[3][0][5] = "Software Engineering";
		
		test[3][1][0] = "Pass(91)";
		test[3][1][1] = "Pass(73)";
		test[3][1][2] = "Fail(19)"; 
		test[3][1][3] = "Pass(80)";
		test[2][1][4] = "Pass(76)";
		test[2][1][5] = "Pass(87)";
		
		test[4][0][0] = "Probability Stats";
		test[4][0][1] = "Machine Learning";
		test[4][0][2] = "Compiler Design";
		test[4][0][3] = "Theory of Computation";
		test[4][0][4] = "Embedded Systems";
		test[4][0][5] = "Computer Graphics";
		
		test[4][1][0] = "Pass(86)";
		test[4][1][1] = "Pass(88)";
		test[4][1][2] = "Pass(84)";
		test[4][1][3] = "Pass(95)";
		test[4][1][4] = "Pass(73)";
		test[4][1][5] = "Pass(90)";
		
		System.out.println("            ");
		System.out.println("Print Semester 2 Subject 4 "+marks[1][0][2]);
		System.out.println("Print Semester 2 Subject 5 "+marks[1][0][3]);
		System.out.println("the Status/Marks of Semester 4 Subject 3 "+marks[3][1][2]);
		System.out.println("the Status/Marks of Semester 4 Subject 6 "+marks[3][1][5]);
	}

}
