import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Objects;

public class UsersManager {
    public void addToUser(Users users){
        System.out.println(users.firstname+" "+users.lastname+ " "+ users.email+ " Eklendi");

    }
    public void login (Users users){

        System.out.println(users.firstname+" "+users.lastname+ ""+ users.email+ "Giriş Yapıldı");

    }

    public <T> void showList(List<T> users) {
        for(Object u : users) {
            Users user = (Users) u;
            System.out.println(user.getLastname()+" " +user.getFirstname()+" "+user.getEmail());
        }
        }
    }


