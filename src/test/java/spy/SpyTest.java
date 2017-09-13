package spy;

import api.CUT;
import api.ComponentExtension;
import dummy.ComponentDummyExtensionImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import src.CUTImpl;

public class SpyTest {

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
    public void addSpy() throws Exception {

        final CUT cutSpy = Mockito.spy(new CUTImpl(ce));
        cutSpy.doBusiness(3, null);

        Mockito.verify(cutSpy).doBusiness(3, null);
        //Mockito.verify(ce).add(3);  ->> Error! ce is not spy

    }

    @Test
    public void addSpyCe() throws Exception {

        final ComponentExtension ceSpy =  Mockito.spy(ce);
        final CUT cutSpy = Mockito.spy(new CUTImpl(ceSpy));
        cutSpy.doBusiness(3, null);

        Mockito.verify(cutSpy).doBusiness(3, null);
        Mockito.verify(ceSpy).add(3);
    }
}