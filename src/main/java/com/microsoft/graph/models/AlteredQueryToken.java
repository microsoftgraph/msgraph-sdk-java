package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlteredQueryToken implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Defines the length of a changed segment. */
    private Integer _length;
    /** The OdataType property */
    private String _odataType;
    /** Defines the offset of a changed segment. */
    private Integer _offset;
    /** Represents the corrected segment string. */
    private String _suggestion;
    /**
     * Instantiates a new alteredQueryToken and sets the default values.
     * @return a void
     */
    public AlteredQueryToken() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.alteredQueryToken");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alteredQueryToken
     */
    @javax.annotation.Nonnull
    public static AlteredQueryToken createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlteredQueryToken();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AlteredQueryToken currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("length", (n) -> { currentObject.setLength(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("offset", (n) -> { currentObject.setOffset(n.getIntegerValue()); });
            this.put("suggestion", (n) -> { currentObject.setSuggestion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the length property value. Defines the length of a changed segment.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLength() {
        return this._length;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the offset property value. Defines the offset of a changed segment.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOffset() {
        return this._offset;
    }
    /**
     * Gets the suggestion property value. Represents the corrected segment string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSuggestion() {
        return this._suggestion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("length", this.getLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("suggestion", this.getSuggestion());
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
     * Sets the length property value. Defines the length of a changed segment.
     * @param value Value to set for the length property.
     * @return a void
     */
    public void setLength(@javax.annotation.Nullable final Integer value) {
        this._length = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the offset property value. Defines the offset of a changed segment.
     * @param value Value to set for the offset property.
     * @return a void
     */
    public void setOffset(@javax.annotation.Nullable final Integer value) {
        this._offset = value;
    }
    /**
     * Sets the suggestion property value. Represents the corrected segment string.
     * @param value Value to set for the suggestion property.
     * @return a void
     */
    public void setSuggestion(@javax.annotation.Nullable final String value) {
        this._suggestion = value;
    }
}
