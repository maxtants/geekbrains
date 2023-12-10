import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedList<Object> nums = new LinkedList<>();
        nums.add(3);
        nums.add(9);
        nums.add(8);

        System.out.println(revert(nums));
        System.out.println(nums);
    }


    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> ll2 = new LinkedList<>();

        int n = ll.size();

        for (int i = 0; i < n; i++) {
            if(ll.size() == 1) {
                ll2.add(ll.pollFirst());
                break;
            }
            ll2.add(ll.pollLast());
        }

        return ll2;
    }

}
