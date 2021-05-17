package Pegasus;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Decimal->");
        int  nchap, k = 0;
        int[] arr = new int[20];
        int i = 0;
        Scanner num= new Scanner(System.in);
        int numb=num.nextInt();
        nchap = numb;
        System.out.print("Hexadecimal->");
        if (numb < 10) { System.out.println(  numb); }

        if (numb == 10) {
            System.out.println( "A");
        }
        else if (numb == 11) {
            System.out.println(  "B");
        }
        else if (numb == 12) {
            System.out.println( "C");
        }
        else if (numb == 13) {
            System.out.println(  "D");
        }
        else if (numb == 14) {
            System.out.println(  "E");
        }
        else if (numb == 15) {
            System.out.println( "F");
        }

        if (numb > 15) {
            for ( i = 0; i <= 9; i++) {

                numb = nchap % 16;
                nchap = nchap / 16;
                arr[k] = numb;
                if (nchap == 0) {
                    break;
                }
                k++;
            }
            for (int n = k; n >= 0; n--) {
                if (arr[n] == 10) {
                    System.out.print( "A");
                }
                else if (arr[n] == 11) {
                    System.out.print(  "B");
                }
                else if (arr[n] == 12) {
                    System.out.print( "C");
                }
                else if (arr[n] == 13) {
                    System.out.print(  "D");
                }
                else if (arr[n] == 14) {
                    System.out.print(  "E");
                }
                else if (arr[n] == 15) {
                    System.out.print( "F");
                }
                else {
                    System.out.print( arr[n]);
                }

            }

        }


















    }
}
