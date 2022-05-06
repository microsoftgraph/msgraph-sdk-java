package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The content of the item.  */
    private String _content;
    /** The type of the content. Possible values are text and html.  */
    private BodyType _contentType;
    /**
     * Instantiates a new itemBody and sets the default values.
     * @return a void
     */
    public ItemBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemBody
     */
    @javax.annotation.Nonnull
    public static ItemBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemBody();
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
     * Gets the content property value. The content of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this._content;
    }
    /**
     * Gets the contentType property value. The type of the content. Possible values are text and html.
     * @return a bodyType
     */
    @javax.annotation.Nullable
    public BodyType getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getEnumValue(BodyType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeEnumValue("contentType", this.getContentType());
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
     * Sets the content property value. The content of the item.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final String value) {
        this._content = value;
    }
    /**
     * Sets the contentType property value. The type of the content. Possible values are text and html.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final BodyType value) {
        this._contentType = value;
    }
}
