package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppRole implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles supporting assignment to other applications' service principals are also known as application permissions. The 'Application' value is only supported for app roles defined on application entities.
     */
    private java.util.List<String> allowedMemberTypes;
    /**
     * The description for the app role. This is displayed when the app role is being assigned and, if the app role functions as an application permission, during  consent experiences.
     */
    private String description;
    /**
     * Display name for the permission that appears in the app role assignment and consent experiences.
     */
    private String displayName;
    /**
     * Unique role identifier inside the appRoles collection. When creating a new app role, a new GUID identifier must be provided.
     */
    private UUID id;
    /**
     * When creating or updating an app role, this must be set to true (which is the default). To delete a role, this must first be set to false.  At that point, in a subsequent call, this role may be removed.
     */
    private Boolean isEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     */
    private String origin;
    /**
     * Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % & ' ( ) * + , - . / : ;  =  ? @ [ ] ^ + _  {  } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character, including the space character, are not allowed. May not begin with ..
     */
    private String value;
    /**
     * Instantiates a new AppRole and sets the default values.
     */
    public AppRole() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppRole
     */
    @jakarta.annotation.Nonnull
    public static AppRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppRole();
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
     * Gets the allowedMemberTypes property value. Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles supporting assignment to other applications' service principals are also known as application permissions. The 'Application' value is only supported for app roles defined on application entities.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedMemberTypes() {
        return this.allowedMemberTypes;
    }
    /**
     * Gets the description property value. The description for the app role. This is displayed when the app role is being assigned and, if the app role functions as an application permission, during  consent experiences.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name for the permission that appears in the app role assignment and consent experiences.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("allowedMemberTypes", (n) -> { this.setAllowedMemberTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique role identifier inside the appRoles collection. When creating a new app role, a new GUID identifier must be provided.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the isEnabled property value. When creating or updating an app role, this must be set to true (which is the default). To delete a role, this must first be set to false.  At that point, in a subsequent call, this role may be removed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
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
     * Gets the origin property value. Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the value property value. Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % & ' ( ) * + , - . / : ;  =  ? @ [ ] ^ + _  {  } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character, including the space character, are not allowed. May not begin with ..
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedMemberTypes", this.getAllowedMemberTypes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("id", this.getId());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the allowedMemberTypes property value. Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles supporting assignment to other applications' service principals are also known as application permissions. The 'Application' value is only supported for app roles defined on application entities.
     * @param value Value to set for the allowedMemberTypes property.
     */
    public void setAllowedMemberTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedMemberTypes = value;
    }
    /**
     * Sets the description property value. The description for the app role. This is displayed when the app role is being assigned and, if the app role functions as an application permission, during  consent experiences.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name for the permission that appears in the app role assignment and consent experiences.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. Unique role identifier inside the appRoles collection. When creating a new app role, a new GUID identifier must be provided.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the isEnabled property value. When creating or updating an app role, this must be set to true (which is the default). To delete a role, this must first be set to false.  At that point, in a subsequent call, this role may be removed.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the origin property value. Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the value property value. Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % & ' ( ) * + , - . / : ;  =  ? @ [ ] ^ + _  {  } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character, including the space character, are not allowed. May not begin with ..
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
