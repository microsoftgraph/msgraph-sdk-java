package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * App configuration key types.
 */
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MdmAppConfigKeyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
