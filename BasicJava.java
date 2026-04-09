import java.util.*;

public class BasicJava {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        boolean isLeap = false;
        if(year%4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            }else{
                isLeap = true;
            }
        }else{
            isLeap = false;
        }
                if(isLeap == true){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Non-Leap-Year");
        }
        sc.close();
     }
}
