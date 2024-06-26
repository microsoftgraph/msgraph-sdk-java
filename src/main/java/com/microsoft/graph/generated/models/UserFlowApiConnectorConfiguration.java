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
public class UserFlowApiConnectorConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserFlowApiConnectorConfiguration} and sets the default values.
     */
    public UserFlowApiConnectorConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserFlowApiConnectorConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static UserFlowApiConnectorConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFlowApiConnectorConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("postAttributeCollection", (n) -> { this.setPostAttributeCollection(n.getObjectValue(IdentityApiConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("postFederationSignup", (n) -> { this.setPostFederationSignup(n.getObjectValue(IdentityApiConnector::createFromDiscriminatorValue)); });
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
     * Gets the postAttributeCollection property value. The postAttributeCollection property
     * @return a {@link IdentityApiConnector}
     */
    @jakarta.annotation.Nullable
    public IdentityApiConnector getPostAttributeCollection() {
        return this.backingStore.get("postAttributeCollection");
    }
    /**
     * Gets the postFederationSignup property value. The postFederationSignup property
     * @return a {@link IdentityApiConnector}
     */
    @jakarta.annotation.Nullable
    public IdentityApiConnector getPostFederationSignup() {
        return this.backingStore.get("postFederationSignup");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("postAttributeCollection", this.getPostAttributeCollection());
        writer.writeObjectValue("postFederationSignup", this.getPostFederationSignup());
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
     * Sets the postAttributeCollection property value. The postAttributeCollection property
     * @param value Value to set for the postAttributeCollection property.
     */
    public void setPostAttributeCollection(@jakarta.annotation.Nullable final IdentityApiConnector value) {
        this.backingStore.set("postAttributeCollection", value);
    }
    /**
     * Sets the postFederationSignup property value. The postFederationSignup property
     * @param value Value to set for the postFederationSignup property.
     */
    public void setPostFederationSignup(@jakarta.annotation.Nullable final IdentityApiConnector value) {
        this.backingStore.set("postFederationSignup", value);
    }
}
