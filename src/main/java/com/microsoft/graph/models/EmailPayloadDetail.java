package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailPayloadDetail extends PayloadDetail implements Parsable {
    /**
     * The fromEmail property
     */
    private String fromEmail;
    /**
     * The fromName property
     */
    private String fromName;
    /**
     * The isExternalSender property
     */
    private Boolean isExternalSender;
    /**
     * The subject property
     */
    private String subject;
    /**
     * Instantiates a new EmailPayloadDetail and sets the default values.
     */
    public EmailPayloadDetail() {
        super();
        this.setOdataType("#microsoft.graph.emailPayloadDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailPayloadDetail
     */
    @jakarta.annotation.Nonnull
    public static EmailPayloadDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailPayloadDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fromEmail", (n) -> { this.setFromEmail(n.getStringValue()); });
        deserializerMap.put("fromName", (n) -> { this.setFromName(n.getStringValue()); });
        deserializerMap.put("isExternalSender", (n) -> { this.setIsExternalSender(n.getBooleanValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromEmail property value. The fromEmail property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromEmail() {
        return this.fromEmail;
    }
    /**
     * Gets the fromName property value. The fromName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromName() {
        return this.fromName;
    }
    /**
     * Gets the isExternalSender property value. The isExternalSender property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalSender() {
        return this.isExternalSender;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fromEmail", this.getFromEmail());
        writer.writeStringValue("fromName", this.getFromName());
        writer.writeBooleanValue("isExternalSender", this.getIsExternalSender());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the fromEmail property value. The fromEmail property
     * @param value Value to set for the fromEmail property.
     */
    public void setFromEmail(@jakarta.annotation.Nullable final String value) {
        this.fromEmail = value;
    }
    /**
     * Sets the fromName property value. The fromName property
     * @param value Value to set for the fromName property.
     */
    public void setFromName(@jakarta.annotation.Nullable final String value) {
        this.fromName = value;
    }
    /**
     * Sets the isExternalSender property value. The isExternalSender property
     * @param value Value to set for the isExternalSender property.
     */
    public void setIsExternalSender(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalSender = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
