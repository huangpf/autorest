package fixtures.url;

import fixtures.url.models.UriColor;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PathsTests {
    private static AutoRestUrlTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestUrlTestServiceImpl("http://localhost.:3000");
    }

    @Test
    public void getBooleanTrue() throws Exception {
        client.getPathsOperations().getBooleanTrue(true);
    }

    @Test
    public void getBooleanFalse() throws Exception {
        client.getPathsOperations().getBooleanFalse(false);
    }

    @Test
    public void getIntOneMillion() throws Exception {
        client.getPathsOperations().getIntOneMillion(1000000);
    }

    @Test
    public void getIntNegativeOneMillion() throws Exception {
        client.getPathsOperations().getIntNegativeOneMillion(-1000000);
    }

    @Test
    public void getTenBillion() throws Exception {
        client.getPathsOperations().getTenBillion(10000000000L);
    }

    @Test
    public void getNegativeTenBillion() throws Exception {
        client.getPathsOperations().getNegativeTenBillion(-10000000000L);
    }

    @Test
    public void floatScientificPositive() throws Exception {
        client.getPathsOperations().floatScientificPositive(1.034E+20);
    }

    @Test
    public void floatScientificNegative() throws Exception {
        client.getPathsOperations().floatScientificNegative(-1.034E-20);
    }

    @Test
    public void doubleDecimalPositive() throws Exception {
        client.getPathsOperations().doubleDecimalPositive(9999999.999);
    }

    @Test
    public void doubleDecimalNegative() throws Exception {
        client.getPathsOperations().doubleDecimalNegative(-9999999.999);
    }

    @Test
    public void stringUrlEncoded() throws Exception {
        client.getPathsOperations().stringUrlEncoded("begin!*'();:@ &=+$,/?#[]end");
    }

    @Test
    public void stringEmpty() throws Exception {
        client.getPathsOperations().stringEmpty("");
    }

    @Test
    public void stringNull() throws Exception {
        try {
            client.getPathsOperations().stringNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter stringPath is required"));
        }
    }

    @Test
    public void enumValid() throws Exception {
        client.getPathsOperations().enumValid(UriColor.GREEN_COLOR);
    }

    @Test
    public void enumNull() throws Exception {
        try {
            client.getPathsOperations().enumNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter enumPath is required"));
        }
    }

    @Test
    public void byteMultiByte() throws Exception {
        client.getPathsOperations().byteMultiByte("啊齄丂狛狜隣郎隣兀﨩".getBytes("UTF-8"));
    }

    @Test
    public void byteEmpty() throws Exception {
        client.getPathsOperations().byteEmpty("".getBytes("UTF-8"));
    }

    @Test
    public void byteNull() throws Exception {
        try {
            client.getPathsOperations().byteNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter bytePath is required"));
        }
    }

    @Test
    public void dateValid() throws Exception {
        client.getPathsOperations().dateValid(new LocalDate(2012, 1, 1));
    }

    @Test
    public void dateNull() throws Exception {
        try {
            client.getPathsOperations().dateNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter datePath is required"));
        }
    }

    @Test
    public void dateTimeValid() throws Exception {
        client.getPathsOperations().dateTimeValid(new DateTime(2012, 1, 1, 1, 1, 1, DateTimeZone.UTC));
    }

    @Test
    public void dateTimeNull() throws Exception {
        try {
            client.getPathsOperations().dateTimeNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter dateTimePath is required"));
        }
    }
}
