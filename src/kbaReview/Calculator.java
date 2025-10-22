package kbaReview;

class Calculator {
    // (1) add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // (2) add three numbers (overloaded method)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // (3) add two double numbers (overloaded by type)
    double add(double a, double b) {
        return a + b;
    }
}
