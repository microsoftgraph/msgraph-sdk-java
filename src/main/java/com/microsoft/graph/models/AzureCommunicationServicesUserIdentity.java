package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureCommunicationServicesUserIdentity extends Identity implements Parsable {
    /**
     * Instantiates a new AzureCommunicationServicesUserIdentity and sets the default values.
     */
    public AzureCommunicationServicesUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.azureCommunicationServicesUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureCommunicationServicesUserIdentity
     */
    @jakarta.annotation.Nonnull
    public static AzureCommunicationServicesUserIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureCommunicationServicesUserIdentity();
    }
    /**
     * Gets the azureCommunicationServicesResourceId property value. The Azure Communication Services resource ID associated with the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureCommunicationServicesResourceId() {
        return this.BackingStore.get("azureCommunicationServicesResourceId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureCommunicationServicesResourceId", (n) -> { this.setAzureCommunicationServicesResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureCommunicationServicesResourceId", this.getAzureCommunicationServicesResourceId());
    }
    /**
     * Sets the azureCommunicationServicesResourceId property value. The Azure Communication Services resource ID associated with the user.
     * @param value Value to set for the azureCommunicationServicesResourceId property.
     */
    public void setAzureCommunicationServicesResourceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("azureCommunicationServicesResourceId", value);
    }
}
