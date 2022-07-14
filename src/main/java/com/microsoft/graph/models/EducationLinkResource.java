package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationLinkResource extends EducationResource implements Parsable {
    /** URL to the resource. */
    private String _link;
    /**
     * Instantiates a new EducationLinkResource and sets the default values.
     * @return a void
     */
    public EducationLinkResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationLinkResource
     */
    @javax.annotation.Nonnull
    public static EducationLinkResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationLinkResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationLinkResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("link", (n) -> { currentObject.setLink(n.getStringValue()); });
        }};
    }
    /**
     * Gets the link property value. URL to the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLink() {
        return this._link;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("link", this.getLink());
    }
    /**
     * Sets the link property value. URL to the resource.
     * @param value Value to set for the link property.
     * @return a void
     */
    public void setLink(@javax.annotation.Nullable final String value) {
        this._link = value;
    }
}
