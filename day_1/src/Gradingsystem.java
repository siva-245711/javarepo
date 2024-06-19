import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade= scanner.nextInt();

        if (grade >= 90) {
            System.out.println("excllent");
            
        }
        else if (grade <50 && grade>45){

         System.out.println("good");
        }
        else{
            System.out.println("poor");
        }





    }
    
}
