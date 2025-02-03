import java.util.*;
import java.util.stream.Collectors;


public class App{
    public static void print1ToN(int counter , int n){
        if(counter > n){
            return;
        }
        System.out.println(counter);
        counter  = counter+1;
        print1ToN(counter,n);
    }
    public static void main(String[] args) {
//        print1ToN(1,10);

    }


}
