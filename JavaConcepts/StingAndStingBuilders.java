package JavaConcepts;

public class StingAndStingBuilders {
    public static void main(String[] args) {

        // String Comparision with ref pointing to same object
        String name = "Nobody";
        String otherName = "Nobody";

        System.out.println(name == otherName); // true

        // String Comparision with ref pointing to different object

        String name1 = new String("Nobody");
        String name2 = new String("Nobody");

        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); // true

        // String builders
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }

        System.out.println(sb.toString()); // abcdefghijklmnopqrstuvwxyz

        // Palendrome

        String str = "madam";

        int start = 0;
        int end = str.length() - 1;
        boolean isPalendrome = false;

        char[] stringArr = str.toCharArray();
        for (int i = 0; i < stringArr.length / 2; i++) {
            if (stringArr[start] == stringArr[end]) {
                start++;
                end--;
                isPalendrome = true;
            } else {
                isPalendrome = false;
                break;
            }
        }

        System.out.println(isPalendrome ? "Its a palembrome" : "Its not an palendrome");
    }
}
