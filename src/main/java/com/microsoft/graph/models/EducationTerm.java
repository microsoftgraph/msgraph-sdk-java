package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationTerm implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Display name of the term. */
    private String displayName;
    /** End of the term. */
    private LocalDate endDate;
    /** ID of term in the syncing system. */
    private String externalId;
    /** The OdataType property */
    private String odataType;
    /** Start of the term. */
    private LocalDate startDate;
    /**
     * Instantiates a new educationTerm and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationTerm() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. Display name of the term.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDate property value. End of the term.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * Gets the externalId property value. ID of term in the syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the startDate property value. Start of the term.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. Display name of the term.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDate property value. End of the term.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the externalId property value. ID of term in the syncing system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the startDate property value. Start of the term.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
}
