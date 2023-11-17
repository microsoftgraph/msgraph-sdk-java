package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenoteOperation extends Operation implements Parsable {
    /**
     * Instantiates a new OnenoteOperation and sets the default values.
     */
    public OnenoteOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnenoteOperation
     */
    @jakarta.annotation.Nonnull
    public static OnenoteOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteOperation();
    }
    /**
     * Gets the error property value. The error returned by the operation.
     * @return a OnenoteOperationError
     */
    @jakarta.annotation.Nullable
    public OnenoteOperationError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(OnenoteOperationError::createFromDiscriminatorValue)); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentComplete property value. The operation percent complete if the operation is still in running status.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPercentComplete() {
        return this.backingStore.get("percentComplete");
    }
    /**
     * Gets the resourceId property value. The resource id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the resourceLocation property value. The resource URI for the object. For example, the resource URI for a copied page or section.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.backingStore.get("resourceLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("percentComplete", this.getPercentComplete());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
    }
    /**
     * Sets the error property value. The error returned by the operation.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final OnenoteOperationError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the percentComplete property value. The operation percent complete if the operation is still in running status.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("percentComplete", value);
    }
    /**
     * Sets the resourceId property value. The resource id.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the resourceLocation property value. The resource URI for the object. For example, the resource URI for a copied page or section.
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceLocation", value);
    }
}
