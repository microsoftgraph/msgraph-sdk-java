package com.microsoft.graph.models;

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
public class UserRegistrationMethodSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UserRegistrationMethodSummary and sets the default values.
     */
    public UserRegistrationMethodSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserRegistrationMethodSummary
     */
    @jakarta.annotation.Nonnull
    public static UserRegistrationMethodSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationMethodSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
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
        deserializerMap.put("userRegistrationMethodCounts", (n) -> { this.setUserRegistrationMethodCounts(n.getCollectionOfObjectValues(UserRegistrationMethodCount::createFromDiscriminatorValue)); });
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
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the totalUserCount property value. Total number of users in the tenant.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalUserCount() {
        return this.backingStore.get("totalUserCount");
    }
    /**
     * Gets the userRegistrationMethodCounts property value. Number of users registered for each authentication method.
     * @return a java.util.List<UserRegistrationMethodCount>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserRegistrationMethodCount> getUserRegistrationMethodCounts() {
        return this.backingStore.get("userRegistrationMethodCounts");
    }
    /**
     * Gets the userRoles property value. The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     * @return a IncludedUserRoles
     */
    @jakarta.annotation.Nullable
    public IncludedUserRoles getUserRoles() {
        return this.backingStore.get("userRoles");
    }
    /**
     * Gets the userTypes property value. User type. Possible values are: all, member, guest, unknownFutureValue.
     * @return a IncludedUserTypes
     */
    @jakarta.annotation.Nullable
    public IncludedUserTypes getUserTypes() {
        return this.backingStore.get("userTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("totalUserCount", this.getTotalUserCount());
        writer.writeCollectionOfObjectValues("userRegistrationMethodCounts", this.getUserRegistrationMethodCounts());
        writer.writeEnumValue("userRoles", this.getUserRoles());
        writer.writeEnumValue("userTypes", this.getUserTypes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the totalUserCount property value. Total number of users in the tenant.
     * @param value Value to set for the totalUserCount property.
     */
    public void setTotalUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalUserCount", value);
    }
    /**
     * Sets the userRegistrationMethodCounts property value. Number of users registered for each authentication method.
     * @param value Value to set for the userRegistrationMethodCounts property.
     */
    public void setUserRegistrationMethodCounts(@jakarta.annotation.Nullable final java.util.List<UserRegistrationMethodCount> value) {
        this.backingStore.set("userRegistrationMethodCounts", value);
    }
    /**
     * Sets the userRoles property value. The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     * @param value Value to set for the userRoles property.
     */
    public void setUserRoles(@jakarta.annotation.Nullable final IncludedUserRoles value) {
        this.backingStore.set("userRoles", value);
    }
    /**
     * Sets the userTypes property value. User type. Possible values are: all, member, guest, unknownFutureValue.
     * @param value Value to set for the userTypes property.
     */
    public void setUserTypes(@jakarta.annotation.Nullable final IncludedUserTypes value) {
        this.backingStore.set("userTypes", value);
    }
}
