package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessSessionControls implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ConditionalAccessSessionControls and sets the default values.
     */
    public ConditionalAccessSessionControls() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessSessionControls
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessSessionControls createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessSessionControls();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the applicationEnforcedRestrictions property value. Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session control.
     * @return a ApplicationEnforcedRestrictionsSessionControl
     */
    @jakarta.annotation.Nullable
    public ApplicationEnforcedRestrictionsSessionControl getApplicationEnforcedRestrictions() {
        return this.backingStore.get("applicationEnforcedRestrictions");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cloudAppSecurity property value. Session control to apply cloud app security.
     * @return a CloudAppSecuritySessionControl
     */
    @jakarta.annotation.Nullable
    public CloudAppSecuritySessionControl getCloudAppSecurity() {
        return this.backingStore.get("cloudAppSecurity");
    }
    /**
     * Gets the disableResilienceDefaults property value. Session control that determines whether it is acceptable for Microsoft Entra ID to extend existing sessions based on information collected prior to an outage or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableResilienceDefaults() {
        return this.backingStore.get("disableResilienceDefaults");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("applicationEnforcedRestrictions", (n) -> { this.setApplicationEnforcedRestrictions(n.getObjectValue(ApplicationEnforcedRestrictionsSessionControl::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudAppSecurity", (n) -> { this.setCloudAppSecurity(n.getObjectValue(CloudAppSecuritySessionControl::createFromDiscriminatorValue)); });
        deserializerMap.put("disableResilienceDefaults", (n) -> { this.setDisableResilienceDefaults(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("persistentBrowser", (n) -> { this.setPersistentBrowser(n.getObjectValue(PersistentBrowserSessionControl::createFromDiscriminatorValue)); });
        deserializerMap.put("signInFrequency", (n) -> { this.setSignInFrequency(n.getObjectValue(SignInFrequencySessionControl::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the persistentBrowser property value. Session control to define whether to persist cookies or not. All apps should be selected for this session control to work correctly.
     * @return a PersistentBrowserSessionControl
     */
    @jakarta.annotation.Nullable
    public PersistentBrowserSessionControl getPersistentBrowser() {
        return this.backingStore.get("persistentBrowser");
    }
    /**
     * Gets the signInFrequency property value. Session control to enforce signin frequency.
     * @return a SignInFrequencySessionControl
     */
    @jakarta.annotation.Nullable
    public SignInFrequencySessionControl getSignInFrequency() {
        return this.backingStore.get("signInFrequency");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applicationEnforcedRestrictions", this.getApplicationEnforcedRestrictions());
        writer.writeObjectValue("cloudAppSecurity", this.getCloudAppSecurity());
        writer.writeBooleanValue("disableResilienceDefaults", this.getDisableResilienceDefaults());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("persistentBrowser", this.getPersistentBrowser());
        writer.writeObjectValue("signInFrequency", this.getSignInFrequency());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the applicationEnforcedRestrictions property value. Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session control.
     * @param value Value to set for the applicationEnforcedRestrictions property.
     */
    public void setApplicationEnforcedRestrictions(@jakarta.annotation.Nullable final ApplicationEnforcedRestrictionsSessionControl value) {
        this.backingStore.set("applicationEnforcedRestrictions", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cloudAppSecurity property value. Session control to apply cloud app security.
     * @param value Value to set for the cloudAppSecurity property.
     */
    public void setCloudAppSecurity(@jakarta.annotation.Nullable final CloudAppSecuritySessionControl value) {
        this.backingStore.set("cloudAppSecurity", value);
    }
    /**
     * Sets the disableResilienceDefaults property value. Session control that determines whether it is acceptable for Microsoft Entra ID to extend existing sessions based on information collected prior to an outage or not.
     * @param value Value to set for the disableResilienceDefaults property.
     */
    public void setDisableResilienceDefaults(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableResilienceDefaults", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the persistentBrowser property value. Session control to define whether to persist cookies or not. All apps should be selected for this session control to work correctly.
     * @param value Value to set for the persistentBrowser property.
     */
    public void setPersistentBrowser(@jakarta.annotation.Nullable final PersistentBrowserSessionControl value) {
        this.backingStore.set("persistentBrowser", value);
    }
    /**
     * Sets the signInFrequency property value. Session control to enforce signin frequency.
     * @param value Value to set for the signInFrequency property.
     */
    public void setSignInFrequency(@jakarta.annotation.Nullable final SignInFrequencySessionControl value) {
        this.backingStore.set("signInFrequency", value);
    }
}
