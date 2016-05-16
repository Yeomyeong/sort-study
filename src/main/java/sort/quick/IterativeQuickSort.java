package main.java.sort.quick;

import main.java.sort.Scope;
import main.java.sort.Sort;

import java.util.List;
import java.util.Stack;

import static main.java.sort.quick.QuickSortCore.partitionByPivot;

/**
 * In fact, it is correct to name/call quick sort as partition exchange sort.
 */
public class IterativeQuickSort implements Sort{
  @Override
  public void sort(List<Integer> list) {
    int startIndex = 0, endIndex = list.size() -1;
    Stack<Scope> scopeStack = new Stack<>();
    scopeStack.push(new Scope(startIndex, endIndex));

    while (!scopeStack.isEmpty()) {
      Scope nowScope = scopeStack.pop();
      startIndex = nowScope.getStartIndex();
      endIndex = nowScope.getEndIndex();

      int pivotOffset = partitionByPivot(list , startIndex, endIndex);

      if (pivotOffset-1 > startIndex) {
        scopeStack.push(new Scope(startIndex, pivotOffset-1));
      }

      if (pivotOffset+1 < endIndex) {
        scopeStack.push(new Scope(pivotOffset + 1, endIndex));
      }
    }
  }

}
