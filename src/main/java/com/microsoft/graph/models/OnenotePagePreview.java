package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenotePagePreview implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The links property
     */
    private OnenotePagePreviewLinks links;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The previewText property
     */
    private String previewText;
    /**
     * Instantiates a new onenotePagePreview and sets the default values.
     */
    public OnenotePagePreview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePagePreview
     */
    @jakarta.annotation.Nonnull
    public static OnenotePagePreview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePagePreview();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(OnenotePagePreviewLinks::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the links property value. The links property
     * @return a onenotePagePreviewLinks
     */
    @jakarta.annotation.Nullable
    public OnenotePagePreviewLinks getLinks() {
        return this.links;
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
     * Gets the previewText property value. The previewText property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPreviewText() {
        return this.previewText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("previewText", this.getPreviewText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final OnenotePagePreviewLinks value) {
        this.links = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the previewText property value. The previewText property
     * @param value Value to set for the previewText property.
     */
    public void setPreviewText(@jakarta.annotation.Nullable final String value) {
        this.previewText = value;
    }
}
