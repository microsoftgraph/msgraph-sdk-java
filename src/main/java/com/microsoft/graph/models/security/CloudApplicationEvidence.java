package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudApplicationEvidence extends AlertEvidence implements Parsable {
    /** The appId property */
    private Long _appId;
    /** The displayName property */
    private String _displayName;
    /** The instanceId property */
    private Long _instanceId;
    /** The instanceName property */
    private String _instanceName;
    /** The saasAppId property */
    private Long _saasAppId;
    /**
     * Instantiates a new CloudApplicationEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudApplicationEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudApplicationEvidence
     */
    @javax.annotation.Nonnull
    public static CloudApplicationEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudApplicationEvidence();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getAppId() {
        return this._appId;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getLongValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("instanceId", (n) -> { this.setInstanceId(n.getLongValue()); });
        deserializerMap.put("instanceName", (n) -> { this.setInstanceName(n.getStringValue()); });
        deserializerMap.put("saasAppId", (n) -> { this.setSaasAppId(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instanceId property value. The instanceId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getInstanceId() {
        return this._instanceId;
    }
    /**
     * Gets the instanceName property value. The instanceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceName() {
        return this._instanceName;
    }
    /**
     * Gets the saasAppId property value. The saasAppId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSaasAppId() {
        return this._saasAppId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLongValue("instanceId", this.getInstanceId());
        writer.writeStringValue("instanceName", this.getInstanceName());
        writer.writeLongValue("saasAppId", this.getSaasAppId());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final Long value) {
        this._appId = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the instanceId property value. The instanceId property
     * @param value Value to set for the instanceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceId(@javax.annotation.Nullable final Long value) {
        this._instanceId = value;
    }
    /**
     * Sets the instanceName property value. The instanceName property
     * @param value Value to set for the instanceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceName(@javax.annotation.Nullable final String value) {
        this._instanceName = value;
    }
    /**
     * Sets the saasAppId property value. The saasAppId property
     * @param value Value to set for the saasAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSaasAppId(@javax.annotation.Nullable final Long value) {
        this._saasAppId = value;
    }
}
