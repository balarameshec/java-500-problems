import java.util.Scanner;

public class Foundation {
    public void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation: ");
        System.out.println("1. Hello");
        System.out.println("2. Print name");
        System.out.println("3. Arithemetic operation");
        System.out.println("4. Swap numbers");
        System.out.println("5. Check Even or Odd");
        System.out.println("6. Check Positive or Negative");
        System.out.println("7. Largest of Two Numbers");
        System.out.println("8. Largest of Three Numbers");
        System.out.println("9. Smallest of Three Numbers");
        System.out.println("10. Perimeter and Area");
        System.out.println("11. Interest Calculator");
        System.out.println("12. Percentage Calculator");
        System.out.println("13. Exponential");
        System.out.println("14. Percentage and BMI");
        System.out.println("15. Print 1 to N");
        System.out.println("16. Print N to 1");
        System.out.println("17. Even or Odd Loop");
        System.out.println("18. Multiples of a number");
        System.out.println("19. Sum of N numbers");
        System.out.println("20. Sum of even and odd numbers");
        System.out.println("21. Sum of squares and cubes");
        System.out.println("22. Table Range");
        System.out.println("23. Factorial");
        System.out.println("24. Double Factorial");
        System.out.println("25. Factorial Series");
        System.out.println("26. Fibonacci Series");
        System.out.println("27. Fibonacci Series Nth term");
        System.out.println("28. Fibonacci Sum");
        System.out.println("29. Fibonacci Recursive");
        System.out.println("30. Fibonacci Iterative");
        System.out.println("31. Prime Number");
        System.out.println("32. Prime Number Range");
        System.out.println("33. Prime Factors");
        System.out.println("34. LCM and GCD");
        System.out.println("35. Reverse a number");
        System.out.println("36. Count number of digits");
        System.out.println("37. Sum of Digits");
        System.out.println("38. Product of Digits");
        System.out.println("39. Palindrome Number");
        System.out.println("40. Armstrong Number");
        System.out.println("41. Perfect Number");
        System.out.println("42. Strong Number");
        System.out.println("43. Harshad Number");
        System.out.println("44. Neon Number");
        System.out.println("45. Automorphic Number");
        System.out.println("46. Duck Number");
        System.out.println("47. Spy Number");
        System.out.println("48. Sunny Number");
        System.out.println("49. Disarium Number");
        System.out.println("50. Krishanurthy Number");
        System.out.println("51. Tech Number");
        System.out.println("52. Buzz Number");
        System.out.println("53. Evil Number");
        System.out.println("54. Happy Number");
        System.out.println("55. Twin Prime Number");
        System.out.println("56. Emirp Number");
        System.out.println("57. Circular Number");
        System.out.println("58. Smith Number");
        System.out.println("59. Star triangle");
        System.out.println("60. Inverted star triangle");
        System.out.println("61. Isosceles star triangle");
        System.out.println("62. Inverted isosceles star triangle");
        System.out.println("63. Diamond Pattern");
        System.out.println("64. Hollow diamond Pattern");
        System.out.println("65. Butterfly Pattern");
        System.out.println("66. X Pattern");
        System.out.println("67. Square Pattern");
        System.out.println("68. Hollow square Pattern");
        System.out.println("69. Rectangle Pattern");
        System.out.println("70. Hollow Rectangle Pattern");
        System.out.println("71. Number Triangle ");
        System.out.println("72. Number pyramid ");
        System.out.println("73. Floyd Triangle ");
        System.out.println("74. Floyd Iso Triangle ");
        System.out.println("75. Pascal Triangle ");
        System.out.println("76. Alphabet Triangle ");
        System.out.println("77. Alphabet Pyramid ");
        System.out.println("78. Hourglass Pattern ");
        System.out.println("79. Zigzag Pattern ");
        System.out.println("80. Zigzag Pattern Vertical");
        System.out.println("81. Hollow Pyramid");
        System.out.println("82. Inverted Hollow Pyramid");
        System.out.println("83. Binary Triangle");
        System.out.println("84. Zero to One Triangle");
        System.out.println("85. Mirror Triangle");
        System.out.println("86. Hour glass Pattern");
        System.out.println("87. Heart Pattern");
        System.out.println("88. Array input and output");
        System.out.println("89. Sum of an array");
        System.out.println("90. Average of an array");
        System.out.println("91. Largest of an array");
        System.out.println("92. Smallest of an array");
        System.out.println("93. Second largest of an array");
        System.out.println("94. Second smallest of an array");
        System.out.println("95. Reverse of an array");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            printHello();
        } else if (choice == 2) {
            printName();
        } else if (choice == 3) {
            printArithmeticOp();
        } else if (choice == 4) {
            printSwap();
        } else if (choice == 5) {
            EvenOrOdd();
        } else if (choice == 6) {
            PositiveOrNegative();
        } else if (choice == 7) {
            LargestOfTwo();
        } else if (choice == 8) {
            LargestOfThree();
        } else if (choice == 9) {
            SmallestOfThree();
        } else if (choice == 10) {
            PerimeterAndArea();
        } else if (choice == 11) {
            InterestCalculator();
        } else if (choice == 12) {
            TemperatureConverter();
        } else if (choice == 13) {
            Exponential();
        } else if (choice == 14) {
            PercentageAndBMI();
        } else if (choice == 15) {
            print1ToN();
        } else if (choice == 16) {
            printNto1();
        } else if (choice == 17) {
            EvenOrOddLoop();
        } else if (choice == 18) {
            MultiplesOfNumber();
        } else if (choice == 19) {
            SumOfNNumbers();
        } else if (choice == 20) {
            SumOfEvenOrOddLoop();
        } else if (choice == 21) {
            SumOfSquaresAndCubes();
        } else if (choice == 22) {
            TableRange();
        } else if (choice == 23) {
            Factorial();
        } else if (choice == 24) {
            DoubleFactorial();
        } else if (choice == 25) {
            FactorialSeries();
        } else if (choice == 26) {
            FibonacciSeries();
        } else if (choice == 27) {
            FibonacciSeriesNthTerm();
        } else if (choice == 28) {
            FibonacciSum();
        } else if (choice == 29) {
            FibonacciRecursive();
        } else if (choice == 30) {
            FibonacciIterative();
        } else if (choice == 31) {
            PrimeNumber();
        } else if (choice == 32) {
            PrimeNumberRange();
        } else if (choice == 33) {
            PrimeFactors();
        } else if (choice == 34) {
            GCDAndLCM();
        } else if (choice == 35) {
            ReverseNumber();
        } else if (choice == 36) {
            CountNumbers();
        } else if (choice == 37) {
            SumDigits();
        } else if (choice == 38) {
            ProductDigits();
        } else if (choice == 39) {
            PalindromeNumber();
        } else if (choice == 40) {
            ArmstrongNumber();
        } else if (choice == 41) {
            PerfectNumber();
        } else if (choice == 42) {
            StrongNumber();
        } else if (choice == 43) {
            HarshadNumber();
        } else if (choice == 44) {
            NeonNumber();
        } else if (choice == 45) {
            AutomorphicNumber();
        } else if (choice == 46) {
            DuckNumber();
        } else if (choice == 47) {
            SpyNumber();
        } else if (choice == 48) {
            SunnyNumber();
        } else if (choice == 49) {
            DisariumNumber();
        } else if (choice == 50) {
            KrishnamurthyNumber();
        } else if (choice == 51) {
            TechNumber();
        } else if (choice == 52) {
            BuzzNumber();
        } else if (choice == 53) {
            EvilNumber();
        } else if (choice == 54) {
            HappyNumber();
        } else if (choice == 55) {
            TwinPrime();
        } else if (choice == 56) {
            EmirpNumber();
        } else if (choice == 57) {
            CircularPrime();
        } else if (choice == 58) {
            SmithNumber();
        } else if (choice == 59) {
            StarTriangle();
        } else if (choice == 60) {
            InvertedTriangle();
        } else if (choice == 61) {
            IsoscelesStarTriangle();
        } else if (choice == 62) {
            InvertedIsoTriangle();
        } else if (choice == 63) {
            DiamondPattern();
        } else if (choice == 64) {
            HollowDiamondPattern();
        } else if (choice == 65) {
            ButterflyPattern();
        } else if (choice == 66) {
            XPattern();
        } else if (choice == 67) {
            Square();
        } else if (choice == 68) {
            HollowSquare();
        } else if (choice == 69) {
            Rectangle();
        } else if (choice == 70) {
            HollowRectangel();
        } else if (choice == 71) {
            NumberTriangle();
        } else if (choice == 72) {
            NumberPyramid();
        } else if (choice == 73) {
            FloydTriangle();
        } else if (choice == 74) {
            FloydIsoTriangle();
        } else if (choice == 75) {
            PascalTriangle();
        } else if (choice == 76) {
            AlphabetTriangle();
        } else if (choice == 77) {
            AlphabetPyramid();
        } else if (choice == 78) {
            HourglassPattern();
        } else if (choice == 79) {
            ZigzagPattern();
        } else if (choice == 80) {
            ZigzagPattern2();
        } else if (choice == 81) {
            HollowPyramid();
        } else if (choice == 82) {
            InvertedHollowTriangle();
        } else if (choice == 83) {
            BinaryTriangle();
        } else if (choice == 84) {
            ZeroToOneTriangle();
        } else if (choice == 85) {
            MirrorTriangle();
        } else if (choice == 86) {
            HourGlassPattern();
        } else if (choice == 87) {
            HeartPattern();
        } else if (choice == 88) {
            ArrayIO();
        } else if (choice == 89) {
            ArraySum();
        } else if (choice == 90) {
            AverageArray();
        } else if (choice == 91) {
            LargestElement();
        } else if (choice == 92) {
            SmallestElement();
        } else if (choice == 93) {
            SecondLargest();
        } else if (choice == 94) {
            SecondSmallest();
        } else if (choice == 95) {
            ReverseArray();
        }
    }

    static void printHello() {
        System.out.println("Hello World");
    }

    static void printName() {
        String name = "Bala Kumar";
        System.out.println(name);
    }

    static void printArithmeticOp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter symbol of an arithmetic operation: ");
        String c = sc.next();
        if (c.equals("+")) {
            double sum = a + b;
            System.out.println("Sum = " + sum);
        } else if (c.equals("-")) {
            double difference = a - b;
            System.out.println("Difference :" + difference);
        } else if (c.equals("*")) {
            double product = a * b;
            System.out.println("Product : " + product);
        } else if (c.equals("/")) {
            if (a == 0) {
                System.out.println("Cannot divided by zero");
            } else {
                double division = a / b;
                System.out.println("Division = " + division);
            }
        } else if (c.equals("%")) {
            double remainder = a % b;
            System.out.println("Remainder: " + remainder);
        }

    }

    static void printSwap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println(("Enter second number:"));
        int b = sc.nextInt();
        System.out.println("Before swap: a= " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
        sc.close();
    }

    static void EvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
    }

    static void PositiveOrNegative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("It's Positive number");
        } else {
            System.out.println("It's Negative number");
        }
    }

    static void LargestOfTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(" a is greater");
        } else {
            System.out.println(" b is greater");
        }
    }

    static void LargestOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        System.out.println("Enter a number: ");
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("a is largest");
        } else if ((b > a) && (c > a)) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }

    }

    static void SmallestOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        System.out.println("Enter a number: ");
        int c = sc.nextInt();
        if ((a < b) && (a < c)) {
            System.out.println(" a is smaller");
        } else if ((b < a) && (b < c)) {
            System.out.println(" b is smaller");
        } else {
            System.out.println(" c is smaller");
        }
    }

    static void PerimeterAndArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("Enter a number: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter a side: ");
            int a = sc.nextInt();
            int b = 4 * a;
            System.out.println("Perimeter: " + b);
            int d = a * a;
            System.out.println("Area: " + d);
        } else if (choice == 2) {
            System.out.println("Enter length: ");
            int a = sc.nextInt();
            System.out.println("Enter breath: ");
            int b = sc.nextInt();
            int c = 2 * (a + b);
            System.out.println("Perimeter: " + c);
            int d = a * b;
            System.out.println("Area: " + d);
        } else if (choice == 3) {
            System.out.println("Enter a radius: ");
            int a = sc.nextInt();
            double b = 2 * 3.14 * a;
            System.out.println("Perimeter: " + b);
            double d = a * a * 3.14;
            System.out.println("Area: " + d);

        }
    }

    static void InterestCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Simple Interest ");
        System.out.println("2. Compound Interest ");
        System.out.println("Enter a number: ");
        int choice = sc.nextInt();
        System.out.println("Enter principle amount: ");
        int a = sc.nextInt();
        System.out.println("Enter number of years: ");
        int b = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        int c = sc.nextInt();

        if (choice == 1) {
            double d = (double) (a * b * c) / 100;
            System.out.println("Simple Interest: " + d);
        } else if (choice == 2) {
            double d = a * Math.pow((1 + c / 100.0), b);
            System.out.println("Compound Interest: " + d);
        }

    }

    static void TemperatureConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius ");
        System.out.println("Enter a number: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Celsius: ");
            int a = sc.nextInt();
            double b = (double) ((a * (9 / 5)) + 32);
            System.out.println("Fahrenheit: " + b);
        } else if (choice == 2) {
            System.out.println("Enter Fahrenheit: ");
            int a = sc.nextInt();
            double b = (double) ((a - 32) * (5 / 9));
            System.out.println("Celsius: ");
        }
    }

    static void Exponential() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a power number: ");
        int e = sc.nextInt();
        double b = (double) (a * a);
        double c = (double) (a * a * a);
        double d = (double) (Math.sqrt(a));
        System.out.println("Square of " + a + " is " + b);
        System.out.println("Cube of " + a + " is " + c);
        System.out.println("Square root of " + a + " is " + d);
        System.out.println(a + " power " + e + " is " + Math.pow(a, e));
    }

    static void PercentageAndBMI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Percentage Calculator");
        System.out.println("2. BMI Calculator");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter a part for percentage calculation: ");
            int a = sc.nextInt();
            System.out.println("Enter total amount for percentage calculation: ");
            int b = sc.nextInt();
            double c = ((a * 100) / b);
            System.out.println("Percentage :" + c);
        } else if (choice == 2) {
            System.out.println("Enter height in meter: ");
            double a = sc.nextDouble();
            System.out.println("Enter weight: ");
            double b = sc.nextDouble();
            double bmi = (double) (b / Math.pow(a, 2));
            System.out.println("BMI: " + bmi);
        }
    }

    static void print1ToN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for N: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            // System.out.print(i);
            System.out.println(i);
        }
    }

    static void printNto1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    static void EvenOrOddLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Even numbers: ");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers: ");
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    static void MultiplesOfNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + n * j);
/*        for (int i =1;i<=n;i++){
            System.out.println("Table of "+i);
            for (int j =1 ; j <= 10;j++ ){
                System.out.println(i+" x "+j+" = "+i*j);
            }*/
        }
    }

    static void SumOfNNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum = sum + j;
        }
        System.out.println("Sum: " + sum);
    }

    static void SumOfEvenOrOddLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        System.out.println("Even numbers: ");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("Sum of even: " + sum);
        sum = 0;
        System.out.println("Odd numbers: ");
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        System.out.println("Sum of odd: " + sum);
    }

    static void SumOfSquaresAndCubes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + (i * i);
        }
        System.out.println("Sum of square: " + sum);
        sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + (Math.pow(i, 3));
        }
        System.out.println("Sum of cube: " + sum);
    }

    static void TableRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
/*    for (int j =1 ; j <= 10;j++ ){
        System.out.println(n+" x "+j+" = "+n*j);*/
        for (int i = 1; i <= n; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }

    static void Factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        System.out.println("Factorial of " + n + " is " + result);
    }

    static void DoubleFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = n; i > 0; i = i - 2) {
            result = result * i;
        }
        System.out.println("Double Factorial of " + n + " is " + result);
/*        if (n%2==0){
        int result = 1;
        for (int i = n; i>0;i=i-2){
            result = result*i;
        }
        System.out.println("Double Factorial of "+n+" is "+result);
    }
    else if (n%2!=0){
        int result = 1;
        for (int i = n;i>0;i = i-2){
            result = result * i;
        }
            System.out.println("Double Factorial of "+n+" is "+result);
    }*/
    }

    static void FactorialSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial series: ");
        int a = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = 1;
            for (int j = i; j > 0; j--) {
                result = result * j;
            }
            System.out.println("Factorial series of " + i + " is " + result);
        }

    }

    static void FibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Fibonacci series: ");
        int a = sc.nextInt();
        int previous = 0;
        int current = 1;
        int next;
        System.out.print(previous);
        for (int i = 0; i <= a; i++) {
            System.out.print("," + current);
            next = previous + current;
            previous = current;
            current = next;
        }
    }

    static void FibonacciSeriesNthTerm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Fibonacci series: ");
        int a = sc.nextInt();
        int previous = 0;
        int current = 1;
        int next;
        System.out.print(previous);
        for (int i = 0; i <= a; i++) {
            /*System.out.print(","+current);*/
            next = previous + current;
            previous = current;
            current = next;
            if (i == a) {
                System.out.println("Number in " + a + "th position is " + current);
            }
        }
    }

    static void FibonacciSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int previous = 0;
        int current = 1;
        int next;
        int sum = 0;
        /*System.out.print(previous);*/
        for (int i = 0; i < a; i++) {

            next = previous + current;
            sum = sum + previous;
            previous = current;
            current = next;

        }
        /*sum = sum + next;*/
        System.out.print("Fibonacci Sum of " + a + " is " + sum);

    }

    static void FibonacciRecursive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int result = FibonacciRecursive(a);
        System.out.println("Number in " + a + "th position is " + result);
    }

    static int FibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
    }

    static void FibonacciIterative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Fibonacci iterative: ");
        int a = sc.nextInt();
        int previous = 0;
        int current = 1;
        int next;

        for (int i = 0; i < a; i++) {
            next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println("Number in " + a + "th position is " + previous);

    }

    static void PrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        Boolean FoundDivisor = false;
        /*if ((a>1)&&(a%2!=0))*/
        for (int i = 2; i <= (a - 1); i++) {
            if (a % i == 0) {
                FoundDivisor = true;
            }
        }
        if (FoundDivisor == true) {
            System.out.println("It's not a prime");
        } else {
            System.out.println("It's a prime");
        }

    }

    static void PrimeNumberRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i;
        Boolean FoundDivisor = false;
        Boolean FoundPrime = false;
        for (i = 2; i <= a; i++) {
            FoundDivisor = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    FoundDivisor = true;
                }
            }
            if (FoundDivisor == false) {
                if (FoundPrime == true) {
                    System.out.print(",");
                }

                System.out.print(i);
                FoundPrime = true;
            }
        }
    }

    static void PrimeFactors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factors of " + n + " are: ");
        RecursivePrimeFactor(n, 2);

    }

    static void RecursivePrimeFactor(int n, int i) {
        if (n == i) {
            System.out.print(i);
            return;
        }
        if (n == 1) {
            System.out.print(i);
            return;
        }
        if (n % i == 0) {
            System.out.print(i + ",");
            n = n / i;
            RecursivePrimeFactor(n, i);
        } else {

            i = i + 1;
            RecursivePrimeFactor(n, i);
        }
    }

    static void GCDAndLCM() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        int i = 1;
        while (true) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM: " + i);
                break;
            }
            i++;
        }
        int gcd = 1;
        for (i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }

    static void ReverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i;
        while (a > 0) {
            i = a % 10;
            System.out.print(i);
            a = a / 10;
        }

    }

    static void CountNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i, j = 0;
        while (a > 0) {
            i = a / 10;
            j = j + 1;
            a = a / 10;
        }
        System.out.println("Number of digits: " + j);
    }

    static void SumDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i, sum = 0;
        while (a > 0) {
            i = a % 10;
            sum = sum + i;
            a = a / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    static void ProductDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i, product = 1;
        while (a > 0) {
            i = a % 10;
            product = product * i;
            a = a / 10;
        }
        System.out.println("Product of digits: " + product);
    }

    static void PalindromeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i, b = a, reverse = 0;
        while (a > 0) {
            i = a % 10;
            reverse = reverse * 10 + i;
            a = a / 10;
        }
        if (reverse == b) {
            System.out.println("It's a Palindrome Number");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    static void ArmstrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int i, b = a, c = a, j = 0;
        double cube, sum = 0;
        while (a > 0) {
            i = a / 10;
            j = j + 1;
            a = a / 10;
        }
        while (c > 0) {
            i = c % 10;
            cube = (double) Math.pow(i, j);
            sum = sum + cube;
            c = c / 10;
        }
        if (sum == b) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }

    }

    static void PerfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (a == sum) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a Perfect number");
        }
    }

    static void StrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt(), b = a, c = a, result, i, sum = 0, j;
        while (a > 0) {
            result = 1;
            i = a % 10;
            for (j = i; j > 0; j--) {
                result = result * j;
            }
            sum = sum + result;
            a = a / 10;
        }
        if (sum == b) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a strong number");
        }

    }

    static void HarshadNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(), i, sum = 0, b = a;
        while (a > 0) {
            i = a % 10;
            sum = sum + i;
            a = a / 10;
        }
        if (b % sum == 0) {
            System.out.println("It's a Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

    static void NeonNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), b = a, d;
        double c, i, sum = 0;
        c = Math.pow(a, 2);
        d = (int) c;
        while (d > 0) {
            i = d % 10;
            sum = sum + i;
            d = d / 10;
        }
        if (b == sum) {
            System.out.println("It's a neon number");
        } else {
            System.out.println("It's not a neon number");
        }
    }

    static void AutomorphicNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), d, i = 0, count = 0, b = a, power = 1, k = 0;
        double c;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        c = Math.pow(b, 2);
        d = (int) c;
        while (k < count) {
            power = power * 10;
            k++;
            i = d % power;

        }
        if (b == i) {
            System.out.println("It's an automorphic number");
        } else {
            System.out.println("It's not an automorphic number");
        }
    }

    static void DuckNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        boolean found = false;
        while (a > 0) {
            int i = a % 10;
            if (i == 0) {
                found = true;
            }
            a = a / 10;
        }
        if (found) {
            System.out.println("It's a duck number");
        } else {
            System.out.println("It's not a duck number");
        }
    }

    static void SpyNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), b = a, i, sum = 0, product = 1;
        while (a > 0) {
            i = a % 10;
            sum = sum + i;
            a = a / 10;
        }
        while (b > 0) {
            i = b % 10;
            product = product * i;
            b = b / 10;
        }
        if (sum == product) {
            System.out.println("It's a spy number");
        } else {
            System.out.println("It's not a spy number");
        }
    }

    static void SunnyNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), b = a + 1;
        double root = Math.sqrt(b);
        if (root == (int) root) {
            System.out.println("It's a sunny number");
        } else {
            System.out.println("It's not a sunny number");
        }

    }

    static void DisariumNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), b = a, i, j = 0, sum = 0, c = a;
        ;

        while (a > 0) {
            i = a / 10;
            j = j + 1;
            a = a / 10;
        }
        while (c > 0) {
            i = c % 10;
            sum = sum + (int) Math.pow(i, j);
            j = j - 1;
            c = c / 10;
        }
        if (sum == b) {
            System.out.println("It's a Disarium Number");
        } else {
            System.out.println("It's not a Disarium Number");
        }
    }

    static void KrishnamurthyNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt(), b = a, i, sum = 0, result;
        while (a > 0) {
            i = a % 10;
            result = 1;
            for (int j = i; j > 0; j--) {
                result = result * j;
            }
            sum = sum + result;
            a = a / 10;
        }
        if (b == sum) {
            System.out.println("It's a krishnamurthy number");
        } else {
            System.out.println("It's not a krishnamurthy number");
        }
    }

    static void TechNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int c = a, b = a;
        int count = 0;
        double half, power, i, j = 0, sum = 0;
        while (a > 0) {
            count++;
            a = a / 10;
        }
        while (b > 0) {
            half = count / 2;
            power = Math.pow(10, half);
            i = b % power;
            sum = sum + i;
            b = b / (int) power;
        }
        j = Math.pow(sum, 2);
        if (j == c && count % 2 == 0) {
            System.out.println("It's a Tech Number");
        } else {
            System.out.println("It's not a Tech number");
        }
    }

    static void BuzzNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, b = a;
        i = a % 10;
        if (i == 7 || a % 7 == 0) {
            System.out.println("It's a buzz number");
        } else {
            System.out.println("It's not a buzz number");
        }
    }

    static void EvilNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i = 0, b = a;
        int j = a, count = 0;
        int found = 0, h, l = 0;
        for (i = j; i >= 1; i = i / 2) {
            if (i % 2 == 0) {
                found = found * 10 + 0;
            } else if (i % 2 != 0) {
                found = found * 10 + 1;
                count++;
            } else {
                j = i;
            }
        }
        while (found > 0) {
            h = found % 10;
            l = l * 10 + h;
            found = found / 10;
        }
        System.out.println("Binary form of " + b + " is " + l);
        if (count % 2 == 0) {
            System.out.println("It's an evil number");
        } else {
            System.out.println("It's not an evil number");
        }
    }

    static void HappyNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, sum = 0, j, b, num;
        double power;
        while (a > 0) {
            i = a % 10;
            power = Math.pow(i, 2);
            sum = sum + (int) power;
            a = a / 10;
        }
        b = sum;
        while (sum != 1 && sum != 4) {
            num = 0;
            for (b = sum; b > 0; b = b / 10) {
                i = b % 10;
                power = Math.pow(i, 2);
                num = num + (int) power;
            }
            sum = num;
        }

        if (sum == 1) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
    }

    static void TwinPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt(), i, k = 1;
        boolean foundDivisorI = false, foundPrime = false, foundDivisorK = false;
        for (i = 2; i <= a; i++) {
            foundDivisorI = false;
            foundDivisorK = false;
            k = i + 2;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    foundDivisorI = true;
                }
            }
            for (int j = 2; j <= Math.sqrt(k); j++) {
                if (k % j == 0) {
                    foundDivisorK = true;
                }
            }
            if (foundDivisorI == false && foundDivisorK == false) {
                System.out.println(i + "," + k);
                foundPrime = true;
            }
        }
    }

    static void EmirpNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt(), i;
        boolean foundDivisor = false, foundPrime = false;
        for (i = 2; i <= a; i++) {
            foundDivisor = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    foundDivisor = true;
                    break;
                }
            }
            if (foundDivisor == false) {
                int original = i, reverse = 0;
                while (original > 0) {
                    reverse = reverse * 10 + original % 10;
                    original = original / 10;
                }
                if (reverse != i) {
                    boolean reverseDivisor = false;

                    for (int j = 2; j <= Math.sqrt(reverse); j++) {
                        if (reverse % j == 0) {
                            reverseDivisor = true;
                            break;
                        }
                    }
                    if (!reverseDivisor)
                        System.out.print(i + ",");
                    foundPrime = true;
                }
            }
        }
    }

    static void CircularPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, b = a, d = 0, j, shuffel = 0, count = 0, rotation = 0, k = 0, h, z = b;
        ;
        double c, power = 1;
        boolean foundDivisor = false;
        while (b > 0) {
            d = b % 10;
            count++;
            b = b / 10;
        }
        while (rotation < (count - 1)) {
            d = z % 10;
            z = z / 10;
            h = count - 1;
            power = Math.pow(10, h);
            shuffel = (int) (power * d + z);
            for (i = 2; i <= (shuffel - 1); i++) {
                if (shuffel % i == 0) {
                    foundDivisor = true;
                    break;
                }
            }
            if (foundDivisor == false) {
                z = shuffel;
                rotation++;
            } else {
                System.out.print("It's not a circular prime");
                break;
            }
        }
        if (rotation == count - 1 && foundDivisor == false) {
            System.out.print("It's a circular prime");
        }
    }

    static void SmithNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), b = a, c = a, d, i, j, sum = 0, factorSum = 0;
        while (b > 0) {
            i = b % 10;
            sum = sum + i;
            b = b / 10;
        }
        System.out.println("Sum of digits: " + sum);
        factorSum = factors(c, 2, 0);
        System.out.println("Sum of factors: " + factorSum);
        if (sum == factorSum) {
            System.out.println("Smith number");
        } else {
            System.out.println("Not a smith number");
        }
    }

    static int factors(int c, int j, int factorSum) {
        if (c == j) {
            return factorSum + j;
        }
        if (c == 1) {
            return factorSum + j;
        }
        if (c % j == 0) {
            if (isPrime(j)) {
                factorSum = factorSum + j;
                c = c / j;
                return factors(c, j, factorSum);
            } else {
                j = j + 1;
                return factors(c, j, factorSum);
            }
        } else {
            j = j + 1;
            return factors(c, j, factorSum);
        }

    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void StarTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void InvertedTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void IsoscelesStarTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = 1; i <= a; i++) {
            for (j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void InvertedIsoTriangle() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
                Thread.sleep(1000);
            }
            System.out.println();
        }
    }

    static void DiamondPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = 1; i <= a; i++) {
            for (j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = a - 1; i >= 1; i--) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void HollowDiamondPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = 1; i <= a; i++) {
            for (j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }
            Hollow(i);
            System.out.println();
        }

        for (i = a - 1; i >= 1; i--) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            Hollow(i);
            System.out.println();
        }
    }

    static void Hollow(int i) {
        for (int j = 1; j <= 2 * i - 1; j++) {
            if ((j == 1) || (j == 2 * i - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void ButterflyPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(), i, j;
        for (i = 1; i <= a; i++) {
            Butterfly(i,a);
        }
        for (i = a - 1; i >= 1; i--) {
            Butterfly(i,a);
        }
    }
    static void Butterfly(int i, int a){
        int j;
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (j = 2 * (a - i); j >= 1; j--) {
            System.out.print(" ");
        }
        for (j = i; j >= 1; j--) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void XPattern(){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i = 1; i<=a;i++){
            xLogic(i,a);
        }
        for (i=a-1;i>=1;i--){
            xLogic(i,a);
        }
    }
    static void xLogic(int i,int a){
        int j;
        for (j = 1; j <= i; j++) {
            if (j == i) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        for (j = 2 * (a - i); j >= 1; j--) {
            System.out.print(" ");
        }
        for (j = i; j >= 1; j--) {
            if (j == i) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= sc.nextInt(),i,j;
        for (i = 1; i<=a;i++){
            for (j = 1; j<=a;j++){
                if ((j==i)||j==a-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void Square(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i = 1;i<=a;i++){
            for (j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    static void HollowSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i = 1;i<=a;i++){
            for (j=i;j<=a;j++){
                if((i==a)||(j==a)||(i==1)||(j==1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println();
    }

    static void Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int a = sc.nextInt(),i,j;
        System.out.println("Enter the breath: ");
        int b=  sc.nextInt();
        for (i = 1;i<=a;i++){
            for (j = 1; j<=b;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    static void HollowRectangel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int a = sc.nextInt(),i,j;
        System.out.println("Enter breath: ");
        int b = sc.nextInt();
        for (i=1; i<=a; i++){
            for (j=1; j<=b;j++){
                if ((i==1)||(j==1)||(i==a)||(j==b)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println();
    }

    static void NumberTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt(),i,j;
        for (i = 1; i<= a; i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void NumberPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=1;i<=a;i++){
            for (j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void FloydTriangle(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = sc.nextInt(),i,j,number=1;
    for (i=1;i<=a;i++){
        for (j=1;j<=i;j++){
            System.out.print(number);
            number++;
        }
        System.out.println();
    }

    }

    static void FloydIsoTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j,number=1;
        for (i=1;i<=a;i++){
            for (j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
            System.out.print(number);
            number++;
            }
            System.out.println();
        }
    }

    static void PascalTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a  =sc.nextInt(),i,j;
        int[] previous = {1};
        for (i=1;i<=a;i++){
            int[] current = new int[i];
            for (j=0;j<i;j++){
                if ((j==0)||(j==i-1)){
                    current[j]=1;
                }
                else {
                   current [j] = previous[j-1]+previous[j];
                }
                System.out.print(current[j]+" ");
            }
            System.out.println();
            previous = current;
        }
    }

    static void AlphabetTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=1;i<=a;i++) {
            char b = 'A';
            for (j = 1; j <= i; j++) {
                System.out.print(b);
                b++;
            }
            System.out.println();
        }
    }
    static void AlphabetPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=1;i<=a;i++){
            char b='A';
            for (j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                for (j=1;j<=2*i-1;j++){
                    if (j<=(2*i-1)/2 && j<=2*i-1){
                        System.out.print(b);
                        b++;}
                    else if (j>=(2*i-1)/2 && j<=2*i-1)
                    {
                        b--;
                        System.out.print(b);

                    }
                }
            }
            System.out.println();
        }
    }

    static void HourglassPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 2; i <= a; i++) {
            for (j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ZigzagPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=1;i<=3;i++){
            for (j=1;j<=a;j++){
               if ((i == 1 && j % 4 == 1)
                        || (i == 2 && j % 2 == 0)
                        || (i == 3 && j % 4 == 3)) {
                System.out.print("*");}
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void ZigzagPattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=1;i<=a;i++){
            for (j=1;j<=3;j++){
                if ((j == 1 && i % 4 == 1)
                        || (j == 2 && i % 2 == 0)
                        || (j == 3 && i % 4 == 3)) {
                    System.out.print("*");}
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void HollowPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=1;i<=a;i++){
            for (j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                if (i==1||i==a||j==2*i-1||j==1){
                System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void InvertedHollowTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j;
        for (i=a;i>=1;i--){
            for (j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                if (j==1||i==1||i==a||j==2*i-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void BinaryTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a  = sc.nextInt(),i,j;
        for (i=1;i<=a;i++){
            for (j=1;j<=i;j++){
                if ((i+j)%2==0){
                System.out.print("1");
            }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void ZeroToOneTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a  = sc.nextInt(),i,j;
        for (i=1;i<=a;i++){
            for (j=1;j<=i;j++){
                if (j%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void MirrorTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a =sc.nextInt(),i,j;
        for (i=a;i>=1;i--){
            for (j = 1; j <=a - i; j++) {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void HourGlassPattern() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt(),i,j,moved = 0;
        while (moved <= 2 * a - 1) {
            // Clear screen effect
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (i = a; i >= 1; i--) {
                for (j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    int starPosition = 2 * i - j;
                    if (starPosition <= moved) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (i = 2; i <= a; i++) {
                for (j = a - i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    if (i == 1 || i == a || j == 2 * i - 1 || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            Thread.sleep(200);

            moved++;
        }
    }

    static void HeartPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        // Top part
        for (int i = 1; i <= a / 2; i++) {
            // Last row of top: completely filled
            if (i == a / 2) {
                for (int j = 1; j <= 2 * a - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // Left spaces
                for (int j = 1; j <= a / 2 - i; j++) {
                    System.out.print(" ");
                }
                // Left stars
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print("*");
                }
                // Middle spaces
                for (int j = 1; j <= a - 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                // Right stars
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Bottom part (single loop, starts at a-1 to avoid repeating the full row)
        for (int i = a - 1; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ArrayIO(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i<=a-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for (int i=0; i<a;i++){
            System.out.print(arr[i]+" ");
        }
        }
    static void ArraySum(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array size: ");
        int a = sc.nextInt(),i, sum = 0;
        int[] arr = new int[a];
        for (i=0 ; i<=a-1; i++){
            arr[i]  =sc.nextInt();
        }
        System.out.println("Sum of entered array is: ");
        for (i=0; i<a; i++){
            sum = sum+ arr[i];
        }
        System.out.print(sum);
    }

    static void AverageArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        int a  = sc.nextInt(),i,sum = 0,average;
        int[] arr = new int[a];
        for (i=0; i<=a-1; i++){
            arr[i] = sc.nextInt();
        }
        for (i=0; i<a; i++){
            sum = sum+arr[i];
        }
        average = sum/a;
        System.out.print("Average of array is: "+average);
    }

    static void LargestElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        int a = sc.nextInt(),i,current,Largest;
        int[] arr = new int[a];
        for (i=0; i<=a-1;i++){
            arr[i] = sc.nextInt();
        }
        Largest = arr[0];
        for (i=0; i<a; i++){
            current = arr[i];
            if (current > Largest){
                Largest = current;
            }
        }
        System.out.print("Largest element in array is: "+Largest);

    }

    static void SmallestElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in an array: ");
        int a = sc.nextInt(),i,current, smallest;
        int[] arr = new int[a];
        for (i = 0; i<=a-1; i++){
            arr[i] = sc.nextInt();
        }
        smallest = arr[0];
        for(i=0; i<a; i++){
            current = arr[i];
            if (current<smallest){
                smallest = current;
            }

        }
        System.out.print("Smallest element in an array: "+smallest);

    }
    static void SecondLargest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in an array: ");
        int a = sc.nextInt(),i,current,largest, secondLargest = 0;
        int[] arr = new int[a];
        for (i=0 ; i<=a-1; i++){
            arr[i] = sc.nextInt();
        }
        largest = arr[0];
        secondLargest = arr[1];
        if (largest > secondLargest){
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }
        for (i = 2;i<a; i++){
            current = arr[i];
            if (current>largest){
                secondLargest  = largest;
                largest = current;
            }
            else if (current>secondLargest){
                secondLargest = current;
            }
        }
        System.out.print("Second largest element in an array: "+secondLargest);
    }

    static void SecondSmallest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in an array: ");
        int a = sc.nextInt(),i,current,smallest, secondSmallest ;
        int[] arr = new int[a];
        for (i=0 ; i<=a-1; i++){
            arr[i] = sc.nextInt();
        }
        smallest = arr[0];
        secondSmallest = arr[1];
        if (smallest > secondSmallest){
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (i = 2;i<a; i++){
            current = arr[i];
            if (current<smallest){
                secondSmallest  = smallest;
                smallest = current;
            }
            else if (current<secondSmallest){
                secondSmallest = current;
            }
        }
        System.out.print("Second smallest element in an array: "+secondSmallest);
    }

    static void ReverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int a = sc.nextInt(),i,reverse;
        int[] arr = new int[a];
        for (i=0 ; i<=a-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for (i=0 ; i<a; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array is: ");
        for (i=a-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    static void 



    void main() {
}}





