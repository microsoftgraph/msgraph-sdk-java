package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationExternalResource extends EducationResource implements Parsable {
    /** Location of the resource. Required. */
    private String _webUrl;
    /**
     * Instantiates a new EducationExternalResource and sets the default values.
     * @return a void
     */
    public EducationExternalResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationExternalResource
     */
    @javax.annotation.Nonnull
    public static EducationExternalResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationExternalResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationExternalResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the webUrl property value. Location of the resource. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the webUrl property value. Location of the resource. Required.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
