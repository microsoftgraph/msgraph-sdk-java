package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApplicationDataType implements ValuedEnum {
    None("none"),
    CodingFiles("codingFiles"),
    CreditCards("creditCards"),
    DatabaseFiles("databaseFiles"),
    Documents("documents"),
    MediaFiles("mediaFiles"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationDataType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationDataType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "codingFiles": return CodingFiles;
            case "creditCards": return CreditCards;
            case "databaseFiles": return DatabaseFiles;
            case "documents": return Documents;
            case "mediaFiles": return MediaFiles;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
