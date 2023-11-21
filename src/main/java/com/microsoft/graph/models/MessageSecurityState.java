package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageSecurityState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MessageSecurityState and sets the default values.
     */
    public MessageSecurityState() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageSecurityState
     */
    @jakarta.annotation.Nonnull
    public static MessageSecurityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageSecurityState();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the connectingIP property value. The connectingIP property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectingIP() {
        return this.backingStore.get("connectingIP");
    }
    /**
     * Gets the deliveryAction property value. The deliveryAction property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeliveryAction() {
        return this.backingStore.get("deliveryAction");
    }
    /**
     * Gets the deliveryLocation property value. The deliveryLocation property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeliveryLocation() {
        return this.backingStore.get("deliveryLocation");
    }
    /**
     * Gets the directionality property value. The directionality property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDirectionality() {
        return this.backingStore.get("directionality");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("connectingIP", (n) -> { this.setConnectingIP(n.getStringValue()); });
        deserializerMap.put("deliveryAction", (n) -> { this.setDeliveryAction(n.getStringValue()); });
        deserializerMap.put("deliveryLocation", (n) -> { this.setDeliveryLocation(n.getStringValue()); });
        deserializerMap.put("directionality", (n) -> { this.setDirectionality(n.getStringValue()); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("messageFingerprint", (n) -> { this.setMessageFingerprint(n.getStringValue()); });
        deserializerMap.put("messageReceivedDateTime", (n) -> { this.setMessageReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("messageSubject", (n) -> { this.setMessageSubject(n.getStringValue()); });
        deserializerMap.put("networkMessageId", (n) -> { this.setNetworkMessageId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internetMessageId property value. The internetMessageId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.backingStore.get("internetMessageId");
    }
    /**
     * Gets the messageFingerprint property value. The messageFingerprint property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessageFingerprint() {
        return this.backingStore.get("messageFingerprint");
    }
    /**
     * Gets the messageReceivedDateTime property value. The messageReceivedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMessageReceivedDateTime() {
        return this.backingStore.get("messageReceivedDateTime");
    }
    /**
     * Gets the messageSubject property value. The messageSubject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessageSubject() {
        return this.backingStore.get("messageSubject");
    }
    /**
     * Gets the networkMessageId property value. The networkMessageId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageId() {
        return this.backingStore.get("networkMessageId");
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
        writer.writeStringValue("connectingIP", this.getConnectingIP());
        writer.writeStringValue("deliveryAction", this.getDeliveryAction());
        writer.writeStringValue("deliveryLocation", this.getDeliveryLocation());
        writer.writeStringValue("directionality", this.getDirectionality());
        writer.writeStringValue("internetMessageId", this.getInternetMessageId());
        writer.writeStringValue("messageFingerprint", this.getMessageFingerprint());
        writer.writeOffsetDateTimeValue("messageReceivedDateTime", this.getMessageReceivedDateTime());
        writer.writeStringValue("messageSubject", this.getMessageSubject());
        writer.writeStringValue("networkMessageId", this.getNetworkMessageId());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the connectingIP property value. The connectingIP property
     * @param value Value to set for the connectingIP property.
     */
    public void setConnectingIP(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectingIP", value);
    }
    /**
     * Sets the deliveryAction property value. The deliveryAction property
     * @param value Value to set for the deliveryAction property.
     */
    public void setDeliveryAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deliveryAction", value);
    }
    /**
     * Sets the deliveryLocation property value. The deliveryLocation property
     * @param value Value to set for the deliveryLocation property.
     */
    public void setDeliveryLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deliveryLocation", value);
    }
    /**
     * Sets the directionality property value. The directionality property
     * @param value Value to set for the directionality property.
     */
    public void setDirectionality(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directionality", value);
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internetMessageId", value);
    }
    /**
     * Sets the messageFingerprint property value. The messageFingerprint property
     * @param value Value to set for the messageFingerprint property.
     */
    public void setMessageFingerprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageFingerprint", value);
    }
    /**
     * Sets the messageReceivedDateTime property value. The messageReceivedDateTime property
     * @param value Value to set for the messageReceivedDateTime property.
     */
    public void setMessageReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("messageReceivedDateTime", value);
    }
    /**
     * Sets the messageSubject property value. The messageSubject property
     * @param value Value to set for the messageSubject property.
     */
    public void setMessageSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageSubject", value);
    }
    /**
     * Sets the networkMessageId property value. The networkMessageId property
     * @param value Value to set for the networkMessageId property.
     */
    public void setNetworkMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkMessageId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
