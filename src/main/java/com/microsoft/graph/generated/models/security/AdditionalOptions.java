package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdditionalOptions implements ValuedEnum {
    None("none"),
    TeamsAndYammerConversations("teamsAndYammerConversations"),
    CloudAttachments("cloudAttachments"),
    AllDocumentVersions("allDocumentVersions"),
    SubfolderContents("subfolderContents"),
    ListAttachments("listAttachments"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AdditionalOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdditionalOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "teamsAndYammerConversations": return TeamsAndYammerConversations;
            case "cloudAttachments": return CloudAttachments;
            case "allDocumentVersions": return AllDocumentVersions;
            case "subfolderContents": return SubfolderContents;
            case "listAttachments": return ListAttachments;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
