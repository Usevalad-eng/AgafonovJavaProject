package algorithms;

public class Hello {
    int number;

    public Hello(int n) {
        this.number = n;
    }

    public void getHello() {
        if (number > 7) {
            System.out.println("Hello");
        }
    }

    public void getHelloWithScanner(int inpNumber) {
        try {
            if (inpNumber > 7) {
                System.out.println("Hello");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
