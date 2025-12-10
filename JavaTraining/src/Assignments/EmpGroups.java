package Assignments;

public class EmpGroups {

	public static void main(String[] args) {
    
		Employees obj = new Employees();
		
	    String[] names = obj.employeNames;
		int[] ids = obj.employeeIDs;
		
		System.out.println("Employee Name:"+ names[0]+",Employee ID:"+ids[0]);
		System.out.println("Employee Name:"+ names[1]+",Employee ID:"+ids[1]);
		System.out.println("Employee Name:"+ names[2]+",Employee ID:"+ids[2]);
		
		
		/*String[][] names = obj.data;
		System.out.println("Employee Name:"+names[0][0]+",Employee ID:"+names[1][0]);
		System.out.println("Employee Name:"+names[0][1]+",Employee ID:"+names[1][1]);
		System.out.println("Employee Name:"+names[0][2]+",Employee ID:"+names[1][2]);*/
	}

}
