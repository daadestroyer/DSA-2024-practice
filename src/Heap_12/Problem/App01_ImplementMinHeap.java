package Heap_12.Problem;

import java.util.ArrayList;
class Solution {
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

    public void insert(int key) {
        heap.add(key);
        heapifyUp(heap.size() - 1);
    }

    public void heapifyUp(int CIdx) {
        // find PIDX
        int PIDX = (CIdx - 1) / 2;
        if (heap.get(CIdx) < heap.get(PIDX)) {
            swap(CIdx, PIDX);
            heapifyUp(PIDX);
        }
    }

    public void downHeapify(int PIdx) {
        int leftChildIdx = 2 * PIdx + 1;
        int rightChildIdx = 2 * PIdx + 2;
        int minIdx = PIdx;

        if (leftChildIdx < heap.size() && heap.get(leftChildIdx) < heap.get(minIdx)) {
            minIdx = leftChildIdx;
        } else if (rightChildIdx < heap.size() && heap.get(rightChildIdx) < heap.get(minIdx)) {
            minIdx = rightChildIdx;
        }
        if (minIdx != PIdx) {
            swap(PIdx, minIdx);
            downHeapify(minIdx);
        }
    }

    public void changeKey(int index, int newVal) {
        if (index < 0 || index >= heap.size()) return;

        int oldVal = heap.get(index);
        heap.set(index, newVal);

        if (newVal < oldVal) {
            heapifyUp(index);
        } else {
            downHeapify(index);
        }
    }

    public void extractMin() {
        // in min heap min element is at top
        // just remove 0th element from list
        if (heap.isEmpty()) {
            return;
        }
        int lastIdx = heap.size() - 1;
        swap(0, lastIdx);
        heap.remove(lastIdx);
        downHeapify(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int getMin() {
        if (heap.isEmpty()) throw new IllegalArgumentException("Heap is empty");
        return heap.get(0);
    }

    public int heapSize() {
        return heap.size();
    }
}
public class App01_ImplementMinHeap {

    public static void main(String[] args) {

    }
}
