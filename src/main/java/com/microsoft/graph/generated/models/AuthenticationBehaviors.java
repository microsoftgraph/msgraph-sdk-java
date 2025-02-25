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
public class AuthenticationBehaviors implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AuthenticationBehaviors} and sets the default values.
     */
    public AuthenticationBehaviors() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationBehaviors}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationBehaviors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationBehaviors();
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
     * Gets the blockAzureADGraphAccess property value. The blockAzureADGraphAccess property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockAzureADGraphAccess() {
        return this.backingStore.get("blockAzureADGraphAccess");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("blockAzureADGraphAccess", (n) -> { this.setBlockAzureADGraphAccess(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeUnverifiedEmailClaim", (n) -> { this.setRemoveUnverifiedEmailClaim(n.getBooleanValue()); });
        deserializerMap.put("requireClientServicePrincipal", (n) -> { this.setRequireClientServicePrincipal(n.getBooleanValue()); });
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
     * Gets the removeUnverifiedEmailClaim property value. The removeUnverifiedEmailClaim property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRemoveUnverifiedEmailClaim() {
        return this.backingStore.get("removeUnverifiedEmailClaim");
    }
    /**
     * Gets the requireClientServicePrincipal property value. The requireClientServicePrincipal property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireClientServicePrincipal() {
        return this.backingStore.get("requireClientServicePrincipal");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockAzureADGraphAccess", this.getBlockAzureADGraphAccess());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("removeUnverifiedEmailClaim", this.getRemoveUnverifiedEmailClaim());
        writer.writeBooleanValue("requireClientServicePrincipal", this.getRequireClientServicePrincipal());
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
     * Sets the blockAzureADGraphAccess property value. The blockAzureADGraphAccess property
     * @param value Value to set for the blockAzureADGraphAccess property.
     */
    public void setBlockAzureADGraphAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockAzureADGraphAccess", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the removeUnverifiedEmailClaim property value. The removeUnverifiedEmailClaim property
     * @param value Value to set for the removeUnverifiedEmailClaim property.
     */
    public void setRemoveUnverifiedEmailClaim(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("removeUnverifiedEmailClaim", value);
    }
    /**
     * Sets the requireClientServicePrincipal property value. The requireClientServicePrincipal property
     * @param value Value to set for the requireClientServicePrincipal property.
     */
    public void setRequireClientServicePrincipal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireClientServicePrincipal", value);
    }
}
