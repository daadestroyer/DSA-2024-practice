package Arrays_06.Basic;

import java.util.ArrayList;

public class App10_FindTheNumberThatAppearOnlyOnce {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {7, 3, 5, 4, 5, 3, 4};

        for(int i : arr){
            if(!list.contains(i)){
                list.add(i);
            }
        }

        System.out.println(list.get(0));

    }
}
