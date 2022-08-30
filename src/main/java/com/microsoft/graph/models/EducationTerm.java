package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationTerm implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Display name of the term. */
    private String _displayName;
    /** End of the term. */
    private LocalDate _endDate;
    /** ID of term in the syncing system. */
    private String _externalId;
    /** The OdataType property */
    private String _odataType;
    /** Start of the term. */
    private LocalDate _startDate;
    /**
     * Instantiates a new educationTerm and sets the default values.
     * @return a void
     */
    public EducationTerm() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.educationTerm");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationTerm
     */
    @javax.annotation.Nonnull
    public static EducationTerm createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationTerm();
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
     * Gets the displayName property value. Display name of the term.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endDate property value. End of the term.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this._endDate;
    }
    /**
     * Gets the externalId property value. ID of term in the syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationTerm currentObject = this;
        return new HashMap<>(5) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endDate", (n) -> { currentObject.setEndDate(n.getLocalDateValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("startDate", (n) -> { currentObject.setStartDate(n.getLocalDateValue()); });
        }};
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
     * Gets the startDate property value. Start of the term.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this._startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalDateValue("startDate", this.getStartDate());
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
     * Sets the displayName property value. Display name of the term.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endDate property value. End of the term.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this._endDate = value;
    }
    /**
     * Sets the externalId property value. ID of term in the syncing system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
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
     * Sets the startDate property value. Start of the term.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._startDate = value;
    }
}
