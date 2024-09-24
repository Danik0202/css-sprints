package first_moduledom2;


public class new19 {
    public static void main(String[] args) {


    }

    public static int countVowels(String str) {
        int ap = 0;
        String a = "a";
        String e = "e";
        String ii = "i";
        String u = "u";
        String o = "o";
        String stra = str.toLowerCase();
        for (int i = 0; i < stra.length(); i++) {
            if (stra.charAt(i)==a.charAt(0) || stra.charAt(i)==e.charAt(0) || stra.charAt(i)==ii.charAt(0) || stra.charAt(i)==o.charAt(0) || stra.charAt(i)==u.charAt(0)) {
                ap++;
            }
        }return ap;

    }
}