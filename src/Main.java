import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
//        OOP user=new OOP();
//        user.name="Bekzod";
//        user.age=19;
//        user.gender="Male";
//        user.weight=62.65;
//        user.height=175.0;
//        System.out.println(user);

        Scanner scannerStr=new Scanner(System.in);
        Scanner scannerInt=new Scanner(System.in);
        while (true){
            System.out.println("1.Register, 2.Login");
            int stepCode=scannerInt.nextInt();
            switch (stepCode){
                case 1 ->{
                    OOP user =new OOP();
                    System.out.println("enter name");

                }

            }
        }
    }

}