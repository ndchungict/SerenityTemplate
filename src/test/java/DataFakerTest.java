
import auto.utilities.datafaker.DataFaker;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
public class DataFakerTest {
    @Test
    public void abc(){
        DataFaker faker = new DataFaker();
        log.info(faker.vnNationalID().newID());
        log.info(faker.vnName().fullName());
    }
}
