package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureResourceEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new AzureResourceEvidence and sets the default values.
     */
    public AzureResourceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.azureResourceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureResourceEvidence
     */
    @jakarta.annotation.Nonnull
    public static AzureResourceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureResourceEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceId property value. The unique identifier for the Azure resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.BackingStore.get("resourceId");
    }
    /**
     * Gets the resourceName property value. The name of the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.BackingStore.get("resourceName");
    }
    /**
     * Gets the resourceType property value. The type of the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.BackingStore.get("resourceType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeStringValue("resourceType", this.getResourceType());
    }
    /**
     * Sets the resourceId property value. The unique identifier for the Azure resource.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceId", value);
    }
    /**
     * Sets the resourceName property value. The name of the resource.
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceName", value);
    }
    /**
     * Sets the resourceType property value. The type of the resource.
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceType", value);
    }
}
