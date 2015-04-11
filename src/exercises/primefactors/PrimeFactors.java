package exercises.primefactors;

import exercises.util.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wbzhao on 15-4-11.
 * =============================
 * Prime Factors Exercise
 * Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
 *
 * For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
 * =============================
 */
public class PrimeFactors {

    private ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        int given = Utils.getInputInt();

        List<Integer> primeFactorsList = primeFactors.generator(given);
        String output = "";

        for (Integer i : primeFactorsList) {
            output += i + ",";
        }
        if (!output.equals(""))
            output = output.substring(0, output.length() - 1);
        System.out.println(output);
    }

    private List<Integer> generator(int given) {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(generator(given, 1));
        return result;
    }

    private List<Integer> generator(int given, int lastPrimeFactor) {
        List<Integer> result = new ArrayList<Integer>();

        if (given > 1) {
            int nextPrimeFactor;
            int lastPrime = lastPrimeFactor;

            nextPrimeFactor = findNextPrimeFactor(given, lastPrime);
            if (nextPrimeFactor <= given) {
                result.add(nextPrimeFactor);
                given = divideOutAPrimeFactor(given, nextPrimeFactor);
                result.addAll(generator(given, nextPrimeFactor));
            }
        }

        return result;
    }

    private int findNextPrimeFactor(int given, int lastPrime) {
        int nextPrime;
        while ((nextPrime = findNextPrimeOf(lastPrime)) < given &&
                given % nextPrime != 0) {
            lastPrime = nextPrime;
        }
        return nextPrime;
    }

    private int findNextPrimeOf(int given) {
        int nextPrime = 2;
        if (given > 1) {
            if (primes.isEmpty()) {
                genNextPrime();
            }
            nextPrime = primes.get(primes.size() - 1);
            while (nextPrime <= given) {
                nextPrime = genNextPrime();
            }
        }
        return nextPrime;
    }

    private int genNextPrime() {
        if (primes.isEmpty()) {
            primes.add(2);
            return 2;
        }
        for (int i = primes.get(primes.size() - 1); ; i++) {
            if (isPrime(i)) return i;
        }
    }

    private int divideOutAPrimeFactor(int given, int primeFactor) {
        do {
            given /= primeFactor;
        } while (given % primeFactor == 0);
        return given;
    }

    private boolean isPrime(int i) {
        for (Integer prime : primes) {
            if (i % prime == 0) {
                return false;
            }
        }
        primes.add(i);
        return true;
    }
}
