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
public class ConditionalAccessGrantControls implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new ConditionalAccessGrantControls and sets the default values.
     */
    public ConditionalAccessGrantControls() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessGrantControls
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessGrantControls createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessGrantControls();
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
     * Gets the authenticationStrength property value. The authenticationStrength property
     * @return a AuthenticationStrengthPolicy
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthPolicy getAuthenticationStrength() {
        return this.backingStore.get("authenticationStrength");
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
     * Gets the builtInControls property value. List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice, domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue.
     * @return a java.util.List<ConditionalAccessGrantControl>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessGrantControl> getBuiltInControls() {
        return this.backingStore.get("builtInControls");
    }
    /**
     * Gets the customAuthenticationFactors property value. List of custom controls IDs required by the policy. For more information, see Custom controls.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCustomAuthenticationFactors() {
        return this.backingStore.get("customAuthenticationFactors");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("authenticationStrength", (n) -> { this.setAuthenticationStrength(n.getObjectValue(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("builtInControls", (n) -> { this.setBuiltInControls(n.getCollectionOfEnumValues(ConditionalAccessGrantControl.class)); });
        deserializerMap.put("customAuthenticationFactors", (n) -> { this.setCustomAuthenticationFactors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getStringValue()); });
        deserializerMap.put("termsOfUse", (n) -> { this.setTermsOfUse(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the operator property value. Defines the relationship of the grant controls. Possible values: AND, OR.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Gets the termsOfUse property value. List of terms of use IDs required by the policy.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTermsOfUse() {
        return this.backingStore.get("termsOfUse");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationStrength", this.getAuthenticationStrength());
        writer.writeCollectionOfEnumValues("builtInControls", this.getBuiltInControls());
        writer.writeCollectionOfPrimitiveValues("customAuthenticationFactors", this.getCustomAuthenticationFactors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operator", this.getOperator());
        writer.writeCollectionOfPrimitiveValues("termsOfUse", this.getTermsOfUse());
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
     * Sets the authenticationStrength property value. The authenticationStrength property
     * @param value Value to set for the authenticationStrength property.
     */
    public void setAuthenticationStrength(@jakarta.annotation.Nullable final AuthenticationStrengthPolicy value) {
        this.backingStore.set("authenticationStrength", value);
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
     * Sets the builtInControls property value. List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice, domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue.
     * @param value Value to set for the builtInControls property.
     */
    public void setBuiltInControls(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessGrantControl> value) {
        this.backingStore.set("builtInControls", value);
    }
    /**
     * Sets the customAuthenticationFactors property value. List of custom controls IDs required by the policy. For more information, see Custom controls.
     * @param value Value to set for the customAuthenticationFactors property.
     */
    public void setCustomAuthenticationFactors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("customAuthenticationFactors", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operator property value. Defines the relationship of the grant controls. Possible values: AND, OR.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operator", value);
    }
    /**
     * Sets the termsOfUse property value. List of terms of use IDs required by the policy.
     * @param value Value to set for the termsOfUse property.
     */
    public void setTermsOfUse(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("termsOfUse", value);
    }
}
