package com.microsoft.graph.users.item.drives.item.items.item.invite;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the invite method. */
public class InvitePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The expirationDateTime property */
    private String _expirationDateTime;
    /** The message property */
    private String _message;
    /** The password property */
    private String _password;
    /** The recipients property */
    private java.util.List<DriveRecipient> _recipients;
    /** The requireSignIn property */
    private Boolean _requireSignIn;
    /** The retainInheritedPermissions property */
    private Boolean _retainInheritedPermissions;
    /** The roles property */
    private java.util.List<String> _roles;
    /** The sendInvitation property */
    private Boolean _sendInvitation;
    /**
     * Instantiates a new invitePostRequestBody and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InvitePostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(8) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getStringValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
            this.put("recipients", (n) -> { currentObject.setRecipients(n.getCollectionOfObjectValues(DriveRecipient::createFromDiscriminatorValue)); });
            this.put("requireSignIn", (n) -> { currentObject.setRequireSignIn(n.getBooleanValue()); });
            this.put("retainInheritedPermissions", (n) -> { currentObject.setRetainInheritedPermissions(n.getBooleanValue()); });
            this.put("roles", (n) -> { currentObject.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sendInvitation", (n) -> { currentObject.setSendInvitation(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the password property value. The password property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a driveRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<DriveRecipient> getRecipients() {
        return this._recipients;
    }
    /**
     * Gets the requireSignIn property value. The requireSignIn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSignIn() {
        return this._requireSignIn;
    }
    /**
     * Gets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRetainInheritedPermissions() {
        return this._retainInheritedPermissions;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this._roles;
    }
    /**
     * Gets the sendInvitation property value. The sendInvitation property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendInvitation() {
        return this._sendInvitation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final String value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     * @return a void
     */
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this._recipients = value;
    }
    /**
     * Sets the requireSignIn property value. The requireSignIn property
     * @param value Value to set for the requireSignIn property.
     * @return a void
     */
    public void setRequireSignIn(@javax.annotation.Nullable final Boolean value) {
        this._requireSignIn = value;
    }
    /**
     * Sets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @param value Value to set for the retainInheritedPermissions property.
     * @return a void
     */
    public void setRetainInheritedPermissions(@javax.annotation.Nullable final Boolean value) {
        this._retainInheritedPermissions = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    public void setRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roles = value;
    }
    /**
     * Sets the sendInvitation property value. The sendInvitation property
     * @param value Value to set for the sendInvitation property.
     * @return a void
     */
    public void setSendInvitation(@javax.annotation.Nullable final Boolean value) {
        this._sendInvitation = value;
    }
}
