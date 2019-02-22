package lesson02;

public class HomeWorkOnString {

    static String eachNth(String s, int n){

        String r = "";

        for (int x = 0; x < s.length(); x++){
            if (n < 1) break;
            if (x%n == 0){
                r += s.charAt(x);
            }
        }

        return r;
    }
}
