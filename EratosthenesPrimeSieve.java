/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

import java.util.Scanner;

/**
 *
 * @author Reisinger
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    public static void main(String[] args) {
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve();
        Scanner sc = new Scanner(System.in);
        int obergrenze = Integer.parseInt(sc.nextLine());
        for (int r = 4; r <= obergrenze; r++) {
            if (r % 2== 0) {
                for (int y = 2; y < r; y++) {
                    int tmp = r - y;
                    if (e.isPrime(tmp) == true) 
                    {
                        System.out.println(r + " Summe : " + r + " = " + y + "+" + tmp);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }

        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        
    }
}
