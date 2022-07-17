/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author MY COMPUTER
 */
public class Baitap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month;
        
        System.out.println("Nhap vao ngay sinh: ");
        day = scanner.nextInt();
        System.out.println("Nhap vao thang sinh: ");
        month = scanner.nextInt();
        
        switch(month){
            case 1:
                if(20 <= day && day <= 31){
                    System.out.println("Cung Bảo Bình");                    
                }
                
                else if(1<= day && day <20 ){
                    System.out.println("Cung Ma Kết");
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 2:
                if(1<= day && day <19 ){
                    System.out.println("Cung Bảo Bình");
                }
                else if( 19 <= day && day <= 28){
                    System.out.println("Cung Song Ngư");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 3:
                if(1<= day && day <=20 ){
                    System.out.println("Cung Song Ngư");
                }
                else if( 21 <= day && day <= 31){
                    System.out.println("Cung Bạch Dương");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 4:
                if(1<= day && day <=20 ){
                    System.out.println("Cung Bạch Dương");
                }
                else if( 20 < day && day <= 30){
                    System.out.println("Cung Kim Ngưu");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 5:
                if(1<= day && day <=20 ){
                    System.out.println("Cung Kim Ngưu");
                }
                else if( 20 < day && day <= 31){
                    System.out.println("Cung Song Tử");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 6:
                if(1<= day && day <= 21 ){
                    System.out.println("Cung Song Tử");
                }
                else if( 22 <= day && day <= 30){
                    System.out.println("Cung Cự Giải");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 7:
                if(1<= day && day <=22 ){
                    System.out.println("Cung Cự Giải");
                }
                else if( 23 <= day && day <= 31){
                    System.out.println("Cung Sư Tử");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 8:
                if(1<= day && day <=22 ){
                    System.out.println("Cung Sư Tử");
                }
                else if( 23 <= day && day <= 31){
                    System.out.println("Cung Xử Nữ");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 9:
                if(1<= day && day <= 22 ){
                    System.out.println("Cung Xử Nữ");
                }
                else if( 23 <= day && day <= 30){
                    System.out.println("Cung Thiên Bình");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 10:
                if(1<= day && day <= 23 ){
                    System.out.println("Cung Thiên Bình");
                }
                else if( 24 <= day && day <= 31){
                    System.out.println("Cung Bọ Cạp");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 11:
                if(1<= day && day <= 22 ){
                    System.out.println("Cung Bọ Cạp");
                }
                else if( 23 <= day && day <= 30){
                    System.out.println("Cung Nhân Mã");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            case 12:
                if(1<= day && day <= 21 ){
                    System.out.println("Cung Nhân Mã");
                }
                else if( 22 <= day && day <= 31){
                    System.out.println("Cung Ma kết");                    
                }
                else{
                    System.out.println("Ngày nhập không hợp lệ!");
                }
                break;
            default: System.out.println("Tháng nhập không hợp lệ!"); break;
            
        }
    }
    
}
