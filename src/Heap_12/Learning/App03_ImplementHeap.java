package Heap_12.Learning;

import java.util.ArrayList;

public class App03_ImplementHeap {
    ArrayList<Integer> list = new ArrayList<>();

    void add(int data) {
        // add the data
        list.add(data);

        // up heapify
        upheapify(list.size() - 1);
    }

    void upheapify(int CIdx) {
        // find parent idx
        int PIdx = (CIdx - 1) / 2;
        if (list.get(CIdx) < list.get(PIdx)) {
            swap(CIdx, PIdx);
            upheapify(PIdx);
        }
    }

    public void swap(int CIdx, int PIdx) {
        int ChildData = list.get(CIdx);
        int ParentData = list.get(PIdx);
        list.set(CIdx, ParentData);
        list.set(PIdx, ChildData);
    }

    public int remove() {
        swap(0, list.size() - 1);
        int data = list.remove(list.size() - 1);
        downheapify(0);
        return data;
    }

    public void downheapify(int PIDx) {
        // find parent left child
        int leftChildIdx = 2 * PIDx + 1;

        // find parent right child
        int rightChildIdx = 2 * PIDx + 2;

        int minIdx = PIDx;
        if (leftChildIdx < list.size() && list.get(leftChildIdx) < list.get(PIDx)) {
            minIdx = leftChildIdx;
        } else if (rightChildIdx < list.size() && list.get(rightChildIdx) < list.get(PIDx)) {
            minIdx = rightChildIdx;
        }
        if (minIdx != PIDx) {
            swap(minIdx, PIDx);
            downheapify(minIdx);
        }
    }

    public void display(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        App03_ImplementHeap app = new App03_ImplementHeap();
        app.add(10);
        app.add(20);
        app.add(30);
        app.add(3);
        app.display();

        app.remove();
        app.display();
    }
}
