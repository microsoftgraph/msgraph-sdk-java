package com.microsoft.graph.models;

import com.microsoft.graph.models.termstore.Set;
import com.microsoft.graph.models.termstore.Term;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TermColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies whether the column will allow more than one value.
     */
    private Boolean allowMultipleValues;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The parentTerm property
     */
    private Term parentTerm;
    /**
     * Specifies whether to display the entire term path or only the term label.
     */
    private Boolean showFullyQualifiedName;
    /**
     * The termSet property
     */
    private Set termSet;
    /**
     * Instantiates a new termColumn and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TermColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termColumn
     */
    @jakarta.annotation.Nonnull
    public static TermColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermColumn();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowMultipleValues property value. Specifies whether the column will allow more than one value.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowMultipleValues() {
        return this.allowMultipleValues;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowMultipleValues", (n) -> { this.setAllowMultipleValues(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentTerm", (n) -> { this.setParentTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
        deserializerMap.put("showFullyQualifiedName", (n) -> { this.setShowFullyQualifiedName(n.getBooleanValue()); });
        deserializerMap.put("termSet", (n) -> { this.setTermSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the parentTerm property value. The parentTerm property
     * @return a term
     */
    @jakarta.annotation.Nullable
    public Term getParentTerm() {
        return this.parentTerm;
    }
    /**
     * Gets the showFullyQualifiedName property value. Specifies whether to display the entire term path or only the term label.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowFullyQualifiedName() {
        return this.showFullyQualifiedName;
    }
    /**
     * Gets the termSet property value. The termSet property
     * @return a set
     */
    @jakarta.annotation.Nullable
    public Set getTermSet() {
        return this.termSet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleValues", this.getAllowMultipleValues());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("parentTerm", this.getParentTerm());
        writer.writeBooleanValue("showFullyQualifiedName", this.getShowFullyQualifiedName());
        writer.writeObjectValue("termSet", this.getTermSet());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowMultipleValues property value. Specifies whether the column will allow more than one value.
     * @param value Value to set for the allowMultipleValues property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowMultipleValues(@jakarta.annotation.Nullable final Boolean value) {
        this.allowMultipleValues = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the parentTerm property value. The parentTerm property
     * @param value Value to set for the parentTerm property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParentTerm(@jakarta.annotation.Nullable final Term value) {
        this.parentTerm = value;
    }
    /**
     * Sets the showFullyQualifiedName property value. Specifies whether to display the entire term path or only the term label.
     * @param value Value to set for the showFullyQualifiedName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setShowFullyQualifiedName(@jakarta.annotation.Nullable final Boolean value) {
        this.showFullyQualifiedName = value;
    }
    /**
     * Sets the termSet property value. The termSet property
     * @param value Value to set for the termSet property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTermSet(@jakarta.annotation.Nullable final Set value) {
        this.termSet = value;
    }
}
