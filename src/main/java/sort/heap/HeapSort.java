package main.java.sort.heap;

import java.util.List;

import static main.java.sort.SortUtil.swap;

public class HeapSort {
  private final int ROOT_INDEX = 0;

  public void sort(List<Integer> list) {
    buildHeap(list);
    heapSort(list);
  }

  private void buildHeap(List<Integer> list) {
    int length = list.size();
    for (int subRootIndex = length / 2 - 1; subRootIndex >= 0; subRootIndex--) {
      heapify(list, length, subRootIndex);
      System.out.println(list);
    }
  }

  private void heapSort(List<Integer> list) {
    int length = list.size();
    for (int heapSize = length-1; heapSize >= 0; heapSize--) {
      swap(list, ROOT_INDEX, heapSize);
      heapify(list, heapSize, ROOT_INDEX);
    }
  }

  void heapify(List<Integer> list, int sizeOfHeap, int root)
  {
    int subtreeRoot = getSubtreeRoot(list, sizeOfHeap, root);

    if (subtreeRoot != root) {
      swap(list, root, subtreeRoot);
      heapify(list, sizeOfHeap, subtreeRoot);
    }
  }

  private int getSubtreeRoot(List<Integer> list, int sizeOfHeap, int root) {
    int subtreeRoot = root;
    int leftIndex = 2 * root + 1;
    int rightIndex = 2 * root + 2;

    if (leftIndex < sizeOfHeap && list.get(leftIndex) > list.get(subtreeRoot))
      subtreeRoot = leftIndex;

    if (rightIndex < sizeOfHeap && list.get(rightIndex) > list.get(subtreeRoot))
      subtreeRoot = rightIndex;

    return subtreeRoot;
  }
}
