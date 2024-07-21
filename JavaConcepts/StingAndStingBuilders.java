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

    }
}
