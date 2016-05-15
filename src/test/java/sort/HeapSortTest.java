package test.java.sort;

import main.java.sort.heap.HeapSort;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HeapSortTest {
  @Test
  public void testHeapSort() {
    List<Integer> list = Arrays.asList(5, 3, 7, 6, 2, 1, 4, 4,2);
    new HeapSort().sort(list);

    assertEquals(list, Arrays.asList(1,2,2,3,4,4,5,6,7));
  }
}
