package math;

public class PrimeNumber {

    int primeNumber;

    public PrimeNumber() {
    }

    public PrimeNumber(int primeNumber) {
        this.primeNumber = primeNumber;
    }

    public boolean getPrimeNumber() {
        int count = 0;
        for (int i = 1; i <= primeNumber; i++) {
            if (primeNumber % i != 0) {
            } else {
                count++;
            }
        }
        return count == 2;

    }

}
