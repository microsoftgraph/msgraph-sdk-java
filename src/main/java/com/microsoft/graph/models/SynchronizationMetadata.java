package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SynchronizationMetadata implements ValuedEnum {
    GalleryApplicationIdentifier("GalleryApplicationIdentifier"),
    GalleryApplicationKey("GalleryApplicationKey"),
    IsOAuthEnabled("IsOAuthEnabled"),
    IsSynchronizationAgentAssignmentRequired("IsSynchronizationAgentAssignmentRequired"),
    IsSynchronizationAgentRequired("IsSynchronizationAgentRequired"),
    IsSynchronizationInPreview("IsSynchronizationInPreview"),
    OAuthSettings("OAuthSettings"),
    SynchronizationLearnMoreIbizaFwLink("SynchronizationLearnMoreIbizaFwLink"),
    ConfigurationFields("ConfigurationFields");
    public final String value;
    SynchronizationMetadata(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationMetadata forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "GalleryApplicationIdentifier": return GalleryApplicationIdentifier;
            case "GalleryApplicationKey": return GalleryApplicationKey;
            case "IsOAuthEnabled": return IsOAuthEnabled;
            case "IsSynchronizationAgentAssignmentRequired": return IsSynchronizationAgentAssignmentRequired;
            case "IsSynchronizationAgentRequired": return IsSynchronizationAgentRequired;
            case "IsSynchronizationInPreview": return IsSynchronizationInPreview;
            case "OAuthSettings": return OAuthSettings;
            case "SynchronizationLearnMoreIbizaFwLink": return SynchronizationLearnMoreIbizaFwLink;
            case "ConfigurationFields": return ConfigurationFields;
            default: return null;
        }
    }
}
