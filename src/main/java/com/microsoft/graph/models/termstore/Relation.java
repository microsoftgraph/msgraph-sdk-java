package microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class Relation extends Entity implements Parsable {
    /** The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the relation is directly with the [set].  */
    private Term _fromTerm;
    /** The type of relation. Possible values are: pin, reuse.  */
    private RelationType _relationship;
    /** The [set] in which the relation is relevant.  */
    private Set _set;
    /** The to [term] of the relation. The term to which the relationship is defined.  */
    private Term _toTerm;
    /**
     * Instantiates a new relation and sets the default values.
     * @return a void
     */
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
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("fromTerm", (n) -> { currentObject.setFromTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
            this.put("relationship", (n) -> { currentObject.setRelationship(n.getEnumValue(RelationType.class)); });
            this.put("set", (n) -> { currentObject.setSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
            this.put("toTerm", (n) -> { currentObject.setToTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fromTerm property value. The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the relation is directly with the [set].
     * @return a term
     */
    @javax.annotation.Nullable
    public Term getFromTerm() {
        return this._fromTerm;
    }
    /**
     * Gets the relationship property value. The type of relation. Possible values are: pin, reuse.
     * @return a relationType
     */
    @javax.annotation.Nullable
    public RelationType getRelationship() {
        return this._relationship;
    }
    /**
     * Gets the set property value. The [set] in which the relation is relevant.
     * @return a set
     */
    @javax.annotation.Nullable
    public Set getSet() {
        return this._set;
    }
    /**
     * Gets the toTerm property value. The to [term] of the relation. The term to which the relationship is defined.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fromTerm", this.getFromTerm());
        writer.writeEnumValue("relationship", this.getRelationship());
        writer.writeObjectValue("set", this.getSet());
        writer.writeObjectValue("toTerm", this.getToTerm());
    }
    /**
     * Sets the fromTerm property value. The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the relation is directly with the [set].
     * @param value Value to set for the fromTerm property.
     * @return a void
     */
    public void setFromTerm(@javax.annotation.Nullable final Term value) {
        this._fromTerm = value;
    }
    /**
     * Sets the relationship property value. The type of relation. Possible values are: pin, reuse.
     * @param value Value to set for the relationship property.
     * @return a void
     */
    public void setRelationship(@javax.annotation.Nullable final RelationType value) {
        this._relationship = value;
    }
    /**
     * Sets the set property value. The [set] in which the relation is relevant.
     * @param value Value to set for the set property.
     * @return a void
     */
    public void setSet(@javax.annotation.Nullable final Set value) {
        this._set = value;
    }
    /**
     * Sets the toTerm property value. The to [term] of the relation. The term to which the relationship is defined.
     * @param value Value to set for the toTerm property.
     * @return a void
     */
    public void setToTerm(@javax.annotation.Nullable final Term value) {
        this._toTerm = value;
    }
}
