package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClientUserAgent extends UserAgent implements Parsable {
    /**
     * Instantiates a new {@link ClientUserAgent} and sets the default values.
     */
    public ClientUserAgent() {
        super();
        this.setOdataType("#microsoft.graph.callRecords.clientUserAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClientUserAgent}
     */
    @jakarta.annotation.Nonnull
    public static ClientUserAgent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClientUserAgent();
    }
    /**
     * Gets the azureADAppId property value. The unique identifier of the Microsoft Entra application used by this endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureADAppId() {
        return this.backingStore.get("azureADAppId");
    }
    /**
     * Gets the communicationServiceId property value. Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommunicationServiceId() {
        return this.backingStore.get("communicationServiceId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureADAppId", (n) -> { this.setAzureADAppId(n.getStringValue()); });
        deserializerMap.put("communicationServiceId", (n) -> { this.setCommunicationServiceId(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(ClientPlatform::forValue)); });
        deserializerMap.put("productFamily", (n) -> { this.setProductFamily(n.getEnumValue(ProductFamily::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a {@link ClientPlatform}
     */
    @jakarta.annotation.Nullable
    public ClientPlatform getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the productFamily property value. The productFamily property
     * @return a {@link ProductFamily}
     */
    @jakarta.annotation.Nullable
    public ProductFamily getProductFamily() {
        return this.backingStore.get("productFamily");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureADAppId", this.getAzureADAppId());
        writer.writeStringValue("communicationServiceId", this.getCommunicationServiceId());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeEnumValue("productFamily", this.getProductFamily());
    }
    /**
     * Sets the azureADAppId property value. The unique identifier of the Microsoft Entra application used by this endpoint.
     * @param value Value to set for the azureADAppId property.
     */
    public void setAzureADAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureADAppId", value);
    }
    /**
     * Sets the communicationServiceId property value. Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     * @param value Value to set for the communicationServiceId property.
     */
    public void setCommunicationServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("communicationServiceId", value);
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final ClientPlatform value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the productFamily property value. The productFamily property
     * @param value Value to set for the productFamily property.
     */
    public void setProductFamily(@jakarta.annotation.Nullable final ProductFamily value) {
        this.backingStore.set("productFamily", value);
    }
}
