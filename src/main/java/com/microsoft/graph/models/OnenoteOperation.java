package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenoteOperation extends Operation implements Parsable {
    /** The error returned by the operation. */
    private OnenoteOperationError _error;
    /** The operation percent complete if the operation is still in running status. */
    private String _percentComplete;
    /** The resource id. */
    private String _resourceId;
    /** The resource URI for the object. For example, the resource URI for a copied page or section. */
    private String _resourceLocation;
    /**
     * Instantiates a new OnenoteOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnenoteOperation() {
        super();
        this.setOdataType("#microsoft.graph.onenoteOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnenoteOperation
     */
    @javax.annotation.Nonnull
    public static OnenoteOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteOperation();
    }
    /**
     * Gets the error property value. The error returned by the operation.
     * @return a onenoteOperationError
     */
    @javax.annotation.Nullable
    public OnenoteOperationError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnenoteOperation currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { currentObject.setError(n.getObjectValue(OnenoteOperationError::createFromDiscriminatorValue)); });
        deserializerMap.put("percentComplete", (n) -> { currentObject.setPercentComplete(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
        deserializerMap.put("resourceLocation", (n) -> { currentObject.setResourceLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentComplete property value. The operation percent complete if the operation is still in running status.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPercentComplete() {
        return this._percentComplete;
    }
    /**
     * Gets the resourceId property value. The resource id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the resourceLocation property value. The resource URI for the object. For example, the resource URI for a copied page or section.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceLocation() {
        return this._resourceLocation;
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
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("percentComplete", this.getPercentComplete());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
    }
    /**
     * Sets the error property value. The error returned by the operation.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final OnenoteOperationError value) {
        this._error = value;
    }
    /**
     * Sets the percentComplete property value. The operation percent complete if the operation is still in running status.
     * @param value Value to set for the percentComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentComplete(@javax.annotation.Nullable final String value) {
        this._percentComplete = value;
    }
    /**
     * Sets the resourceId property value. The resource id.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the resourceLocation property value. The resource URI for the object. For example, the resource URI for a copied page or section.
     * @param value Value to set for the resourceLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceLocation(@javax.annotation.Nullable final String value) {
        this._resourceLocation = value;
    }
}
