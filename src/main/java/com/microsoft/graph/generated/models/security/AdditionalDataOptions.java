package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdditionalDataOptions implements ValuedEnum {
    AllVersions("allVersions"),
    LinkedFiles("linkedFiles"),
    UnknownFutureValue("unknownFutureValue"),
    AdvancedIndexing("advancedIndexing"),
    ListAttachments("listAttachments"),
    HtmlTranscripts("htmlTranscripts"),
    MessageConversationExpansion("messageConversationExpansion"),
    LocationsWithoutHits("locationsWithoutHits"),
    AllItemsInFolder("allItemsInFolder");
    public final String value;
    AdditionalDataOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdditionalDataOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allVersions": return AllVersions;
            case "linkedFiles": return LinkedFiles;
            case "unknownFutureValue": return UnknownFutureValue;
            case "advancedIndexing": return AdvancedIndexing;
            case "listAttachments": return ListAttachments;
            case "htmlTranscripts": return HtmlTranscripts;
            case "messageConversationExpansion": return MessageConversationExpansion;
            case "locationsWithoutHits": return LocationsWithoutHits;
            case "allItemsInFolder": return AllItemsInFolder;
            default: return null;
        }
    }
}
