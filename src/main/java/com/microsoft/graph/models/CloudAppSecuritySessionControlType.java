package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityContainer singleton. */
public enum CloudAppSecuritySessionControlType implements ValuedEnum {
    McasConfigured("mcasConfigured"),
    MonitorOnly("monitorOnly"),
    BlockDownloads("blockDownloads"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudAppSecuritySessionControlType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudAppSecuritySessionControlType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mcasConfigured": return McasConfigured;
            case "monitorOnly": return MonitorOnly;
            case "blockDownloads": return BlockDownloads;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
