/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package histogram;
import java.util.Scanner;
/**
 *
 * @author gilmour
 */
public class Histogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        while(n < 101 && n > 0){
            if((n <= 10) && (n >= 1)){
                a++;
            }
            if((n <= 20) && (n >= 11)){
                b++;
            }
            if((n <= 30) && (n >= 21)){
                c++;
            }
            if((n <= 40) && (n >= 31)){
                d++;
            }
            if((n <= 50) && (n >= 41)){
                e++;
            }
            if((n <= 60) && (n >= 51)){
                f++;
            }
            if((n <= 70) && (n >= 61)){
                g++;
            }
            if((n <= 80) && (n >= 71)){
                h++;
            }
            if((n <= 90) && (n >= 81)){
                i++;
            }
            if((n <= 100) && (n >= 91)){
                j++;
            n = number.nextInt();
            }
            System.out.print("1-10");
            for(a; a > 0; a--){
        }
        
        // TODO code application logic here
    }
    
}
