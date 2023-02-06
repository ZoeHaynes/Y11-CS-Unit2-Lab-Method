//1
public class Method {
    //2
    public static void main(String[] args) {
        //3
        int sum = add(3,8);
        System.out.println(sum);
        //4
        int sumTwo = addTwo(3,8, 4,9);
        System.out.println(sumTwo);
        //5
        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);
        //6
        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);
        //7
        String triple = triple("oohbaby");
        System.out.println(triple);
        //8
        double half = half(17);
        System.out.println(half);
        //9
        int roundedPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositive);
        //10
        int roundedNegative = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegative);

    }
    //3
    public static int add(int a, int b) {
        return a + b;
    }
    //4
    public static int addTwo(int a, int b, int c, int d) {
        int sum1 = add(a,b);
        int sum2 = add(c,d);
        return sum1 + sum2;
    }
    //5
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";

    }
    //6
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";

    }
    //7
    public static String triple(String name) {
        return name + name + name;

    }
    //8
    public static double half(int a) {
        double A = (double)a;
        return A/2;

    }
    //9
    public static int roundPositiveValueToNearestInteger(double a){
        int roundedValue = (int) Math.round(a);
        return roundedValue;

    }
    //10
    public static int roundNegativeValueToNearestInteger(double a){
        a*=-1;
        int roundedNegValue = (int) Math.round(a);
        roundedNegValue*=-1;
        return roundedNegValue;

    }



}