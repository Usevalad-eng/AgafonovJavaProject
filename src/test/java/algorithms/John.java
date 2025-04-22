package algorithms;

public class John {
    String string1 = "John";
    String string2;

    public John(String str2) {
        this.string1 = "John";
        this.string2 = str2;
    }

    public void getJohn() {
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Hello John");
        } else {
            System.out.println("There is no such name");
        }
    }
}
