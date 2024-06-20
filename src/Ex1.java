import java.util.HashMap;

public class Ex1 {

    public static char nonRepeatedChar(String s) {


        for (int i = 0; i < s.length(); i++) {
            boolean duplicated = false;

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    duplicated = true;
                    break;
                }
            }
            if (!duplicated) {
                return s.charAt(i);
            }
        }

        return '0';
    }

    public static char nonRepeatedChar2(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return '0';
    }


    public static void main(String[] args) {
        String s = "gibblegabbler";

        System.out.println("The first non repeated is String is : " + nonRepeatedChar(s));
        System.out.println("The second non repeated is String is : " + nonRepeatedChar2(s));


    }
}
