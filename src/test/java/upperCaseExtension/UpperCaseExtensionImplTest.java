package upperCaseExtension;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseExtensionImplTest {

    @Test
    public void firstUpperCase() throws Exception {

        // Arrange
        String name = "victorBolinches";
        final UpperCaseExtension normalize = UpperCaseExtensionImpl.create();

        // Act
        String result = normalize.firstUpperCase(name);

        // Assert
        Assert.assertEquals("VictorBolinches" , result);


    }

}