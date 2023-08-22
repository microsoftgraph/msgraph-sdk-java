package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppManagementConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Collection of keyCredential restrictions settings to be applied to an application or service principal.
     */
    private java.util.List<KeyCredentialConfiguration> keyCredentials;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Collection of password restrictions settings to be applied to an application or service principal.
     */
    private java.util.List<PasswordCredentialConfiguration> passwordCredentials;
    /**
     * Instantiates a new appManagementConfiguration and sets the default values.
     */
    public AppManagementConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appManagementConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AppManagementConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppManagementConfiguration();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("keyCredentials", (n) -> { this.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredentialConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordCredentials", (n) -> { this.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredentialConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keyCredentials property value. Collection of keyCredential restrictions settings to be applied to an application or service principal.
     * @return a keyCredentialConfiguration
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyCredentialConfiguration> getKeyCredentials() {
        return this.keyCredentials;
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
     * Gets the passwordCredentials property value. Collection of password restrictions settings to be applied to an application or service principal.
     * @return a passwordCredentialConfiguration
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordCredentialConfiguration> getPasswordCredentials() {
        return this.passwordCredentials;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("keyCredentials", this.getKeyCredentials());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("passwordCredentials", this.getPasswordCredentials());
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
     * Sets the keyCredentials property value. Collection of keyCredential restrictions settings to be applied to an application or service principal.
     * @param value Value to set for the keyCredentials property.
     */
    public void setKeyCredentials(@jakarta.annotation.Nullable final java.util.List<KeyCredentialConfiguration> value) {
        this.keyCredentials = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the passwordCredentials property value. Collection of password restrictions settings to be applied to an application or service principal.
     * @param value Value to set for the passwordCredentials property.
     */
    public void setPasswordCredentials(@jakarta.annotation.Nullable final java.util.List<PasswordCredentialConfiguration> value) {
        this.passwordCredentials = value;
    }
}
