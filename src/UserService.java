public class UserService {
    public OOP users[]=new OOP[10];
    public int index=0;
    public boolean addUser(OOP user){
        boolean isHasUser=false;
        for(OOP user1: users ){
            if (user1!= null){
                if(user1.username.equals(user.username)){
                    isHasUser=true;
                }
            }

            }
        if(!isHasUser){
            users[index++]=user;

        }

        return !isHasUser;


    }
    public  boolean login(String username, String password){
        for(OOP u: users){
            if(u.username.equals(username) && u.password.equals(password)){
                return true;
            }
        }
        return false;
    }



}

