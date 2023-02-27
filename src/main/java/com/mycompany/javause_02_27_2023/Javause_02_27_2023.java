/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javause_02_27_2023;

/**
 *
 * @author ICX
 */
public class Javause_02_27_2023 {

    public static void main(String[] args) {
        int limit = 100;
	        System.out.println("Prime numbers between 1 and " + limit);
	        for (int i = 2; i <= limit; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
    }
}
