package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenotePatchContentCommand implements AdditionalDataHolder, Parsable {
    /** The action to perform on the target element. Possible values are: replace, append, delete, insert, or prepend. */
    private OnenotePatchActionType _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary data, the request must be sent using the multipart/form-data content type with a 'Commands' part. */
    private String _content;
    /** The location to add the supplied content, relative to the target element. Possible values are: after (default) or before. */
    private OnenotePatchInsertPosition _position;
    /** The element to update. Must be the #<data-id> or the generated {id} of the element, or the body or title keyword. */
    private String _target;
    /**
     * Instantiates a new onenotePatchContentCommand and sets the default values.
     * @return a void
     */
    public OnenotePatchContentCommand() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePatchContentCommand
     */
    @javax.annotation.Nonnull
    public static OnenotePatchContentCommand createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePatchContentCommand();
    }
    /**
     * Gets the action property value. The action to perform on the target element. Possible values are: replace, append, delete, insert, or prepend.
     * @return a onenotePatchActionType
     */
    @javax.annotation.Nullable
    public OnenotePatchActionType getAction() {
        return this._action;
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
     * Gets the content property value. A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnenotePatchContentCommand currentObject = this;
        return new HashMap<>(4) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(OnenotePatchActionType.class)); });
            this.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
            this.put("position", (n) -> { currentObject.setPosition(n.getEnumValue(OnenotePatchInsertPosition.class)); });
            this.put("target", (n) -> { currentObject.setTarget(n.getStringValue()); });
        }};
    }
    /**
     * Gets the position property value. The location to add the supplied content, relative to the target element. Possible values are: after (default) or before.
     * @return a onenotePatchInsertPosition
     */
    @javax.annotation.Nullable
    public OnenotePatchInsertPosition getPosition() {
        return this._position;
    }
    /**
     * Gets the target property value. The element to update. Must be the #<data-id> or the generated {id} of the element, or the body or title keyword.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("content", this.getContent());
        writer.writeEnumValue("position", this.getPosition());
        writer.writeStringValue("target", this.getTarget());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action to perform on the target element. Possible values are: replace, append, delete, insert, or prepend.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final OnenotePatchActionType value) {
        this._action = value;
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
     * Sets the content property value. A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final String value) {
        this._content = value;
    }
    /**
     * Sets the position property value. The location to add the supplied content, relative to the target element. Possible values are: after (default) or before.
     * @param value Value to set for the position property.
     * @return a void
     */
    public void setPosition(@javax.annotation.Nullable final OnenotePatchInsertPosition value) {
        this._position = value;
    }
    /**
     * Sets the target property value. The element to update. Must be the #<data-id> or the generated {id} of the element, or the body or title keyword.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final String value) {
        this._target = value;
    }
}
