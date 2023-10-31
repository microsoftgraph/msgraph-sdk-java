package com.microsoft.graph.models;

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
public class UserRegistrationFeatureSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UserRegistrationFeatureSummary and sets the default values.
     */
    public UserRegistrationFeatureSummary() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserRegistrationFeatureSummary
     */
    @jakarta.annotation.Nonnull
    public static UserRegistrationFeatureSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationFeatureSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalUserCount", (n) -> { this.setTotalUserCount(n.getLongValue()); });
        deserializerMap.put("userRegistrationFeatureCounts", (n) -> { this.setUserRegistrationFeatureCounts(n.getCollectionOfObjectValues(UserRegistrationFeatureCount::createFromDiscriminatorValue)); });
        deserializerMap.put("userRoles", (n) -> { this.setUserRoles(n.getEnumValue(IncludedUserRoles.class)); });
        deserializerMap.put("userTypes", (n) -> { this.setUserTypes(n.getEnumValue(IncludedUserTypes.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the totalUserCount property value. Total number of users accounts, excluding those that are blocked.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalUserCount() {
        return this.getBackingStore().get("totalUserCount");
    }
    /**
     * Gets the userRegistrationFeatureCounts property value. Number of users registered or capable for multi-factor authentication, self-service password reset, and passwordless authentication.
     * @return a java.util.List<UserRegistrationFeatureCount>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserRegistrationFeatureCount> getUserRegistrationFeatureCounts() {
        return this.getBackingStore().get("userRegistrationFeatureCounts");
    }
    /**
     * Gets the userRoles property value. The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     * @return a IncludedUserRoles
     */
    @jakarta.annotation.Nullable
    public IncludedUserRoles getUserRoles() {
        return this.getBackingStore().get("userRoles");
    }
    /**
     * Gets the userTypes property value. User type. Possible values are: all, member, guest, unknownFutureValue.
     * @return a IncludedUserTypes
     */
    @jakarta.annotation.Nullable
    public IncludedUserTypes getUserTypes() {
        return this.getBackingStore().get("userTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("totalUserCount", this.getTotalUserCount());
        writer.writeCollectionOfObjectValues("userRegistrationFeatureCounts", this.getUserRegistrationFeatureCounts());
        writer.writeEnumValue("userRoles", this.getUserRoles());
        writer.writeEnumValue("userTypes", this.getUserTypes());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the totalUserCount property value. Total number of users accounts, excluding those that are blocked.
     * @param value Value to set for the totalUserCount property.
     */
    public void setTotalUserCount(@jakarta.annotation.Nullable final Long value) {
        this.getBackingStore().set("totalUserCount", value);
    }
    /**
     * Sets the userRegistrationFeatureCounts property value. Number of users registered or capable for multi-factor authentication, self-service password reset, and passwordless authentication.
     * @param value Value to set for the userRegistrationFeatureCounts property.
     */
    public void setUserRegistrationFeatureCounts(@jakarta.annotation.Nullable final java.util.List<UserRegistrationFeatureCount> value) {
        this.getBackingStore().set("userRegistrationFeatureCounts", value);
    }
    /**
     * Sets the userRoles property value. The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     * @param value Value to set for the userRoles property.
     */
    public void setUserRoles(@jakarta.annotation.Nullable final IncludedUserRoles value) {
        this.getBackingStore().set("userRoles", value);
    }
    /**
     * Sets the userTypes property value. User type. Possible values are: all, member, guest, unknownFutureValue.
     * @param value Value to set for the userTypes property.
     */
    public void setUserTypes(@jakarta.annotation.Nullable final IncludedUserTypes value) {
        this.getBackingStore().set("userTypes", value);
    }
}
