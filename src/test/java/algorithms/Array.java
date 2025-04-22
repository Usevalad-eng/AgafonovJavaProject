package algorithms;

public class Array {
    int[] array;

    public Array(int[] arr) {
        this.array = arr;
    }

    public void getArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 3;
            System.out.println(array[i]);
        }
    }
}
