import java.util.Scanner;
public class Main { 
    static void printPattern(int n) 
    { 
        int col, num = 0; 
        for (int row = 1; row <= n; row++) { 
            if (row % 2 != 0) { 
                for (col = num + 1; col < num + row; col++) 
                    System.out.print(col + "*"); 
                System.out.println(col++); 
                num = col; 
            } 
            else { 
                num = num + row - 1; 
                for (col = num; col > num - row + 1; col--) 
                    System.out.print(col + "*"); 
                System.out.println(col); 
            } 
        } 
    } 
public static void main(String args[]) 
    { 
        int n; 
  		Scanner sc = new Scanner(System.in);
  		n=sc.nextInt();
        printPattern(n); 
    } 
} 