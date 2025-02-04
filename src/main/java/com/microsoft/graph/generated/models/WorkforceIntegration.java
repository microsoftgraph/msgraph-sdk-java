package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkforceIntegration extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link WorkforceIntegration} and sets the default values.
     */
    public WorkforceIntegration() {
        super();
        this.setOdataType("#microsoft.graph.workforceIntegration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkforceIntegration}
     */
    @jakarta.annotation.Nonnull
    public static WorkforceIntegration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegration();
    }
    /**
     * Gets the apiVersion property value. API version for the callback URL. Start with 1.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getApiVersion() {
        return this.backingStore.get("apiVersion");
    }
    /**
     * Gets the displayName property value. Name of the workforce integration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the eligibilityFilteringEnabledEntities property value. Support to view eligibility-filtered results. Possible values are: none, swapRequest, offerShiftRequest, unknownFutureValue, timeOffReason. Use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: timeOffReason.
     * @return a {@link EnumSet<EligibilityFilteringEnabledEntities>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<EligibilityFilteringEnabledEntities> getEligibilityFilteringEnabledEntities() {
        return this.backingStore.get("eligibilityFilteringEnabledEntities");
    }
    /**
     * Gets the encryption property value. The workforce integration encryption resource.
     * @return a {@link WorkforceIntegrationEncryption}
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationEncryption getEncryption() {
        return this.backingStore.get("encryption");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiVersion", (n) -> { this.setApiVersion(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("eligibilityFilteringEnabledEntities", (n) -> { this.setEligibilityFilteringEnabledEntities(n.getEnumSetValue(EligibilityFilteringEnabledEntities::forValue)); });
        deserializerMap.put("encryption", (n) -> { this.setEncryption(n.getObjectValue(WorkforceIntegrationEncryption::createFromDiscriminatorValue)); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("supportedEntities", (n) -> { this.setSupportedEntities(n.getEnumSetValue(WorkforceIntegrationSupportedEntities::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the supportedEntities property value. The Shifts entities supported for synchronous change notifications. Shifts call back to the provided URL when client changes occur to the entities specified in this property. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openShift, openShiftRequest, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard , timeOffReason , timeOff , timeOffRequest.
     * @return a {@link EnumSet<WorkforceIntegrationSupportedEntities>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WorkforceIntegrationSupportedEntities> getSupportedEntities() {
        return this.backingStore.get("supportedEntities");
    }
    /**
     * Gets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("apiVersion", this.getApiVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("eligibilityFilteringEnabledEntities", this.getEligibilityFilteringEnabledEntities());
        writer.writeObjectValue("encryption", this.getEncryption());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeEnumSetValue("supportedEntities", this.getSupportedEntities());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the apiVersion property value. API version for the callback URL. Start with 1.
     * @param value Value to set for the apiVersion property.
     */
    public void setApiVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("apiVersion", value);
    }
    /**
     * Sets the displayName property value. Name of the workforce integration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the eligibilityFilteringEnabledEntities property value. Support to view eligibility-filtered results. Possible values are: none, swapRequest, offerShiftRequest, unknownFutureValue, timeOffReason. Use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: timeOffReason.
     * @param value Value to set for the eligibilityFilteringEnabledEntities property.
     */
    public void setEligibilityFilteringEnabledEntities(@jakarta.annotation.Nullable final EnumSet<EligibilityFilteringEnabledEntities> value) {
        this.backingStore.set("eligibilityFilteringEnabledEntities", value);
    }
    /**
     * Sets the encryption property value. The workforce integration encryption resource.
     * @param value Value to set for the encryption property.
     */
    public void setEncryption(@jakarta.annotation.Nullable final WorkforceIntegrationEncryption value) {
        this.backingStore.set("encryption", value);
    }
    /**
     * Sets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the supportedEntities property value. The Shifts entities supported for synchronous change notifications. Shifts call back to the provided URL when client changes occur to the entities specified in this property. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openShift, openShiftRequest, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard , timeOffReason , timeOff , timeOffRequest.
     * @param value Value to set for the supportedEntities property.
     */
    public void setSupportedEntities(@jakarta.annotation.Nullable final EnumSet<WorkforceIntegrationSupportedEntities> value) {
        this.backingStore.set("supportedEntities", value);
    }
    /**
     * Sets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
