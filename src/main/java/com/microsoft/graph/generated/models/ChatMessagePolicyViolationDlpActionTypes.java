package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatMessagePolicyViolationDlpActionTypes implements ValuedEnum {
    None("none"),
    NotifySender("notifySender"),
    BlockAccess("blockAccess"),
    BlockAccessExternal("blockAccessExternal");
    public final String value;
    ChatMessagePolicyViolationDlpActionTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatMessagePolicyViolationDlpActionTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "notifySender": return NotifySender;
            case "blockAccess": return BlockAccess;
            case "blockAccessExternal": return BlockAccessExternal;
            default: return null;
        }
    }
}
