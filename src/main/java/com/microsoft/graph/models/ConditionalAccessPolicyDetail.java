package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessPolicyDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The conditions property
     */
    private ConditionalAccessConditionSet conditions;
    /**
     * Represents grant controls that must be fulfilled for the policy.
     */
    private ConditionalAccessGrantControls grantControls;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents a complex type of session controls that is enforced after sign-in.
     */
    private ConditionalAccessSessionControls sessionControls;
    /**
     * Instantiates a new conditionalAccessPolicyDetail and sets the default values.
     */
    public ConditionalAccessPolicyDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPolicyDetail
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessPolicyDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicyDetail();
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
     * Gets the conditions property value. The conditions property
     * @return a conditionalAccessConditionSet
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessConditionSet getConditions() {
        return this.conditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(ConditionalAccessConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("grantControls", (n) -> { this.setGrantControls(n.getObjectValue(ConditionalAccessGrantControls::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sessionControls", (n) -> { this.setSessionControls(n.getObjectValue(ConditionalAccessSessionControls::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grantControls property value. Represents grant controls that must be fulfilled for the policy.
     * @return a conditionalAccessGrantControls
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessGrantControls getGrantControls() {
        return this.grantControls;
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
     * Gets the sessionControls property value. Represents a complex type of session controls that is enforced after sign-in.
     * @return a conditionalAccessSessionControls
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessSessionControls getSessionControls() {
        return this.sessionControls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeObjectValue("grantControls", this.getGrantControls());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("sessionControls", this.getSessionControls());
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
     * Sets the conditions property value. The conditions property
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final ConditionalAccessConditionSet value) {
        this.conditions = value;
    }
    /**
     * Sets the grantControls property value. Represents grant controls that must be fulfilled for the policy.
     * @param value Value to set for the grantControls property.
     */
    public void setGrantControls(@jakarta.annotation.Nullable final ConditionalAccessGrantControls value) {
        this.grantControls = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sessionControls property value. Represents a complex type of session controls that is enforced after sign-in.
     * @param value Value to set for the sessionControls property.
     */
    public void setSessionControls(@jakarta.annotation.Nullable final ConditionalAccessSessionControls value) {
        this.sessionControls = value;
    }
}
