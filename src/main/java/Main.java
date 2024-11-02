package recursion;

public class Main {

    public static int sumToOne(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumToOne(n - 1);
    }

    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int productOdd(int n) {
        if (n < 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return productOdd(n - 1);
        }
        return n * productOdd(n - 2);
    }

    public static int digitCount(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + digitCount(n / 10);
    }

    public static int integerDivision(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }
        if (x < y) {
            return 0;
        }
        return 1 + integerDivision(x - y, y);
    }

    public static int modulo(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Modulo by zero is undefined.");
        }
        if (x < y) {
            return x;
        }
        return modulo(x - y, y);
    }

    public static boolean isMultiple(int x, int y) {
        if (y == 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        if (x < y) {
            return false;
        }
        return isMultiple(x - y, y);
    }

    public static boolean isPrime(int n) {
        return isPrimeHelper(n, 2);
    }
    
    private static boolean isPrimeHelper(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrimeHelper(n, divisor + 1);
    }

    public static boolean allEvenOrAllOdd(int n) {
        return allEvenOrAllOddHelper(n, n % 2);
    }
    
    private static boolean allEvenOrAllOddHelper(int n, int parity) {
        if (n == 0) {
            return true;
        }
        if (n % 2 != parity) {
            return false;
        }
        return allEvenOrAllOddHelper(n / 10, parity);
    }

    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + sumArray(arr, index - 1);
    }

    public static int countPositive(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        int count = 0;
        if (arr[index] > 0) {
            count = 1;
        }
        return count + countPositive(arr, index - 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static boolean hasNoPrimes(int[] arr, int index) {
        if (index == arr.length) {
            return true;
        }
        if (isPrime(arr[index])) {
            return false;
        }
        return hasNoPrimes(arr, index + 1);
    }

    public static void main(String[] args) {
        int n = 6;
        int number = 190350;
        int x = 20, y = 4;
        int[] intArray = {1, 3, 5, 6};
        int target = 5;

        System.out.println("Sum from 1 to " + n + ": " + sumToOne(n));
        System.out.println("Factorial of " + n + ": " + factorial(n));
        System.out.println("Product of odd numbers from 1 to " + n + ": " + productOdd(n));
        System.out.println("Digit count in " + number + ": " + digitCount(number));
        System.out.println("Integer division of " + x + " by " + y + ": " + integerDivision(x, y));
        System.out.println("Modulo of " + x + " by " + y + ": " + modulo(x, y));
        System.out.println(x + " is a multiple of " + y + ": " + isMultiple(x, y));
        System.out.println(n + " is prime: " + isPrime(n));
        System.out.println("All digits in " + number + " are even or all are odd: " + allEvenOrAllOdd(number));
        System.out.println("Sum of array elements up to the given index: " + sumArray(intArray, 2));
        System.out.println("Number of positive elements up to the given index: " + countPositive(intArray, 2));
        System.out.println("Index of target element " + target + ": " + findIndex(intArray, target, 0));
        System.out.println("Is the array sorted: " + isSorted(intArray, 0));
        System.out.println("Has no prime numbers in array: " + hasNoPrimes(intArray, 0));
    }
}
