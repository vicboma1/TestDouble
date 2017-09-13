package mock;

import api.CUT;
import api.ComponentExtension;
import dummy.ComponentDummyExtensionImpl;
import fake.FakeHttpServletRequest;
import javafx.concurrent.Task;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import src.CUTImpl;

import static org.mockito.Matchers.anyInt;

public class MockTest {

    private ComponentExtension ce;
    private CUT cut;

    @Before
    public void setUp() throws Exception {
        ce = Mockito.mock(ComponentExtension.class);
        cut = new CUTImpl(ce);
    }

    @After
    public void tearDown() throws Exception {
        ce = null;
        cut = null;
    }

    @Test
    public void add() throws Exception {

        Mockito.when(ce.add(Integer.MIN_VALUE)).thenReturn(Integer.MIN_VALUE + 1);
        Mockito.when(ce.add(3)).thenReturn(3);
        Mockito.when(ce.add(123)).thenReturn(124);

        Assert.assertEquals("MIN_VALUE add(Integer.MIN_VALUE) != Integer.MIN_VALUE + 1", java.util.Optional.of(Integer.MIN_VALUE + 1), java.util.Optional.of(ce.add(Integer.MIN_VALUE)));
        Assert.assertNotEquals("4 != add(3)", "4", cut.doBusiness(3, 1));
        Assert.assertEquals("add(123) != 124", "124", cut.doBusiness(123, 1));

        Mockito.verify(ce).add(Matchers.eq(Integer.MIN_VALUE));
        Mockito.verify(ce, Mockito.times(3)).add(anyInt());
    }
}
