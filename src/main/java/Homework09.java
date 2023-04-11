/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {
    
    public static void main(String[] args) {
        int triangleNumber = 0;
        int divisorsCounter = 0;
        int counter = 1;
    
        while (divisorsCounter < 100) {
            triangleNumber += counter;
            divisorsCounter = 0;
            for (int i = 1; i <= triangleNumber / 2; i++) {
                if (triangleNumber % i == 0) {
                    divisorsCounter++;
                }
            }
            counter++;
        }
    
        System.out.println("First triangle number over a hundred divisors: " + triangleNumber);
    }
}
////