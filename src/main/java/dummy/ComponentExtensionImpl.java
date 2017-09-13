package dummy;

/**
 * Adaptación a "Fakes, Stubs, Dummy, Mocks, Doubles and All That..."
 */
public class ComponentExtensionImpl implements ComponentExtension {

    public int add(Integer value) {
        if (value == null) {
            throw new IllegalArgumentException("This param must be not null.");
        } else if (value == Integer.MAX_VALUE) {
            throw new IllegalStateException("Overflow value.");
        } else {
            return (value + 1);
        }
    }
}
