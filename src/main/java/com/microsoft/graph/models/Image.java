package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Image implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Optional. Height of the image, in pixels. Read-only. */
    private Integer _height;
    /** The OdataType property */
    private String _odataType;
    /** Optional. Width of the image, in pixels. Read-only. */
    private Integer _width;
    /**
     * Instantiates a new image and sets the default values.
     * @return a void
     */
    public Image() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.image");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a image
     */
    @javax.annotation.Nonnull
    public static Image createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Image();
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
        final Image currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("height", (n) -> { currentObject.setHeight(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("width", (n) -> { currentObject.setWidth(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the height property value. Optional. Height of the image, in pixels. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHeight() {
        return this._height;
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
     * Gets the width property value. Optional. Width of the image, in pixels. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWidth() {
        return this._width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("width", this.getWidth());
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
     * Sets the height property value. Optional. Height of the image, in pixels. Read-only.
     * @param value Value to set for the height property.
     * @return a void
     */
    public void setHeight(@javax.annotation.Nullable final Integer value) {
        this._height = value;
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
     * Sets the width property value. Optional. Width of the image, in pixels. Read-only.
     * @param value Value to set for the width property.
     * @return a void
     */
    public void setWidth(@javax.annotation.Nullable final Integer value) {
        this._width = value;
    }
}
