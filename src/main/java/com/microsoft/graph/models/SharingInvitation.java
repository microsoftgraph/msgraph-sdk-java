package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharingInvitation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email address provided for the recipient of the sharing invitation. Read-only.
     */
    private String email;
    /**
     * Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     */
    private IdentitySet invitedBy;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The redeemedBy property
     */
    private String redeemedBy;
    /**
     * If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     */
    private Boolean signInRequired;
    /**
     * Instantiates a new sharingInvitation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SharingInvitation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharingInvitation
     */
    @jakarta.annotation.Nonnull
    public static SharingInvitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingInvitation();
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
     * Gets the email property value. The email address provided for the recipient of the sharing invitation. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("invitedBy", (n) -> { this.setInvitedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("redeemedBy", (n) -> { this.setRedeemedBy(n.getStringValue()); });
        deserializerMap.put("signInRequired", (n) -> { this.setSignInRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitedBy property value. Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInvitedBy() {
        return this.invitedBy;
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
     * Gets the redeemedBy property value. The redeemedBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRedeemedBy() {
        return this.redeemedBy;
    }
    /**
     * Gets the signInRequired property value. If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSignInRequired() {
        return this.signInRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the email property value. The email address provided for the recipient of the sharing invitation. Read-only.
     * @param value Value to set for the email property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the invitedBy property value. Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     * @param value Value to set for the invitedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInvitedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.invitedBy = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the redeemedBy property value. The redeemedBy property
     * @param value Value to set for the redeemedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRedeemedBy(@jakarta.annotation.Nullable final String value) {
        this.redeemedBy = value;
    }
    /**
     * Sets the signInRequired property value. If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     * @param value Value to set for the signInRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSignInRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.signInRequired = value;
    }
}
