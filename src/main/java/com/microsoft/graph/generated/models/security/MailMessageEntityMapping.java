package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailMessageEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link MailMessageEntityMapping} and sets the default values.
     */
    public MailMessageEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.mailMessageEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailMessageEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static MailMessageEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailMessageEntityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("networkMessageIdColumn", (n) -> { this.setNetworkMessageIdColumn(n.getStringValue()); });
        deserializerMap.put("recipientColumn", (n) -> { this.setRecipientColumn(n.getStringValue()); });
        deserializerMap.put("senderColumn", (n) -> { this.setSenderColumn(n.getStringValue()); });
        deserializerMap.put("subjectColumn", (n) -> { this.setSubjectColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkMessageIdColumn property value. Name of the detection query column that maps to the network message ID of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageIdColumn() {
        return this.backingStore.get("networkMessageIdColumn");
    }
    /**
     * Gets the recipientColumn property value. Name of the detection query column that maps to the recipient of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientColumn() {
        return this.backingStore.get("recipientColumn");
    }
    /**
     * Gets the senderColumn property value. Name of the detection query column that maps to the sender of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderColumn() {
        return this.backingStore.get("senderColumn");
    }
    /**
     * Gets the subjectColumn property value. Name of the detection query column that maps to the subject of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectColumn() {
        return this.backingStore.get("subjectColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("networkMessageIdColumn", this.getNetworkMessageIdColumn());
        writer.writeStringValue("recipientColumn", this.getRecipientColumn());
        writer.writeStringValue("senderColumn", this.getSenderColumn());
        writer.writeStringValue("subjectColumn", this.getSubjectColumn());
    }
    /**
     * Sets the networkMessageIdColumn property value. Name of the detection query column that maps to the network message ID of the alert entity.
     * @param value Value to set for the networkMessageIdColumn property.
     */
    public void setNetworkMessageIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkMessageIdColumn", value);
    }
    /**
     * Sets the recipientColumn property value. Name of the detection query column that maps to the recipient of the alert entity.
     * @param value Value to set for the recipientColumn property.
     */
    public void setRecipientColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientColumn", value);
    }
    /**
     * Sets the senderColumn property value. Name of the detection query column that maps to the sender of the alert entity.
     * @param value Value to set for the senderColumn property.
     */
    public void setSenderColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderColumn", value);
    }
    /**
     * Sets the subjectColumn property value. Name of the detection query column that maps to the subject of the alert entity.
     * @param value Value to set for the subjectColumn property.
     */
    public void setSubjectColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectColumn", value);
    }
}
