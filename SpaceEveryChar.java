package StringPrectice;

public class SpaceEveryChar {
    public static void main(String[] args) {
        String str = "priya";
        String str1 = " ";
        for (int i = 0; i < str.length(); i++) {
            str1 = str1 + " " + str.charAt(i);
        }
        System.out.println(str1);
    }
}
