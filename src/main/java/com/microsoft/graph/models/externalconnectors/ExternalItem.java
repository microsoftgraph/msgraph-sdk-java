package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalItem extends Entity implements Parsable {
    /**
     * Instantiates a new ExternalItem and sets the default values.
     */
    public ExternalItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalItem
     */
    @jakarta.annotation.Nonnull
    public static ExternalItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalItem();
    }
    /**
     * Gets the acl property value. An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     * @return a java.util.List<Acl>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Acl> getAcl() {
        return this.getBackingStore().get("acl");
    }
    /**
     * Gets the activities property value. Returns a list of activities performed on the item. Write-only.
     * @return a java.util.List<ExternalActivity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalActivity> getActivities() {
        return this.getBackingStore().get("activities");
    }
    /**
     * Gets the content property value. A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     * @return a ExternalItemContent
     */
    @jakarta.annotation.Nullable
    public ExternalItemContent getContent() {
        return this.getBackingStore().get("content");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acl", (n) -> { this.setAcl(n.getCollectionOfObjectValues(Acl::createFromDiscriminatorValue)); });
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfObjectValues(ExternalActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(ExternalItemContent::createFromDiscriminatorValue)); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(Properties::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the properties property value. A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     * @return a Properties
     */
    @jakarta.annotation.Nullable
    public Properties getProperties() {
        return this.getBackingStore().get("properties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acl", this.getAcl());
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeObjectValue("content", this.getContent());
        writer.writeObjectValue("properties", this.getProperties());
    }
    /**
     * Sets the acl property value. An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     * @param value Value to set for the acl property.
     */
    public void setAcl(@jakarta.annotation.Nullable final java.util.List<Acl> value) {
        this.getBackingStore().set("acl", value);
    }
    /**
     * Sets the activities property value. Returns a list of activities performed on the item. Write-only.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<ExternalActivity> value) {
        this.getBackingStore().set("activities", value);
    }
    /**
     * Sets the content property value. A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final ExternalItemContent value) {
        this.getBackingStore().set("content", value);
    }
    /**
     * Sets the properties property value. A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final Properties value) {
        this.getBackingStore().set("properties", value);
    }
}
