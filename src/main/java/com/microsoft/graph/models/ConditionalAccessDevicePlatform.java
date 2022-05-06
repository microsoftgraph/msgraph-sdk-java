package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityContainer singleton.  */
public enum ConditionalAccessDevicePlatform implements ValuedEnum {
    Android("android"),
    IOS("iOS"),
    Windows("windows"),
    WindowsPhone("windowsPhone"),
    MacOS("macOS"),
    All("all"),
    UnknownFutureValue("unknownFutureValue"),
    Linux("linux");
    public final String value;
    ConditionalAccessDevicePlatform(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConditionalAccessDevicePlatform forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "android": return Android;
            case "iOS": return IOS;
            case "windows": return Windows;
            case "windowsPhone": return WindowsPhone;
            case "macOS": return MacOS;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            case "linux": return Linux;
            default: return null;
        }
    }
}
