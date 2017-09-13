package fake;

import java.util.HashMap;
import java.util.Map;

public class FakeAccountRepository implements AccountRepository {

    private Map<User, AccountImpl> accounts = new HashMap();

    public FakeAccountRepository( Map<User, AccountImpl> accounts ) {
       this.accounts  = accounts;
    }

    public String getPasswordHash(User user) {
        return accounts.get(user).getPasswordHash();
    }

}