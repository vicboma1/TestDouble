package fake;

public interface AccountRepository{
    String getPasswordHash(User user);
}