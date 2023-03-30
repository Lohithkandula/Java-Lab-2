interface StudentRead {
void Code();
}
interface StudentTravel {
void Compile();
}
class Student implements StudentRead, StudentTravel{
public void Code() {
System.out.println("Hello ");
}
public void Compile() {
System.out.println("This is Lohith");
}
}
public class Multiple {
public static void main(String args[]) {
Student a = new Student();
a.Code();
a.Compile();
}
}
