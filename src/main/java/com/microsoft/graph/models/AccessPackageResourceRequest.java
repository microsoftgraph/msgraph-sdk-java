package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceRequest extends Entity implements Parsable {
    /**
     * The catalog property
     */
    private AccessPackageCatalog catalog;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The type of the request. Use adminAdd to add a resource, if the caller is an administrator or resource owner, adminUpdate to update a resource, or adminRemove to remove a resource.
     */
    private AccessPackageRequestType requestType;
    /**
     * The resource property
     */
    private AccessPackageResource resource;
    /**
     * The outcome of whether the service was able to add the resource to the catalog.  The value is delivered if the resource was added or removed, and deliveryFailed if it could not be added or removed. Read-only.
     */
    private AccessPackageRequestState state;
    /**
     * Instantiates a new AccessPackageResourceRequest and sets the default values.
     */
    public AccessPackageResourceRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageResourceRequest
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRequest();
    }
    /**
     * Gets the catalog property value. The catalog property
     * @return a AccessPackageCatalog
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this.catalog;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the requestType property value. The type of the request. Use adminAdd to add a resource, if the caller is an administrator or resource owner, adminUpdate to update a resource, or adminRemove to remove a resource.
     * @return a AccessPackageRequestType
     */
    @jakarta.annotation.Nullable
    public AccessPackageRequestType getRequestType() {
        return this.requestType;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a AccessPackageResource
     */
    @jakarta.annotation.Nullable
    public AccessPackageResource getResource() {
        return this.resource;
    }
    /**
     * Gets the state property value. The outcome of whether the service was able to add the resource to the catalog.  The value is delivered if the resource was added or removed, and deliveryFailed if it could not be added or removed. Read-only.
     * @return a AccessPackageRequestState
     */
    @jakarta.annotation.Nullable
    public AccessPackageRequestState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.catalog = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the requestType property value. The type of the request. Use adminAdd to add a resource, if the caller is an administrator or resource owner, adminUpdate to update a resource, or adminRemove to remove a resource.
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final AccessPackageRequestType value) {
        this.requestType = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.resource = value;
    }
    /**
     * Sets the state property value. The outcome of whether the service was able to add the resource to the catalog.  The value is delivered if the resource was added or removed, and deliveryFailed if it could not be added or removed. Read-only.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AccessPackageRequestState value) {
        this.state = value;
    }
}
