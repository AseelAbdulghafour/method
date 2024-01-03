package method;
  import java.util.List;
import java.util.ArrayList;
public class summationPractice {
  



    public static void main(String[] args) {

        ArrayList<Integer> numb = new ArrayList<>();
        numb.add(2);
        numb.add(60);
        numb.add(32);
        numb.add(41);
        numb.add(10);
        numb.add(1);

        System.out.println(sum(numb));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sumnum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumnum += numbers.get(i);
        }
        return sumnum;
    }

    @Override
    public String toString() {
        return "Main []";
    }
}

