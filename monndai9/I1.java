package monndai9;
import java.util.Scanner;
//aaaa
public class I1 {
    
        public static void displaySchoolAndName(String school, String name) {
            System.out.println("学校名: " + school);
            System.out.println("名前: " + name);
        }
    
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
    

            System.out.print("学校名を入力してください: ");
            String schoolName = scanner.nextLine();
    
            
            System.out.print("名前を入力してください: ");
            String yourName = scanner.nextLine();
    
            
            displaySchoolAndName(schoolName, yourName);
            
            scanner.close();
        }
    }
    
    
    
    

