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
public class TeamMessagingSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamMessagingSettings and sets the default values.
     */
    public TeamMessagingSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamMessagingSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamMessagingSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamMessagingSettings();
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
     * Gets the allowChannelMentions property value. If set to true, @channel mentions are allowed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowChannelMentions() {
        return this.backingStore.get("allowChannelMentions");
    }
    /**
     * Gets the allowOwnerDeleteMessages property value. If set to true, owners can delete any message.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowOwnerDeleteMessages() {
        return this.backingStore.get("allowOwnerDeleteMessages");
    }
    /**
     * Gets the allowTeamMentions property value. If set to true, @team mentions are allowed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeamMentions() {
        return this.backingStore.get("allowTeamMentions");
    }
    /**
     * Gets the allowUserDeleteMessages property value. If set to true, users can delete their messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserDeleteMessages() {
        return this.backingStore.get("allowUserDeleteMessages");
    }
    /**
     * Gets the allowUserEditMessages property value. If set to true, users can edit their messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserEditMessages() {
        return this.backingStore.get("allowUserEditMessages");
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowChannelMentions", (n) -> { this.setAllowChannelMentions(n.getBooleanValue()); });
        deserializerMap.put("allowOwnerDeleteMessages", (n) -> { this.setAllowOwnerDeleteMessages(n.getBooleanValue()); });
        deserializerMap.put("allowTeamMentions", (n) -> { this.setAllowTeamMentions(n.getBooleanValue()); });
        deserializerMap.put("allowUserDeleteMessages", (n) -> { this.setAllowUserDeleteMessages(n.getBooleanValue()); });
        deserializerMap.put("allowUserEditMessages", (n) -> { this.setAllowUserEditMessages(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowChannelMentions", this.getAllowChannelMentions());
        writer.writeBooleanValue("allowOwnerDeleteMessages", this.getAllowOwnerDeleteMessages());
        writer.writeBooleanValue("allowTeamMentions", this.getAllowTeamMentions());
        writer.writeBooleanValue("allowUserDeleteMessages", this.getAllowUserDeleteMessages());
        writer.writeBooleanValue("allowUserEditMessages", this.getAllowUserEditMessages());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowChannelMentions property value. If set to true, @channel mentions are allowed.
     * @param value Value to set for the allowChannelMentions property.
     */
    public void setAllowChannelMentions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowChannelMentions", value);
    }
    /**
     * Sets the allowOwnerDeleteMessages property value. If set to true, owners can delete any message.
     * @param value Value to set for the allowOwnerDeleteMessages property.
     */
    public void setAllowOwnerDeleteMessages(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowOwnerDeleteMessages", value);
    }
    /**
     * Sets the allowTeamMentions property value. If set to true, @team mentions are allowed.
     * @param value Value to set for the allowTeamMentions property.
     */
    public void setAllowTeamMentions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowTeamMentions", value);
    }
    /**
     * Sets the allowUserDeleteMessages property value. If set to true, users can delete their messages.
     * @param value Value to set for the allowUserDeleteMessages property.
     */
    public void setAllowUserDeleteMessages(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUserDeleteMessages", value);
    }
    /**
     * Sets the allowUserEditMessages property value. If set to true, users can edit their messages.
     * @param value Value to set for the allowUserEditMessages property.
     */
    public void setAllowUserEditMessages(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUserEditMessages", value);
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
}
