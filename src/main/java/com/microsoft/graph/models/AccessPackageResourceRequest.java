package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResourceRequest extends Entity implements Parsable {
    /**
     * The catalog property
     */
    private AccessPackageCatalog catalog;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The requestType property
     */
    private AccessPackageRequestType requestType;
    /**
     * The resource property
     */
    private AccessPackageResource resource;
    /**
     * The state property
     */
    private AccessPackageRequestState state;
    /**
     * Instantiates a new accessPackageResourceRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRequest
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRequest();
    }
    /**
     * Gets the catalog property value. The catalog property
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this.catalog;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getEnumValue(AccessPackageRequestType.class)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AccessPackageRequestState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the requestType property value. The requestType property
     * @return a accessPackageRequestType
     */
    @javax.annotation.Nullable
    public AccessPackageRequestType getRequestType() {
        return this.requestType;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public AccessPackageResource getResource() {
        return this.resource;
    }
    /**
     * Gets the state property value. The state property
     * @return a accessPackageRequestState
     */
    @javax.annotation.Nullable
    public AccessPackageRequestState getState() {
        return this.state;
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
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("requestType", this.getRequestType());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the catalog property value. The catalog property
     * @param value Value to set for the catalog property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalog(@javax.annotation.Nullable final AccessPackageCatalog value) {
        this.catalog = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the requestType property value. The requestType property
     * @param value Value to set for the requestType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestType(@javax.annotation.Nullable final AccessPackageRequestType value) {
        this.requestType = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final AccessPackageResource value) {
        this.resource = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AccessPackageRequestState value) {
        this.state = value;
    }
}
