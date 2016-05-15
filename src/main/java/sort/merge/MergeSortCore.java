package main.java.sort.merge;

import java.util.ArrayList;
import java.util.List;

public class MergeSortCore {
  public static void mergeInPlace(List<Integer> list, int startIndex, int middle, int endIndex) {
    List<Integer> helper = new ArrayList<>(list.subList(startIndex, endIndex+1));

    int leftIndex = 0,
            leftEnd = middle - startIndex,
            rightIndex = middle + 1 - startIndex,
            rightEnd = endIndex - startIndex,
            current = startIndex;

    while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
      if (helper.get(leftIndex) < helper.get(rightIndex)) {
        list.set(current, helper.get(leftIndex));
        leftIndex++;
      } else {
        list.set(current, helper.get(rightIndex));
        rightIndex++;
      }
      current++;
    }

    while (current <= endIndex && leftIndex <= leftEnd) {
      list.set(current, helper.get(leftIndex));
      leftIndex++;
      current++;
    }
  }

  public static void mergeFromTwoCopiedArraysToOriginArray(List<Integer> leftList, List<Integer> rightList, List<Integer> list) {
    int leftIndex=0, rightIndex=0, current=0,
            leftSize = leftList.size(), rightSize = rightList.size();

    while (leftIndex < leftSize && rightIndex < rightSize) {
      if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
        list.set(current, leftList.get(leftIndex));
        leftIndex++;
      } else {
        list.set(current, rightList.get(rightIndex));
        rightIndex++;
      }
      current++;
    }

    if (leftIndex >= leftSize) {
      while (current < list.size()) {
        list.set(current, rightList.get(rightIndex));
        rightIndex++;
        current++;
      }
    } else {
      while (current < list.size()) {
        list.set(current, leftList.get(leftIndex));
        leftIndex++;
        current++;
      }
    }
  }
}
