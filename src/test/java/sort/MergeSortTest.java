package test.java.sort;

import main.java.sort.merge.PrimitiveMergeSort;
import main.java.sort.merge.RecursiveMergeSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
  PrimitiveMergeSort primitiveMergeSort;
  RecursiveMergeSort recursiveMergeSort;

  @Before
  public void init() {
    primitiveMergeSort = new PrimitiveMergeSort();
    recursiveMergeSort = new RecursiveMergeSort();
  }

  @Test
  public void testPrimitiveMergeSort() {
    List<Integer> list = Arrays.asList(5, 3, 7, 6, 2, 1, 4, 4,2);
    primitiveMergeSort.sort(list);

    assertEquals(list, Arrays.asList(1,2,2,3,4,4,5,6,7));
  }

  @Test
  public void testRecursiveMergeSort() {
    List<Integer> list = Arrays.asList(5, 3, 7, 6, 2, 1, 4, 4,2);
    recursiveMergeSort.sort(list);

    assertEquals(list, Arrays.asList(1,2,2,3,4,4,5,6,7));
  }
}
