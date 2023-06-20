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
public class RemoteAssistancePartner extends Entity implements Parsable {
    /** Display name of the partner. */
    private String displayName;
    /** Timestamp of the last request sent to Intune by the TEM partner. */
    private OffsetDateTime lastConnectionDateTime;
    /** The current TeamViewer connector status */
    private RemoteAssistanceOnboardingStatus onboardingStatus;
    /** URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service. */
    private String onboardingUrl;
    /**
     * Instantiates a new remoteAssistancePartner and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RemoteAssistancePartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteAssistancePartner
     */
    @javax.annotation.Nonnull
    public static RemoteAssistancePartner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteAssistancePartner();
    }
    /**
     * Gets the displayName property value. Display name of the partner.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this.lastConnectionDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The current TeamViewer connector status
     * @return a RemoteAssistanceOnboardingStatus
     */
    @javax.annotation.Nullable
    public RemoteAssistanceOnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the onboardingUrl property value. URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnboardingUrl() {
        return this.onboardingUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastConnectionDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The current TeamViewer connector status
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardingStatus(@javax.annotation.Nullable final RemoteAssistanceOnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the onboardingUrl property value. URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     * @param value Value to set for the onboardingUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardingUrl(@javax.annotation.Nullable final String value) {
        this.onboardingUrl = value;
    }
}
