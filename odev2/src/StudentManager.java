import java.util.List;

public class StudentManager extends UsersManager {
    public void login (Users users){
        System.out.println(users.getFirstname()+" "+users.getLastname()+ " Öğrenci giriş Yaptı");

    }
    public void addToUser(Users users){
        System.out.println(users.firstname+"  "+users.lastname+ " "+ users.email+ " Öğrenci Eklendi");

    }
    public List<Student> addToStudent(List<Student>students, Student student){
        students.add(student);
        return students;

    }
}
