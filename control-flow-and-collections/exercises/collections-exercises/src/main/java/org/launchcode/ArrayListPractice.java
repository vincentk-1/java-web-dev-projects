import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList <Integer> arrInt = new ArrayList<>();
        arrInt.add(1);arrInt.add(7);arrInt.add(12);arrInt.add(18);arrInt.add(23);
        arrInt.add(25);arrInt.add(36);arrInt.add(48);arrInt.add(53);arrInt.add(64);


        public static int sumEven(arrInt) {
            int total = 0;
            for (int integer : arrInt) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
        System.out.println(sumEven);
    }
}
