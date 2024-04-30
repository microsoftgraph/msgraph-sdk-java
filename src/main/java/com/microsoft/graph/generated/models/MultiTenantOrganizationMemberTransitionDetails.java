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
public class MultiTenantOrganizationMemberTransitionDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MultiTenantOrganizationMemberTransitionDetails} and sets the default values.
     */
    public MultiTenantOrganizationMemberTransitionDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiTenantOrganizationMemberTransitionDetails}
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationMemberTransitionDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationMemberTransitionDetails();
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
     * Gets the desiredRole property value. Role of the tenant in the multitenant organization. The possible values are: owner, member, unknownFutureValue.
     * @return a {@link MultiTenantOrganizationMemberRole}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberRole getDesiredRole() {
        return this.backingStore.get("desiredRole");
    }
    /**
     * Gets the desiredState property value. State of the tenant in the multitenant organization currently being processed. The possible values are: pending, active, removed, unknownFutureValue. Read-only.
     * @return a {@link MultiTenantOrganizationMemberState}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getDesiredState() {
        return this.backingStore.get("desiredState");
    }
    /**
     * Gets the details property value. Details that explain the processing status if any. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("desiredRole", (n) -> { this.setDesiredRole(n.getEnumValue(MultiTenantOrganizationMemberRole::forValue)); });
        deserializerMap.put("desiredState", (n) -> { this.setDesiredState(n.getEnumValue(MultiTenantOrganizationMemberState::forValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MultiTenantOrganizationMemberProcessingStatus::forValue)); });
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
     * Gets the status property value. Processing state of the asynchronous job. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue. Read-only.
     * @return a {@link MultiTenantOrganizationMemberProcessingStatus}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberProcessingStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("desiredRole", this.getDesiredRole());
        writer.writeEnumValue("desiredState", this.getDesiredState());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the desiredRole property value. Role of the tenant in the multitenant organization. The possible values are: owner, member, unknownFutureValue.
     * @param value Value to set for the desiredRole property.
     */
    public void setDesiredRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.backingStore.set("desiredRole", value);
    }
    /**
     * Sets the desiredState property value. State of the tenant in the multitenant organization currently being processed. The possible values are: pending, active, removed, unknownFutureValue. Read-only.
     * @param value Value to set for the desiredState property.
     */
    public void setDesiredState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.backingStore.set("desiredState", value);
    }
    /**
     * Sets the details property value. Details that explain the processing status if any. Read-only.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the status property value. Processing state of the asynchronous job. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberProcessingStatus value) {
        this.backingStore.set("status", value);
    }
}
