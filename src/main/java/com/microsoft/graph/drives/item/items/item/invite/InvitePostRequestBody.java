package com.microsoft.graph.drives.item.items.item.invite;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new InvitePostRequestBody and sets the default values.
     */
    public InvitePostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InvitePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static InvitePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExpirationDateTime() {
        return this.BackingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.BackingStore.get("message");
    }
    /**
     * Gets the password property value. The password property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.BackingStore.get("password");
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a java.util.List<DriveRecipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveRecipient> getRecipients() {
        return this.BackingStore.get("recipients");
    }
    /**
     * Gets the requireSignIn property value. The requireSignIn property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSignIn() {
        return this.BackingStore.get("requireSignIn");
    }
    /**
     * Gets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRetainInheritedPermissions() {
        return this.BackingStore.get("retainInheritedPermissions");
    }
    /**
     * Gets the roles property value. The roles property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.BackingStore.get("roles");
    }
    /**
     * Gets the sendInvitation property value. The sendInvitation property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSendInvitation() {
        return this.BackingStore.get("sendInvitation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("message", value);
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("password", value);
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this.BackingStore.set("recipients", value);
    }
    /**
     * Sets the requireSignIn property value. The requireSignIn property
     * @param value Value to set for the requireSignIn property.
     */
    public void setRequireSignIn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("requireSignIn", value);
    }
    /**
     * Sets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @param value Value to set for the retainInheritedPermissions property.
     */
    public void setRetainInheritedPermissions(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("retainInheritedPermissions", value);
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roles", value);
    }
    /**
     * Sets the sendInvitation property value. The sendInvitation property
     * @param value Value to set for the sendInvitation property.
     */
    public void setSendInvitation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("sendInvitation", value);
    }
}
