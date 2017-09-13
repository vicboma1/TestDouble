package dummy;

import api.ComponentExtension;

/**
 * Adaptación a "Fakes, Stubs, Dummy, Mocks, Doubles and All That..."
 */
public class ComponentDummyExtensionImpl implements ComponentExtension {

    public Integer add(Integer value) {
        if (value == null) {
            throw new IllegalArgumentException("This param must be not null.");
        } else if (value == Integer.MAX_VALUE) {
            throw new IllegalStateException("Overflow value.");
        } else {
            return (value + 1);
        }
    }
}
