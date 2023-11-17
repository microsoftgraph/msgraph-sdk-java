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
public class Term extends Entity implements Parsable {
    /**
     * Instantiates a new Term and sets the default values.
     */
    public Term() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Term
     */
    @jakarta.annotation.Nonnull
    public static Term createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Term();
    }
    /**
     * Gets the children property value. Children of current term.
     * @return a java.util.List<Term>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Term> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * Gets the createdDateTime property value. Date and time of term creation. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the descriptions property value. Description about term that is dependent on the languageTag.
     * @return a java.util.List<LocalizedDescription>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocalizedDescription> getDescriptions() {
        return this.backingStore.get("descriptions");
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
        deserializerMap.put("descriptions", (n) -> { this.setDescriptions(n.getCollectionOfObjectValues(LocalizedDescription::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfObjectValues(LocalizedLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("relations", (n) -> { this.setRelations(n.getCollectionOfObjectValues(Relation::createFromDiscriminatorValue)); });
        deserializerMap.put("set", (n) -> { this.setSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. Label metadata for a term.
     * @return a java.util.List<LocalizedLabel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocalizedLabel> getLabels() {
        return this.backingStore.get("labels");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last date and time of term modification. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the properties property value. Collection of properties on the term.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getProperties() {
        return this.backingStore.get("properties");
    }
    /**
     * Gets the relations property value. To indicate which terms are related to the current term as either pinned or reused.
     * @return a java.util.List<Relation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Relation> getRelations() {
        return this.backingStore.get("relations");
    }
    /**
     * Gets the set property value. The [set] in which the term is created.
     * @return a Set
     */
    @jakarta.annotation.Nullable
    public Set getSet() {
        return this.backingStore.get("set");
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
        writer.writeCollectionOfObjectValues("descriptions", this.getDescriptions());
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
        writer.writeCollectionOfObjectValues("relations", this.getRelations());
        writer.writeObjectValue("set", this.getSet());
    }
    /**
     * Sets the children property value. Children of current term.
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<Term> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of term creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the descriptions property value. Description about term that is dependent on the languageTag.
     * @param value Value to set for the descriptions property.
     */
    public void setDescriptions(@jakarta.annotation.Nullable final java.util.List<LocalizedDescription> value) {
        this.backingStore.set("descriptions", value);
    }
    /**
     * Sets the labels property value. Label metadata for a term.
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final java.util.List<LocalizedLabel> value) {
        this.backingStore.set("labels", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last date and time of term modification. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the properties property value. Collection of properties on the term.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("properties", value);
    }
    /**
     * Sets the relations property value. To indicate which terms are related to the current term as either pinned or reused.
     * @param value Value to set for the relations property.
     */
    public void setRelations(@jakarta.annotation.Nullable final java.util.List<Relation> value) {
        this.backingStore.set("relations", value);
    }
    /**
     * Sets the set property value. The [set] in which the term is created.
     * @param value Value to set for the set property.
     */
    public void setSet(@jakarta.annotation.Nullable final Set value) {
        this.backingStore.set("set", value);
    }
}
