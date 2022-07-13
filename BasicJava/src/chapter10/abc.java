package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class abc {
   public static void main(String[] args) {
      // (Alt + Shift + z try) catch 단축키
      Scanner scanner = new Scanner(System.in);
      while (true) {
         try {
            System.out.println("어떤 수로 나누시겠습니까?>>");
            int data1 = scanner.nextInt();      
            System.out.println("어떤 수로 나누시겠습니까?>>");
            int data2 = scanner.nextInt();
            int result = data1 / data2;
            System.out.printf("%d / %d = %d\n", data1, data2, result);
            break;
         } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            scanner= new Scanner(System.in);
         } 
         catch (ArithmeticException e) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
         }
      }
      scanner.close();
   }
}
