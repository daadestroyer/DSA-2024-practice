package Recursion_12.Medium;

public class App20_GenerateAllSubSeqOfString {
    public static void generateAllSubSeq(String S, int idx, String res) {
        if (idx == S.length()) {
            System.out.print(res+" ");
            return;
        }
        // take it
        generateAllSubSeq(S, idx + 1, res + S.charAt(idx));

        // skip it
        generateAllSubSeq(S, idx + 1, res);
    }

    public static void main(String[] args) {
        String S = "abc";
        generateAllSubSeq(S, 0, "");
    }
}
