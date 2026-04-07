package d7;

public class arrays {
    private int data[];
    private int size;

    public arrays() {
        data = new int[10];
        size = 0;
    }

    public arrays(int initialCapacity) {
        data = new int[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }


}