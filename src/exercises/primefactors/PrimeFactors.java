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

    private int genNextPrime() {
        if (primes.isEmpty()) {
            primes.add(2);
            return 2;
        }
        for (int i = primes.get(primes.size() - 1); ; i++) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
                return i;
            }
        }
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

    private List<Integer> generator(int given) {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(generator(given, 1));
        return result;
    }

    private List<Integer> generator(int given, int lastPrimeFactor) {
        List<Integer> result = new ArrayList<Integer>();

        if (given > 1) {
            int nextPrime;
            int lastPrime = lastPrimeFactor;

            while ((nextPrime = findNextPrimeOf(lastPrime)) < given &&
                    given % nextPrime != 0) {
                lastPrime = nextPrime;
            }
            if (nextPrime <= given) {
                result.add(nextPrime);
                do {
                    given /= nextPrime;
                } while (given % nextPrime == 0);
                result.addAll(generator(given, nextPrime));
            }
        }

        return result;
    }

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
}
