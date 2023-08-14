package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VisualInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional. JSON object used to represent an icon which represents the application used to generate the activity
     */
    private ImageInfo attribution;
    /**
     * Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color
     */
    private String backgroundColor;
    /**
     * Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI
     */
    private Json content;
    /**
     * Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata)
     */
    private String description;
    /**
     * Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation)
     */
    private String displayText;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new visualInfo and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public VisualInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a visualInfo
     */
    @jakarta.annotation.Nonnull
    public static VisualInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VisualInfo();
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
     * Gets the attribution property value. Optional. JSON object used to represent an icon which represents the application used to generate the activity
     * @return a imageInfo
     */
    @jakarta.annotation.Nullable
    public ImageInfo getAttribution() {
        return this.attribution;
    }
    /**
     * Gets the backgroundColor property value. Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    /**
     * Gets the content property value. Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getContent() {
        return this.content;
    }
    /**
     * Gets the description property value. Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayText property value. Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayText() {
        return this.displayText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("attribution", (n) -> { this.setAttribution(n.getObjectValue(ImageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("backgroundColor", (n) -> { this.setBackgroundColor(n.getStringValue()); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayText", (n) -> { this.setDisplayText(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attribution", this.getAttribution());
        writer.writeStringValue("backgroundColor", this.getBackgroundColor());
        writer.writeObjectValue("content", this.getContent());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayText", this.getDisplayText());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attribution property value. Optional. JSON object used to represent an icon which represents the application used to generate the activity
     * @param value Value to set for the attribution property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttribution(@jakarta.annotation.Nullable final ImageInfo value) {
        this.attribution = value;
    }
    /**
     * Sets the backgroundColor property value. Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color
     * @param value Value to set for the backgroundColor property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBackgroundColor(@jakarta.annotation.Nullable final String value) {
        this.backgroundColor = value;
    }
    /**
     * Sets the content property value. Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI
     * @param value Value to set for the content property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContent(@jakarta.annotation.Nullable final Json value) {
        this.content = value;
    }
    /**
     * Sets the description property value. Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata)
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayText property value. Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation)
     * @param value Value to set for the displayText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayText(@jakarta.annotation.Nullable final String value) {
        this.displayText = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
