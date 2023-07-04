package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalItem extends Entity implements Parsable {
    /**
     * An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     */
    private java.util.List<Acl> acl;
    /**
     * Returns a list of activities performed on the item. Write-only.
     */
    private java.util.List<ExternalActivity> activities;
    /**
     * A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     */
    private ExternalItemContent content;
    /**
     * A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     */
    private Properties properties;
    /**
     * Instantiates a new externalItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalItem
     */
    @javax.annotation.Nonnull
    public static ExternalItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalItem();
    }
    /**
     * Gets the acl property value. An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     * @return a acl
     */
    @javax.annotation.Nullable
    public java.util.List<Acl> getAcl() {
        return this.acl;
    }
    /**
     * Gets the activities property value. Returns a list of activities performed on the item. Write-only.
     * @return a externalActivity
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalActivity> getActivities() {
        return this.activities;
    }
    /**
     * Gets the content property value. A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     * @return a externalItemContent
     */
    @javax.annotation.Nullable
    public ExternalItemContent getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a properties
     */
    @javax.annotation.Nullable
    public Properties getProperties() {
        return this.properties;
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
        writer.writeCollectionOfObjectValues("acl", this.getAcl());
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeObjectValue("content", this.getContent());
        writer.writeObjectValue("properties", this.getProperties());
    }
    /**
     * Sets the acl property value. An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     * @param value Value to set for the acl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcl(@javax.annotation.Nullable final java.util.List<Acl> value) {
        this.acl = value;
    }
    /**
     * Sets the activities property value. Returns a list of activities performed on the item. Write-only.
     * @param value Value to set for the activities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivities(@javax.annotation.Nullable final java.util.List<ExternalActivity> value) {
        this.activities = value;
    }
    /**
     * Sets the content property value. A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final ExternalItemContent value) {
        this.content = value;
    }
    /**
     * Sets the properties property value. A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     * @param value Value to set for the properties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProperties(@javax.annotation.Nullable final Properties value) {
        this.properties = value;
    }
}
