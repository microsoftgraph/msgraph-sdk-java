package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsRegistrationCampaignIncludeTarget implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The object identifier of an Azure Active Directory user or group.
     */
    private String id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
     */
    private String targetedAuthenticationMethod;
    /**
     * The targetType property
     */
    private AuthenticationMethodTargetType targetType;
    /**
     * Instantiates a new AuthenticationMethodsRegistrationCampaignIncludeTarget and sets the default values.
     */
    public AuthenticationMethodsRegistrationCampaignIncludeTarget() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationMethodsRegistrationCampaignIncludeTarget
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodsRegistrationCampaignIncludeTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsRegistrationCampaignIncludeTarget();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("targetedAuthenticationMethod", (n) -> { this.setTargetedAuthenticationMethod(n.getStringValue()); });
        deserializerMap.put("targetType", (n) -> { this.setTargetType(n.getEnumValue(AuthenticationMethodTargetType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The object identifier of an Azure Active Directory user or group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the targetedAuthenticationMethod property value. The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetedAuthenticationMethod() {
        return this.targetedAuthenticationMethod;
    }
    /**
     * Gets the targetType property value. The targetType property
     * @return a AuthenticationMethodTargetType
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodTargetType getTargetType() {
        return this.targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("targetedAuthenticationMethod", this.getTargetedAuthenticationMethod());
        writer.writeEnumValue("targetType", this.getTargetType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the id property value. The object identifier of an Azure Active Directory user or group.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the targetedAuthenticationMethod property value. The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
     * @param value Value to set for the targetedAuthenticationMethod property.
     */
    public void setTargetedAuthenticationMethod(@jakarta.annotation.Nullable final String value) {
        this.targetedAuthenticationMethod = value;
    }
    /**
     * Sets the targetType property value. The targetType property
     * @param value Value to set for the targetType property.
     */
    public void setTargetType(@jakarta.annotation.Nullable final AuthenticationMethodTargetType value) {
        this.targetType = value;
    }
}
