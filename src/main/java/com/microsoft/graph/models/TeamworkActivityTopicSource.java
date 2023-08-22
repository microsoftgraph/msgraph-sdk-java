package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkActivityTopicSource implements ValuedEnum {
    EntityUrl("entityUrl"),
    Text("text");
    public final String value;
    TeamworkActivityTopicSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkActivityTopicSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entityUrl": return EntityUrl;
            case "text": return Text;
            default: return null;
        }
    }
}
