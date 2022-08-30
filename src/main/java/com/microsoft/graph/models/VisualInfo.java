package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VisualInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Optional. JSON object used to represent an icon which represents the application used to generate the activity */
    private ImageInfo _attribution;
    /** Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color */
    private String _backgroundColor;
    /** Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI */
    private Json _content;
    /** Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata) */
    private String _description;
    /** Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation) */
    private String _displayText;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new visualInfo and sets the default values.
     * @return a void
     */
    public VisualInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.visualInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a visualInfo
     */
    @javax.annotation.Nonnull
    public static VisualInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VisualInfo();
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
     * Gets the attribution property value. Optional. JSON object used to represent an icon which represents the application used to generate the activity
     * @return a imageInfo
     */
    @javax.annotation.Nullable
    public ImageInfo getAttribution() {
        return this._attribution;
    }
    /**
     * Gets the backgroundColor property value. Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackgroundColor() {
        return this._backgroundColor;
    }
    /**
     * Gets the content property value. Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getContent() {
        return this._content;
    }
    /**
     * Gets the description property value. Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayText property value. Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayText() {
        return this._displayText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VisualInfo currentObject = this;
        return new HashMap<>(6) {{
            this.put("attribution", (n) -> { currentObject.setAttribution(n.getObjectValue(ImageInfo::createFromDiscriminatorValue)); });
            this.put("backgroundColor", (n) -> { currentObject.setBackgroundColor(n.getStringValue()); });
            this.put("content", (n) -> { currentObject.setContent(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayText", (n) -> { currentObject.setDisplayText(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attribution property value. Optional. JSON object used to represent an icon which represents the application used to generate the activity
     * @param value Value to set for the attribution property.
     * @return a void
     */
    public void setAttribution(@javax.annotation.Nullable final ImageInfo value) {
        this._attribution = value;
    }
    /**
     * Sets the backgroundColor property value. Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color
     * @param value Value to set for the backgroundColor property.
     * @return a void
     */
    public void setBackgroundColor(@javax.annotation.Nullable final String value) {
        this._backgroundColor = value;
    }
    /**
     * Sets the content property value. Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final Json value) {
        this._content = value;
    }
    /**
     * Sets the description property value. Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata)
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayText property value. Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation)
     * @param value Value to set for the displayText property.
     * @return a void
     */
    public void setDisplayText(@javax.annotation.Nullable final String value) {
        this._displayText = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
