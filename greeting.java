import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class greeting{
    private static void greetStudents(List<String>students){
        for(String student:students){
            System.out.println("Hello"+student);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of students:");
        int num=scanner.nextInt();
        scanner.nextLine();
        List<String>students=new ArrayList<>();
        System.out.println("enter the name of student:");

        for(int i=0;i<num;i++){
            System.out.println("Student: "+(i+1));
            String name=scanner.nextLine();
            students.add(name);
        }
        greetStudents(students);

    }
} 