package com.microsoft.graph.identity.conditionalaccess.evaluate;

import com.microsoft.graph.models.SignInConditions;
import com.microsoft.graph.models.SignInContext;
import com.microsoft.graph.models.SignInIdentity;
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
public class EvaluatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EvaluatePostRequestBody} and sets the default values.
     */
    public EvaluatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static EvaluatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the appliedPoliciesOnly property value. The appliedPoliciesOnly property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppliedPoliciesOnly() {
        return this.backingStore.get("appliedPoliciesOnly");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appliedPoliciesOnly", (n) -> { this.setAppliedPoliciesOnly(n.getBooleanValue()); });
        deserializerMap.put("signInConditions", (n) -> { this.setSignInConditions(n.getObjectValue(SignInConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("signInContext", (n) -> { this.setSignInContext(n.getObjectValue(SignInContext::createFromDiscriminatorValue)); });
        deserializerMap.put("signInIdentity", (n) -> { this.setSignInIdentity(n.getObjectValue(SignInIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the signInConditions property value. The signInConditions property
     * @return a {@link SignInConditions}
     */
    @jakarta.annotation.Nullable
    public SignInConditions getSignInConditions() {
        return this.backingStore.get("signInConditions");
    }
    /**
     * Gets the signInContext property value. The signInContext property
     * @return a {@link SignInContext}
     */
    @jakarta.annotation.Nullable
    public SignInContext getSignInContext() {
        return this.backingStore.get("signInContext");
    }
    /**
     * Gets the signInIdentity property value. The signInIdentity property
     * @return a {@link SignInIdentity}
     */
    @jakarta.annotation.Nullable
    public SignInIdentity getSignInIdentity() {
        return this.backingStore.get("signInIdentity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("appliedPoliciesOnly", this.getAppliedPoliciesOnly());
        writer.writeObjectValue("signInConditions", this.getSignInConditions());
        writer.writeObjectValue("signInContext", this.getSignInContext());
        writer.writeObjectValue("signInIdentity", this.getSignInIdentity());
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
     * Sets the appliedPoliciesOnly property value. The appliedPoliciesOnly property
     * @param value Value to set for the appliedPoliciesOnly property.
     */
    public void setAppliedPoliciesOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appliedPoliciesOnly", value);
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
     * Sets the signInConditions property value. The signInConditions property
     * @param value Value to set for the signInConditions property.
     */
    public void setSignInConditions(@jakarta.annotation.Nullable final SignInConditions value) {
        this.backingStore.set("signInConditions", value);
    }
    /**
     * Sets the signInContext property value. The signInContext property
     * @param value Value to set for the signInContext property.
     */
    public void setSignInContext(@jakarta.annotation.Nullable final SignInContext value) {
        this.backingStore.set("signInContext", value);
    }
    /**
     * Sets the signInIdentity property value. The signInIdentity property
     * @param value Value to set for the signInIdentity property.
     */
    public void setSignInIdentity(@jakarta.annotation.Nullable final SignInIdentity value) {
        this.backingStore.set("signInIdentity", value);
    }
}
