package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ExchangeIdFormat implements ValuedEnum {
    EntryId("entryId"),
    EwsId("ewsId"),
    ImmutableEntryId("immutableEntryId"),
    RestId("restId"),
    RestImmutableEntryId("restImmutableEntryId");
    public final String value;
    ExchangeIdFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExchangeIdFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entryId": return EntryId;
            case "ewsId": return EwsId;
            case "immutableEntryId": return ImmutableEntryId;
            case "restId": return RestId;
            case "restImmutableEntryId": return RestImmutableEntryId;
            default: return null;
        }
    }
}
