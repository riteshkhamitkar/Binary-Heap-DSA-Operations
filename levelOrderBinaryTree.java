.................
Main.java
.................
class Main {
    public static void main(String[] args){
        BinaryHeap newBP = new BinaryHeap(5);
        newBP.levelOrder();
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

    //isEmpty Peek method 

    public boolean isEmpty(){
        if(sizeOfTree == 0){
            return true;
        }else{
            return false;
        }
    }

    // Peek method

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Binary Heap is Empty");
            return null;
        }
        return arr[1];
    }


    //Size of Binary Heap

    public int sizeOfBP(){
        return sizeOfTree;
    }

    //LevelOrder traversal 

    public void levelOrder(){
        for(int i = 1; i<= sizeOfTree;i++){
            System.out.println("arr[]" + " ");
        }
        System.out.println("\n");
    }
    
}


...........
//////finish///////////
