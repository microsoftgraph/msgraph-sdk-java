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
public class ContentCustomization implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ContentCustomization} and sets the default values.
     */
    public ContentCustomization() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentCustomization}
     */
    @jakarta.annotation.Nonnull
    public static ContentCustomization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentCustomization();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the attributeCollection property value. Represents the content options of External Identities to be customized throughout the authentication flow for a tenant.
     * @return a {@link java.util.List<KeyValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getAttributeCollection() {
        return this.backingStore.get("attributeCollection");
    }
    /**
     * Gets the attributeCollectionRelativeUrl property value. A relative URL for the content options of External Identities to be customized throughout the authentication flow for a tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttributeCollectionRelativeUrl() {
        return this.backingStore.get("attributeCollectionRelativeUrl");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("attributeCollection", (n) -> { this.setAttributeCollection(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeCollectionRelativeUrl", (n) -> { this.setAttributeCollectionRelativeUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("registrationCampaign", (n) -> { this.setRegistrationCampaign(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationCampaignRelativeUrl", (n) -> { this.setRegistrationCampaignRelativeUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the registrationCampaign property value. The registrationCampaign property
     * @return a {@link java.util.List<KeyValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getRegistrationCampaign() {
        return this.backingStore.get("registrationCampaign");
    }
    /**
     * Gets the registrationCampaignRelativeUrl property value. The registrationCampaignRelativeUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegistrationCampaignRelativeUrl() {
        return this.backingStore.get("registrationCampaignRelativeUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributeCollection", this.getAttributeCollection());
        writer.writeStringValue("attributeCollectionRelativeUrl", this.getAttributeCollectionRelativeUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("registrationCampaign", this.getRegistrationCampaign());
        writer.writeStringValue("registrationCampaignRelativeUrl", this.getRegistrationCampaignRelativeUrl());
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
     * Sets the attributeCollection property value. Represents the content options of External Identities to be customized throughout the authentication flow for a tenant.
     * @param value Value to set for the attributeCollection property.
     */
    public void setAttributeCollection(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("attributeCollection", value);
    }
    /**
     * Sets the attributeCollectionRelativeUrl property value. A relative URL for the content options of External Identities to be customized throughout the authentication flow for a tenant.
     * @param value Value to set for the attributeCollectionRelativeUrl property.
     */
    public void setAttributeCollectionRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attributeCollectionRelativeUrl", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the registrationCampaign property value. The registrationCampaign property
     * @param value Value to set for the registrationCampaign property.
     */
    public void setRegistrationCampaign(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("registrationCampaign", value);
    }
    /**
     * Sets the registrationCampaignRelativeUrl property value. The registrationCampaignRelativeUrl property
     * @param value Value to set for the registrationCampaignRelativeUrl property.
     */
    public void setRegistrationCampaignRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("registrationCampaignRelativeUrl", value);
    }
}
