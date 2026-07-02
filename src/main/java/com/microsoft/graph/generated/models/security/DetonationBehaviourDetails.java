package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetonationBehaviourDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DetonationBehaviourDetails} and sets the default values.
     */
    public DetonationBehaviourDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DetonationBehaviourDetails}
     */
    @jakarta.annotation.Nonnull
    public static DetonationBehaviourDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetonationBehaviourDetails();
    }
    /**
     * Gets the actionStatus property value. The status of the action performed during detonation (e.g., &apos;Successful&apos;, &apos;Failed&apos;, &apos;Blocked&apos;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionStatus() {
        return this.backingStore.get("actionStatus");
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the behaviourCapability property value. Categorizes the capability or type of behavior observed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBehaviourCapability() {
        return this.backingStore.get("behaviourCapability");
    }
    /**
     * Gets the behaviourGroup property value. Groups related behaviors together for classification purposes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBehaviourGroup() {
        return this.backingStore.get("behaviourGroup");
    }
    /**
     * Gets the details property value. More contextual information about the observed behavior or action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * Gets the eventDateTime property value. The date and time when the behavior or action was observed during detonation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("actionStatus", (n) -> { this.setActionStatus(n.getStringValue()); });
        deserializerMap.put("behaviourCapability", (n) -> { this.setBehaviourCapability(n.getStringValue()); });
        deserializerMap.put("behaviourGroup", (n) -> { this.setBehaviourGroup(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getStringValue()); });
        deserializerMap.put("processId", (n) -> { this.setProcessId(n.getStringValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the operation property value. The specific operation or action that was performed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperation() {
        return this.backingStore.get("operation");
    }
    /**
     * Gets the processId property value. The unique identifier of the process involved in the behavior.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessId() {
        return this.backingStore.get("processId");
    }
    /**
     * Gets the processName property value. The name of the process that performed or was involved in the behavior.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessName() {
        return this.backingStore.get("processName");
    }
    /**
     * Gets the target property value. The target of the operation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionStatus", this.getActionStatus());
        writer.writeStringValue("behaviourCapability", this.getBehaviourCapability());
        writer.writeStringValue("behaviourGroup", this.getBehaviourGroup());
        writer.writeStringValue("details", this.getDetails());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operation", this.getOperation());
        writer.writeStringValue("processId", this.getProcessId());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("target", this.getTarget());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionStatus property value. The status of the action performed during detonation (e.g., &apos;Successful&apos;, &apos;Failed&apos;, &apos;Blocked&apos;).
     * @param value Value to set for the actionStatus property.
     */
    public void setActionStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionStatus", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the behaviourCapability property value. Categorizes the capability or type of behavior observed.
     * @param value Value to set for the behaviourCapability property.
     */
    public void setBehaviourCapability(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("behaviourCapability", value);
    }
    /**
     * Sets the behaviourGroup property value. Groups related behaviors together for classification purposes.
     * @param value Value to set for the behaviourGroup property.
     */
    public void setBehaviourGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("behaviourGroup", value);
    }
    /**
     * Sets the details property value. More contextual information about the observed behavior or action.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the eventDateTime property value. The date and time when the behavior or action was observed during detonation.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operation property value. The specific operation or action that was performed.
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operation", value);
    }
    /**
     * Sets the processId property value. The unique identifier of the process involved in the behavior.
     * @param value Value to set for the processId property.
     */
    public void setProcessId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processId", value);
    }
    /**
     * Sets the processName property value. The name of the process that performed or was involved in the behavior.
     * @param value Value to set for the processName property.
     */
    public void setProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processName", value);
    }
    /**
     * Sets the target property value. The target of the operation.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("target", value);
    }
}
