import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {

   @Test
   public void testNum() {
      assertEquals(10, sample.num());
      assertEquals("10じゃない!!",10, sample.num());
   }
}
