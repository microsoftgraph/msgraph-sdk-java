package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AmazonResourceEvidence extends AlertEvidence implements Parsable {
    /**
     * The unique identifier for the Amazon account.
     */
    private String amazonAccountId;
    /**
     * The Amazon resource identifier (ARN) for the cloud resource.
     */
    private String amazonResourceId;
    /**
     * The name of the resource.
     */
    private String resourceName;
    /**
     * The type of the resource.
     */
    private String resourceType;
    /**
     * Instantiates a new amazonResourceEvidence and sets the default values.
     */
    public AmazonResourceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.amazonResourceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a amazonResourceEvidence
     */
    @jakarta.annotation.Nonnull
    public static AmazonResourceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AmazonResourceEvidence();
    }
    /**
     * Gets the amazonAccountId property value. The unique identifier for the Amazon account.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAmazonAccountId() {
        return this.amazonAccountId;
    }
    /**
     * Gets the amazonResourceId property value. The Amazon resource identifier (ARN) for the cloud resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAmazonResourceId() {
        return this.amazonResourceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("amazonAccountId", (n) -> { this.setAmazonAccountId(n.getStringValue()); });
        deserializerMap.put("amazonResourceId", (n) -> { this.setAmazonResourceId(n.getStringValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceName property value. The name of the resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.resourceName;
    }
    /**
     * Gets the resourceType property value. The type of the resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("amazonAccountId", this.getAmazonAccountId());
        writer.writeStringValue("amazonResourceId", this.getAmazonResourceId());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeStringValue("resourceType", this.getResourceType());
    }
    /**
     * Sets the amazonAccountId property value. The unique identifier for the Amazon account.
     * @param value Value to set for the amazonAccountId property.
     */
    public void setAmazonAccountId(@jakarta.annotation.Nullable final String value) {
        this.amazonAccountId = value;
    }
    /**
     * Sets the amazonResourceId property value. The Amazon resource identifier (ARN) for the cloud resource.
     * @param value Value to set for the amazonResourceId property.
     */
    public void setAmazonResourceId(@jakarta.annotation.Nullable final String value) {
        this.amazonResourceId = value;
    }
    /**
     * Sets the resourceName property value. The name of the resource.
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.resourceName = value;
    }
    /**
     * Sets the resourceType property value. The type of the resource.
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.resourceType = value;
    }
}
