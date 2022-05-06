package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum MobileAppPublishingState implements ValuedEnum {
    NotPublished("notPublished"),
    Processing("processing"),
    Published("published");
    public final String value;
    MobileAppPublishingState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileAppPublishingState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notPublished": return NotPublished;
            case "processing": return Processing;
            case "published": return Published;
            default: return null;
        }
    }
}
