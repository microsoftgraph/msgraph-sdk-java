package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewAccessPackageAssignmentPolicyScope extends AccessReviewResourceScope implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewAccessPackageAssignmentPolicyScope} and sets the default values.
     */
    public AccessReviewAccessPackageAssignmentPolicyScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewAccessPackageAssignmentPolicyScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewAccessPackageAssignmentPolicyScope}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewAccessPackageAssignmentPolicyScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewAccessPackageAssignmentPolicyScope();
    }
    /**
     * Gets the accessPackageDisplayName property value. The display name of the access package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageDisplayName() {
        return this.backingStore.get("accessPackageDisplayName");
    }
    /**
     * Gets the accessPackageId property value. The access package identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageId() {
        return this.backingStore.get("accessPackageId");
    }
    /**
     * Gets the catalogDisplayName property value. The display name of the catalog.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogDisplayName() {
        return this.backingStore.get("catalogDisplayName");
    }
    /**
     * Gets the catalogId property value. The catalog identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogId() {
        return this.backingStore.get("catalogId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageDisplayName", (n) -> { this.setAccessPackageDisplayName(n.getStringValue()); });
        deserializerMap.put("accessPackageId", (n) -> { this.setAccessPackageId(n.getStringValue()); });
        deserializerMap.put("catalogDisplayName", (n) -> { this.setCatalogDisplayName(n.getStringValue()); });
        deserializerMap.put("catalogId", (n) -> { this.setCatalogId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessPackageDisplayName", this.getAccessPackageDisplayName());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
        writer.writeStringValue("catalogDisplayName", this.getCatalogDisplayName());
        writer.writeStringValue("catalogId", this.getCatalogId());
    }
    /**
     * Sets the accessPackageDisplayName property value. The display name of the access package.
     * @param value Value to set for the accessPackageDisplayName property.
     */
    public void setAccessPackageDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageDisplayName", value);
    }
    /**
     * Sets the accessPackageId property value. The access package identifier.
     * @param value Value to set for the accessPackageId property.
     */
    public void setAccessPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageId", value);
    }
    /**
     * Sets the catalogDisplayName property value. The display name of the catalog.
     * @param value Value to set for the catalogDisplayName property.
     */
    public void setCatalogDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogDisplayName", value);
    }
    /**
     * Sets the catalogId property value. The catalog identifier.
     * @param value Value to set for the catalogId property.
     */
    public void setCatalogId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogId", value);
    }
}
