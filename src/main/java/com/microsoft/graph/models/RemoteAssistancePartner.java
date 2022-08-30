package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** RemoteAssistPartner resources represent the metadata and status of a given Remote Assistance partner service. */
public class RemoteAssistancePartner extends Entity implements Parsable {
    /** Display name of the partner. */
    private String _displayName;
    /** Timestamp of the last request sent to Intune by the TEM partner. */
    private OffsetDateTime _lastConnectionDateTime;
    /** The current TeamViewer connector status */
    private RemoteAssistanceOnboardingStatus _onboardingStatus;
    /** URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service. */
    private String _onboardingUrl;
    /**
     * Instantiates a new remoteAssistancePartner and sets the default values.
     * @return a void
     */
    public RemoteAssistancePartner() {
        super();
        this.setOdataType("#microsoft.graph.remoteAssistancePartner");
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
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoteAssistancePartner currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastConnectionDateTime", (n) -> { currentObject.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
            this.put("onboardingStatus", (n) -> { currentObject.setOnboardingStatus(n.getEnumValue(RemoteAssistanceOnboardingStatus.class)); });
            this.put("onboardingUrl", (n) -> { currentObject.setOnboardingUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this._lastConnectionDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The current TeamViewer connector status
     * @return a remoteAssistanceOnboardingStatus
     */
    @javax.annotation.Nullable
    public RemoteAssistanceOnboardingStatus getOnboardingStatus() {
        return this._onboardingStatus;
    }
    /**
     * Gets the onboardingUrl property value. URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnboardingUrl() {
        return this._onboardingUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConnectionDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The current TeamViewer connector status
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    public void setOnboardingStatus(@javax.annotation.Nullable final RemoteAssistanceOnboardingStatus value) {
        this._onboardingStatus = value;
    }
    /**
     * Sets the onboardingUrl property value. URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     * @param value Value to set for the onboardingUrl property.
     * @return a void
     */
    public void setOnboardingUrl(@javax.annotation.Nullable final String value) {
        this._onboardingUrl = value;
    }
}
