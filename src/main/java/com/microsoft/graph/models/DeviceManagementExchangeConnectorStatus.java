package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementExchangeConnectorStatus implements ValuedEnum {
    None("none"),
    ConnectionPending("connectionPending"),
    Connected("connected"),
    Disconnected("disconnected");
    public final String value;
    DeviceManagementExchangeConnectorStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeConnectorStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "connectionPending": return ConnectionPending;
            case "connected": return Connected;
            case "disconnected": return Disconnected;
            default: return null;
        }
    }
}
