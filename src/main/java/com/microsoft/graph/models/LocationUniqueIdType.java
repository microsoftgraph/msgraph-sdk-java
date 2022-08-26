package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum LocationUniqueIdType implements ValuedEnum {
    Unknown("unknown"),
    LocationStore("locationStore"),
    Directory("directory"),
    Private_escaped("private_escaped"),
    Bing("bing");
    public final String value;
    LocationUniqueIdType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LocationUniqueIdType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "locationStore": return LocationStore;
            case "directory": return Directory;
            case "private": return Private_escaped;
            case "bing": return Bing;
            default: return null;
        }
    }
}
