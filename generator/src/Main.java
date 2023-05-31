import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        List<Character> password = new ArrayList<>();

        System.out.print("Enter password length: ");
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            char c = (char)(r.nextInt(26) + 'a');
            password.add(c);

            if(i % 2 == 0){
                char c1 =(char)(r.nextInt(26) + 'A');
                password.add(c1);
            }
            if(i % 3 == 0){
                int num = r.nextInt(10);
                String charNum = String.valueOf(num);
                char convert = charNum.charAt(0);

                password.add(convert);
            }
        }

        String passwordFormat = password.toString().replace(",", "").replace("[", "").replace("]", "").trim();
        System.out.println(passwordFormat);
    }
}
