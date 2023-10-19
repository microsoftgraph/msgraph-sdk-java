package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ObjectIdentity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies the issuer of the identity, for example facebook.com.For local accounts (where signInType isn't federated), this property is the local B2C tenant default domain name, for example contoso.onmicrosoft.com.For guests from other Microsoft Entra organization, this is the domain of the federated organization, for example contoso.com.Supports $filter. 512 character limit.
     */
    private String issuer;
    /**
     * Specifies the unique identifier assigned to the user by the issuer. The combination of issuer and issuerAssignedId must be unique within the organization. Represents the sign-in name for the user, when signInType is set to emailAddress or userName (also known as local accounts).When signInType is set to: emailAddress, (or a custom string that starts with emailAddress like emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must begin with alphabetical character or number, and can only contain alphanumeric characters and the following symbols: - or Supports $filter. 64 character limit.
     */
    private String issuerAssignedId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the user sign-in types in your directory, such as emailAddress, userName, federated, or userPrincipalName. federated represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer. Setting or updating a userPrincipalName identity will update the value of the userPrincipalName property on the user object. The validations performed on the userPrincipalName property on the user object, for example, verified domains and acceptable characters, will be performed when setting or updating a userPrincipalName identity. Other validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can also be set to any custom string.
     */
    private String signInType;
    /**
     * Instantiates a new ObjectIdentity and sets the default values.
     */
    public ObjectIdentity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ObjectIdentity
     */
    @jakarta.annotation.Nonnull
    public static ObjectIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectIdentity();
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
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerAssignedId", (n) -> { this.setIssuerAssignedId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("signInType", (n) -> { this.setSignInType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuer property value. Specifies the issuer of the identity, for example facebook.com.For local accounts (where signInType isn't federated), this property is the local B2C tenant default domain name, for example contoso.onmicrosoft.com.For guests from other Microsoft Entra organization, this is the domain of the federated organization, for example contoso.com.Supports $filter. 512 character limit.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the issuerAssignedId property value. Specifies the unique identifier assigned to the user by the issuer. The combination of issuer and issuerAssignedId must be unique within the organization. Represents the sign-in name for the user, when signInType is set to emailAddress or userName (also known as local accounts).When signInType is set to: emailAddress, (or a custom string that starts with emailAddress like emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must begin with alphabetical character or number, and can only contain alphanumeric characters and the following symbols: - or Supports $filter. 64 character limit.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuerAssignedId() {
        return this.issuerAssignedId;
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
     * Gets the signInType property value. Specifies the user sign-in types in your directory, such as emailAddress, userName, federated, or userPrincipalName. federated represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer. Setting or updating a userPrincipalName identity will update the value of the userPrincipalName property on the user object. The validations performed on the userPrincipalName property on the user object, for example, verified domains and acceptable characters, will be performed when setting or updating a userPrincipalName identity. Other validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can also be set to any custom string.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignInType() {
        return this.signInType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerAssignedId", this.getIssuerAssignedId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("signInType", this.getSignInType());
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
     * Sets the issuer property value. Specifies the issuer of the identity, for example facebook.com.For local accounts (where signInType isn't federated), this property is the local B2C tenant default domain name, for example contoso.onmicrosoft.com.For guests from other Microsoft Entra organization, this is the domain of the federated organization, for example contoso.com.Supports $filter. 512 character limit.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the issuerAssignedId property value. Specifies the unique identifier assigned to the user by the issuer. The combination of issuer and issuerAssignedId must be unique within the organization. Represents the sign-in name for the user, when signInType is set to emailAddress or userName (also known as local accounts).When signInType is set to: emailAddress, (or a custom string that starts with emailAddress like emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must begin with alphabetical character or number, and can only contain alphanumeric characters and the following symbols: - or Supports $filter. 64 character limit.
     * @param value Value to set for the issuerAssignedId property.
     */
    public void setIssuerAssignedId(@jakarta.annotation.Nullable final String value) {
        this.issuerAssignedId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the signInType property value. Specifies the user sign-in types in your directory, such as emailAddress, userName, federated, or userPrincipalName. federated represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer. Setting or updating a userPrincipalName identity will update the value of the userPrincipalName property on the user object. The validations performed on the userPrincipalName property on the user object, for example, verified domains and acceptable characters, will be performed when setting or updating a userPrincipalName identity. Other validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can also be set to any custom string.
     * @param value Value to set for the signInType property.
     */
    public void setSignInType(@jakarta.annotation.Nullable final String value) {
        this.signInType = value;
    }
}
