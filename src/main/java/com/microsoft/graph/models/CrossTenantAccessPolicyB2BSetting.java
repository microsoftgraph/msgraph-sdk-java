package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyB2BSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of applications targeted with your cross-tenant access policy.
     */
    private CrossTenantAccessPolicyTargetConfiguration applications;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The list of users and groups targeted with your cross-tenant access policy.
     */
    private CrossTenantAccessPolicyTargetConfiguration usersAndGroups;
    /**
     * Instantiates a new crossTenantAccessPolicyB2BSetting and sets the default values.
     */
    public CrossTenantAccessPolicyB2BSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicyB2BSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyB2BSetting();
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
     * Gets the applications property value. The list of applications targeted with your cross-tenant access policy.
     * @return a crossTenantAccessPolicyTargetConfiguration
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfiguration getApplications() {
        return this.applications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("applications", (n) -> { this.setApplications(n.getObjectValue(CrossTenantAccessPolicyTargetConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("usersAndGroups", (n) -> { this.setUsersAndGroups(n.getObjectValue(CrossTenantAccessPolicyTargetConfiguration::createFromDiscriminatorValue)); });
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
     * Gets the usersAndGroups property value. The list of users and groups targeted with your cross-tenant access policy.
     * @return a crossTenantAccessPolicyTargetConfiguration
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfiguration getUsersAndGroups() {
        return this.usersAndGroups;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applications", this.getApplications());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("usersAndGroups", this.getUsersAndGroups());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applications property value. The list of applications targeted with your cross-tenant access policy.
     * @param value Value to set for the applications property.
     */
    public void setApplications(@jakarta.annotation.Nullable final CrossTenantAccessPolicyTargetConfiguration value) {
        this.applications = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the usersAndGroups property value. The list of users and groups targeted with your cross-tenant access policy.
     * @param value Value to set for the usersAndGroups property.
     */
    public void setUsersAndGroups(@jakarta.annotation.Nullable final CrossTenantAccessPolicyTargetConfiguration value) {
        this.usersAndGroups = value;
    }
}
