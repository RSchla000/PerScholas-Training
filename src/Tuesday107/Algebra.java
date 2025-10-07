package Tuesday107;

public class Algebra {
    int linearEquation(int m, int x, int b) {
        return m * x + b;
    }
public double calculateHypotenuse(double a, double b) {
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
}
public double simpleIntrest (double P,double R, double T){
        return P*R*T;
    }
public double quadtricEquation(double a, double b, double c , double x) {
        return a*x*x+b*x+c;

}



    static void main(String[] args) {
        Algebra myEquation = new Algebra();
        int sum = myEquation.linearEquation(20,15,4);
        System.out.println("Sum = " +sum);

        Algebra pythagorean = new Algebra();
        double sum2 = pythagorean.calculateHypotenuse(2,4);
        System.out.println("Hypotenuse for a triangle with sides 2 and 4 = " +sum2);

        Algebra intrest = new Algebra();
        double sum3 = intrest.simpleIntrest(1.9,4.7,3.3);
        System.out.println("The intrest rate = " +sum3);

        Algebra quad = new Algebra();
        double sum4 = quad.quadtricEquation(1,-3,2,2);
        System.out.println("The sum = "+sum4);
    }
}