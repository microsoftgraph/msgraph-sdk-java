package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppliedConditionalAccessPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
     */
    private String displayName;
    /**
     * Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     */
    private java.util.List<String> enforcedGrantControls;
    /**
     * Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     */
    private java.util.List<String> enforcedSessionControls;
    /**
     * An identifier of the conditional access policy.
     */
    private String id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue.
     */
    private AppliedConditionalAccessPolicyResult result;
    /**
     * Instantiates a new appliedConditionalAccessPolicy and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AppliedConditionalAccessPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appliedConditionalAccessPolicy
     */
    @jakarta.annotation.Nonnull
    public static AppliedConditionalAccessPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedConditionalAccessPolicy();
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
     * Gets the displayName property value. Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enforcedGrantControls property value. Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnforcedGrantControls() {
        return this.enforcedGrantControls;
    }
    /**
     * Gets the enforcedSessionControls property value. Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnforcedSessionControls() {
        return this.enforcedSessionControls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforcedGrantControls", (n) -> { this.setEnforcedGrantControls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enforcedSessionControls", (n) -> { this.setEnforcedSessionControls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getEnumValue(AppliedConditionalAccessPolicyResult.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. An identifier of the conditional access policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the result property value. Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue.
     * @return a appliedConditionalAccessPolicyResult
     */
    @jakarta.annotation.Nullable
    public AppliedConditionalAccessPolicyResult getResult() {
        return this.result;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("enforcedGrantControls", this.getEnforcedGrantControls());
        writer.writeCollectionOfPrimitiveValues("enforcedSessionControls", this.getEnforcedSessionControls());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("result", this.getResult());
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
     * Sets the displayName property value. Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enforcedGrantControls property value. Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     * @param value Value to set for the enforcedGrantControls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnforcedGrantControls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.enforcedGrantControls = value;
    }
    /**
     * Sets the enforcedSessionControls property value. Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     * @param value Value to set for the enforcedSessionControls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnforcedSessionControls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.enforcedSessionControls = value;
    }
    /**
     * Sets the id property value. An identifier of the conditional access policy.
     * @param value Value to set for the id property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
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
     * Sets the result property value. Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue.
     * @param value Value to set for the result property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResult(@jakarta.annotation.Nullable final AppliedConditionalAccessPolicyResult value) {
        this.result = value;
    }
}
