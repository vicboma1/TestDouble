package upperCaseExtension;

import java.util.stream.IntStream;

public class UpperCaseExtensionImpl implements UpperCaseExtension {

    public static UpperCaseExtension create() {
        return new UpperCaseExtensionImpl();
    }

    UpperCaseExtensionImpl(){}

    public String firstUpperCase(String input){
        final String[] result = new String[]{""};
        
        IntStream.range(0, input.length())
                .mapToObj(i -> i == 0 ? Character.toUpperCase(input.charAt(i)) : input.charAt(i))
                .forEach(it -> result[0]+=it.toString() );

        return result[0];
    }



}
