package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAccount implements AdditionalDataHolder, Parsable {
    /**
     * The displayed name of the user account.
     */
    private String accountName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The user object identifier in Azure Active Directory (Azure AD).
     */
    private String azureAdUserId;
    /**
     * The user display name in Azure AD.
     */
    private String displayName;
    /**
     * The name of the Active Directory domain of which the user is a member.
     */
    private String domainName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The user principal name of the account in Azure AD.
     */
    private String userPrincipalName;
    /**
     * The local security identifier of the user account.
     */
    private String userSid;
    /**
     * Instantiates a new userAccount and sets the default values.
     */
    public UserAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAccount
     */
    @jakarta.annotation.Nonnull
    public static UserAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccount();
    }
    /**
     * Gets the accountName property value. The displayed name of the user account.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
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
     * Gets the azureAdUserId property value. The user object identifier in Azure Active Directory (Azure AD).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureAdUserId() {
        return this.azureAdUserId;
    }
    /**
     * Gets the displayName property value. The user display name in Azure AD.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the domainName property value. The name of the Active Directory domain of which the user is a member.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("azureAdUserId", (n) -> { this.setAzureAdUserId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userSid", (n) -> { this.setUserSid(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the userPrincipalName property value. The user principal name of the account in Azure AD.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userSid property value. The local security identifier of the user account.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserSid() {
        return this.userSid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("azureAdUserId", this.getAzureAdUserId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("userSid", this.getUserSid());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountName property value. The displayed name of the user account.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.accountName = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the azureAdUserId property value. The user object identifier in Azure Active Directory (Azure AD).
     * @param value Value to set for the azureAdUserId property.
     */
    public void setAzureAdUserId(@jakarta.annotation.Nullable final String value) {
        this.azureAdUserId = value;
    }
    /**
     * Sets the displayName property value. The user display name in Azure AD.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the domainName property value. The name of the Active Directory domain of which the user is a member.
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name of the account in Azure AD.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userSid property value. The local security identifier of the user account.
     * @param value Value to set for the userSid property.
     */
    public void setUserSid(@jakarta.annotation.Nullable final String value) {
        this.userSid = value;
    }
}
