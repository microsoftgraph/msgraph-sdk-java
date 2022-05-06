package microsoft.graph.users.item.onenote.notebooks.item.sections.item.pages.item.onenotepatchcontent;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.OnenotePatchContentCommand;
/** Provides operations to call the onenotePatchContent method.  */
public class OnenotePatchContentRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The commands property  */
    private java.util.List<OnenotePatchContentCommand> _commands;
    /**
     * Instantiates a new onenotePatchContentRequestBody and sets the default values.
     * @return a void
     */
    public OnenotePatchContentRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePatchContentRequestBody
     */
    @javax.annotation.Nonnull
    public static OnenotePatchContentRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePatchContentRequestBody();
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
     * Gets the commands property value. The commands property
     * @return a onenotePatchContentCommand
     */
    @javax.annotation.Nullable
    public java.util.List<OnenotePatchContentCommand> getCommands() {
        return this._commands;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnenotePatchContentRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("commands", (n) -> { currentObject.setCommands(n.getCollectionOfObjectValues(OnenotePatchContentCommand::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("commands", this.getCommands());
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
     * Sets the commands property value. The commands property
     * @param value Value to set for the commands property.
     * @return a void
     */
    public void setCommands(@javax.annotation.Nullable final java.util.List<OnenotePatchContentCommand> value) {
        this._commands = value;
    }
}
