package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum EdgeSearchEngineType implements ValuedEnum {
    /** Uses factory settings of Edge to assign the default search engine as per the user market */
    Default_escaped("default_escaped"),
    /** Sets Bing as the default search engine */
    Bing("bing");
    public final String value;
    EdgeSearchEngineType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EdgeSearchEngineType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "bing": return Bing;
            default: return null;
        }
    }
}
