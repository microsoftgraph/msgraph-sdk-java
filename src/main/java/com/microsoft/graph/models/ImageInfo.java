package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImageInfo implements AdditionalDataHolder, Parsable {
    /** Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example  a high contrast image */
    private Boolean _addImageQuery;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Optional; alt-text accessible content for the image */
    private String _alternateText;
    /** The alternativeText property */
    private String _alternativeText;
    /** Optional; URI that points to an icon which represents the application used to generate the activity */
    private String _iconUrl;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new imageInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImageInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a imageInfo
     */
    @javax.annotation.Nonnull
    public static ImageInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageInfo();
    }
    /**
     * Gets the addImageQuery property value. Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example  a high contrast image
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAddImageQuery() {
        return this._addImageQuery;
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
     * Gets the alternateText property value. Optional; alt-text accessible content for the image
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateText() {
        return this._alternateText;
    }
    /**
     * Gets the alternativeText property value. The alternativeText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternativeText() {
        return this._alternativeText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("addImageQuery", (n) -> { this.setAddImageQuery(n.getBooleanValue()); });
        deserializerMap.put("alternateText", (n) -> { this.setAlternateText(n.getStringValue()); });
        deserializerMap.put("alternativeText", (n) -> { this.setAlternativeText(n.getStringValue()); });
        deserializerMap.put("iconUrl", (n) -> { this.setIconUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iconUrl property value. Optional; URI that points to an icon which represents the application used to generate the activity
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIconUrl() {
        return this._iconUrl;
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
        writer.writeBooleanValue("addImageQuery", this.getAddImageQuery());
        writer.writeStringValue("alternateText", this.getAlternateText());
        writer.writeStringValue("alternativeText", this.getAlternativeText());
        writer.writeStringValue("iconUrl", this.getIconUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addImageQuery property value. Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example  a high contrast image
     * @param value Value to set for the addImageQuery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddImageQuery(@javax.annotation.Nullable final Boolean value) {
        this._addImageQuery = value;
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
     * Sets the alternateText property value. Optional; alt-text accessible content for the image
     * @param value Value to set for the alternateText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateText(@javax.annotation.Nullable final String value) {
        this._alternateText = value;
    }
    /**
     * Sets the alternativeText property value. The alternativeText property
     * @param value Value to set for the alternativeText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeText(@javax.annotation.Nullable final String value) {
        this._alternativeText = value;
    }
    /**
     * Sets the iconUrl property value. Optional; URI that points to an icon which represents the application used to generate the activity
     * @param value Value to set for the iconUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIconUrl(@javax.annotation.Nullable final String value) {
        this._iconUrl = value;
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
