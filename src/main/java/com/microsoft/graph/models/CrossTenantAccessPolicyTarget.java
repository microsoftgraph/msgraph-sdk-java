package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyTarget implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The unique identifier of the user, group, or application; one of the following keywords: AllUsers and AllApplications; or for targets that are applications, you may use reserved values. */
    private String _target;
    /** The type of resource that you want to target. The possible values are: user, group, application, unknownFutureValue. */
    private CrossTenantAccessPolicyTargetType _targetType;
    /**
     * Instantiates a new crossTenantAccessPolicyTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTarget() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicyTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyTarget
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyTarget();
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
        final CrossTenantAccessPolicyTarget currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { currentObject.setTarget(n.getStringValue()); });
        deserializerMap.put("targetType", (n) -> { currentObject.setTargetType(n.getEnumValue(CrossTenantAccessPolicyTargetType.class)); });
        return deserializerMap
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
     * Gets the target property value. The unique identifier of the user, group, or application; one of the following keywords: AllUsers and AllApplications; or for targets that are applications, you may use reserved values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTarget() {
        return this._target;
    }
    /**
     * Gets the targetType property value. The type of resource that you want to target. The possible values are: user, group, application, unknownFutureValue.
     * @return a crossTenantAccessPolicyTargetType
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTargetType getTargetType() {
        return this._targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("target", this.getTarget());
        writer.writeEnumValue("targetType", this.getTargetType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the target property value. The unique identifier of the user, group, or application; one of the following keywords: AllUsers and AllApplications; or for targets that are applications, you may use reserved values.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final String value) {
        this._target = value;
    }
    /**
     * Sets the targetType property value. The type of resource that you want to target. The possible values are: user, group, application, unknownFutureValue.
     * @param value Value to set for the targetType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetType(@javax.annotation.Nullable final CrossTenantAccessPolicyTargetType value) {
        this._targetType = value;
    }
}
