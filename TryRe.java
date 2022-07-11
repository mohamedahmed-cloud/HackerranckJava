import java.sql.SQLOutput;
import java.util.Arrays;

public class TryRe {
    public static void main(String[] args) {
        int[] oldList = {1, 2, 3, 4, 5};
        TryRe re = new TryRe();
        System.out.println(re.reverse(oldList));
        System.out.println(Arrays.toString(oldList));
        for (int i = 0; i < oldList.length; i++)
            System.out.print(oldList[i] + " ");
    }

    public int[] reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];
        System.out.println(newList);
//        deep copy
        return newList;
    }
}
