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
public class IdleSessionSignOut implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new IdleSessionSignOut and sets the default values.
     */
    public IdleSessionSignOut() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdleSessionSignOut
     */
    @jakarta.annotation.Nonnull
    public static IdleSessionSignOut createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdleSessionSignOut();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("signOutAfterInSeconds", (n) -> { this.setSignOutAfterInSeconds(n.getLongValue()); });
        deserializerMap.put("warnAfterInSeconds", (n) -> { this.setWarnAfterInSeconds(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the idle session sign-out policy is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.BackingStore.get("isEnabled");
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
     * Gets the signOutAfterInSeconds property value. Number of seconds of inactivity after which a user is signed out.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSignOutAfterInSeconds() {
        return this.BackingStore.get("signOutAfterInSeconds");
    }
    /**
     * Gets the warnAfterInSeconds property value. Number of seconds of inactivity after which a user is notified that they'll be signed out.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getWarnAfterInSeconds() {
        return this.BackingStore.get("warnAfterInSeconds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("signOutAfterInSeconds", this.getSignOutAfterInSeconds());
        writer.writeLongValue("warnAfterInSeconds", this.getWarnAfterInSeconds());
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
     * Sets the isEnabled property value. Indicates whether the idle session sign-out policy is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the signOutAfterInSeconds property value. Number of seconds of inactivity after which a user is signed out.
     * @param value Value to set for the signOutAfterInSeconds property.
     */
    public void setSignOutAfterInSeconds(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("signOutAfterInSeconds", value);
    }
    /**
     * Sets the warnAfterInSeconds property value. Number of seconds of inactivity after which a user is notified that they'll be signed out.
     * @param value Value to set for the warnAfterInSeconds property.
     */
    public void setWarnAfterInSeconds(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("warnAfterInSeconds", value);
    }
}
