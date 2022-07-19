package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum NotificationTemplateBrandingOptions implements ValuedEnum {
    /** No Branding. */
    None("none"),
    /** Include Company Logo. */
    IncludeCompanyLogo("includeCompanyLogo"),
    /** Include Company Name. */
    IncludeCompanyName("includeCompanyName"),
    /** Include Contact Info. */
    IncludeContactInformation("includeContactInformation");
    public final String value;
    NotificationTemplateBrandingOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NotificationTemplateBrandingOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "includeCompanyLogo": return IncludeCompanyLogo;
            case "includeCompanyName": return IncludeCompanyName;
            case "includeContactInformation": return IncludeContactInformation;
            default: return null;
        }
    }
}
