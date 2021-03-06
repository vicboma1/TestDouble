package src;

import api.CUT;
import api.ComponentExtension;

/**
 * Adaptación a "Fakes, Stubs, Dummy, Mocks, Doubles and All That..."
 */
    public class CUTImpl implements CUT {

        private ComponentExtension component;

        public CUTImpl(ComponentExtension c) {
            this.component = c;
        }

        @Override
        public String doBusiness(Integer param, Integer delta) {
            final int res = component.add(param);
            return String.valueOf(res);
        }
    }
