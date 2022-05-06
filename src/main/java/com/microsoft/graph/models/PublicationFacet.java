package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PublicationFacet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The state of publication for this document. Either published or checkout. Read-only.  */
    private String _level;
    /** The unique identifier for the version that is visible to the current caller. Read-only.  */
    private String _versionId;
    /**
     * Instantiates a new publicationFacet and sets the default values.
     * @return a void
     */
    public PublicationFacet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a publicationFacet
     */
    @javax.annotation.Nonnull
    public static PublicationFacet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublicationFacet();
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
        final PublicationFacet currentObject = this;
        return new HashMap<>(2) {{
            this.put("level", (n) -> { currentObject.setLevel(n.getStringValue()); });
            this.put("versionId", (n) -> { currentObject.setVersionId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the level property value. The state of publication for this document. Either published or checkout. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLevel() {
        return this._level;
    }
    /**
     * Gets the versionId property value. The unique identifier for the version that is visible to the current caller. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionId() {
        return this._versionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("level", this.getLevel());
        writer.writeStringValue("versionId", this.getVersionId());
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
     * Sets the level property value. The state of publication for this document. Either published or checkout. Read-only.
     * @param value Value to set for the level property.
     * @return a void
     */
    public void setLevel(@javax.annotation.Nullable final String value) {
        this._level = value;
    }
    /**
     * Sets the versionId property value. The unique identifier for the version that is visible to the current caller. Read-only.
     * @param value Value to set for the versionId property.
     * @return a void
     */
    public void setVersionId(@javax.annotation.Nullable final String value) {
        this._versionId = value;
    }
}
