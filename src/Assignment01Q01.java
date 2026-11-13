public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg: args) {
            char firstchar = arg.charAt(0);
            if (firstchar % 5 == 0) {
                System.out.println(firstchar);
            }
        }
    }
}
