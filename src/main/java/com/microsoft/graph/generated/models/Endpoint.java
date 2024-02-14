package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Endpoint extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link Endpoint} and sets the default values.
     */
    public Endpoint() {
        super();
        this.setOdataType("#microsoft.graph.endpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Endpoint}
     */
    @jakarta.annotation.Nonnull
    public static Endpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Endpoint();
    }
    /**
     * Gets the capability property value. The capability property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCapability() {
        return this.backingStore.get("capability");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capability", (n) -> { this.setCapability(n.getStringValue()); });
        deserializerMap.put("providerId", (n) -> { this.setProviderId(n.getStringValue()); });
        deserializerMap.put("providerName", (n) -> { this.setProviderName(n.getStringValue()); });
        deserializerMap.put("providerResourceId", (n) -> { this.setProviderResourceId(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the providerId property value. The providerId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderId() {
        return this.backingStore.get("providerId");
    }
    /**
     * Gets the providerName property value. The providerName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderName() {
        return this.backingStore.get("providerName");
    }
    /**
     * Gets the providerResourceId property value. The providerResourceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderResourceId() {
        return this.backingStore.get("providerResourceId");
    }
    /**
     * Gets the uri property value. The uri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUri() {
        return this.backingStore.get("uri");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCapability(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("capability", value);
    }
    /**
     * Sets the providerId property value. The providerId property
     * @param value Value to set for the providerId property.
     */
    public void setProviderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerId", value);
    }
    /**
     * Sets the providerName property value. The providerName property
     * @param value Value to set for the providerName property.
     */
    public void setProviderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerName", value);
    }
    /**
     * Sets the providerResourceId property value. The providerResourceId property
     * @param value Value to set for the providerResourceId property.
     */
    public void setProviderResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerResourceId", value);
    }
    /**
     * Sets the uri property value. The uri property
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uri", value);
    }
}
