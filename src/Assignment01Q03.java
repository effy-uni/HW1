public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 1;
        int previous = 1;
        int current = 1;
        System.out.print(previous);

        for (int i = 0; i < x-1; i++) {
            if (i < x - 1) 
                System.out.print(" "); 
            if (current % 2 == 1) {
                numOdd++;
            }
            System.out.print(current);
            current += previous;
            previous = current - previous;
        }
        System.out.println();

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
