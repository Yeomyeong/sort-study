package main.java.sort.quick;

import main.java.sort.Sort;

import java.util.List;
import java.util.Stack;

import static main.java.sort.quick.QuickSortUtil.partitionByPivot;

/**
 * Created by wymstar on 5/10/16.
 */
public class IterativeQuickSort implements Sort{
  public void sort(List<Integer> list) {
    sort(list, 0, list.size()-1);
  }

  private int partition(List<Integer> list, int startIndex, int endIndex)
  {
    if (startIndex < endIndex) {
      int pivotOffset = partitionByPivot(list, startIndex, endIndex);
      return pivotOffset;
    }
    return -1;
  }

  private void sort(List<Integer> list, int startIndex, int endIndex)
  {
    Stack<Scope> scopeStack = new Stack<>();
    scopeStack.push(new Scope(startIndex, endIndex));

    while (!scopeStack.isEmpty()) {
      Scope nowScope = scopeStack.pop();
      startIndex = nowScope.startIndex;
      endIndex = nowScope.endIndex;

      int pivotOffset = partition(list , startIndex, endIndex);

      if (pivotOffset-1 > startIndex) {
        scopeStack.push(new Scope(startIndex, pivotOffset-1));
      }

      if (pivotOffset+1 < endIndex) {
        scopeStack.push(new Scope(pivotOffset + 1, endIndex));
      }
    }
  }

  private class Scope {
    int startIndex;
    int endIndex;

    public Scope(int startIndex, int endIndex) {
      this.startIndex = startIndex;
      this.endIndex = endIndex;
    }
  }
}
