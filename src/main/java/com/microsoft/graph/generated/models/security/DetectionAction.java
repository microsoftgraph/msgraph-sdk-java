package com.microsoft.graph.models.security;

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
public class DetectionAction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DetectionAction} and sets the default values.
     */
    public DetectionAction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DetectionAction}
     */
    @jakarta.annotation.Nonnull
    public static DetectionAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetectionAction();
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
     * Gets the alertTemplate property value. The alertTemplate property
     * @return a {@link AlertTemplate}
     */
    @jakarta.annotation.Nullable
    public AlertTemplate getAlertTemplate() {
        return this.backingStore.get("alertTemplate");
    }
    /**
     * Gets the automatedActions property value. The set of automated actions to run against entities that match the detection.
     * @return a {@link AutomatedActionSet}
     */
    @jakarta.annotation.Nullable
    public AutomatedActionSet getAutomatedActions() {
        return this.backingStore.get("automatedActions");
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
        deserializerMap.put("alertTemplate", (n) -> { this.setAlertTemplate(n.getObjectValue(AlertTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("automatedActions", (n) -> { this.setAutomatedActions(n.getObjectValue(AutomatedActionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationalScope", (n) -> { this.setOrganizationalScope(n.getObjectValue(OrganizationalScope::createFromDiscriminatorValue)); });
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
     * Gets the organizationalScope property value. The set of groups (for example, device groups) to which the parent custom detection rule applies.
     * @return a {@link OrganizationalScope}
     */
    @jakarta.annotation.Nullable
    public OrganizationalScope getOrganizationalScope() {
        return this.backingStore.get("organizationalScope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("alertTemplate", this.getAlertTemplate());
        writer.writeObjectValue("automatedActions", this.getAutomatedActions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("organizationalScope", this.getOrganizationalScope());
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
     * Sets the alertTemplate property value. The alertTemplate property
     * @param value Value to set for the alertTemplate property.
     */
    public void setAlertTemplate(@jakarta.annotation.Nullable final AlertTemplate value) {
        this.backingStore.set("alertTemplate", value);
    }
    /**
     * Sets the automatedActions property value. The set of automated actions to run against entities that match the detection.
     * @param value Value to set for the automatedActions property.
     */
    public void setAutomatedActions(@jakarta.annotation.Nullable final AutomatedActionSet value) {
        this.backingStore.set("automatedActions", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the organizationalScope property value. The set of groups (for example, device groups) to which the parent custom detection rule applies.
     * @param value Value to set for the organizationalScope property.
     */
    public void setOrganizationalScope(@jakarta.annotation.Nullable final OrganizationalScope value) {
        this.backingStore.set("organizationalScope", value);
    }
}
