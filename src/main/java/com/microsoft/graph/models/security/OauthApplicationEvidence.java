package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OauthApplicationEvidence extends AlertEvidence implements Parsable {
    /** Unique identifier of the application. */
    private String appId;
    /** Name of the application. */
    private String displayName;
    /** The unique identifier of the application object in Azure AD. */
    private String objectId;
    /** The name of the application publisher. */
    private String publisher;
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
     * Gets the appId property value. Unique identifier of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the displayName property value. Name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The unique identifier of the application object in Azure AD.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this.objectId;
    }
    /**
     * Gets the publisher property value. The name of the application publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
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
     * Sets the appId property value. Unique identifier of the application.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the displayName property value. Name of the application.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the objectId property value. The unique identifier of the application object in Azure AD.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this.objectId = value;
    }
    /**
     * Sets the publisher property value. The name of the application publisher.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
}
