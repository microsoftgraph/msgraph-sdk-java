package com.microsoft.graph.models;

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
    /** Address to the proxy server. Specify an address in the format [':'] */
    private String _address;
    /** Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node. */
    private java.util.List<String> _exceptions;
    /** The OdataType property */
    private String _odataType;
    /** Specifies whether the proxy server should be used for local (intranet) addresses. */
    private Boolean _useForLocalAddresses;
    /**
     * Instantiates a new windows10NetworkProxyServer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10NetworkProxyServer() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windows10NetworkProxyServer");
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
     * Gets the address property value. Address to the proxy server. Specify an address in the format [':']
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
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
            this.put("exceptions", (n) -> { currentObject.setExceptions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("useForLocalAddresses", (n) -> { currentObject.setUseForLocalAddresses(n.getBooleanValue()); });
        }};
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeCollectionOfPrimitiveValues("exceptions", this.getExceptions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("useForLocalAddresses", this.getUseForLocalAddresses());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the address property value. Address to the proxy server. Specify an address in the format [':']
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
    }
    /**
     * Sets the exceptions property value. Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     * @param value Value to set for the exceptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExceptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._exceptions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the useForLocalAddresses property value. Specifies whether the proxy server should be used for local (intranet) addresses.
     * @param value Value to set for the useForLocalAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseForLocalAddresses(@javax.annotation.Nullable final Boolean value) {
        this._useForLocalAddresses = value;
    }
}
