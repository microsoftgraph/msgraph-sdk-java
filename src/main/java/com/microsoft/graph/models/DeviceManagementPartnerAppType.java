package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementPartnerAppType implements ValuedEnum {
    Unknown("unknown"),
    SingleTenantApp("singleTenantApp"),
    MultiTenantApp("multiTenantApp");
    public final String value;
    DeviceManagementPartnerAppType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementPartnerAppType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "singleTenantApp": return SingleTenantApp;
            case "multiTenantApp": return MultiTenantApp;
            default: return null;
        }
    }
}
