package auto.utilities.datafaker.providers;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.nio.file.Paths;
import java.util.Locale;

public class VietNamesName extends AbstractProvider<BaseProviders> {
    public VietNamesName(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get("src/main/resources/datafaker/vietnam_phone_number.yml"));
    }

    public String firstName() {
        return resolve("vietnamese_name.first_name");
    }

    public String middleName() {
        return resolve("vietnamese_name.middle_name");
    }

    public String lastName() {
        return resolve("vietnamese_name.last_name");
    }

    public String fullName() {
        return this.resolve("vietnamese_name.full_name");
    }
}
