package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum SettingSourceType implements ValuedEnum {
    DeviceConfiguration("deviceConfiguration"),
    DeviceIntent("deviceIntent");
    public final String value;
    SettingSourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SettingSourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceConfiguration": return DeviceConfiguration;
            case "deviceIntent": return DeviceIntent;
            default: return null;
        }
    }
}
