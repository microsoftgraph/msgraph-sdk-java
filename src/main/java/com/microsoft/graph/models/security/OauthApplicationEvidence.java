package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OauthApplicationEvidence extends AlertEvidence implements Parsable {
    /** The appId property */
    private String _appId;
    /** The displayName property */
    private String _displayName;
    /** The objectId property */
    private String _objectId;
    /** The publisher property */
    private String _publisher;
    /**
     * Instantiates a new OauthApplicationEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OauthApplicationEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OauthApplicationEvidence
     */
    @javax.annotation.Nonnull
    public static OauthApplicationEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OauthApplicationEvidence();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
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
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The objectId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this._objectId;
    }
    /**
     * Gets the publisher property value. The publisher property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("publisher", this.getPublisher());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
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
     * Sets the objectId property value. The objectId property
     * @param value Value to set for the objectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this._objectId = value;
    }
    /**
     * Sets the publisher property value. The publisher property
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
}
