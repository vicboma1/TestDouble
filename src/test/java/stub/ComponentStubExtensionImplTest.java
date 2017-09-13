package stub;

import api.CUT;
import api.ComponentExtension;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.CUTImpl;

public class ComponentStubExtensionImplTest {

    private ComponentExtension ce;

    @Before
    public void setUp() throws Exception {
        ce = new ComponentStubExtensionImpl();
    }

    @After
    public void tearDown() throws Exception {
        ce = null;
    }

    @Test
    public void add() throws Exception {
        String result = "java.lang.NullPointerException";

        final CUT cut = new CUTImpl(ce);
        try {
            cut.doBusiness(3, null);
            Assert.fail(String.valueOf(result));
        }
        catch(NullPointerException ee){
            Assert.assertEquals(ee.toString(),result);
        }
        finally{

        }
    }
}