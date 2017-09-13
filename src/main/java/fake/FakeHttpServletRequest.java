package fake;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public abstract class FakeHttpServletRequest implements HttpServletRequest {
    private final Map<String, Object> attributes = new LinkedHashMap();

    @Override public Object getAttribute(String name) {
        return attributes.get(name);
    }

    @Override public Enumeration<String> getAttributeNames() {
        return Collections.enumeration(attributes.keySet());
    }

    @Override public void setAttribute(String name, Object value) {
        attributes.put(name, value);
    }
}

