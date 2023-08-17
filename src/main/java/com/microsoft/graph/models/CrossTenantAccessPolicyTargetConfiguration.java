package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyTargetConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue.
     */
    private CrossTenantAccessPolicyTargetConfigurationAccessType accessType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies whether to target users, groups, or applications with this rule.
     */
    private java.util.List<CrossTenantAccessPolicyTarget> targets;
    /**
     * Instantiates a new crossTenantAccessPolicyTargetConfiguration and sets the default values.
     */
    public CrossTenantAccessPolicyTargetConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyTargetConfiguration
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicyTargetConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyTargetConfiguration();
    }
    /**
     * Gets the accessType property value. Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue.
     * @return a crossTenantAccessPolicyTargetConfigurationAccessType
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfigurationAccessType getAccessType() {
        return this.accessType;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumValue(CrossTenantAccessPolicyTargetConfigurationAccessType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(CrossTenantAccessPolicyTarget::createFromDiscriminatorValue)); });
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
     * Gets the targets property value. Specifies whether to target users, groups, or applications with this rule.
     * @return a crossTenantAccessPolicyTarget
     */
    @jakarta.annotation.Nullable
    public java.util.List<CrossTenantAccessPolicyTarget> getTargets() {
        return this.targets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue.
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final CrossTenantAccessPolicyTargetConfigurationAccessType value) {
        this.accessType = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the targets property value. Specifies whether to target users, groups, or applications with this rule.
     * @param value Value to set for the targets property.
     */
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<CrossTenantAccessPolicyTarget> value) {
        this.targets = value;
    }
}
