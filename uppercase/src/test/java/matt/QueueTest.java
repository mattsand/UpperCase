package matt;
import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {
	@Test
	public void TestQueue(){
		final int max = 3;
		final int num1 = 1;
		final int num2 = 4;
		final int num3 = 3;
		final Queue Qu = new Queue(max);
		Qu.enqueue(num1); Qu.enqueue(num2); Qu.enqueue(num3);
		assertEquals(1, Qu.dequeue());
		assertEquals(4, Qu.dequeue());
		assertEquals(3, Qu.dequeue());
	}
}
