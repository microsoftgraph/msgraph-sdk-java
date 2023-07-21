package com.microsoft.graph.serviceprincipals.item.synchronization.jobs.item.validatecredentials;

import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ValidateCredentialsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The applicationIdentifier property
     */
    private String applicationIdentifier;
    /**
     * The credentials property
     */
    private java.util.List<SynchronizationSecretKeyStringValuePair> credentials;
    /**
     * The templateId property
     */
    private String templateId;
    /**
     * The useSavedCredentials property
     */
    private Boolean useSavedCredentials;
    /**
     * Instantiates a new validateCredentialsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ValidateCredentialsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateCredentialsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ValidateCredentialsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateCredentialsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the applicationIdentifier property value. The applicationIdentifier property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    /**
     * Gets the credentials property value. The credentials property
     * @return a synchronizationSecretKeyStringValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationSecretKeyStringValuePair> getCredentials() {
        return this.credentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("applicationIdentifier", (n) -> { this.setApplicationIdentifier(n.getStringValue()); });
        deserializerMap.put("credentials", (n) -> { this.setCredentials(n.getCollectionOfObjectValues(SynchronizationSecretKeyStringValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        deserializerMap.put("useSavedCredentials", (n) -> { this.setUseSavedCredentials(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Gets the useSavedCredentials property value. The useSavedCredentials property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseSavedCredentials() {
        return this.useSavedCredentials;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationIdentifier", this.getApplicationIdentifier());
        writer.writeCollectionOfObjectValues("credentials", this.getCredentials());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeBooleanValue("useSavedCredentials", this.getUseSavedCredentials());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applicationIdentifier property value. The applicationIdentifier property
     * @param value Value to set for the applicationIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationIdentifier(@javax.annotation.Nullable final String value) {
        this.applicationIdentifier = value;
    }
    /**
     * Sets the credentials property value. The credentials property
     * @param value Value to set for the credentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCredentials(@javax.annotation.Nullable final java.util.List<SynchronizationSecretKeyStringValuePair> value) {
        this.credentials = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this.templateId = value;
    }
    /**
     * Sets the useSavedCredentials property value. The useSavedCredentials property
     * @param value Value to set for the useSavedCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseSavedCredentials(@javax.annotation.Nullable final Boolean value) {
        this.useSavedCredentials = value;
    }
}
