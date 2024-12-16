package apnaColl.strings;

public class Rev {
    public static void main(String[] args) {


        String st = "hello";
        String ts = "";
        for(int i = 0;i<st.length();i++){
            ts = ts + st.charAt(st.length()- i - 1);
//            ts =  st.charAt(st.length()- i - 1)+ts    ;
        }
        System.out.println(ts);
    }
}