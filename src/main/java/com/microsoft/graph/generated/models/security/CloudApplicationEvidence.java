package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudApplicationEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link CloudApplicationEvidence} and sets the default values.
     */
    public CloudApplicationEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.cloudApplicationEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudApplicationEvidence}
     */
    @jakarta.annotation.Nonnull
    public static CloudApplicationEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudApplicationEvidence();
    }
    /**
     * Gets the appId property value. Unique identifier of the application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the displayName property value. Name of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getLongValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("instanceId", (n) -> { this.setInstanceId(n.getLongValue()); });
        deserializerMap.put("instanceName", (n) -> { this.setInstanceName(n.getStringValue()); });
        deserializerMap.put("saasAppId", (n) -> { this.setSaasAppId(n.getLongValue()); });
        deserializerMap.put("stream", (n) -> { this.setStream(n.getObjectValue(Stream::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instanceId property value. Identifier of the instance of the Software as a Service (SaaS) application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getInstanceId() {
        return this.backingStore.get("instanceId");
    }
    /**
     * Gets the instanceName property value. Name of the instance of the SaaS application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstanceName() {
        return this.backingStore.get("instanceName");
    }
    /**
     * Gets the saasAppId property value. The identifier of the SaaS application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSaasAppId() {
        return this.backingStore.get("saasAppId");
    }
    /**
     * Gets the stream property value. The stream property
     * @return a {@link Stream}
     */
    @jakarta.annotation.Nullable
    public Stream getStream() {
        return this.backingStore.get("stream");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLongValue("instanceId", this.getInstanceId());
        writer.writeStringValue("instanceName", this.getInstanceName());
        writer.writeLongValue("saasAppId", this.getSaasAppId());
        writer.writeObjectValue("stream", this.getStream());
    }
    /**
     * Sets the appId property value. Unique identifier of the application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the displayName property value. Name of the application.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the instanceId property value. Identifier of the instance of the Software as a Service (SaaS) application.
     * @param value Value to set for the instanceId property.
     */
    public void setInstanceId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("instanceId", value);
    }
    /**
     * Sets the instanceName property value. Name of the instance of the SaaS application.
     * @param value Value to set for the instanceName property.
     */
    public void setInstanceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("instanceName", value);
    }
    /**
     * Sets the saasAppId property value. The identifier of the SaaS application.
     * @param value Value to set for the saasAppId property.
     */
    public void setSaasAppId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("saasAppId", value);
    }
    /**
     * Sets the stream property value. The stream property
     * @param value Value to set for the stream property.
     */
    public void setStream(@jakarta.annotation.Nullable final Stream value) {
        this.backingStore.set("stream", value);
    }
}
