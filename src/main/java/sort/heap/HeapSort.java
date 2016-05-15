package main.java.sort.heap;

import java.util.List;

import static main.java.sort.SortUtil.swap;

public class HeapSort
{
  private final int ROOT_INDEX = 0;

  public void sort(List<Integer> list) {
    buildHeap(list);
    heapSort(list);
  }

  private void buildHeap(List<Integer> list) {
    int length = list.size();
    for (int i = length / 2 - 1; i >= 0; i--)
      heapify(list, length, i);
  }

  private void heapSort(List<Integer> list) {
    int length = list.size();
    for (int heapSize = length-1; heapSize >= 0; heapSize--) {
      swap(list, ROOT_INDEX, heapSize);
      heapify(list, heapSize, ROOT_INDEX);
    }
  }

  void heapify(List<Integer> list, int sizeOfHeap, int rootIndex)
  {
    int subtreeRoot = rootIndex;
    int leftIndex = 2*rootIndex + 1;
    int rightIndex = 2*rootIndex + 2;

    if (leftIndex < sizeOfHeap && list.get(leftIndex) > list.get(subtreeRoot))
      subtreeRoot = leftIndex;

    if (rightIndex < sizeOfHeap && list.get(rightIndex) > list.get(subtreeRoot))
      subtreeRoot = rightIndex;

    if (subtreeRoot != rootIndex)
    {
      swap(list,rootIndex, subtreeRoot);
      heapify(list, sizeOfHeap, subtreeRoot);
    }
  }
}
