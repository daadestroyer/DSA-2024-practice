package Recursion_12.Medium;

public class App17_1DQueen {
    public static void main(String[] args) {
        queenPermutation(new boolean[4], 0, 2, "");
        System.out.println("------------------");
        queenCombination(new boolean[4], 0, 2, "", 0);
    }

    private static void queenCombination(boolean[] boxes, int QP, int TQ, String ans, int lastIdx) {
        if (QP == TQ) {
            System.out.println(ans);
            return;
        }
        for (int i = lastIdx; i < boxes.length; i++) {
            boxes[i] = true;
            queenCombination(boxes, QP + 1, TQ, ans + "Q" + QP + "B" + i + " ", i + 1);
            boxes[i] = false;
        }
    }

    private static void queenPermutation(boolean[] boxes, int QP, int TQ, String ans) {
        if (QP == TQ) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < boxes.length; i++) {
            if (!boxes[i]) {
                boxes[i] = true;
                queenPermutation(boxes, QP + 1, TQ, ans + "Q" + QP + "B" + i + " ");
                boxes[i] = false;
            }
        }
    }
}
