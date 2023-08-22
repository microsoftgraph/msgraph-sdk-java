package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Network Proxy Server Policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10NetworkProxyServer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Address to the proxy server. Specify an address in the format [':']
     */
    private String address;
    /**
     * Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     */
    private java.util.List<String> exceptions;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies whether the proxy server should be used for local (intranet) addresses.
     */
    private Boolean useForLocalAddresses;
    /**
     * Instantiates a new windows10NetworkProxyServer and sets the default values.
     */
    public Windows10NetworkProxyServer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10NetworkProxyServer
     */
    @jakarta.annotation.Nonnull
    public static Windows10NetworkProxyServer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10NetworkProxyServer();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. Address to the proxy server. Specify an address in the format [':']
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAddress() {
        return this.address;
    }
    /**
     * Gets the exceptions property value. Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExceptions() {
        return this.exceptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getStringValue()); });
        deserializerMap.put("exceptions", (n) -> { this.setExceptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("useForLocalAddresses", (n) -> { this.setUseForLocalAddresses(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the useForLocalAddresses property value. Specifies whether the proxy server should be used for local (intranet) addresses.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseForLocalAddresses() {
        return this.useForLocalAddresses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeCollectionOfPrimitiveValues("exceptions", this.getExceptions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("useForLocalAddresses", this.getUseForLocalAddresses());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. Address to the proxy server. Specify an address in the format [':']
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final String value) {
        this.address = value;
    }
    /**
     * Sets the exceptions property value. Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     * @param value Value to set for the exceptions property.
     */
    public void setExceptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.exceptions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the useForLocalAddresses property value. Specifies whether the proxy server should be used for local (intranet) addresses.
     * @param value Value to set for the useForLocalAddresses property.
     */
    public void setUseForLocalAddresses(@jakarta.annotation.Nullable final Boolean value) {
        this.useForLocalAddresses = value;
    }
}
