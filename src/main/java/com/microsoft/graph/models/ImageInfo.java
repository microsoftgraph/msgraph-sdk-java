package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageInfo implements AdditionalDataHolder, Parsable {
    /**
     * Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example  a high contrast image
     */
    private Boolean addImageQuery;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional; alt-text accessible content for the image
     */
    private String alternateText;
    /**
     * The alternativeText property
     */
    private String alternativeText;
    /**
     * Optional; URI that points to an icon which represents the application used to generate the activity
     */
    private String iconUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new ImageInfo and sets the default values.
     */
    public ImageInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImageInfo
     */
    @jakarta.annotation.Nonnull
    public static ImageInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageInfo();
    }
    /**
     * Gets the addImageQuery property value. Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example  a high contrast image
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAddImageQuery() {
        return this.addImageQuery;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the alternateText property value. Optional; alt-text accessible content for the image
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlternateText() {
        return this.alternateText;
    }
    /**
     * Gets the alternativeText property value. The alternativeText property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlternativeText() {
        return this.alternativeText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("addImageQuery", (n) -> { this.setAddImageQuery(n.getBooleanValue()); });
        deserializerMap.put("alternateText", (n) -> { this.setAlternateText(n.getStringValue()); });
        deserializerMap.put("alternativeText", (n) -> { this.setAlternativeText(n.getStringValue()); });
        deserializerMap.put("iconUrl", (n) -> { this.setIconUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iconUrl property value. Optional; URI that points to an icon which represents the application used to generate the activity
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIconUrl() {
        return this.iconUrl;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAddImageQuery(@jakarta.annotation.Nullable final Boolean value) {
        this.addImageQuery = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alternateText property value. Optional; alt-text accessible content for the image
     * @param value Value to set for the alternateText property.
     */
    public void setAlternateText(@jakarta.annotation.Nullable final String value) {
        this.alternateText = value;
    }
    /**
     * Sets the alternativeText property value. The alternativeText property
     * @param value Value to set for the alternativeText property.
     */
    public void setAlternativeText(@jakarta.annotation.Nullable final String value) {
        this.alternativeText = value;
    }
    /**
     * Sets the iconUrl property value. Optional; URI that points to an icon which represents the application used to generate the activity
     * @param value Value to set for the iconUrl property.
     */
    public void setIconUrl(@jakarta.annotation.Nullable final String value) {
        this.iconUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
