package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClientUserAgent extends UserAgent implements Parsable {
    /** The unique identifier of the Azure AD application used by this endpoint. */
    private String _azureADAppId;
    /** Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs. */
    private String _communicationServiceId;
    /** The platform property */
    private ClientPlatform _platform;
    /** The productFamily property */
    private ProductFamily _productFamily;
    /**
     * Instantiates a new ClientUserAgent and sets the default values.
     * @return a void
     */
    public ClientUserAgent() {
        super();
        this.setOdataType("#microsoft.graph.callRecords.clientUserAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClientUserAgent
     */
    @javax.annotation.Nonnull
    public static ClientUserAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClientUserAgent();
    }
    /**
     * Gets the azureADAppId property value. The unique identifier of the Azure AD application used by this endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureADAppId() {
        return this._azureADAppId;
    }
    /**
     * Gets the communicationServiceId property value. Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommunicationServiceId() {
        return this._communicationServiceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClientUserAgent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("azureADAppId", (n) -> { currentObject.setAzureADAppId(n.getStringValue()); });
            this.put("communicationServiceId", (n) -> { currentObject.setCommunicationServiceId(n.getStringValue()); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(ClientPlatform.class)); });
            this.put("productFamily", (n) -> { currentObject.setProductFamily(n.getEnumValue(ProductFamily.class)); });
        }};
    }
    /**
     * Gets the platform property value. The platform property
     * @return a clientPlatform
     */
    @javax.annotation.Nullable
    public ClientPlatform getPlatform() {
        return this._platform;
    }
    /**
     * Gets the productFamily property value. The productFamily property
     * @return a productFamily
     */
    @javax.annotation.Nullable
    public ProductFamily getProductFamily() {
        return this._productFamily;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureADAppId", this.getAzureADAppId());
        writer.writeStringValue("communicationServiceId", this.getCommunicationServiceId());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeEnumValue("productFamily", this.getProductFamily());
    }
    /**
     * Sets the azureADAppId property value. The unique identifier of the Azure AD application used by this endpoint.
     * @param value Value to set for the azureADAppId property.
     * @return a void
     */
    public void setAzureADAppId(@javax.annotation.Nullable final String value) {
        this._azureADAppId = value;
    }
    /**
     * Sets the communicationServiceId property value. Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     * @param value Value to set for the communicationServiceId property.
     * @return a void
     */
    public void setCommunicationServiceId(@javax.annotation.Nullable final String value) {
        this._communicationServiceId = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final ClientPlatform value) {
        this._platform = value;
    }
    /**
     * Sets the productFamily property value. The productFamily property
     * @param value Value to set for the productFamily property.
     * @return a void
     */
    public void setProductFamily(@javax.annotation.Nullable final ProductFamily value) {
        this._productFamily = value;
    }
}
