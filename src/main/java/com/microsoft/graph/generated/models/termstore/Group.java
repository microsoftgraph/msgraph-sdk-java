package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Group extends Entity implements Parsable {
    /**
     * Instantiates a new Group and sets the default values.
     */
    public Group() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Group
     */
    @jakarta.annotation.Nonnull
    public static Group createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Group();
    }
    /**
     * Gets the createdDateTime property value. Date and time of the group creation. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description that gives details on the term usage.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("parentSiteId", (n) -> { this.setParentSiteId(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumValue(TermGroupScope::forValue)); });
        deserializerMap.put("sets", (n) -> { this.setSets(n.getCollectionOfObjectValues(Set::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the parentSiteId property value. ID of the parent site of this group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentSiteId() {
        return this.backingStore.get("parentSiteId");
    }
    /**
     * Gets the scope property value. Returns the type of the group. Possible values are: global, system, and siteCollection.
     * @return a TermGroupScope
     */
    @jakarta.annotation.Nullable
    public TermGroupScope getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the sets property value. All sets under the group in a term [store].
     * @return a java.util.List<Set>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Set> getSets() {
        return this.backingStore.get("sets");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("parentSiteId", this.getParentSiteId());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeCollectionOfObjectValues("sets", this.getSets());
    }
    /**
     * Sets the createdDateTime property value. Date and time of the group creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description that gives details on the term usage.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the group.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the parentSiteId property value. ID of the parent site of this group.
     * @param value Value to set for the parentSiteId property.
     */
    public void setParentSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentSiteId", value);
    }
    /**
     * Sets the scope property value. Returns the type of the group. Possible values are: global, system, and siteCollection.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final TermGroupScope value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the sets property value. All sets under the group in a term [store].
     * @param value Value to set for the sets property.
     */
    public void setSets(@jakarta.annotation.Nullable final java.util.List<Set> value) {
        this.backingStore.set("sets", value);
    }
}
