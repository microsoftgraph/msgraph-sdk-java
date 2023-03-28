package com.microsoft.graph.drives.item.items.item.invite;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvitePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The expirationDateTime property */
    private String expirationDateTime;
    /** The message property */
    private String message;
    /** The password property */
    private String password;
    /** The recipients property */
    private java.util.List<DriveRecipient> recipients;
    /** The requireSignIn property */
    private Boolean requireSignIn;
    /** The retainInheritedPermissions property */
    private Boolean retainInheritedPermissions;
    /** The roles property */
    private java.util.List<String> roles;
    /** The sendInvitation property */
    private Boolean sendInvitation;
    /**
     * Instantiates a new invitePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InvitePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invitePostRequestBody
     */
    @javax.annotation.Nonnull
    public static InvitePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitePostRequestBody();
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
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfObjectValues(DriveRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("requireSignIn", (n) -> { this.setRequireSignIn(n.getBooleanValue()); });
        deserializerMap.put("retainInheritedPermissions", (n) -> { this.setRetainInheritedPermissions(n.getBooleanValue()); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sendInvitation", (n) -> { this.setSendInvitation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the password property value. The password property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a driveRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<DriveRecipient> getRecipients() {
        return this.recipients;
    }
    /**
     * Gets the requireSignIn property value. The requireSignIn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSignIn() {
        return this.requireSignIn;
    }
    /**
     * Gets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRetainInheritedPermissions() {
        return this.retainInheritedPermissions;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.roles;
    }
    /**
     * Gets the sendInvitation property value. The sendInvitation property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendInvitation() {
        return this.sendInvitation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("password", this.getPassword());
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeBooleanValue("requireSignIn", this.getRequireSignIn());
        writer.writeBooleanValue("retainInheritedPermissions", this.getRetainInheritedPermissions());
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
        writer.writeBooleanValue("sendInvitation", this.getSendInvitation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final String value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassword(@javax.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipients(@javax.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this.recipients = value;
    }
    /**
     * Sets the requireSignIn property value. The requireSignIn property
     * @param value Value to set for the requireSignIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireSignIn(@javax.annotation.Nullable final Boolean value) {
        this.requireSignIn = value;
    }
    /**
     * Sets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @param value Value to set for the retainInheritedPermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRetainInheritedPermissions(@javax.annotation.Nullable final Boolean value) {
        this.retainInheritedPermissions = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roles = value;
    }
    /**
     * Sets the sendInvitation property value. The sendInvitation property
     * @param value Value to set for the sendInvitation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSendInvitation(@javax.annotation.Nullable final Boolean value) {
        this.sendInvitation = value;
    }
}
