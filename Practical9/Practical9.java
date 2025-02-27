class Practical9 {

    // Generates an array of random numbers
    public static int[] randomNumbers(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] =(int)(System.nanoTime()%30)+ 1; // Generate numbers between 1 and 31
        }
        return arr;
    }

    // Factorial using iteration time calculation
    public static long FactIterationTimeCount(int number) {
        long startTime = System.nanoTime();
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Factorial using recursion time calculation
    public static long factRecursive(long num) { // Changed int to long
        if (num < 2) {
            return 1;
        }
        return num * factRecursive(num - 1);
    }

    // Factorial using recursion function call 
    public static long FactRecursiveTimeCount(int number) {
        long startTime = System.nanoTime();
        factRecursive(number); // Removed unused variable `result`
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Function to compare execution time
    public static void TimeCount(int[] arr) {
        long totalIterationTime = 0;
        long totalRecursiveTime = 0;

        for (int number : arr) {
            for (int i = 0; i < 5; i++) { // Run multiple times for better accuracy
                totalIterationTime += FactIterationTimeCount(number);
                totalRecursiveTime += FactRecursiveTimeCount(number);
            }
        }

        long iterationAverage = totalIterationTime / 5;
        long recursiveAverage = totalRecursiveTime / 5;

        if (iterationAverage <= recursiveAverage) {
            System.out.println("Factorial using Iterative method is Faster.");
        } else {
            System.out.println("Factorial using Recursive method is Faster.");
        }
    }

    // Creates a random string of given size
    public static String createRandomString(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            int randomValue = (char)(System.nanoTime()%52)+1;
            if (randomValue < 26) {
                sb.append((char) (randomValue + 65)); // A-Z
            } else {
                sb.append((char) (randomValue - 26 + 97)); // a-z
            }
        }
        return sb.toString();
    }

    // Compares string concatenation methods
    public static void stringConcatenationTime(int size) {
        String s = createRandomString(size);
		

        // Using String
        long startTime = System.nanoTime();
        String str1 = s + s;
        long endTime = System.nanoTime();
        long stringTime = endTime - startTime;

        // Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer(s);
        sbf.append(s);
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;

        // Determine the fastest method
        if (stringTime < stringBuilderTime && stringTime < stringBufferTime) {
            System.out.println("String concatenation using String is the fastest.");
        } else if (stringBuilderTime < stringTime && stringBuilderTime < stringBufferTime) {
            System.out.println("String concatenation using StringBuilder is the fastest.");
        } else {
            System.out.println("String concatenation using StringBuffer is the fastest.");
        }
    }

    public static void main(String args[]) {
    int size=Integer.parseInt(args[0]);
        int arr[] = randomNumbers(size);
        TimeCount(arr);
        stringConcatenationTime(size); // Increased size for better comparison
    }
}
