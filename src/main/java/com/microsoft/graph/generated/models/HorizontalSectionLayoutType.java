package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HorizontalSectionLayoutType implements ValuedEnum {
    None("none"),
    OneColumn("oneColumn"),
    TwoColumns("twoColumns"),
    ThreeColumns("threeColumns"),
    OneThirdLeftColumn("oneThirdLeftColumn"),
    OneThirdRightColumn("oneThirdRightColumn"),
    FullWidth("fullWidth"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HorizontalSectionLayoutType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HorizontalSectionLayoutType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "oneColumn": return OneColumn;
            case "twoColumns": return TwoColumns;
            case "threeColumns": return ThreeColumns;
            case "oneThirdLeftColumn": return OneThirdLeftColumn;
            case "oneThirdRightColumn": return OneThirdRightColumn;
            case "fullWidth": return FullWidth;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
