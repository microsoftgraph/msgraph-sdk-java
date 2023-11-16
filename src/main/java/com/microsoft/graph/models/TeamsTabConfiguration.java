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
public class TeamsTabConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeamsTabConfiguration and sets the default values.
     */
    public TeamsTabConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsTabConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamsTabConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsTabConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the contentUrl property value. Url used for rendering tab contents in Teams. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.BackingStore.get("contentUrl");
    }
    /**
     * Gets the entityId property value. Identifier for the entity hosted by the tab provider.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEntityId() {
        return this.BackingStore.get("entityId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("entityId", (n) -> { this.setEntityId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeUrl", (n) -> { this.setRemoveUrl(n.getStringValue()); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the removeUrl property value. Url called by Teams client when a Tab is removed using the Teams Client.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoveUrl() {
        return this.BackingStore.get("removeUrl");
    }
    /**
     * Gets the websiteUrl property value. Url for showing tab contents outside of Teams.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebsiteUrl() {
        return this.BackingStore.get("websiteUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeStringValue("entityId", this.getEntityId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("removeUrl", this.getRemoveUrl());
        writer.writeStringValue("websiteUrl", this.getWebsiteUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the contentUrl property value. Url used for rendering tab contents in Teams. Required.
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentUrl", value);
    }
    /**
     * Sets the entityId property value. Identifier for the entity hosted by the tab provider.
     * @param value Value to set for the entityId property.
     */
    public void setEntityId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("entityId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the removeUrl property value. Url called by Teams client when a Tab is removed using the Teams Client.
     * @param value Value to set for the removeUrl property.
     */
    public void setRemoveUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("removeUrl", value);
    }
    /**
     * Sets the websiteUrl property value. Url for showing tab contents outside of Teams.
     * @param value Value to set for the websiteUrl property.
     */
    public void setWebsiteUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("websiteUrl", value);
    }
}
