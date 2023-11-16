package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * RemoteAssistPartner resources represent the metadata and status of a given Remote Assistance partner service.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteAssistancePartner extends Entity implements Parsable {
    /**
     * Instantiates a new RemoteAssistancePartner and sets the default values.
     */
    public RemoteAssistancePartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteAssistancePartner
     */
    @jakarta.annotation.Nonnull
    public static RemoteAssistancePartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteAssistancePartner();
    }
    /**
     * Gets the displayName property value. Display name of the partner.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastConnectionDateTime", (n) -> { this.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(RemoteAssistanceOnboardingStatus.class)); });
        deserializerMap.put("onboardingUrl", (n) -> { this.setOnboardingUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this.BackingStore.get("lastConnectionDateTime");
    }
    /**
     * Gets the onboardingStatus property value. The current TeamViewer connector status
     * @return a RemoteAssistanceOnboardingStatus
     */
    @jakarta.annotation.Nullable
    public RemoteAssistanceOnboardingStatus getOnboardingStatus() {
        return this.BackingStore.get("onboardingStatus");
    }
    /**
     * Gets the onboardingUrl property value. URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnboardingUrl() {
        return this.BackingStore.get("onboardingUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastConnectionDateTime", this.getLastConnectionDateTime());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeStringValue("onboardingUrl", this.getOnboardingUrl());
    }
    /**
     * Sets the displayName property value. Display name of the partner.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @param value Value to set for the lastConnectionDateTime property.
     */
    public void setLastConnectionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastConnectionDateTime", value);
    }
    /**
     * Sets the onboardingStatus property value. The current TeamViewer connector status
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final RemoteAssistanceOnboardingStatus value) {
        this.BackingStore.set("onboardingStatus", value);
    }
    /**
     * Sets the onboardingUrl property value. URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     * @param value Value to set for the onboardingUrl property.
     */
    public void setOnboardingUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("onboardingUrl", value);
    }
}
