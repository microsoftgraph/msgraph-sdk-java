package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentTypeOrder implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Whether this is the default Content Type */
    private Boolean _default_escaped;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the position in which the Content Type appears in the selection UI. */
    private Integer _position;
    /**
     * Instantiates a new contentTypeOrder and sets the default values.
     * @return a void
     */
    public ContentTypeOrder() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.contentTypeOrder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contentTypeOrder
     */
    @javax.annotation.Nonnull
    public static ContentTypeOrder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentTypeOrder();
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
     * Gets the default property value. Whether this is the default Content Type
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefault() {
        return this._default_escaped;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ContentTypeOrder currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("default", (n) -> { currentObject.setDefault(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("position", (n) -> { currentObject.setPosition(n.getIntegerValue()); });
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
     * Gets the position property value. Specifies the position in which the Content Type appears in the selection UI.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPosition() {
        return this._position;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("default", this.getDefault());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("position", this.getPosition());
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
     * Sets the default property value. Whether this is the default Content Type
     * @param value Value to set for the default property.
     * @return a void
     */
    public void setDefault(@javax.annotation.Nullable final Boolean value) {
        this._default_escaped = value;
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
     * Sets the position property value. Specifies the position in which the Content Type appears in the selection UI.
     * @param value Value to set for the position property.
     * @return a void
     */
    public void setPosition(@javax.annotation.Nullable final Integer value) {
        this._position = value;
    }
}
