package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PageLinks implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Opens the page in the OneNote native client if it's installed. */
    private ExternalLink _oneNoteClientUrl;
    /** Opens the page in OneNote on the web. */
    private ExternalLink _oneNoteWebUrl;
    /**
     * Instantiates a new pageLinks and sets the default values.
     * @return a void
     */
    public PageLinks() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pageLinks
     */
    @javax.annotation.Nonnull
    public static PageLinks createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PageLinks();
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
        final PageLinks currentObject = this;
        return new HashMap<>(2) {{
            this.put("oneNoteClientUrl", (n) -> { currentObject.setOneNoteClientUrl(n.getObjectValue(ExternalLink::createFromDiscriminatorValue)); });
            this.put("oneNoteWebUrl", (n) -> { currentObject.setOneNoteWebUrl(n.getObjectValue(ExternalLink::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the oneNoteClientUrl property value. Opens the page in the OneNote native client if it's installed.
     * @return a externalLink
     */
    @javax.annotation.Nullable
    public ExternalLink getOneNoteClientUrl() {
        return this._oneNoteClientUrl;
    }
    /**
     * Gets the oneNoteWebUrl property value. Opens the page in OneNote on the web.
     * @return a externalLink
     */
    @javax.annotation.Nullable
    public ExternalLink getOneNoteWebUrl() {
        return this._oneNoteWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("oneNoteClientUrl", this.getOneNoteClientUrl());
        writer.writeObjectValue("oneNoteWebUrl", this.getOneNoteWebUrl());
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
     * Sets the oneNoteClientUrl property value. Opens the page in the OneNote native client if it's installed.
     * @param value Value to set for the oneNoteClientUrl property.
     * @return a void
     */
    public void setOneNoteClientUrl(@javax.annotation.Nullable final ExternalLink value) {
        this._oneNoteClientUrl = value;
    }
    /**
     * Sets the oneNoteWebUrl property value. Opens the page in OneNote on the web.
     * @param value Value to set for the oneNoteWebUrl property.
     * @return a void
     */
    public void setOneNoteWebUrl(@javax.annotation.Nullable final ExternalLink value) {
        this._oneNoteWebUrl = value;
    }
}
