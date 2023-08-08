package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationMethodSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Total number of users in the tenant.
     */
    private Long totalUserCount;
    /**
     * Number of users registered for each authentication method.
     */
    private java.util.List<UserRegistrationMethodCount> userRegistrationMethodCounts;
    /**
     * The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     */
    private IncludedUserRoles userRoles;
    /**
     * User type. Possible values are: all, member, guest, unknownFutureValue.
     */
    private IncludedUserTypes userTypes;
    /**
     * Instantiates a new userRegistrationMethodSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserRegistrationMethodSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userRegistrationMethodSummary
     */
    @jakarta.annotation.Nonnull
    public static UserRegistrationMethodSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationMethodSummary();
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the totalUserCount property value. Total number of users in the tenant.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTotalUserCount() {
        return this.totalUserCount;
    }
    /**
     * Gets the userRegistrationMethodCounts property value. Number of users registered for each authentication method.
     * @return a userRegistrationMethodCount
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserRegistrationMethodCount> getUserRegistrationMethodCounts() {
        return this.userRegistrationMethodCounts;
    }
    /**
     * Gets the userRoles property value. The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     * @return a includedUserRoles
     */
    @jakarta.annotation.Nullable
    public IncludedUserRoles getUserRoles() {
        return this.userRoles;
    }
    /**
     * Gets the userTypes property value. User type. Possible values are: all, member, guest, unknownFutureValue.
     * @return a includedUserTypes
     */
    @jakarta.annotation.Nullable
    public IncludedUserTypes getUserTypes() {
        return this.userTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
     * Sets the totalUserCount property value. Total number of users in the tenant.
     * @param value Value to set for the totalUserCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTotalUserCount(@jakarta.annotation.Nullable final Long value) {
        this.totalUserCount = value;
    }
    /**
     * Sets the userRegistrationMethodCounts property value. Number of users registered for each authentication method.
     * @param value Value to set for the userRegistrationMethodCounts property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserRegistrationMethodCounts(@jakarta.annotation.Nullable final java.util.List<UserRegistrationMethodCount> value) {
        this.userRegistrationMethodCounts = value;
    }
    /**
     * Sets the userRoles property value. The role type of the user. Possible values are: all, privilegedAdmin, admin, user, unknownFutureValue.
     * @param value Value to set for the userRoles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserRoles(@jakarta.annotation.Nullable final IncludedUserRoles value) {
        this.userRoles = value;
    }
    /**
     * Sets the userTypes property value. User type. Possible values are: all, member, guest, unknownFutureValue.
     * @param value Value to set for the userTypes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserTypes(@jakarta.annotation.Nullable final IncludedUserTypes value) {
        this.userTypes = value;
    }
}
