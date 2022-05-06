package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Endpoint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** User-agent reported by this endpoint.  */
    private UserAgent _userAgent;
    /**
     * Instantiates a new endpoint and sets the default values.
     * @return a void
     */
    public Endpoint() {
        this.setAdditionalData(new HashMap<>());
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
        final Endpoint currentObject = this;
        return new HashMap<>(1) {{
            this.put("userAgent", (n) -> { currentObject.setUserAgent(n.getObjectValue(UserAgent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the userAgent property value. User-agent reported by this endpoint.
     * @return a userAgent
     */
    @javax.annotation.Nullable
    public UserAgent getUserAgent() {
        return this._userAgent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("userAgent", this.getUserAgent());
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
     * Sets the userAgent property value. User-agent reported by this endpoint.
     * @param value Value to set for the userAgent property.
     * @return a void
     */
    public void setUserAgent(@javax.annotation.Nullable final UserAgent value) {
        this._userAgent = value;
    }
}
