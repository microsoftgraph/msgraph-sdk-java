package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the instantiate method. */
public class Endpoint extends DirectoryObject implements Parsable {
    /** The capability property */
    private String _capability;
    /** The providerId property */
    private String _providerId;
    /** The providerName property */
    private String _providerName;
    /** The providerResourceId property */
    private String _providerResourceId;
    /** The uri property */
    private String _uri;
    /**
     * Instantiates a new endpoint and sets the default values.
     * @return a void
     */
    public Endpoint() {
        super();
        this.setOdataType("#microsoft.graph.endpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a endpoint
     */
    @javax.annotation.Nonnull
    public static Endpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Endpoint();
    }
    /**
     * Gets the capability property value. The capability property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCapability() {
        return this._capability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Endpoint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("capability", (n) -> { currentObject.setCapability(n.getStringValue()); });
            this.put("providerId", (n) -> { currentObject.setProviderId(n.getStringValue()); });
            this.put("providerName", (n) -> { currentObject.setProviderName(n.getStringValue()); });
            this.put("providerResourceId", (n) -> { currentObject.setProviderResourceId(n.getStringValue()); });
            this.put("uri", (n) -> { currentObject.setUri(n.getStringValue()); });
        }};
    }
    /**
     * Gets the providerId property value. The providerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderId() {
        return this._providerId;
    }
    /**
     * Gets the providerName property value. The providerName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderName() {
        return this._providerName;
    }
    /**
     * Gets the providerResourceId property value. The providerResourceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderResourceId() {
        return this._providerResourceId;
    }
    /**
     * Gets the uri property value. The uri property
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
        writer.writeStringValue("capability", this.getCapability());
        writer.writeStringValue("providerId", this.getProviderId());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeStringValue("providerResourceId", this.getProviderResourceId());
        writer.writeStringValue("uri", this.getUri());
    }
    /**
     * Sets the capability property value. The capability property
     * @param value Value to set for the capability property.
     * @return a void
     */
    public void setCapability(@javax.annotation.Nullable final String value) {
        this._capability = value;
    }
    /**
     * Sets the providerId property value. The providerId property
     * @param value Value to set for the providerId property.
     * @return a void
     */
    public void setProviderId(@javax.annotation.Nullable final String value) {
        this._providerId = value;
    }
    /**
     * Sets the providerName property value. The providerName property
     * @param value Value to set for the providerName property.
     * @return a void
     */
    public void setProviderName(@javax.annotation.Nullable final String value) {
        this._providerName = value;
    }
    /**
     * Sets the providerResourceId property value. The providerResourceId property
     * @param value Value to set for the providerResourceId property.
     * @return a void
     */
    public void setProviderResourceId(@javax.annotation.Nullable final String value) {
        this._providerResourceId = value;
    }
    /**
     * Sets the uri property value. The uri property
     * @param value Value to set for the uri property.
     * @return a void
     */
    public void setUri(@javax.annotation.Nullable final String value) {
        this._uri = value;
    }
}
