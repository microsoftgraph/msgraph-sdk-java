package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.termstore.Set;
import microsoft.graph.models.termstore.Term;
public class TermColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies whether the column will allow more than one value */
    private Boolean _allowMultipleValues;
    /** The parentTerm property */
    private Term _parentTerm;
    /** Specifies whether to display the entire term path or only the term label. */
    private Boolean _showFullyQualifiedName;
    /** The termSet property */
    private Set _termSet;
    /**
     * Instantiates a new termColumn and sets the default values.
     * @return a void
     */
    public TermColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termColumn
     */
    @javax.annotation.Nonnull
    public static TermColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermColumn();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the allowMultipleValues property value. Specifies whether the column will allow more than one value
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleValues() {
        return this._allowMultipleValues;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TermColumn currentObject = this;
        return new HashMap<>(4) {{
            this.put("allowMultipleValues", (n) -> { currentObject.setAllowMultipleValues(n.getBooleanValue()); });
            this.put("parentTerm", (n) -> { currentObject.setParentTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
            this.put("showFullyQualifiedName", (n) -> { currentObject.setShowFullyQualifiedName(n.getBooleanValue()); });
            this.put("termSet", (n) -> { currentObject.setTermSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the parentTerm property value. The parentTerm property
     * @return a term
     */
    @javax.annotation.Nullable
    public Term getParentTerm() {
        return this._parentTerm;
    }
    /**
     * Gets the showFullyQualifiedName property value. Specifies whether to display the entire term path or only the term label.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowFullyQualifiedName() {
        return this._showFullyQualifiedName;
    }
    /**
     * Gets the termSet property value. The termSet property
     * @return a set
     */
    @javax.annotation.Nullable
    public Set getTermSet() {
        return this._termSet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleValues", this.getAllowMultipleValues());
        writer.writeObjectValue("parentTerm", this.getParentTerm());
        writer.writeBooleanValue("showFullyQualifiedName", this.getShowFullyQualifiedName());
        writer.writeObjectValue("termSet", this.getTermSet());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowMultipleValues property value. Specifies whether the column will allow more than one value
     * @param value Value to set for the allowMultipleValues property.
     * @return a void
     */
    public void setAllowMultipleValues(@javax.annotation.Nullable final Boolean value) {
        this._allowMultipleValues = value;
    }
    /**
     * Sets the parentTerm property value. The parentTerm property
     * @param value Value to set for the parentTerm property.
     * @return a void
     */
    public void setParentTerm(@javax.annotation.Nullable final Term value) {
        this._parentTerm = value;
    }
    /**
     * Sets the showFullyQualifiedName property value. Specifies whether to display the entire term path or only the term label.
     * @param value Value to set for the showFullyQualifiedName property.
     * @return a void
     */
    public void setShowFullyQualifiedName(@javax.annotation.Nullable final Boolean value) {
        this._showFullyQualifiedName = value;
    }
    /**
     * Sets the termSet property value. The termSet property
     * @param value Value to set for the termSet property.
     * @return a void
     */
    public void setTermSet(@javax.annotation.Nullable final Set value) {
        this._termSet = value;
    }
}
