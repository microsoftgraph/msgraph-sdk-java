package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Network Proxy Server Policy. */
public class Windows10NetworkProxyServer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Address to the proxy server. Specify an address in the format <server>[':'<port>] */
    private String _address;
    /** Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node. */
    private java.util.List<String> _exceptions;
    /** Specifies whether the proxy server should be used for local (intranet) addresses. */
    private Boolean _useForLocalAddresses;
    /**
     * Instantiates a new windows10NetworkProxyServer and sets the default values.
     * @return a void
     */
    public Windows10NetworkProxyServer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10NetworkProxyServer
     */
    @javax.annotation.Nonnull
    public static Windows10NetworkProxyServer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10NetworkProxyServer();
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
     * Gets the address property value. Address to the proxy server. Specify an address in the format <server>[':'<port>]
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this._address;
    }
    /**
     * Gets the exceptions property value. Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExceptions() {
        return this._exceptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10NetworkProxyServer currentObject = this;
        return new HashMap<>(3) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
            this.put("exceptions", (n) -> { currentObject.setExceptions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("useForLocalAddresses", (n) -> { currentObject.setUseForLocalAddresses(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the useForLocalAddresses property value. Specifies whether the proxy server should be used for local (intranet) addresses.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseForLocalAddresses() {
        return this._useForLocalAddresses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeCollectionOfPrimitiveValues("exceptions", this.getExceptions());
        writer.writeBooleanValue("useForLocalAddresses", this.getUseForLocalAddresses());
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
     * Sets the address property value. Address to the proxy server. Specify an address in the format <server>[':'<port>]
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
    }
    /**
     * Sets the exceptions property value. Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     * @param value Value to set for the exceptions property.
     * @return a void
     */
    public void setExceptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._exceptions = value;
    }
    /**
     * Sets the useForLocalAddresses property value. Specifies whether the proxy server should be used for local (intranet) addresses.
     * @param value Value to set for the useForLocalAddresses property.
     * @return a void
     */
    public void setUseForLocalAddresses(@javax.annotation.Nullable final Boolean value) {
        this._useForLocalAddresses = value;
    }
}
