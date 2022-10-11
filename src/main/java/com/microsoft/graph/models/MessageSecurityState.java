package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageSecurityState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The connectingIP property */
    private String _connectingIP;
    /** The deliveryAction property */
    private String _deliveryAction;
    /** The deliveryLocation property */
    private String _deliveryLocation;
    /** The directionality property */
    private String _directionality;
    /** The internetMessageId property */
    private String _internetMessageId;
    /** The messageFingerprint property */
    private String _messageFingerprint;
    /** The messageReceivedDateTime property */
    private OffsetDateTime _messageReceivedDateTime;
    /** The messageSubject property */
    private String _messageSubject;
    /** The networkMessageId property */
    private String _networkMessageId;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new messageSecurityState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MessageSecurityState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.messageSecurityState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageSecurityState
     */
    @javax.annotation.Nonnull
    public static MessageSecurityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageSecurityState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the connectingIP property value. The connectingIP property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectingIP() {
        return this._connectingIP;
    }
    /**
     * Gets the deliveryAction property value. The deliveryAction property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeliveryAction() {
        return this._deliveryAction;
    }
    /**
     * Gets the deliveryLocation property value. The deliveryLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeliveryLocation() {
        return this._deliveryLocation;
    }
    /**
     * Gets the directionality property value. The directionality property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDirectionality() {
        return this._directionality;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MessageSecurityState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(10) {{
            this.put("connectingIP", (n) -> { currentObject.setConnectingIP(n.getStringValue()); });
            this.put("deliveryAction", (n) -> { currentObject.setDeliveryAction(n.getStringValue()); });
            this.put("deliveryLocation", (n) -> { currentObject.setDeliveryLocation(n.getStringValue()); });
            this.put("directionality", (n) -> { currentObject.setDirectionality(n.getStringValue()); });
            this.put("internetMessageId", (n) -> { currentObject.setInternetMessageId(n.getStringValue()); });
            this.put("messageFingerprint", (n) -> { currentObject.setMessageFingerprint(n.getStringValue()); });
            this.put("messageReceivedDateTime", (n) -> { currentObject.setMessageReceivedDateTime(n.getOffsetDateTimeValue()); });
            this.put("messageSubject", (n) -> { currentObject.setMessageSubject(n.getStringValue()); });
            this.put("networkMessageId", (n) -> { currentObject.setNetworkMessageId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the internetMessageId property value. The internetMessageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternetMessageId() {
        return this._internetMessageId;
    }
    /**
     * Gets the messageFingerprint property value. The messageFingerprint property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageFingerprint() {
        return this._messageFingerprint;
    }
    /**
     * Gets the messageReceivedDateTime property value. The messageReceivedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMessageReceivedDateTime() {
        return this._messageReceivedDateTime;
    }
    /**
     * Gets the messageSubject property value. The messageSubject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageSubject() {
        return this._messageSubject;
    }
    /**
     * Gets the networkMessageId property value. The networkMessageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkMessageId() {
        return this._networkMessageId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the connectingIP property value. The connectingIP property
     * @param value Value to set for the connectingIP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectingIP(@javax.annotation.Nullable final String value) {
        this._connectingIP = value;
    }
    /**
     * Sets the deliveryAction property value. The deliveryAction property
     * @param value Value to set for the deliveryAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryAction(@javax.annotation.Nullable final String value) {
        this._deliveryAction = value;
    }
    /**
     * Sets the deliveryLocation property value. The deliveryLocation property
     * @param value Value to set for the deliveryLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryLocation(@javax.annotation.Nullable final String value) {
        this._deliveryLocation = value;
    }
    /**
     * Sets the directionality property value. The directionality property
     * @param value Value to set for the directionality property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectionality(@javax.annotation.Nullable final String value) {
        this._directionality = value;
    }
    /**
     * Sets the internetMessageId property value. The internetMessageId property
     * @param value Value to set for the internetMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetMessageId(@javax.annotation.Nullable final String value) {
        this._internetMessageId = value;
    }
    /**
     * Sets the messageFingerprint property value. The messageFingerprint property
     * @param value Value to set for the messageFingerprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageFingerprint(@javax.annotation.Nullable final String value) {
        this._messageFingerprint = value;
    }
    /**
     * Sets the messageReceivedDateTime property value. The messageReceivedDateTime property
     * @param value Value to set for the messageReceivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._messageReceivedDateTime = value;
    }
    /**
     * Sets the messageSubject property value. The messageSubject property
     * @param value Value to set for the messageSubject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageSubject(@javax.annotation.Nullable final String value) {
        this._messageSubject = value;
    }
    /**
     * Sets the networkMessageId property value. The networkMessageId property
     * @param value Value to set for the networkMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkMessageId(@javax.annotation.Nullable final String value) {
        this._networkMessageId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
