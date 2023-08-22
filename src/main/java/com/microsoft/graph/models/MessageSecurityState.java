package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageSecurityState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The connectingIP property
     */
    private String connectingIP;
    /**
     * The deliveryAction property
     */
    private String deliveryAction;
    /**
     * The deliveryLocation property
     */
    private String deliveryLocation;
    /**
     * The directionality property
     */
    private String directionality;
    /**
     * The internetMessageId property
     */
    private String internetMessageId;
    /**
     * The messageFingerprint property
     */
    private String messageFingerprint;
    /**
     * The messageReceivedDateTime property
     */
    private OffsetDateTime messageReceivedDateTime;
    /**
     * The messageSubject property
     */
    private String messageSubject;
    /**
     * The networkMessageId property
     */
    private String networkMessageId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new messageSecurityState and sets the default values.
     */
    public MessageSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageSecurityState
     */
    @jakarta.annotation.Nonnull
    public static MessageSecurityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageSecurityState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the connectingIP property value. The connectingIP property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConnectingIP() {
        return this.connectingIP;
    }
    /**
     * Gets the deliveryAction property value. The deliveryAction property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeliveryAction() {
        return this.deliveryAction;
    }
    /**
     * Gets the deliveryLocation property value. The deliveryLocation property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeliveryLocation() {
        return this.deliveryLocation;
    }
    /**
     * Gets the directionality property value. The directionality property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDirectionality() {
        return this.directionality;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInternetMessageId() {
        return this.internetMessageId;
    }
    /**
     * Gets the messageFingerprint property value. The messageFingerprint property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMessageFingerprint() {
        return this.messageFingerprint;
    }
    /**
     * Gets the messageReceivedDateTime property value. The messageReceivedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMessageReceivedDateTime() {
        return this.messageReceivedDateTime;
    }
    /**
     * Gets the messageSubject property value. The messageSubject property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMessageSubject() {
        return this.messageSubject;
    }
    /**
     * Gets the networkMessageId property value. The networkMessageId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageId() {
        return this.networkMessageId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the connectingIP property value. The connectingIP property
     * @param value Value to set for the connectingIP property.
     */
    public void setConnectingIP(@jakarta.annotation.Nullable final String value) {
        this.connectingIP = value;
    }
    /**
     * Sets the deliveryAction property value. The deliveryAction property
     * @param value Value to set for the deliveryAction property.
     */
    public void setDeliveryAction(@jakarta.annotation.Nullable final String value) {
        this.deliveryAction = value;
    }
    /**
     * Sets the deliveryLocation property value. The deliveryLocation property
     * @param value Value to set for the deliveryLocation property.
     */
    public void setDeliveryLocation(@jakarta.annotation.Nullable final String value) {
        this.deliveryLocation = value;
    }
    /**
     * Sets the directionality property value. The directionality property
     * @param value Value to set for the directionality property.
     */
    public void setDirectionality(@jakarta.annotation.Nullable final String value) {
        this.directionality = value;
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     */
    public void setInternetMessageId(@jakarta.annotation.Nullable final String value) {
        this.internetMessageId = value;
    }
    /**
     * Sets the messageFingerprint property value. The messageFingerprint property
     * @param value Value to set for the messageFingerprint property.
     */
    public void setMessageFingerprint(@jakarta.annotation.Nullable final String value) {
        this.messageFingerprint = value;
    }
    /**
     * Sets the messageReceivedDateTime property value. The messageReceivedDateTime property
     * @param value Value to set for the messageReceivedDateTime property.
     */
    public void setMessageReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.messageReceivedDateTime = value;
    }
    /**
     * Sets the messageSubject property value. The messageSubject property
     * @param value Value to set for the messageSubject property.
     */
    public void setMessageSubject(@jakarta.annotation.Nullable final String value) {
        this.messageSubject = value;
    }
    /**
     * Sets the networkMessageId property value. The networkMessageId property
     * @param value Value to set for the networkMessageId property.
     */
    public void setNetworkMessageId(@jakarta.annotation.Nullable final String value) {
        this.networkMessageId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
