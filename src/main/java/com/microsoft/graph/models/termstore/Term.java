package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Term extends Entity implements Parsable {
    /** Children of current term. */
    private java.util.List<Term> _children;
    /** Date and time of term creation. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** Description about term that is dependent on the languageTag. */
    private java.util.List<LocalizedDescription> _descriptions;
    /** Label metadata for a term. */
    private java.util.List<LocalizedLabel> _labels;
    /** Last date and time of term modification. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Collection of properties on the term. */
    private java.util.List<KeyValue> _properties;
    /** To indicate which terms are related to the current term as either pinned or reused. */
    private java.util.List<Relation> _relations;
    /** The [set] in which the term is created. */
    private Set _set;
    /**
     * Instantiates a new term and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Term() {
        super();
        this.setOdataType("#microsoft.graph.termStore.term");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a term
     */
    @javax.annotation.Nonnull
    public static Term createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Term();
    }
    /**
     * Gets the children property value. Children of current term.
     * @return a term
     */
    @javax.annotation.Nullable
    public java.util.List<Term> getChildren() {
        return this._children;
    }
    /**
     * Gets the createdDateTime property value. Date and time of term creation. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the descriptions property value. Description about term that is dependent on the languageTag.
     * @return a localizedDescription
     */
    @javax.annotation.Nullable
    public java.util.List<LocalizedDescription> getDescriptions() {
        return this._descriptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Term currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(Term::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("descriptions", (n) -> { currentObject.setDescriptions(n.getCollectionOfObjectValues(LocalizedDescription::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { currentObject.setLabels(n.getCollectionOfObjectValues(LocalizedLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("properties", (n) -> { currentObject.setProperties(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("relations", (n) -> { currentObject.setRelations(n.getCollectionOfObjectValues(Relation::createFromDiscriminatorValue)); });
        deserializerMap.put("set", (n) -> { currentObject.setSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. Label metadata for a term.
     * @return a localizedLabel
     */
    @javax.annotation.Nullable
    public java.util.List<LocalizedLabel> getLabels() {
        return this._labels;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last date and time of term modification. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the properties property value. Collection of properties on the term.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getProperties() {
        return this._properties;
    }
    /**
     * Gets the relations property value. To indicate which terms are related to the current term as either pinned or reused.
     * @return a relation
     */
    @javax.annotation.Nullable
    public java.util.List<Relation> getRelations() {
        return this._relations;
    }
    /**
     * Gets the set property value. The [set] in which the term is created.
     * @return a set
     */
    @javax.annotation.Nullable
    public Set getSet() {
        return this._set;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildren(@javax.annotation.Nullable final java.util.List<Term> value) {
        this._children = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of term creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the descriptions property value. Description about term that is dependent on the languageTag.
     * @param value Value to set for the descriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescriptions(@javax.annotation.Nullable final java.util.List<LocalizedDescription> value) {
        this._descriptions = value;
    }
    /**
     * Sets the labels property value. Label metadata for a term.
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final java.util.List<LocalizedLabel> value) {
        this._labels = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last date and time of term modification. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the properties property value. Collection of properties on the term.
     * @param value Value to set for the properties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProperties(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._properties = value;
    }
    /**
     * Sets the relations property value. To indicate which terms are related to the current term as either pinned or reused.
     * @param value Value to set for the relations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelations(@javax.annotation.Nullable final java.util.List<Relation> value) {
        this._relations = value;
    }
    /**
     * Sets the set property value. The [set] in which the term is created.
     * @param value Value to set for the set property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSet(@javax.annotation.Nullable final Set value) {
        this._set = value;
    }
}
