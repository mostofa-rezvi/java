//  Check Prime Number
package math;

public class PrimeNumber {

    public String calculatePrime(int number) {

        int primeNumber = 0;
        int count = 0;

        for (int i = 1; i <= primeNumber; i++) {
            if (primeNumber % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "This is Prime Number";
        } else {
            return "This is not Prime Number";
        }

    }

}
