package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum MdmAppConfigKeyType implements ValuedEnum {
    StringType("stringType"),
    IntegerType("integerType"),
    RealType("realType"),
    BooleanType("booleanType"),
    TokenType("tokenType");
    public final String value;
    MdmAppConfigKeyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MdmAppConfigKeyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "stringType": return StringType;
            case "integerType": return IntegerType;
            case "realType": return RealType;
            case "booleanType": return BooleanType;
            case "tokenType": return TokenType;
            default: return null;
        }
    }
}
