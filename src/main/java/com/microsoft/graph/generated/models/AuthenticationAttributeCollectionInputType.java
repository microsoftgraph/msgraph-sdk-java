package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationAttributeCollectionInputType implements ValuedEnum {
    Text("text"),
    RadioSingleSelect("radioSingleSelect"),
    CheckboxMultiSelect("checkboxMultiSelect"),
    Boolean("boolean"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationAttributeCollectionInputType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationAttributeCollectionInputType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "radioSingleSelect": return RadioSingleSelect;
            case "checkboxMultiSelect": return CheckboxMultiSelect;
            case "boolean": return Boolean;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
