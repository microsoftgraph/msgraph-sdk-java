package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyB2BSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of applications targeted with your cross-tenant access policy. */
    private CrossTenantAccessPolicyTargetConfiguration _applications;
    /** The OdataType property */
    private String _odataType;
    /** The list of users and groups targeted with your cross-tenant access policy. */
    private CrossTenantAccessPolicyTargetConfiguration _usersAndGroups;
    /**
     * Instantiates a new crossTenantAccessPolicyB2BSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyB2BSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyB2BSetting();
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
     * Gets the applications property value. The list of applications targeted with your cross-tenant access policy.
     * @return a crossTenantAccessPolicyTargetConfiguration
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfiguration getApplications() {
        return this._applications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("applications", (n) -> { this.setApplications(n.getObjectValue(CrossTenantAccessPolicyTargetConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("usersAndGroups", (n) -> { this.setUsersAndGroups(n.getObjectValue(CrossTenantAccessPolicyTargetConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the usersAndGroups property value. The list of users and groups targeted with your cross-tenant access policy.
     * @return a crossTenantAccessPolicyTargetConfiguration
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfiguration getUsersAndGroups() {
        return this._usersAndGroups;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applications", this.getApplications());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("usersAndGroups", this.getUsersAndGroups());
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
     * Sets the applications property value. The list of applications targeted with your cross-tenant access policy.
     * @param value Value to set for the applications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplications(@javax.annotation.Nullable final CrossTenantAccessPolicyTargetConfiguration value) {
        this._applications = value;
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
     * Sets the usersAndGroups property value. The list of users and groups targeted with your cross-tenant access policy.
     * @param value Value to set for the usersAndGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersAndGroups(@javax.annotation.Nullable final CrossTenantAccessPolicyTargetConfiguration value) {
        this._usersAndGroups = value;
    }
}
