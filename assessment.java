/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author QUINONES_CPE113
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ans = OddEven(16);
        System.out.println(ans);

        int result = classifyTriangle(3, 3, 3);
        System.out.println(result);
    }

    static int OddEven(int oddeven) {
        int status;
        if (oddeven % 2 == 0) {
            status = 1;
        } else {
            status = 0;
        }
        return status;
    }
    
    public static int classifyTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }

        if (a == b && b == c) {
            return 1;
        } else if (a == b || b == c || a == c) {
            return 2;
        } else {
            return 3;
        }
    }

}
