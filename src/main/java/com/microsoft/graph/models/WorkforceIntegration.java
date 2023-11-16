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
     * Instantiates a new WorkforceIntegration and sets the default values.
     */
    public WorkforceIntegration() {
        super();
        this.setOdataType("#microsoft.graph.workforceIntegration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkforceIntegration
     */
    @jakarta.annotation.Nonnull
    public static WorkforceIntegration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegration();
    }
    /**
     * Gets the apiVersion property value. API version for the call back URL. Start with 1.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getApiVersion() {
        return this.BackingStore.get("apiVersion");
    }
    /**
     * Gets the displayName property value. Name of the workforce integration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the encryption property value. The workforce integration encryption resource.
     * @return a WorkforceIntegrationEncryption
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationEncryption getEncryption() {
        return this.BackingStore.get("encryption");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiVersion", (n) -> { this.setApiVersion(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("encryption", (n) -> { this.setEncryption(n.getObjectValue(WorkforceIntegrationEncryption::createFromDiscriminatorValue)); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("supportedEntities", (n) -> { this.setSupportedEntities(n.getEnumSetValue(WorkforceIntegrationSupportedEntities.class)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.BackingStore.get("isActive");
    }
    /**
     * Gets the supportedEntities property value. The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest, unknownFutureValue.
     * @return a EnumSet<WorkforceIntegrationSupportedEntities>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WorkforceIntegrationSupportedEntities> getSupportedEntities() {
        return this.BackingStore.get("supportedEntities");
    }
    /**
     * Gets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.BackingStore.get("url");
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
        writer.writeObjectValue("encryption", this.getEncryption());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeEnumSetValue("supportedEntities", this.getSupportedEntities());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the apiVersion property value. API version for the call back URL. Start with 1.
     * @param value Value to set for the apiVersion property.
     */
    public void setApiVersion(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("apiVersion", value);
    }
    /**
     * Sets the displayName property value. Name of the workforce integration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the encryption property value. The workforce integration encryption resource.
     * @param value Value to set for the encryption property.
     */
    public void setEncryption(@jakarta.annotation.Nullable final WorkforceIntegrationEncryption value) {
        this.BackingStore.set("encryption", value);
    }
    /**
     * Sets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isActive", value);
    }
    /**
     * Sets the supportedEntities property value. The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest, unknownFutureValue.
     * @param value Value to set for the supportedEntities property.
     */
    public void setSupportedEntities(@jakarta.annotation.Nullable final EnumSet<WorkforceIntegrationSupportedEntities> value) {
        this.BackingStore.set("supportedEntities", value);
    }
    /**
     * Sets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("url", value);
    }
}
