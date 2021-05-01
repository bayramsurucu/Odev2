import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student=new Student();
        List<Student>students=new ArrayList<Student>();
        student.setId(1);
        student.setFirstname("Bayram");
        student.setLastname("Sürücü");
        student.setEmail("bayram.surucu@hotmail.com");
        student.setPassword("Aa123456*");
        Student student2=new Student();
        student2.setId(2);
        student2.setFirstname("ahmet");
        student2.setLastname("Sürücü");
        student2.setEmail("dsfwqfwqwqrwqrqwrwq.surucu@hotmail.com");
        student2.setPassword("Aa123456*");
        StudentManager studentManager=new StudentManager();
        studentManager.addToUser(student);
        studentManager.login(student);
        studentManager.addToStudent(students,student);
        studentManager.addToStudent(students,student2);
        InstructorManager instructorManager=new InstructorManager();

        List<Instructor>instructors=new ArrayList<Instructor>();

        Instructor instructor=new Instructor();
        instructor.setFirstname("Engin");
        instructor.setLastname("demiroğ");
        instructor.setEmail("engindemiroğ@hotmail.com");
        instructorManager.addInstructor(instructors,instructor);
        Instructor instructor2=new Instructor();
        instructor2.setFirstname("İnci");
        instructor2.setLastname("yisfğitsfsafsafa");
        instructor2.setEmail("sfsagdagasgsagas@hotmail.com");
        instructorManager.addInstructor(instructors,instructor2);
     /* instructorManager.login(instructor);
      instructorManager.addToUser(instructor);
      instructorManager.courseList();*/
    UsersManager usersManager=new UsersManager();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Öğrenci ve Eğitmen List");
    usersManager.showList(instructors);
    usersManager.showList(students);

    }
}
