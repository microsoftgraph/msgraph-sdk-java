package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamworkActivityTopicSource implements ValuedEnum {
    EntityUrl("entityUrl"),
    Text("text");
    public final String value;
    TeamworkActivityTopicSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkActivityTopicSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entityUrl": return EntityUrl;
            case "text": return Text;
            default: return null;
        }
    }
}
