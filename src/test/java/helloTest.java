import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class helloTest {
    hello hel=new hello();
   @Test
   public void check(){
        String result = hel.concat("Hello ", "World");
        Assert.assertEquals("Hello World", result);
    }
}

