package lesson02;

public class HomeWorkOnString {

    static String eachNth(String s, int n){

        String r = "";

        if (n < 1  || s.length() < 1) return r;

        for (int x = 0; x < s.length(); x++){
            if (x%n == 0){
                r += s.charAt(x);
            }
        }

        return r;
    }
}
