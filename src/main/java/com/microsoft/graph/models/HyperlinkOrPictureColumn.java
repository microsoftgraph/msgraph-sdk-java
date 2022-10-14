package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HyperlinkOrPictureColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies whether the display format used for URL columns is an image or a hyperlink. */
    private Boolean _isPicture;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new hyperlinkOrPictureColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public HyperlinkOrPictureColumn() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.hyperlinkOrPictureColumn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hyperlinkOrPictureColumn
     */
    @javax.annotation.Nonnull
    public static HyperlinkOrPictureColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HyperlinkOrPictureColumn();
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
        final HyperlinkOrPictureColumn currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("isPicture", (n) -> { currentObject.setIsPicture(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isPicture property value. Specifies whether the display format used for URL columns is an image or a hyperlink.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPicture() {
        return this._isPicture;
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
        writer.writeBooleanValue("isPicture", this.getIsPicture());
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
     * Sets the isPicture property value. Specifies whether the display format used for URL columns is an image or a hyperlink.
     * @param value Value to set for the isPicture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPicture(@javax.annotation.Nullable final Boolean value) {
        this._isPicture = value;
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
