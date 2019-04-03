public class isPal {
    public static void main(String[] args) {
        System.out.println(isPal("tacocat"));
    }

    public static boolean isPal(String s){
        String r = "";
        for (int i = s.length()-1; i >= 0; i--){
            r = r+s.charAt(i);
        }
        return r.equals(s);
    }
}
