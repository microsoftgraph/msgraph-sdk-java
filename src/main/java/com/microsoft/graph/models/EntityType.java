package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the query method.  */
public enum EntityType implements ValuedEnum {
    Event("event"),
    Message("message"),
    DriveItem("driveItem"),
    ExternalItem("externalItem"),
    Site("site"),
    List("list"),
    ListItem("listItem"),
    Drive("drive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EntityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EntityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "event": return Event;
            case "message": return Message;
            case "driveItem": return DriveItem;
            case "externalItem": return ExternalItem;
            case "site": return Site;
            case "list": return List;
            case "listItem": return ListItem;
            case "drive": return Drive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
