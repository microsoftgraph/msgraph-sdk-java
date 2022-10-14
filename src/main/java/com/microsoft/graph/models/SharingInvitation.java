package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharingInvitation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The email address provided for the recipient of the sharing invitation. Read-only. */
    private String _email;
    /** Provides information about who sent the invitation that created this permission, if that information is available. Read-only. */
    private IdentitySet _invitedBy;
    /** The OdataType property */
    private String _odataType;
    /** The redeemedBy property */
    private String _redeemedBy;
    /** If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only. */
    private Boolean _signInRequired;
    /**
     * Instantiates a new sharingInvitation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharingInvitation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.sharingInvitation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharingInvitation
     */
    @javax.annotation.Nonnull
    public static SharingInvitation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingInvitation();
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
     * Gets the email property value. The email address provided for the recipient of the sharing invitation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharingInvitation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("invitedBy", (n) -> { currentObject.setInvitedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("redeemedBy", (n) -> { currentObject.setRedeemedBy(n.getStringValue()); });
            this.put("signInRequired", (n) -> { currentObject.setSignInRequired(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the invitedBy property value. Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInvitedBy() {
        return this._invitedBy;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the redeemedBy property value. The redeemedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedeemedBy() {
        return this._redeemedBy;
    }
    /**
     * Gets the signInRequired property value. If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSignInRequired() {
        return this._signInRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("invitedBy", this.getInvitedBy());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("redeemedBy", this.getRedeemedBy());
        writer.writeBooleanValue("signInRequired", this.getSignInRequired());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the email property value. The email address provided for the recipient of the sharing invitation. Read-only.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the invitedBy property value. Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     * @param value Value to set for the invitedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._invitedBy = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the redeemedBy property value. The redeemedBy property
     * @param value Value to set for the redeemedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedeemedBy(@javax.annotation.Nullable final String value) {
        this._redeemedBy = value;
    }
    /**
     * Sets the signInRequired property value. If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     * @param value Value to set for the signInRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInRequired(@javax.annotation.Nullable final Boolean value) {
        this._signInRequired = value;
    }
}
