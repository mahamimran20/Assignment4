import org.junit.Test;
import static org.junit.Assert.*;

public class RegressionTest0 {
    
    @Test
    public void test01() {
        Stack stack0 = new Stack(5);
        assertTrue(stack0.isEmpty());
    }
    
    @Test
    public void test02() {
        Stack stack0 = new Stack(10);
        stack0.push(1);
        assertEquals(1, stack0.size());
    }
    
    @Test
    public void test03() {
        Stack stack0 = new Stack(3);
        stack0.push(10);
        stack0.push(20);
        assertEquals(20, stack0.peek());
    }
    
    @Test
    public void test04() {
        Stack stack0 = new Stack(5);
        stack0.push(100);
        int result = stack0.pop();
        assertEquals(100, result);
    }
    
    @Test
    public void test05() {
        Stack stack0 = new Stack(2);
        stack0.push(1);
        stack0.push(2);
        assertTrue(stack0.isFull());
    }
    
    @Test
    public void test06() {
        Stack stack0 = new Stack(1);
        stack0.push(99);
        assertFalse(stack0.isEmpty());
        assertTrue(stack0.isFull());
    }
    
    @Test(expected = IllegalStateException.class)
    public void test07() {
        Stack stack0 = new Stack(1);
        stack0.push(1);
        stack0.push(2); // Should throw exception
    }
    
    @Test(expected = IllegalStateException.class)
    public void test08() {
        Stack stack0 = new Stack(5);
        stack0.pop(); // Should throw exception - empty stack
    }
}