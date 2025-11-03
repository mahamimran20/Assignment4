import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ChatGPTTest {
    
    private Stack stack;
    
    @BeforeEach
    public void setUp() {
        stack = new Stack(5);
    }
    
    // Constructor Tests
    @Test
    public void testConstructorCreatesEmptyStack() {
        Stack newStack = new Stack(10);
        assertTrue(newStack.isEmpty());
        assertEquals(0, newStack.size());
    }
    
    @Test
    public void testConstructorWithZeroCapacity() {
        Stack zeroStack = new Stack(0);
        assertTrue(zeroStack.isEmpty());
        assertTrue(zeroStack.isFull());
    }
    
    // Push Tests
    @Test
    public void testPushSingleElement() {
        stack.push(10);
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
        assertEquals(10, stack.peek());
    }
    
    @Test
    public void testPushMultipleElements() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(3, stack.size());
        assertEquals(30, stack.peek());
    }
    
    @Test
    public void testPushToFullCapacity() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertTrue(stack.isFull());
        assertEquals(5, stack.size());
    }
    
    @Test
    public void testPushToFullStackThrowsException() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        IllegalStateException exception = assertThrows(
            IllegalStateException.class,
            () -> stack.push(6)
        );
        assertEquals("Stack is full", exception.getMessage());
    }
    
    @Test
    public void testPushNegativeNumbers() {
        stack.push(-1);
        stack.push(-100);
        assertEquals(-100, stack.peek());
        assertEquals(2, stack.size());
    }
    
    @Test
    public void testPushZero() {
        stack.push(0);
        assertEquals(0, stack.peek());
        assertEquals(1, stack.size());
    }
    
    // Pop Tests
    @Test
    public void testPopSingleElement() {
        stack.push(42);
        int popped = stack.pop();
        assertEquals(42, popped);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }
    
    @Test
    public void testPopMultipleElements() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testPopFromEmptyStackThrowsException() {
        IllegalStateException exception = assertThrows(
            IllegalStateException.class,
            () -> stack.pop()
        );
        assertEquals("Stack is empty", exception.getMessage());
    }
    
    @Test
    public void testPopAfterPushAndPopSequence() {
        stack.push(1);
        stack.pop();
        stack.push(2);
        assertEquals(2, stack.pop());
    }
    
    @Test
    public void testPopReturnsLastInFirstOut() {
        stack.push(100);
        stack.push(200);
        stack.push(300);
        
        assertEquals(300, stack.pop());
        assertEquals(200, stack.pop());
        assertEquals(100, stack.pop());
    }
    
    // Peek Tests
    @Test
    public void testPeekDoesNotRemoveElement() {
        stack.push(50);
        assertEquals(50, stack.peek());
        assertEquals(50, stack.peek());
        assertEquals(1, stack.size());
    }
    
    @Test
    public void testPeekAfterMultiplePushes() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.peek());
        assertEquals(3, stack.size());
    }
    
    @Test
    public void testPeekOnEmptyStackThrowsException() {
        IllegalStateException exception = assertThrows(
            IllegalStateException.class,
            () -> stack.peek()
        );
        assertEquals("Stack is empty", exception.getMessage());
    }
    
    @Test
    public void testPeekAfterPop() {
        stack.push(10);
        stack.push(20);
        stack.pop();
        assertEquals(10, stack.peek());
    }
    
    // isEmpty Tests
    @Test
    public void testIsEmptyOnNewStack() {
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testIsEmptyAfterPush() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
    
    @Test
    public void testIsEmptyAfterPushAndPop() {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testIsEmptyAfterMultiplePushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    
    // isFull Tests
    @Test
    public void testIsFullOnNewStack() {
        assertFalse(stack.isFull());
    }
    
    @Test
    public void testIsFullAfterFillingStack() {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }
    
    @Test
    public void testIsFullAfterPopFromFullStack() {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.pop();
        assertFalse(stack.isFull());
    }
    
    @Test
    public void testIsFullWithCapacityOne() {
        Stack smallStack = new Stack(1);
        assertFalse(smallStack.isFull());
        smallStack.push(1);
        assertTrue(smallStack.isFull());
    }
    
    // size Tests
    @Test
    public void testSizeOnNewStack() {
        assertEquals(0, stack.size());
    }
    
    @Test
    public void testSizeAfterPushes() {
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(2);
        assertEquals(2, stack.size());
        stack.push(3);
        assertEquals(3, stack.size());
    }
    
    @Test
    public void testSizeAfterPops() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }
    
    @Test
    public void testSizeAtFullCapacity() {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(5, stack.size());
    }
    
    // Edge Cases and Integration Tests
    @Test
    public void testAlternatingPushAndPop() {
        stack.push(1);
        assertEquals(1, stack.pop());
        stack.push(2);
        assertEquals(2, stack.pop());
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testFillEmptyFillPattern() {
        // Fill
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
        
        // Empty
        while (!stack.isEmpty()) {
            stack.pop();
        }
        assertTrue(stack.isEmpty());
        
        // Fill again
        for (int i = 0; i < 5; i++) {
            stack.push(i * 10);
        }
        assertTrue(stack.isFull());
        assertEquals(40, stack.peek());
    }
    
    @Test
    public void testBoundaryValues() {
        stack.push(Integer.MAX_VALUE);
        stack.push(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, stack.pop());
        assertEquals(Integer.MAX_VALUE, stack.pop());
    }
    
    @Test
    public void testStackWithLargeCapacity() {
        Stack largeStack = new Stack(1000);
        for (int i = 0; i < 1000; i++) {
            largeStack.push(i);
        }
        assertEquals(1000, largeStack.size());
        assertTrue(largeStack.isFull());
    }
}