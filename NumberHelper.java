/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Gabriele
 */
public class NumberHelper {

    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        // ritorna true se number numero pari, altrimenti ritorna false
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if(number % 2 != 0){
            return true;
        }
        return false;
    }

    public int sum(int n) {
        // ritorna la somma tra number e n
        return n + number;
    }

    public boolean isPrime() {
        // ritorna true se number è un numero primo, altrimenti ritorna false
        int divisori = 0;
        for(int i = number; i >= 2; i--){
            if(number % i == 0){
                divisori++;
            }
        }
        if(divisori == 1){
            return true;
        }
        return false;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
        if (n == 0 || n > number){
            return false;
        }
        if(number % n == 0){
            return true;
        }
        return false;
    }
}
