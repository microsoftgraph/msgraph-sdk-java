package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton.  */
public enum ProvisioningStepType implements ValuedEnum {
    Import_escaped("import_escaped"),
    Scoping("scoping"),
    Matching("matching"),
    Processing("processing"),
    ReferenceResolution("referenceResolution"),
    Export("export"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningStepType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProvisioningStepType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "import_escaped": return Import_escaped;
            case "scoping": return Scoping;
            case "matching": return Matching;
            case "processing": return Processing;
            case "referenceResolution": return ReferenceResolution;
            case "export": return Export;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
