package org.example;
public class Calc {
  public int add(int x,int y)
  {
    return x+y;
  }
  public int subtract(int x, int y)
  {
    return x-y;
  }
 }
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
  @Test
  void testSubtraction() {
    assertEquals(2，c.subtract(4,2));
    }
