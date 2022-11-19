package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DateTimeColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details. If unspecified, treated as default. */
    private String _displayAs;
    /** Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime */
    private String _format;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new dateTimeColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DateTimeColumn() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.dateTimeColumn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dateTimeColumn
     */
    @javax.annotation.Nonnull
    public static DateTimeColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DateTimeColumn();
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
     * Gets the displayAs property value. How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details. If unspecified, treated as default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayAs() {
        return this._displayAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DateTimeColumn currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("displayAs", (n) -> { currentObject.setDisplayAs(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { currentObject.setFormat(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the format property value. Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormat() {
        return this._format;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayAs", this.getDisplayAs());
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the displayAs property value. How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details. If unspecified, treated as default.
     * @param value Value to set for the displayAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayAs(@javax.annotation.Nullable final String value) {
        this._displayAs = value;
    }
    /**
     * Sets the format property value. Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final String value) {
        this._format = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
