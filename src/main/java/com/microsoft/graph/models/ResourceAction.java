package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Set of allowed and not allowed actions for a resource.  */
public class ResourceAction implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Allowed Actions  */
    private java.util.List<String> _allowedResourceActions;
    /** Not Allowed Actions.  */
    private java.util.List<String> _notAllowedResourceActions;
    /**
     * Instantiates a new resourceAction and sets the default values.
     * @return a void
     */
    public ResourceAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceAction
     */
    @javax.annotation.Nonnull
    public static ResourceAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceAction();
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
     * Gets the allowedResourceActions property value. Allowed Actions
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedResourceActions() {
        return this._allowedResourceActions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResourceAction currentObject = this;
        return new HashMap<>(2) {{
            this.put("allowedResourceActions", (n) -> { currentObject.setAllowedResourceActions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("notAllowedResourceActions", (n) -> { currentObject.setNotAllowedResourceActions(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the notAllowedResourceActions property value. Not Allowed Actions.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotAllowedResourceActions() {
        return this._notAllowedResourceActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedResourceActions", this.getAllowedResourceActions());
        writer.writeCollectionOfPrimitiveValues("notAllowedResourceActions", this.getNotAllowedResourceActions());
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
     * Sets the allowedResourceActions property value. Allowed Actions
     * @param value Value to set for the allowedResourceActions property.
     * @return a void
     */
    public void setAllowedResourceActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedResourceActions = value;
    }
    /**
     * Sets the notAllowedResourceActions property value. Not Allowed Actions.
     * @param value Value to set for the notAllowedResourceActions property.
     * @return a void
     */
    public void setNotAllowedResourceActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notAllowedResourceActions = value;
    }
}
