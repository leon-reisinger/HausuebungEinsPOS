/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

/**
 *
 * @author Reisinger
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    public static void main(String[] args) {
        
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
