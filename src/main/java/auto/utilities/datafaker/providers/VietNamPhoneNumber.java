package auto.utilities.datafaker.providers;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.nio.file.Paths;
import java.util.Locale;

public class VietNamPhoneNumber extends AbstractProvider<BaseProviders> {
    public VietNamPhoneNumber(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get("src/main/resources/datafaker/vietnam_phone_number.yml"));
    }

    public String mobilePrefix() {
        return this.resolve("vietnam_phone_number.mobile_prefix");
    }

    public String viettelPrefix() {
        return this.resolve("vietnam_phone_number.viettel");
    }

    public String vinaphonePrefix() {
        return this.resolve("vietnam_phone_number.vinaphone");
    }

    /**
     *
     * @return Số điện thoại di động Việt Nam
     */
    public String mobileNumber() {
        return mobilePrefix() + faker.number().digits(7);
    }
}
