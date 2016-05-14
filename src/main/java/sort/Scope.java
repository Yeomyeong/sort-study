package main.java.sort;

public class Scope {
  int startIndex;
  int middleIndex;
  int endIndex;

  public Scope(int startIndex, int endIndex) {
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  public Scope(int startIndex, int middleIndex, int endIndex) {
    this.startIndex = startIndex;
    this.middleIndex = middleIndex;
    this.endIndex = endIndex;
  }

  public int getStartIndex() {
    return startIndex;
  }

  public int getEndIndex() {
    return endIndex;
  }
}
