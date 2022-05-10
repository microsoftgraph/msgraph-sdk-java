package microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.KeyValue;
public class Set extends Entity implements Parsable {
    /** Children terms of set in term [store]. */
    private java.util.List<Term> _children;
    /** Date and time of set creation. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** Description giving details on the term usage. */
    private String _description;
    /** Name of the set for each languageTag. */
    private java.util.List<LocalizedName> _localizedNames;
    /** The parentGroup property */
    private Group _parentGroup;
    /** Custom properties for the set. */
    private java.util.List<KeyValue> _properties;
    /** Indicates which terms have been pinned or reused directly under the set. */
    private java.util.List<Relation> _relations;
    /** All the terms under the set. */
    private java.util.List<Term> _terms;
    /**
     * Instantiates a new set and sets the default values.
     * @return a void
     */
    public Set() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a set
     */
    @javax.annotation.Nonnull
    public static Set createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Set();
    }
    /**
     * Gets the children property value. Children terms of set in term [store].
     * @return a term
     */
    @javax.annotation.Nullable
    public java.util.List<Term> getChildren() {
        return this._children;
    }
    /**
     * Gets the createdDateTime property value. Date and time of set creation. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description giving details on the term usage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Set currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(Term::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("localizedNames", (n) -> { currentObject.setLocalizedNames(n.getCollectionOfObjectValues(LocalizedName::createFromDiscriminatorValue)); });
            this.put("parentGroup", (n) -> { currentObject.setParentGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
            this.put("properties", (n) -> { currentObject.setProperties(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("relations", (n) -> { currentObject.setRelations(n.getCollectionOfObjectValues(Relation::createFromDiscriminatorValue)); });
            this.put("terms", (n) -> { currentObject.setTerms(n.getCollectionOfObjectValues(Term::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the localizedNames property value. Name of the set for each languageTag.
     * @return a localizedName
     */
    @javax.annotation.Nullable
    public java.util.List<LocalizedName> getLocalizedNames() {
        return this._localizedNames;
    }
    /**
     * Gets the parentGroup property value. The parentGroup property
     * @return a group
     */
    @javax.annotation.Nullable
    public Group getParentGroup() {
        return this._parentGroup;
    }
    /**
     * Gets the properties property value. Custom properties for the set.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getProperties() {
        return this._properties;
    }
    /**
     * Gets the relations property value. Indicates which terms have been pinned or reused directly under the set.
     * @return a relation
     */
    @javax.annotation.Nullable
    public java.util.List<Relation> getRelations() {
        return this._relations;
    }
    /**
     * Gets the terms property value. All the terms under the set.
     * @return a term
     */
    @javax.annotation.Nullable
    public java.util.List<Term> getTerms() {
        return this._terms;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setChildren(@javax.annotation.Nullable final java.util.List<Term> value) {
        this._children = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of set creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description giving details on the term usage.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the localizedNames property value. Name of the set for each languageTag.
     * @param value Value to set for the localizedNames property.
     * @return a void
     */
    public void setLocalizedNames(@javax.annotation.Nullable final java.util.List<LocalizedName> value) {
        this._localizedNames = value;
    }
    /**
     * Sets the parentGroup property value. The parentGroup property
     * @param value Value to set for the parentGroup property.
     * @return a void
     */
    public void setParentGroup(@javax.annotation.Nullable final Group value) {
        this._parentGroup = value;
    }
    /**
     * Sets the properties property value. Custom properties for the set.
     * @param value Value to set for the properties property.
     * @return a void
     */
    public void setProperties(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._properties = value;
    }
    /**
     * Sets the relations property value. Indicates which terms have been pinned or reused directly under the set.
     * @param value Value to set for the relations property.
     * @return a void
     */
    public void setRelations(@javax.annotation.Nullable final java.util.List<Relation> value) {
        this._relations = value;
    }
    /**
     * Sets the terms property value. All the terms under the set.
     * @param value Value to set for the terms property.
     * @return a void
     */
    public void setTerms(@javax.annotation.Nullable final java.util.List<Term> value) {
        this._terms = value;
    }
}
