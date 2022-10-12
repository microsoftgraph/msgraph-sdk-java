package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Relation extends Entity implements Parsable {
    /** The fromTerm property */
    private Term _fromTerm;
    /** The relationship property */
    private RelationType _relationship;
    /** The set property */
    private Set _set;
    /** The toTerm property */
    private Term _toTerm;
    /**
     * Instantiates a new relation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Relation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a relation
     */
    @javax.annotation.Nonnull
    public static Relation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Relation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Relation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("fromTerm", (n) -> { currentObject.setFromTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
            this.put("relationship", (n) -> { currentObject.setRelationship(n.getEnumValue(RelationType.class)); });
            this.put("set", (n) -> { currentObject.setSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
            this.put("toTerm", (n) -> { currentObject.setToTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fromTerm property value. The fromTerm property
     * @return a term
     */
    @javax.annotation.Nullable
    public Term getFromTerm() {
        return this._fromTerm;
    }
    /**
     * Gets the relationship property value. The relationship property
     * @return a relationType
     */
    @javax.annotation.Nullable
    public RelationType getRelationship() {
        return this._relationship;
    }
    /**
     * Gets the set property value. The set property
     * @return a set
     */
    @javax.annotation.Nullable
    public Set getSet() {
        return this._set;
    }
    /**
     * Gets the toTerm property value. The toTerm property
     * @return a term
     */
    @javax.annotation.Nullable
    public Term getToTerm() {
        return this._toTerm;
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
        writer.writeObjectValue("fromTerm", this.getFromTerm());
        writer.writeEnumValue("relationship", this.getRelationship());
        writer.writeObjectValue("set", this.getSet());
        writer.writeObjectValue("toTerm", this.getToTerm());
    }
    /**
     * Sets the fromTerm property value. The fromTerm property
     * @param value Value to set for the fromTerm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFromTerm(@javax.annotation.Nullable final Term value) {
        this._fromTerm = value;
    }
    /**
     * Sets the relationship property value. The relationship property
     * @param value Value to set for the relationship property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelationship(@javax.annotation.Nullable final RelationType value) {
        this._relationship = value;
    }
    /**
     * Sets the set property value. The set property
     * @param value Value to set for the set property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSet(@javax.annotation.Nullable final Set value) {
        this._set = value;
    }
    /**
     * Sets the toTerm property value. The toTerm property
     * @param value Value to set for the toTerm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToTerm(@javax.annotation.Nullable final Term value) {
        this._toTerm = value;
    }
}
