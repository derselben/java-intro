package lesson02;

public class HomeWorkOnString {

    static String eachNth(String s, int n){

        StringBuilder r = new StringBuilder();

        if (n > 0  && s.length() > 0) {

            for (int x = 0; x < s.length(); x++) {
                if (x % n == 0) {
                    r.append(s.charAt(x));
                }
            }
        }

        return r.toString();
    }
}
