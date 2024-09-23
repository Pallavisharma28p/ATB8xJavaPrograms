package Sept.ex20092024;

import java.util.Scanner;

public class GradeTernaryOperetor {
    public static void main(String[] args) {


    Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your score");
        int score= scanner.nextInt();

        char grade = ((score >=90)? 'A':(score >=80)? 'B': (score >=70)?'C':'F');

        System.out.println("Your grade is :" + grade);



    }
}
