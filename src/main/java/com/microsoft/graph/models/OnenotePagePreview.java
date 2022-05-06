package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenotePagePreview implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The links property  */
    private OnenotePagePreviewLinks _links;
    /** The previewText property  */
    private String _previewText;
    /**
     * Instantiates a new onenotePagePreview and sets the default values.
     * @return a void
     */
    public OnenotePagePreview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePagePreview
     */
    @javax.annotation.Nonnull
    public static OnenotePagePreview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePagePreview();
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
        final OnenotePagePreview currentObject = this;
        return new HashMap<>(2) {{
            this.put("links", (n) -> { currentObject.setLinks(n.getObjectValue(OnenotePagePreviewLinks::createFromDiscriminatorValue)); });
            this.put("previewText", (n) -> { currentObject.setPreviewText(n.getStringValue()); });
        }};
    }
    /**
     * Gets the links property value. The links property
     * @return a onenotePagePreviewLinks
     */
    @javax.annotation.Nullable
    public OnenotePagePreviewLinks getLinks() {
        return this._links;
    }
    /**
     * Gets the previewText property value. The previewText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviewText() {
        return this._previewText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("previewText", this.getPreviewText());
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
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     * @return a void
     */
    public void setLinks(@javax.annotation.Nullable final OnenotePagePreviewLinks value) {
        this._links = value;
    }
    /**
     * Sets the previewText property value. The previewText property
     * @param value Value to set for the previewText property.
     * @return a void
     */
    public void setPreviewText(@javax.annotation.Nullable final String value) {
        this._previewText = value;
    }
}
