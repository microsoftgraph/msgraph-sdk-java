package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum EditionUpgradeLicenseType implements ValuedEnum {
    /** Product Key Type */
    ProductKey("productKey"),
    /** License File Type */
    LicenseFile("licenseFile");
    public final String value;
    EditionUpgradeLicenseType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EditionUpgradeLicenseType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "productKey": return ProductKey;
            case "licenseFile": return LicenseFile;
            default: return null;
        }
    }
}
