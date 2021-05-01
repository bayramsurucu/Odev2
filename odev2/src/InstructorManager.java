import java.util.List;

public class InstructorManager extends UsersManager {
    public void login (Instructor instructor){
        System.out.println(instructor.getFirstname()+instructor.getLastname()+"Instrutor Giriş Yaptı.");

    }

    public void addToUser(Users users){
        System.out.println(users.getFirstname()+" "+users.getLastname()+ " "+ users.getEmail()+ " öğretmen Eklendi");

    }
    public List<Instructor>addInstructor(List<Instructor>instructors,Instructor instructor){
        instructors.add(instructor);
        return instructors;

    }
    public void courseList(){
      //  System.out.println(instructor.getCourseName()+" kursu "+instructor.getFirstname()+" "+instructor.getLastname()+" Tarafından verilmektedir");

    }

}
