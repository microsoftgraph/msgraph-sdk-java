package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvitedUserMessageInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
     */
    private java.util.List<Recipient> ccRecipients;
    /**
     * Customized message body you want to send if you don't want the default message.
     */
    private String customizedMessageBody;
    /**
     * The language you want to send the default message in. If the customizedMessageBody is specified, this property is ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default is en-US.
     */
    private String messageLanguage;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new invitedUserMessageInfo and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public InvitedUserMessageInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invitedUserMessageInfo
     */
    @jakarta.annotation.Nonnull
    public static InvitedUserMessageInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitedUserMessageInfo();
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
     * Gets the ccRecipients property value. Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
     * @return a recipient
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getCcRecipients() {
        return this.ccRecipients;
    }
    /**
     * Gets the customizedMessageBody property value. Customized message body you want to send if you don't want the default message.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomizedMessageBody() {
        return this.customizedMessageBody;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("ccRecipients", (n) -> { this.setCcRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("customizedMessageBody", (n) -> { this.setCustomizedMessageBody(n.getStringValue()); });
        deserializerMap.put("messageLanguage", (n) -> { this.setMessageLanguage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageLanguage property value. The language you want to send the default message in. If the customizedMessageBody is specified, this property is ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default is en-US.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMessageLanguage() {
        return this.messageLanguage;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("ccRecipients", this.getCcRecipients());
        writer.writeStringValue("customizedMessageBody", this.getCustomizedMessageBody());
        writer.writeStringValue("messageLanguage", this.getMessageLanguage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the ccRecipients property value. Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
     * @param value Value to set for the ccRecipients property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCcRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.ccRecipients = value;
    }
    /**
     * Sets the customizedMessageBody property value. Customized message body you want to send if you don't want the default message.
     * @param value Value to set for the customizedMessageBody property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomizedMessageBody(@jakarta.annotation.Nullable final String value) {
        this.customizedMessageBody = value;
    }
    /**
     * Sets the messageLanguage property value. The language you want to send the default message in. If the customizedMessageBody is specified, this property is ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default is en-US.
     * @param value Value to set for the messageLanguage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMessageLanguage(@jakarta.annotation.Nullable final String value) {
        this.messageLanguage = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
