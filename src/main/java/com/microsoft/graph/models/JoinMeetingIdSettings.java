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
public class JoinMeetingIdSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new JoinMeetingIdSettings and sets the default values.
     */
    public JoinMeetingIdSettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JoinMeetingIdSettings
     */
    @jakarta.annotation.Nonnull
    public static JoinMeetingIdSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinMeetingIdSettings();
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
        deserializerMap.put("isPasscodeRequired", (n) -> { this.setIsPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("joinMeetingId", (n) -> { this.setJoinMeetingId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPasscodeRequired property value. Indicates whether a passcode is required to join a meeting when using joinMeetingId. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPasscodeRequired() {
        return this.getBackingStore().get("isPasscodeRequired");
    }
    /**
     * Gets the joinMeetingId property value. The meeting ID to be used to join a meeting. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJoinMeetingId() {
        return this.getBackingStore().get("joinMeetingId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the passcode property value. The passcode to join a meeting.  Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasscode() {
        return this.getBackingStore().get("passcode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isPasscodeRequired", this.getIsPasscodeRequired());
        writer.writeStringValue("joinMeetingId", this.getJoinMeetingId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the isPasscodeRequired property value. Indicates whether a passcode is required to join a meeting when using joinMeetingId. Optional.
     * @param value Value to set for the isPasscodeRequired property.
     */
    public void setIsPasscodeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isPasscodeRequired", value);
    }
    /**
     * Sets the joinMeetingId property value. The meeting ID to be used to join a meeting. Optional. Read-only.
     * @param value Value to set for the joinMeetingId property.
     */
    public void setJoinMeetingId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("joinMeetingId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the passcode property value. The passcode to join a meeting.  Optional. Read-only.
     * @param value Value to set for the passcode property.
     */
    public void setPasscode(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("passcode", value);
    }
}
