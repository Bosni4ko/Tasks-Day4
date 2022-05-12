import java.util.ArrayList;
import java.util.List;

public class Task1 {
     public static void main(String[] args) {
        String[] arr = {"purple","magenta","pink","blue","black","red","crimson"};
        ArrayList<String> colors = new ArrayList<String>();

        for(String i : arr){
            colors.add(i);
        }
        colors.remove(2);
        colors.add("cyan");
        colors.add(0,"orange");

         colors.forEach(System.out::println);

         List<String> colorsSublist =  colors.subList(2,5);
         System.out.println();
         for (String i : colorsSublist){
             System.out.println(i);
         }

    }
}
