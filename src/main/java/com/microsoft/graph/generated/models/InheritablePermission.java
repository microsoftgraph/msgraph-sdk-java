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
public class InheritablePermission implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link InheritablePermission} and sets the default values.
     */
    public InheritablePermission() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InheritablePermission}
     */
    @jakarta.annotation.Nonnull
    public static InheritablePermission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InheritablePermission();
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
        deserializerMap.put("inheritableScopes", (n) -> { this.setInheritableScopes(n.getObjectValue(InheritableScopes::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceAppId", (n) -> { this.setResourceAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inheritableScopes property value. Inheritance configuration for delegated permission scopes published by the resource application. Supports three patterns: allAllowedScopes (inherit all available scopes), enumeratedScopes (inherit only the listed scopes), and noScopes (inherit none). Each pattern exposes a kind discriminator for filtering.
     * @return a {@link InheritableScopes}
     */
    @jakarta.annotation.Nullable
    public InheritableScopes getInheritableScopes() {
        return this.backingStore.get("inheritableScopes");
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
     * Gets the resourceAppId property value. The appId of the resource application that publishes these scopes. Primary key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceAppId() {
        return this.backingStore.get("resourceAppId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("inheritableScopes", this.getInheritableScopes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceAppId", this.getResourceAppId());
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
     * Sets the inheritableScopes property value. Inheritance configuration for delegated permission scopes published by the resource application. Supports three patterns: allAllowedScopes (inherit all available scopes), enumeratedScopes (inherit only the listed scopes), and noScopes (inherit none). Each pattern exposes a kind discriminator for filtering.
     * @param value Value to set for the inheritableScopes property.
     */
    public void setInheritableScopes(@jakarta.annotation.Nullable final InheritableScopes value) {
        this.backingStore.set("inheritableScopes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resourceAppId property value. The appId of the resource application that publishes these scopes. Primary key.
     * @param value Value to set for the resourceAppId property.
     */
    public void setResourceAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceAppId", value);
    }
}
