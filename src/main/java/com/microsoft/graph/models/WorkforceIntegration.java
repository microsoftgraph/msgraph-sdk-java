package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkforceIntegration extends ChangeTrackedEntity implements Parsable {
    /**
     * API version for the call back URL. Start with 1.
     */
    private Integer apiVersion;
    /**
     * Name of the workforce integration.
     */
    private String displayName;
    /**
     * The workforce integration encryption resource.
     */
    private WorkforceIntegrationEncryption encryption;
    /**
     * Indicates whether this workforce integration is currently active and available.
     */
    private Boolean isActive;
    /**
     * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest, unknownFutureValue.
     */
    private WorkforceIntegrationSupportedEntities supportedEntities;
    /**
     * Workforce Integration URL for callbacks from the Shifts service.
     */
    private String url;
    /**
     * Instantiates a new workforceIntegration and sets the default values.
     */
    public WorkforceIntegration() {
        super();
        this.setOdataType("#microsoft.graph.workforceIntegration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workforceIntegration
     */
    @jakarta.annotation.Nonnull
    public static WorkforceIntegration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegration();
    }
    /**
     * Gets the apiVersion property value. API version for the call back URL. Start with 1.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Gets the displayName property value. Name of the workforce integration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the encryption property value. The workforce integration encryption resource.
     * @return a workforceIntegrationEncryption
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationEncryption getEncryption() {
        return this.encryption;
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
        deserializerMap.put("supportedEntities", (n) -> { this.setSupportedEntities(n.getEnumValue(WorkforceIntegrationSupportedEntities.class)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the supportedEntities property value. The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest, unknownFutureValue.
     * @return a workforceIntegrationSupportedEntities
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationSupportedEntities getSupportedEntities() {
        return this.supportedEntities;
    }
    /**
     * Gets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeEnumValue("supportedEntities", this.getSupportedEntities());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the apiVersion property value. API version for the call back URL. Start with 1.
     * @param value Value to set for the apiVersion property.
     */
    public void setApiVersion(@jakarta.annotation.Nullable final Integer value) {
        this.apiVersion = value;
    }
    /**
     * Sets the displayName property value. Name of the workforce integration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the encryption property value. The workforce integration encryption resource.
     * @param value Value to set for the encryption property.
     */
    public void setEncryption(@jakarta.annotation.Nullable final WorkforceIntegrationEncryption value) {
        this.encryption = value;
    }
    /**
     * Sets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the supportedEntities property value. The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest, unknownFutureValue.
     * @param value Value to set for the supportedEntities property.
     */
    public void setSupportedEntities(@jakarta.annotation.Nullable final WorkforceIntegrationSupportedEntities value) {
        this.supportedEntities = value;
    }
    /**
     * Sets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
