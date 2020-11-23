package object;

class Student{
	int studentID;
	String studentName;
	
	public int hashCode() {
		return studentID;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std =(Student)obj;
			if(this.studentID == std.studentID)
				return true;
			else return false;
		}
		return false;
	}
	
	public Student(int StudentID, String studnetName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public String toString() {
		return studentID +","+studentName;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100,"이상원");
		Student studentLee2 = studentLee; //쥬소복사
		Student studentSang = new Student(100,"이상원");
		
		System.out.println("studentLee의 hashCode :" + studentLee.hashCode() );
		System.out.println("studentSang의 hashCode :" + studentSang.hashCode() );
		
		System.out.println("studentLee의 실제 주소값" + System.identityHashCode(studentLee));
		System.out.println("studentLee의 실제 주소값 :" + System.identityHashCode(studentSang));
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2의 동일합니다");
		else
			System.out.println("studentLee와 studentLee2의 동일하지 않습니다");
		
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소가 같습니다");
		else
			System.out.println("studentLee와 studentSang의 주소가 다릅니다");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang의 동일합니다");
		else
			System.out.println("studentLee와 studentSang의 동일하지 않습니다");
 }
}

