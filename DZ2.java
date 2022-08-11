import java.util.Scanner;

public class DZ2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String ans = "";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();
        char ukaz = s.charAt(0);
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ukaz && i != s.length()-1){
                count = count + 1;
            }
            else {
                if (i == s.length()-1) count += 1;
                ans = ans + String.format("%c%d", ukaz, count);
                ukaz = s.charAt(i);
                count = 1;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}