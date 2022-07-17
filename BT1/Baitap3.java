/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author MY COMPUTER
 */
public class Baitap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào một số n = ");
        n = scanner.nextInt();
        
        int tong = n;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                tong += i;
            }
        }
                
        System.out.println("Tổng ước của n là: " + tong);
    }
    
}
