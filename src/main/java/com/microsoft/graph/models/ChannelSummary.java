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
public class ChannelSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new ChannelSummary and sets the default values.
     */
    public ChannelSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelSummary
     */
    @jakarta.annotation.Nonnull
    public static ChannelSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelSummary();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("guestsCount", (n) -> { this.setGuestsCount(n.getIntegerValue()); });
        deserializerMap.put("hasMembersFromOtherTenants", (n) -> { this.setHasMembersFromOtherTenants(n.getBooleanValue()); });
        deserializerMap.put("membersCount", (n) -> { this.setMembersCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ownersCount", (n) -> { this.setOwnersCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guestsCount property value. Count of guests in a channel.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGuestsCount() {
        return this.backingStore.get("guestsCount");
    }
    /**
     * Gets the hasMembersFromOtherTenants property value. Indicates whether external members are included on the channel.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMembersFromOtherTenants() {
        return this.backingStore.get("hasMembersFromOtherTenants");
    }
    /**
     * Gets the membersCount property value. Count of members in a channel.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMembersCount() {
        return this.backingStore.get("membersCount");
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
     * Gets the ownersCount property value. Count of owners in a channel.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOwnersCount() {
        return this.backingStore.get("ownersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("guestsCount", this.getGuestsCount());
        writer.writeBooleanValue("hasMembersFromOtherTenants", this.getHasMembersFromOtherTenants());
        writer.writeIntegerValue("membersCount", this.getMembersCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("ownersCount", this.getOwnersCount());
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
     * Sets the guestsCount property value. Count of guests in a channel.
     * @param value Value to set for the guestsCount property.
     */
    public void setGuestsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("guestsCount", value);
    }
    /**
     * Sets the hasMembersFromOtherTenants property value. Indicates whether external members are included on the channel.
     * @param value Value to set for the hasMembersFromOtherTenants property.
     */
    public void setHasMembersFromOtherTenants(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasMembersFromOtherTenants", value);
    }
    /**
     * Sets the membersCount property value. Count of members in a channel.
     * @param value Value to set for the membersCount property.
     */
    public void setMembersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("membersCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the ownersCount property value. Count of owners in a channel.
     * @param value Value to set for the ownersCount property.
     */
    public void setOwnersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ownersCount", value);
    }
}
