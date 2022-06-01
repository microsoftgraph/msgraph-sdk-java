package microsoft.graph.me.drives.item.list.contenttypes.item.copytodefaultcontentlocation;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ItemReference;
/** Provides operations to call the copyToDefaultContentLocation method. */
public class CopyToDefaultContentLocationPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The destinationFileName property */
    private String _destinationFileName;
    /** The sourceFile property */
    private ItemReference _sourceFile;
    /**
     * Instantiates a new copyToDefaultContentLocationPostRequestBody and sets the default values.
     * @return a void
     */
    public CopyToDefaultContentLocationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a copyToDefaultContentLocationPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CopyToDefaultContentLocationPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyToDefaultContentLocationPostRequestBody();
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
     * Gets the destinationFileName property value. The destinationFileName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationFileName() {
        return this._destinationFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CopyToDefaultContentLocationPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("destinationFileName", (n) -> { currentObject.setDestinationFileName(n.getStringValue()); });
            this.put("sourceFile", (n) -> { currentObject.setSourceFile(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the sourceFile property value. The sourceFile property
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getSourceFile() {
        return this._sourceFile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationFileName", this.getDestinationFileName());
        writer.writeObjectValue("sourceFile", this.getSourceFile());
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
     * Sets the destinationFileName property value. The destinationFileName property
     * @param value Value to set for the destinationFileName property.
     * @return a void
     */
    public void setDestinationFileName(@javax.annotation.Nullable final String value) {
        this._destinationFileName = value;
    }
    /**
     * Sets the sourceFile property value. The sourceFile property
     * @param value Value to set for the sourceFile property.
     * @return a void
     */
    public void setSourceFile(@javax.annotation.Nullable final ItemReference value) {
        this._sourceFile = value;
    }
}
