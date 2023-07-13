package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureCommunicationServicesUserConversationMember extends ConversationMember implements Parsable {
    /**
     * Azure Communication Services ID of the user.
     */
    private String azureCommunicationServicesId;
    /**
     * Instantiates a new azureCommunicationServicesUserConversationMember and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AzureCommunicationServicesUserConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.azureCommunicationServicesUserConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a azureCommunicationServicesUserConversationMember
     */
    @javax.annotation.Nonnull
    public static AzureCommunicationServicesUserConversationMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureCommunicationServicesUserConversationMember();
    }
    /**
     * Gets the azureCommunicationServicesId property value. Azure Communication Services ID of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureCommunicationServicesId() {
        return this.azureCommunicationServicesId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureCommunicationServicesId", (n) -> { this.setAzureCommunicationServicesId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureCommunicationServicesId", this.getAzureCommunicationServicesId());
    }
    /**
     * Sets the azureCommunicationServicesId property value. Azure Communication Services ID of the user.
     * @param value Value to set for the azureCommunicationServicesId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureCommunicationServicesId(@javax.annotation.Nullable final String value) {
        this.azureCommunicationServicesId = value;
    }
}
