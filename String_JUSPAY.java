import java.util.*;
public class String_JUSPAY{
    public static void main(String[] args) {
        char[] ch = {'j' , 'u' , 's' , 'p' , 'a' , 'y'};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < ch.length ; j++){
                if(s.charAt(i) == ch[j]){
                    ch[j] = '(';
                    c++;
                    break ;
                }
            }
        }
        System.out.println(s.length() - c);
    }
}