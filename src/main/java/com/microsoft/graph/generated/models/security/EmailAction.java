package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailAction extends AutomatedAction implements Parsable {
    /**
     * Instantiates a new {@link EmailAction} and sets the default values.
     */
    public EmailAction() {
        super();
        this.setOdataType("#microsoft.graph.security.emailAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmailAction}
     */
    @jakarta.annotation.Nonnull
    public static EmailAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailAction();
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
        return deserializerMap;
    }
    /**
     * Gets the networkMessageIdColumn property value. Name of the hunting-query result column that contains the network message ID of the targeted email message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageIdColumn() {
        return this.backingStore.get("networkMessageIdColumn");
    }
    /**
     * Gets the recipientColumn property value. Name of the hunting-query result column that contains the recipient of the targeted email message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientColumn() {
        return this.backingStore.get("recipientColumn");
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
    }
    /**
     * Sets the networkMessageIdColumn property value. Name of the hunting-query result column that contains the network message ID of the targeted email message.
     * @param value Value to set for the networkMessageIdColumn property.
     */
    public void setNetworkMessageIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkMessageIdColumn", value);
    }
    /**
     * Sets the recipientColumn property value. Name of the hunting-query result column that contains the recipient of the targeted email message.
     * @param value Value to set for the recipientColumn property.
     */
    public void setRecipientColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientColumn", value);
    }
}
