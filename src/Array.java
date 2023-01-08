import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int [][] arr= new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=cin.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        }
    }


