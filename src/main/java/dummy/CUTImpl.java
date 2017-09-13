package dummy;

/**
 * Adaptación a "Fakes, Stubs, Dummy, Mocks, Doubles and All That..."
 */
    public class CUTImpl implements CUT {

        private ComponentExtension component;

        public CUTImpl(ComponentExtension c) {
            this.component = c;
        }

        @Override
        public String doBusiness(String param, Integer delta) {
            final int res = component.add(Integer.valueOf(param));
            return String.valueOf(res);
        }
    }
