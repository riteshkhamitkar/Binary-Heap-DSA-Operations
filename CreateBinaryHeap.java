.................
Main.java
.................
class Main {
    public static void main(String[] args){
        BinaryHeap newBP = new BinaryHeap(5);
    }
}
..................................
BinaryHeap.java
..................................
public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size){
        arr = new int [size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap is created Successfully");
    }
}

...........
//////finish///////////
