package auto.utilities.datafaker;

import java.util.UUID;
import auto.utilities.datafaker.providers.VietNamNationalID;
import auto.utilities.datafaker.providers.VietNamPhoneNumber;
import auto.utilities.datafaker.providers.VietNamesName;

public class DataFaker extends net.datafaker.Faker {
    public String randomUUID() {
        return UUID.randomUUID().toString();
    }

    public VietNamesName vnName() {
        return getProvider(VietNamesName.class, VietNamesName::new, this);
    }

    public VietNamPhoneNumber vnPhoneNumber() {
        return getProvider(VietNamPhoneNumber.class, VietNamPhoneNumber::new, this);
    }

    public VietNamNationalID vnNationalID() {
        return getProvider(VietNamNationalID.class, VietNamNationalID::new, this);
    }

}
