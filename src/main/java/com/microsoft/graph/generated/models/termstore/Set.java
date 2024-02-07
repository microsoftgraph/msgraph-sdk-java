package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Set extends Entity implements Parsable {
    /**
     * Instantiates a new Set and sets the default values.
     */
    public Set() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Set
     */
    @jakarta.annotation.Nonnull
    public static Set createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Set();
    }
    /**
     * Gets the children property value. Children terms of set in term [store].
     * @return a java.util.List<Term>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Term> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * Gets the createdDateTime property value. Date and time of set creation. Read-only.
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(Term::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("localizedNames", (n) -> { this.setLocalizedNames(n.getCollectionOfObjectValues(LocalizedName::createFromDiscriminatorValue)); });
        deserializerMap.put("parentGroup", (n) -> { this.setParentGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("relations", (n) -> { this.setRelations(n.getCollectionOfObjectValues(Relation::createFromDiscriminatorValue)); });
        deserializerMap.put("terms", (n) -> { this.setTerms(n.getCollectionOfObjectValues(Term::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localizedNames property value. Name of the set for each languageTag.
     * @return a java.util.List<LocalizedName>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocalizedName> getLocalizedNames() {
        return this.backingStore.get("localizedNames");
    }
    /**
     * Gets the parentGroup property value. The parentGroup property
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group getParentGroup() {
        return this.backingStore.get("parentGroup");
    }
    /**
     * Gets the properties property value. Custom properties for the set.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getProperties() {
        return this.backingStore.get("properties");
    }
    /**
     * Gets the relations property value. Indicates which terms have been pinned or reused directly under the set.
     * @return a java.util.List<Relation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Relation> getRelations() {
        return this.backingStore.get("relations");
    }
    /**
     * Gets the terms property value. All the terms under the set.
     * @return a java.util.List<Term>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Term> getTerms() {
        return this.backingStore.get("terms");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("localizedNames", this.getLocalizedNames());
        writer.writeObjectValue("parentGroup", this.getParentGroup());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
        writer.writeCollectionOfObjectValues("relations", this.getRelations());
        writer.writeCollectionOfObjectValues("terms", this.getTerms());
    }
    /**
     * Sets the children property value. Children terms of set in term [store].
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<Term> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of set creation. Read-only.
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
     * Sets the localizedNames property value. Name of the set for each languageTag.
     * @param value Value to set for the localizedNames property.
     */
    public void setLocalizedNames(@jakarta.annotation.Nullable final java.util.List<LocalizedName> value) {
        this.backingStore.set("localizedNames", value);
    }
    /**
     * Sets the parentGroup property value. The parentGroup property
     * @param value Value to set for the parentGroup property.
     */
    public void setParentGroup(@jakarta.annotation.Nullable final Group value) {
        this.backingStore.set("parentGroup", value);
    }
    /**
     * Sets the properties property value. Custom properties for the set.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("properties", value);
    }
    /**
     * Sets the relations property value. Indicates which terms have been pinned or reused directly under the set.
     * @param value Value to set for the relations property.
     */
    public void setRelations(@jakarta.annotation.Nullable final java.util.List<Relation> value) {
        this.backingStore.set("relations", value);
    }
    /**
     * Sets the terms property value. All the terms under the set.
     * @param value Value to set for the terms property.
     */
    public void setTerms(@jakarta.annotation.Nullable final java.util.List<Term> value) {
        this.backingStore.set("terms", value);
    }
}
