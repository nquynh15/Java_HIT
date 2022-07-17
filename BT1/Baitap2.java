/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author MY COMPUTER
 */
public class Baitap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        
        System.out.println("Nhạp vào ba cạnh của tam giác: ");
        System.out.println("a = ");
        a = scanner.nextFloat();
        System.out.println("b = ");
        b = scanner.nextFloat();
        System.out.println("c = ");
        c = scanner.nextFloat();
        
        if( a-b<c && c < a+b ){
            if( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)){
                if(a == b || a==c || b == c){
                    System.out.println("Tam giác vuông cân");
                }
                else{
                    System.out.println("Tam giác vuông");
                }
            }
            else if(a == b && b == c){
                System.out.println("Tam giác đều");
            }
            else if(a==b || b==c || a==c){
                System.out.println("Tam giác cân");
            }
            else{
                System.out.println("Tam giác thường");
            }
        }
        else{
            System.out.println("Không phải tam giác !");
        }
        
    }
    
}
