public class Factorial {
    public static Integer factorial1(Integer num) { //Recursion example
        if (num == 1 || num == 0) {
            return 1;
        } else {
            num *= factorial1(num - 1); // Calling the factorial1 function itself
        }
        return num;
    }

    public static Integer factorial2(Integer num) { // It does the same as the function above
        num = (num == 1 || num == 0) ? 1 : num * factorial2(num - 1);  // but now with ternary operation
        return num;
    }

    public static void main(String[] args) {
        System.out.println(factorial1(6));
        System.out.println(factorial2(6));
    }
}
