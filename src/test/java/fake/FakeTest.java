package fake;

import api.CUT;
import api.ComponentExtension;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import src.CUTImpl;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Matchers.anyInt;

public class FakeTest {
    private AccountRepository ar;

    private User user1 = new User("john@bmail.com");
    private User user2 = new User("boby@bmail.com");

    @Before
    public void setUp() throws Exception {
        ar = new FakeAccountRepository(new HashMap<User, AccountImpl>(){
            {
                put(user1,new AdminAccount());
                put(user2,new UserAccount());
            }
        });
    }

    @After
    public void tearDown() throws Exception {
        ar = null;
    }

    @Test
    public void getPasswordHashContainsAdminAccount() throws Exception {
        String expected = "AdminAccount";

        String result = ar.getPasswordHash(user1);

        Assert.assertEquals(expected,result);
    }

    @Test
    public void getPasswordHashContainsUserAccount() throws Exception {
        String expected = "UserAccount";

        String result = ar.getPasswordHash(user2);

        Assert.assertEquals(expected,result);
    }
}
