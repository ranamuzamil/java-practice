//                  Condiational Statements 

import java.util.Scanner;

public class second {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

                // 1) if-else statement

                // int x = sc.nextInt();
                // if (x % 2 == 0) {
                // System.out.println("The Number you enter is Even");
                // } else {
                // System.out.println("The Number you enter is odd");

                // }

                // 2) Switch

                // int button = sc.nextInt();

                // switch (button) {
                // case 1: System.out.println("you enter 1");
                // break;
                // case 2: System.out.println("you enter 2");
                // break;
                // case 3: System.out.println("you enter 3");
                // break;
                // case 4: System.out.println("you enter 4");
                // break;
                // case 5: System.out.println("you enter 5");
                // break;
                // case 6: System.out.println("you enter 6");
                // break;
                // default: System.out.println("...");
                // break;
                // }

                // sc.close();

                // Loops

                // for(int i = 1 ; i < 11 ; i++){
                // int table2 = i * 2;
                // System.out.println("2 x " + i + " = " + table2);
                // }

                // int n = 5;
                // int m = 5;

                // for(int i = 1; i <= n; i++){
                // for(int j = 1; j <= m; j++){
                // if (i == 1 || j == 1 || i == n || j == m) {
                // System.out.print(" * ");
                // }else{
                // System.out.print(" ");

                // }
                // }
                // System.out.println();
                // }

                // int n = 5;

                // for (int i = 1; i <= n; i++) {
                // for (int j = 1; j <= n - i; j++) {
                // System.out.print(" ");
                // }
                // for (int j = 1; j <= i; j++) {
                // System.out.print(" * ");
                // }
                // System.out.println();
                // }

                // int n = 5;
                // for(int i = 1; i <= n; i++){
                //         for(int j = 1; j <= i; j++){
                //                 System.out.print(j + " ");
                //         }
                //         System.out.println();
                // }
                

                // int n = 5;
                // for(int i = n; i >= 1; i--){
                //         for(int j = 1; j <= i; j++){
                //                 System.out.print(j + " ");
                //         }
                //         System.out.println();
                // }



                // int n = 5;
                // int m = 1;
                // for(int i = 1; i <= n; i++){
                //         for(int j = 1; j <= i; j++){
                //                 System.out.print(m + " ");
                //                 m++;
                //         }
                //         System.out.println();
                // }

                int n = 5;
                for(int i = 1; i <= n; i++){
                        for(int j = 1; j <= i; j++){
                                int sum = i + j;
                               if (sum % 2 == 0) {
                                System.out.print("1 ");                                                                
                               } else {
                                System.out.print("0 ");                                
                               }
                        }
                        System.out.println();
                }



        }
}
