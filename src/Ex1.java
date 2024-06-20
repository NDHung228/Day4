import java.util.HashMap;

public class Ex1 {

    public static char nonRepeatedChar(String s) {

        char result;
        for (int i = 0; i < s.length(); i++) {
            boolean duplicated = false;
            result = s.charAt(i);

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    duplicated = true;
                }
            }
            if (!duplicated) {
                return result;
            }
        }

        return '0';
    }


    public static void main(String[] args) {
        String s = "dibblegabbler";

        System.out.println("The first non repeated is String is : " + nonRepeatedChar(s));


    }
}
