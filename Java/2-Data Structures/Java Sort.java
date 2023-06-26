/*
https://www.hackerrank.com/challenges/java-sort/problem
Test cases : 6/6
*/

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Checker implements Comparator<Student>{
    
    @Override
    public int compare(Student st1, Student st2) {
        
        if(st1.getCgpa() != st2.getCgpa()) {
            return Double.compare(st2.getCgpa(), st1.getCgpa());
        }
        else if(!st1.getFname().equals(st2.getFname())) {
            return st1.getFname().compareTo(st2.getFname());
        }
        else {
            return st1.getId() - st2.getId();
        }
    } 
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        Checker checker = new Checker();
        Collections.sort(studentList,checker);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}