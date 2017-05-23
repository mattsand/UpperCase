package matt;
import org.junit.Test;
import static org.junit.Assert.*;
public class UtilTest {
	@Test
	public void TestistErstesHalbjahr(){
		final boolean sollwert = true;
		final int eingabe = 5;
		
		assertEquals(sollwert,Util.istErstesHalbjahr(eingabe));
	}
	
	
}
