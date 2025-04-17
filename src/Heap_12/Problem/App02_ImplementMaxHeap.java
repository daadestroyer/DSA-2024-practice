package Heap_12.Problem;

import java.util.ArrayList;

public class App02_ImplementMaxHeap {
    private ArrayList<Integer> heap;

    public void initializeHeap() {
        heap = new ArrayList<>();
    }

    public void swap(int Pidx, int Cidx) {
        int ParentData = heap.get(Pidx);
        int ChildData = heap.get(Cidx);
        heap.set(Pidx, ChildData);
        heap.set(Cidx, ParentData);
    }

    public void insert(int data) {
        heap.add(data);
        upHeapify(heap.size() - 1);
    }

    public void upHeapify(int Cidx) {
        int Pidx = (Cidx - 1) / 2;
        if (heap.get(Cidx) > heap.get(Pidx)) {
            swap(Cidx, Pidx);
        }
        upHeapify(Pidx);
    }

    public void downHeapify(int Pidx) {
        int leftChildIdx = 2 * Pidx + 1;
        int rightChildIdx = 2 * Pidx + 2;
        int maxIdx = Pidx;
        if (leftChildIdx < heap.size() && heap.get(leftChildIdx) > heap.get(maxIdx)) {
            maxIdx = leftChildIdx;
        }
        if (rightChildIdx < heap.size() && heap.get(rightChildIdx) > heap.get(maxIdx)) {
            maxIdx = rightChildIdx;
        }
        if (maxIdx != Pidx) {
            swap(maxIdx, Pidx);
            downHeapify(maxIdx);
        }

    }

    public int remove() {
        swap(0, heap.size() - 1);
        int data = heap.remove(heap.size() - 1);
        downHeapify(0);
        return data;
    }


    public static void main(String[] args) {

    }
}
