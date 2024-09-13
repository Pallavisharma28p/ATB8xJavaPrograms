package Sept.ex13092024;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number for table");
        int num =scanner.nextInt();

        for(int a=1;a<=10;a++)
        {
            System.out.printf("%d * %d = %d ", num, a , num*a);
            System.out.println();
        }
    }
}
