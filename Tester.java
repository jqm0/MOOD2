package firstTask;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Tester {

	public static void main(String[] args) {
		boolean option = true;
		boolean option2 = true;
		boolean option3 = true;
		boolean option4 = true;
		boolean o = true;
		ArrayList<Department> departmentA = new ArrayList<Department>();
		Stack<String> stackHistory = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		School school1 = new School();
		
		while(o) {
		System.out.println("please select one of option");
		System.out.println("1 - Do object chaining ");
		System.out.println("2 - Display History ");
		System.out.println("3 - Exit ");
		int firstOption = sc.nextInt();
		if( firstOption == 1) {
		
			System.out.println("welcome to object chaining system");
			System.out.print("Please Enter School Name : ");
			String schoolName = sc.next();
			school1.setName(schoolName);
			stackHistory.push(schoolName);
			System.out.print("Please Enter School ID : ");
			Integer id = sc.nextInt();
			school1.setId(id);
			stackHistory.push(id.toString());
			while (option) {

				Department dep = new Department();
				System.out.print("Please Enter Department Name : ");
				String dName = sc.next();
				dep.setName(dName);
				stackHistory.push(dName);

				System.out.print("Please Enter Department size : ");
				Integer depSize = sc.nextInt();
				dep.setdSize(depSize);
				stackHistory.push(depSize.toString());
				System.out.print("Please Enter Department location : ");
				String dLocation = sc.next();
				dep.setLocation(dLocation);
				stackHistory.push(dLocation);
				while (option2) {

					Teacher t = new Teacher();
					System.out.print("Please Enter Teacher name : ");
					String tName = sc.next();
					t.setName(tName);
					stackHistory.push(tName);
					System.out.print("Please Enter Teacher ID : ");
					Integer tID = sc.nextInt();
					t.setId(tID);
					stackHistory.push(tID.toString());	
					while (option3) {
						Student st = new Student();
						System.out.print("Please Enter Student name : ");
						st.setName(sc.next());
						System.out.print("Please Enter Student ID : ");
						st.setId(sc.nextInt());
						while (option4) {
							Course c = new Course();
							System.out.print("Please Enter Course name : ");
							c.setName(sc.next());
							System.out.print("Please Enter Course Type : ");
							c.setType(sc.next());
							System.out.print("Please Enter Midterm Mark : ");
							c.markCourse.setMidMark(sc.nextDouble());
							System.out.print("Please Enter Finall Mark : ");
							c.markCourse.setFinal(sc.nextDouble());
							st.courseList.add(c);
							System.out.print("Do You want add another course 1 if yes.> ");
							if (sc.nextInt() != 1) {
								option4 = false;
	 
							}

						}

						t.studentList.add(st);
						System.out.print("Do You want add another Student 1 if yes.> ");
						if (sc.nextInt() != 1) {
							option3 = false;

						}
						option4 = true;

					}
					dep.teacherList.add(t);

					System.out.print("Do You want another Teacher 1 if yes.> ");
					option3 = true;
					if (sc.nextInt() != 1) {
						option2 = false;

						
					}
				}
				departmentA.add(dep);

				System.out.print("Please Enter 1 to add more department :");
				option2 = true;
				if (sc.nextInt() != 1) {
					option = false;
					String ANSI_GREEN = "\u001B[32m";
					
					System.out.println(ANSI_GREEN + "===========@@@ School Details @@@============");
					System.out.println(">> School name is :" + school1.getName());
					System.out.println(">> School id is :" + school1.getId());
					System.out.println("=========== |Departments List| ============");

					for (Department department : departmentA) {
						String ANSI_CYAN = "\u001B[36m";
						System.out.println(ANSI_CYAN +"=========== |>> Department Details <<| ============");
						System.out.println("============= Department name is " + department.getName() + " ============");
						System.out.println("============= Department Size is " + department.getdSize() +" ============");
						System.out.println("=========== \\ Teacher List // ============");

						for (Teacher t : department.teacherList) {
							String ANSI_YELLOW = "\u001B[33m";
							System.out.println(ANSI_YELLOW +"================== Teacher Details =====================");
							System.out.println(">> Teacher name is : " + t.getName());
							System.out.println(">> Teacher id is : :" + t.getId());
							System.out.println("==================### Student List ###=====================");
							for (Student s : t.studentList) {
								 
								System.out.println(ANSI_CYAN +"==================>> Student Details <<=====================");
								System.out.println(">> Student name is : " + s.getName());
								System.out.println(">> Student id is : :" + s.getId());
								System.out.println("==================### Course List ###=====================");
								for (Course c : s.courseList) {
									System.out.println("==================$$$  Course Details $$$=====================");
									System.out.println(">> Course name is : " + c.getName());
									System.out.println(">> Course type is : :" + c.getType());
									System.out.println(">> Midterm Mark is : " + c.markCourse.getMidMark());
									System.out.println(">> finall Mark is : :" + c.markCourse.getFinal());
								}
							}

						}

						System.out.println("********************************************************");
					}
					System.out.println("=========== Thank You :) ============");

				}

			}
		}
		else if (firstOption == 2){
			System.out.println("============== History ==============");
			System.out.println(">>>>>>>>>>> School Details <<<<<<<<<");
			for(String s : stackHistory) {
				System.out.println("---------------------------------");
				System.out.println(s);
			}	
		}
		else {
			o = false;
		}
			
		}
		

		sc.close();
	}

}