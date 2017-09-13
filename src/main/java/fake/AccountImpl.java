package fake;

public class AccountImpl implements Account {

    protected String name;

    public AccountImpl(){
    }

    public String getPasswordHash(){
        return name;
    }
}
