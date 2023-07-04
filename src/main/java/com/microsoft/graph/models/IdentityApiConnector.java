package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityApiConnector extends Entity implements Parsable {
    /**
     * The object which describes the authentication configuration details for calling the API. Basic and PKCS 12 client certificate are supported.
     */
    private ApiAuthenticationConfigurationBase authenticationConfiguration;
    /**
     * The name of the API connector.
     */
    private String displayName;
    /**
     * The URL of the API endpoint to call.
     */
    private String targetUrl;
    /**
     * Instantiates a new IdentityApiConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityApiConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityApiConnector
     */
    @javax.annotation.Nonnull
    public static IdentityApiConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityApiConnector();
    }
    /**
     * Gets the authenticationConfiguration property value. The object which describes the authentication configuration details for calling the API. Basic and PKCS 12 client certificate are supported.
     * @return a apiAuthenticationConfigurationBase
     */
    @javax.annotation.Nullable
    public ApiAuthenticationConfigurationBase getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    /**
     * Gets the displayName property value. The name of the API connector.
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
        deserializerMap.put("authenticationConfiguration", (n) -> { this.setAuthenticationConfiguration(n.getObjectValue(ApiAuthenticationConfigurationBase::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("targetUrl", (n) -> { this.setTargetUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetUrl property value. The URL of the API endpoint to call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetUrl() {
        return this.targetUrl;
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
        writer.writeObjectValue("authenticationConfiguration", this.getAuthenticationConfiguration());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("targetUrl", this.getTargetUrl());
    }
    /**
     * Sets the authenticationConfiguration property value. The object which describes the authentication configuration details for calling the API. Basic and PKCS 12 client certificate are supported.
     * @param value Value to set for the authenticationConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationConfiguration(@javax.annotation.Nullable final ApiAuthenticationConfigurationBase value) {
        this.authenticationConfiguration = value;
    }
    /**
     * Sets the displayName property value. The name of the API connector.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the targetUrl property value. The URL of the API endpoint to call.
     * @param value Value to set for the targetUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetUrl(@javax.annotation.Nullable final String value) {
        this.targetUrl = value;
    }
}
