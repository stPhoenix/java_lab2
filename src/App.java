public class App {
    public static void main(String[] args) throws Exception {
        String a = "";
        char[] b = args[0].toCharArray();

        for (int i=b.length-1; i >= 0; i--)
        {
            a += b[i];
        }

        if (a.equals(args[0]))
        {
            System.out.println("Number is a palindrome");
        }
        else {
            System.out.println("Number is not a palindrome");
        }
    }
}
