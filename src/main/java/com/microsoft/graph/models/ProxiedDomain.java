package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Proxied Domain */
public class ProxiedDomain implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The IP address or FQDN */
    private String _ipAddressOrFQDN;
    /** The OdataType property */
    private String _odataType;
    /** Proxy IP or FQDN */
    private String _proxy;
    /**
     * Instantiates a new proxiedDomain and sets the default values.
     * @return a void
     */
    public ProxiedDomain() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.proxiedDomain");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a proxiedDomain
     */
    @javax.annotation.Nonnull
    public static ProxiedDomain createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProxiedDomain();
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
        final ProxiedDomain currentObject = this;
        return new HashMap<>(3) {{
            this.put("ipAddressOrFQDN", (n) -> { currentObject.setIpAddressOrFQDN(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("proxy", (n) -> { currentObject.setProxy(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ipAddressOrFQDN property value. The IP address or FQDN
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddressOrFQDN() {
        return this._ipAddressOrFQDN;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the proxy property value. Proxy IP or FQDN
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxy() {
        return this._proxy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ipAddressOrFQDN", this.getIpAddressOrFQDN());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("proxy", this.getProxy());
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
     * Sets the ipAddressOrFQDN property value. The IP address or FQDN
     * @param value Value to set for the ipAddressOrFQDN property.
     * @return a void
     */
    public void setIpAddressOrFQDN(@javax.annotation.Nullable final String value) {
        this._ipAddressOrFQDN = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the proxy property value. Proxy IP or FQDN
     * @param value Value to set for the proxy property.
     * @return a void
     */
    public void setProxy(@javax.annotation.Nullable final String value) {
        this._proxy = value;
    }
}
