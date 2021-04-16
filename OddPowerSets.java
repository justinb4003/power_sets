import java.lang.Math;
import java.util.Vector;

class OddPowerSets {
    static int[] full = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        int combo_count = (int) (Math.pow(2, full.length));

        // Build up every set
        Vector<Vector<Integer>> all_sets = new Vector<Vector<Integer>>();
        for (int combo = 0; combo < combo_count; combo++) {
            System.out.println(combo);
            String bincode = "";
            Vector<Integer> newset = new Vector<Integer>();
            for (int c = 0; c < full.length; c++) {
                if ((combo & (1 << c)) > 0) {
                    bincode += "1";
                    newset.addElement(full[c]);
                } else {
                    bincode += "0";
                }
            }
            System.out.println(bincode);
            all_sets.addElement(newset);
        }

        Vector<Vector<Integer>> odd_sets = new Vector<Vector<Integer>>();
        System.out.println("All sets:");
        for (Vector<Integer> s : all_sets) {
            System.out.println(s);
            if (s.size() % 2 == 1) {
                odd_sets.addElement(s);
            }
        }

        System.out.println("Odd sets:");
        for (Vector<Integer> s : odd_sets) {
            System.out.println(s);
        }
        System.out.println("Odd  sets count: " + odd_sets.size());
    }
}
