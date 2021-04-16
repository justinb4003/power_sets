import java.lang.Math;
import java.util.Vector;

class OddPowerSets {
    static int[] full = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        int combo_count = (int)(Math.pow(2, full.length));
        for(int combo = 0; combo < combo_count; combo++) {
            System.out.println(combo);
            String bincode = "";
            Vector<int> newset = new Vector<int>();
            for(int c = 0; c < full.length; c++) {
                if((combo & (1 << c)) > 0) {
                    bincode += "1";
                } else { 
                    bincode += "0";
                }
            }
        }
    }
}