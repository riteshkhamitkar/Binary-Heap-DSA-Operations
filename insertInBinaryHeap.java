.................
Main.java
.................
class Main {
    public static void main(String[] args){
        BinaryHeap newBP = new BinaryHeap(5);
        newBP.insert(10, "Min");
        newBP.insert(5, "Min");
        newBP.insert(15, "Min");
        newBP.insert(1, "Min");
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
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    

     // Heapify for Insert
  public void heapifyBottomToTop(int index, String heapType) {
    int parent = index / 2;
    if (index <= 1 ) {
      return;
    }
    if (heapType == "Min") {
      if (arr[index] < arr[parent]) {
        int tmp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = tmp;
      }
    } else if (heapType == "Max") {
      if (arr[index] > arr[parent]) {
        int tmp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = tmp;
      }
    }
    heapifyBottomToTop(parent, heapType);

  }
     // Insert 
  public void insert(int value, String typeHeap) {
    arr[sizeOfTree+1] = value;
    sizeOfTree++;
    heapifyBottomToTop(sizeOfTree, typeHeap);
    System.out.println("Inserted " +value+ " successfully in Heap");
  }
}
...........
//////finish///////////
