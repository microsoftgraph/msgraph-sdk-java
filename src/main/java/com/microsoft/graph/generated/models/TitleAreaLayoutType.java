package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TitleAreaLayoutType implements ValuedEnum {
    ImageAndTitle("imageAndTitle"),
    Plain("plain"),
    ColorBlock("colorBlock"),
    Overlap("overlap"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TitleAreaLayoutType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TitleAreaLayoutType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "imageAndTitle": return ImageAndTitle;
            case "plain": return Plain;
            case "colorBlock": return ColorBlock;
            case "overlap": return Overlap;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
