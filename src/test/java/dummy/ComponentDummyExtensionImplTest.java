package dummy;

import api.CUT;
import api.ComponentExtension;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.CUTImpl;

public class ComponentDummyExtensionImplTest {

    private ComponentExtension ce;

    @Before
    public void setUp() throws Exception {
        ce = new ComponentDummyExtensionImpl();
    }

    @After
    public void tearDown() throws Exception {
        ce = null;
    }

    @Test
    public void add() throws Exception {
        final Integer expected = 4;

        final CUT cut = new CUTImpl(ce);
        final Integer result = Integer.valueOf( cut.doBusiness("3", null));

        Assert.assertEquals("add(3) != 4", result, expected);
    }
}