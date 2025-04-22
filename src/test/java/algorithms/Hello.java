package algorithms;

public class Hello {
    int number;

    public Hello(int number) {
        this.number = number;
    }

    public void getHello(int number){
        if (number == 7){
            System.out.println("Hello");
        }else {
            System.out.println("No elements found");
        }
    }
}
