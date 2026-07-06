package com.microsoft.graph.security.collaboration.analyzedemails.microsoftgraphsecurityremediate;

import com.microsoft.graph.models.security.AnalyzedEmail;
import com.microsoft.graph.models.security.RemediationAction;
import com.microsoft.graph.models.security.RemediationSeverity;
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
public class RemediatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RemediatePostRequestBody} and sets the default values.
     */
    public RemediatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
        this.setRemediateSendersCopy(false);
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RemediatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static RemediatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemediatePostRequestBody();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link RemediationAction}
     */
    @jakarta.annotation.Nullable
    public RemediationAction getAction() {
        return this.backingStore.get("action");
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
     * Gets the analyzedEmails property value. The analyzedEmails property
     * @return a {@link java.util.List<AnalyzedEmail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyzedEmail> getAnalyzedEmails() {
        return this.backingStore.get("analyzedEmails");
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
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(RemediationAction::forValue)); });
        deserializerMap.put("analyzedEmails", (n) -> { this.setAnalyzedEmails(n.getCollectionOfObjectValues(AnalyzedEmail::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("remediateSendersCopy", (n) -> { this.setRemediateSendersCopy(n.getBooleanValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(RemediationSeverity::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the remediateSendersCopy property value. The remediateSendersCopy property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRemediateSendersCopy() {
        return this.backingStore.get("remediateSendersCopy");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link RemediationSeverity}
     */
    @jakarta.annotation.Nullable
    public RemediationSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfObjectValues("analyzedEmails", this.getAnalyzedEmails());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("remediateSendersCopy", this.getRemediateSendersCopy());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final RemediationAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the analyzedEmails property value. The analyzedEmails property
     * @param value Value to set for the analyzedEmails property.
     */
    public void setAnalyzedEmails(@jakarta.annotation.Nullable final java.util.List<AnalyzedEmail> value) {
        this.backingStore.set("analyzedEmails", value);
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the remediateSendersCopy property value. The remediateSendersCopy property
     * @param value Value to set for the remediateSendersCopy property.
     */
    public void setRemediateSendersCopy(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("remediateSendersCopy", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final RemediationSeverity value) {
        this.backingStore.set("severity", value);
    }
}
