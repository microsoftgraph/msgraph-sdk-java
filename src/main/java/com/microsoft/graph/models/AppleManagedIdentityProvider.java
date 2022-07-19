package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleManagedIdentityProvider extends IdentityProviderBase implements Parsable {
    /** The certificate data which is a long string of text from the certificate, can be null. */
    private String _certificateData;
    /** The Apple developer identifier. Required. */
    private String _developerId;
    /** The Apple key identifier. Required. */
    private String _keyId;
    /** The Apple service identifier. Required. */
    private String _serviceId;
    /**
     * Instantiates a new AppleManagedIdentityProvider and sets the default values.
     * @return a void
     */
    public AppleManagedIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.appleManagedIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleManagedIdentityProvider
     */
    @javax.annotation.Nonnull
    public static AppleManagedIdentityProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleManagedIdentityProvider();
    }
    /**
     * Gets the certificateData property value. The certificate data which is a long string of text from the certificate, can be null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateData() {
        return this._certificateData;
    }
    /**
     * Gets the developerId property value. The Apple developer identifier. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeveloperId() {
        return this._developerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleManagedIdentityProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("certificateData", (n) -> { currentObject.setCertificateData(n.getStringValue()); });
            this.put("developerId", (n) -> { currentObject.setDeveloperId(n.getStringValue()); });
            this.put("keyId", (n) -> { currentObject.setKeyId(n.getStringValue()); });
            this.put("serviceId", (n) -> { currentObject.setServiceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the keyId property value. The Apple key identifier. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyId() {
        return this._keyId;
    }
    /**
     * Gets the serviceId property value. The Apple service identifier. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceId() {
        return this._serviceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificateData", this.getCertificateData());
        writer.writeStringValue("developerId", this.getDeveloperId());
        writer.writeStringValue("keyId", this.getKeyId());
        writer.writeStringValue("serviceId", this.getServiceId());
    }
    /**
     * Sets the certificateData property value. The certificate data which is a long string of text from the certificate, can be null.
     * @param value Value to set for the certificateData property.
     * @return a void
     */
    public void setCertificateData(@javax.annotation.Nullable final String value) {
        this._certificateData = value;
    }
    /**
     * Sets the developerId property value. The Apple developer identifier. Required.
     * @param value Value to set for the developerId property.
     * @return a void
     */
    public void setDeveloperId(@javax.annotation.Nullable final String value) {
        this._developerId = value;
    }
    /**
     * Sets the keyId property value. The Apple key identifier. Required.
     * @param value Value to set for the keyId property.
     * @return a void
     */
    public void setKeyId(@javax.annotation.Nullable final String value) {
        this._keyId = value;
    }
    /**
     * Sets the serviceId property value. The Apple service identifier. Required.
     * @param value Value to set for the serviceId property.
     * @return a void
     */
    public void setServiceId(@javax.annotation.Nullable final String value) {
        this._serviceId = value;
    }
}
