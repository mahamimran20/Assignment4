import org.junit.Test;
import static org.junit.Assert.*;

public class EvoSuiteTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack stack0 = new Stack(1);
      boolean boolean0 = stack0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.push(0);
      boolean boolean0 = stack0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Stack stack0 = new Stack(1);
      stack0.push(1);
      boolean boolean0 = stack0.isFull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack stack0 = new Stack(5);
      boolean boolean0 = stack0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Stack stack0 = new Stack(1);
      int int0 = stack0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.push(10);
      int int0 = stack0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Stack stack0 = new Stack(3);
      stack0.push(100);
      stack0.push(200);
      stack0.push(300);
      int int0 = stack0.size();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack stack0 = new Stack(5);
      stack0.push(42);
      int int0 = stack0.peek();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.push(1);
      stack0.push(2);
      int int0 = stack0.peek();
      assertEquals(2, int0);
      assertEquals(2, stack0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack stack0 = new Stack(5);
      stack0.push(99);
      int int0 = stack0.pop();
      assertEquals(99, int0);
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.push(10);
      stack0.push(20);
      stack0.push(30);
      int int0 = stack0.pop();
      assertEquals(30, int0);
      assertEquals(2, stack0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Stack stack0 = new Stack(1);
      stack0.push((-1));
      int int0 = stack0.peek();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Stack stack0 = new Stack(2);
      stack0.push(0);
      int int0 = stack0.peek();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Stack stack0 = new Stack(5);
      stack0.push(1);
      stack0.push(2);
      stack0.push(3);
      stack0.push(4);
      stack0.push(5);
      boolean boolean0 = stack0.isFull();
      assertTrue(boolean0);
      assertEquals(5, stack0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack stack0 = new Stack(3);
      stack0.push(100);
      stack0.pop();
      boolean boolean0 = stack0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.push(Integer.MAX_VALUE);
      int int0 = stack0.pop();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.push(Integer.MIN_VALUE);
      int int0 = stack0.peek();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Stack stack0 = new Stack(100);
      for(int i = 0; i < 50; i++) {
          stack0.push(i);
      }
      assertEquals(50, stack0.size());
      assertFalse(stack0.isEmpty());
      assertFalse(stack0.isFull());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Stack stack0 = new Stack(4);
      stack0.push(1);
      stack0.push(2);
      int int0 = stack0.pop();
      assertEquals(2, int0);
      int int1 = stack0.pop();
      assertEquals(1, int1);
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Stack stack0 = new Stack(0);
      boolean boolean0 = stack0.isEmpty();
      assertTrue(boolean0);
      boolean boolean1 = stack0.isFull();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Stack stack0 = new Stack(3);
      stack0.push(10);
      stack0.push(20);
      stack0.pop();
      int int0 = stack0.peek();
      assertEquals(10, int0);
      assertEquals(1, stack0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Stack stack0 = new Stack(2);
      stack0.push(5);
      stack0.push(10);
      assertTrue(stack0.isFull());
      stack0.pop();
      assertFalse(stack0.isFull());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Stack stack0 = new Stack(1);
      assertFalse(stack0.isFull());
      stack0.push(999);
      assertTrue(stack0.isFull());
  }

  @Test(timeout = 4000, expected = IllegalStateException.class)
  public void test23()  throws Throwable  {
      Stack stack0 = new Stack(1);
      stack0.push(1);
      stack0.push(2);
  }

  @Test(timeout = 4000, expected = IllegalStateException.class)
  public void test24()  throws Throwable  {
      Stack stack0 = new Stack(2);
      stack0.push(10);
      stack0.push(20);
      stack0.push(30);
  }

  @Test(timeout = 4000, expected = IllegalStateException.class)
  public void test25()  throws Throwable  {
      Stack stack0 = new Stack(5);
      stack0.pop();
  }

  @Test(timeout = 4000, expected = IllegalStateException.class)
  public void test26()  throws Throwable  {
      Stack stack0 = new Stack(10);
      stack0.peek();
  }

  @Test(timeout = 4000, expected = IllegalStateException.class)
  public void test27()  throws Throwable  {
      Stack stack0 = new Stack(3);
      stack0.push(1);
      stack0.pop();
      stack0.pop();
  }

  @Test(timeout = 4000, expected = IllegalStateException.class)
  public void test28()  throws Throwable  {
      Stack stack0 = new Stack(2);
      stack0.push(10);
      stack0.pop();
      stack0.peek();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Stack stack0 = new Stack(10);
      for(int i = 0; i < 10; i++) {
          stack0.push(i * 10);
      }
      assertTrue(stack0.isFull());
      for(int i = 9; i >= 0; i--) {
          int val = stack0.pop();
          assertEquals(i * 10, val);
      }
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Stack stack0 = new Stack(5);
      stack0.push(10);
      stack0.push(20);
      stack0.push(30);
      assertEquals(30, stack0.peek());
      assertEquals(30, stack0.peek());
      assertEquals(3, stack0.size());
  }
}