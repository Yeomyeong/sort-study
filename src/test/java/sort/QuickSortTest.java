package test.java.sort;

import main.java.sort.quick.IterativeQuickSort;
import main.java.sort.quick.RecursiveQuickSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by wymstar on 5/9/16.
 */
public class QuickSortTest {
  RecursiveQuickSort recursiveQuickSort;
  IterativeQuickSort iterativeQuickSort;

  @Before
  public void init() {
    recursiveQuickSort = new RecursiveQuickSort();
    iterativeQuickSort = new IterativeQuickSort();
  }

  @Test
  public void test1 () {
    List<Integer> list = Arrays.asList(5, 3, 7, 6, 2, 1, 4);
    recursiveQuickSort.sort(list);

    assertEquals(list, Arrays.asList(1,2,3,4,5,6,7));
  }

  @Test
  public void test2 () {
    List<Integer> list = Arrays.asList(5, 3, 7, 6, 2, 1, 4, 4,2);
    recursiveQuickSort.sort(list);

    assertEquals(list, Arrays.asList(1,2,2,3,4,4,5,6,7));
  }

  @Test
  public void testIterativeQuickSort () {
    List<Integer> list = Arrays.asList(5, 3, 7, 6, 2, 1, 4, 4,2);
    iterativeQuickSort.sort(list);

    assertEquals(list, Arrays.asList(1,2,2,3,4,4,5,6,7));
  }
}
