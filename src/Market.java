import java.util.UUID;

public class Market {
    public UUID id;
    public String name;
    public String username;
    public String password;


    public Market(){

    }





    public Market(String name,String username, String password){
        this.name=name;
        this.username=username;
        this.password=password;

    }



    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
