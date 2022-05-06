package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintServiceEndpoint extends Entity implements Parsable {
    /** A human-readable display name for the endpoint.  */
    private String _displayName;
    /** The URI that can be used to access the service.  */
    private String _uri;
    /**
     * Instantiates a new printServiceEndpoint and sets the default values.
     * @return a void
     */
    public PrintServiceEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printServiceEndpoint
     */
    @javax.annotation.Nonnull
    public static PrintServiceEndpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintServiceEndpoint();
    }
    /**
     * Gets the displayName property value. A human-readable display name for the endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintServiceEndpoint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("uri", (n) -> { currentObject.setUri(n.getStringValue()); });
        }};
    }
    /**
     * Gets the uri property value. The URI that can be used to access the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUri() {
        return this._uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("uri", this.getUri());
    }
    /**
     * Sets the displayName property value. A human-readable display name for the endpoint.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the uri property value. The URI that can be used to access the service.
     * @param value Value to set for the uri property.
     * @return a void
     */
    public void setUri(@javax.annotation.Nullable final String value) {
        this._uri = value;
    }
}
