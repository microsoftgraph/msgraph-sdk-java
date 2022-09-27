package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyTargetConfiguration implements AdditionalDataHolder, Parsable {
    /** Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue. */
    private CrossTenantAccessPolicyTargetConfigurationAccessType _accessType;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Specifies whether to target users, groups, or applications with this rule. */
    private java.util.List<CrossTenantAccessPolicyTarget> _targets;
    /**
     * Instantiates a new crossTenantAccessPolicyTargetConfiguration and sets the default values.
     * @return a void
     */
    public CrossTenantAccessPolicyTargetConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicyTargetConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyTargetConfiguration
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyTargetConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyTargetConfiguration();
    }
    /**
     * Gets the accessType property value. Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue.
     * @return a crossTenantAccessPolicyTargetConfigurationAccessType
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfigurationAccessType getAccessType() {
        return this._accessType;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CrossTenantAccessPolicyTargetConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("accessType", (n) -> { currentObject.setAccessType(n.getEnumValue(CrossTenantAccessPolicyTargetConfigurationAccessType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("targets", (n) -> { currentObject.setTargets(n.getCollectionOfObjectValues(CrossTenantAccessPolicyTarget::createFromDiscriminatorValue)); });
        }};
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
     * Gets the targets property value. Specifies whether to target users, groups, or applications with this rule.
     * @return a crossTenantAccessPolicyTarget
     */
    @javax.annotation.Nullable
    public java.util.List<CrossTenantAccessPolicyTarget> getTargets() {
        return this._targets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. Defines whether access is allowed or blocked. The possible values are: allowed, blocked, unknownFutureValue.
     * @param value Value to set for the accessType property.
     * @return a void
     */
    public void setAccessType(@javax.annotation.Nullable final CrossTenantAccessPolicyTargetConfigurationAccessType value) {
        this._accessType = value;
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the targets property value. Specifies whether to target users, groups, or applications with this rule.
     * @param value Value to set for the targets property.
     * @return a void
     */
    public void setTargets(@javax.annotation.Nullable final java.util.List<CrossTenantAccessPolicyTarget> value) {
        this._targets = value;
    }
}
