import java.util.Arrays;
 public class Main {
    public static void main(String[] args) {
        int l=1;
        int r=2;
        for(int i=0;i<5;i++){
            int c=l+r;
            System.out.println(c);
            l=r;
            r=c;
        }
        
    }
}