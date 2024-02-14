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
public class AccessPackageAssignmentRequestorSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AccessPackageAssignmentRequestorSettings} and sets the default values.
     */
    public AccessPackageAssignmentRequestorSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageAssignmentRequestorSettings}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequestorSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestorSettings();
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
     * Gets the allowCustomAssignmentSchedule property value. False indicates that the requestor isn't permitted to include a schedule in their request.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCustomAssignmentSchedule() {
        return this.backingStore.get("allowCustomAssignmentSchedule");
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
     * Gets the enableOnBehalfRequestorsToAddAccess property value. True allows on-behalf-of requestors to create a request to add access for another principal.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToAddAccess() {
        return this.backingStore.get("enableOnBehalfRequestorsToAddAccess");
    }
    /**
     * Gets the enableOnBehalfRequestorsToRemoveAccess property value. True allows on-behalf-of requestors to create a request to remove access for another principal.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToRemoveAccess() {
        return this.backingStore.get("enableOnBehalfRequestorsToRemoveAccess");
    }
    /**
     * Gets the enableOnBehalfRequestorsToUpdateAccess property value. True allows on-behalf-of requestors to create a request to update access for another principal.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableOnBehalfRequestorsToUpdateAccess() {
        return this.backingStore.get("enableOnBehalfRequestorsToUpdateAccess");
    }
    /**
     * Gets the enableTargetsToSelfAddAccess property value. True allows requestors to create a request to add access for themselves.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTargetsToSelfAddAccess() {
        return this.backingStore.get("enableTargetsToSelfAddAccess");
    }
    /**
     * Gets the enableTargetsToSelfRemoveAccess property value. True allows requestors to create a request to remove their access.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTargetsToSelfRemoveAccess() {
        return this.backingStore.get("enableTargetsToSelfRemoveAccess");
    }
    /**
     * Gets the enableTargetsToSelfUpdateAccess property value. True allows requestors to create a request to update their access.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTargetsToSelfUpdateAccess() {
        return this.backingStore.get("enableTargetsToSelfUpdateAccess");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("allowCustomAssignmentSchedule", (n) -> { this.setAllowCustomAssignmentSchedule(n.getBooleanValue()); });
        deserializerMap.put("enableOnBehalfRequestorsToAddAccess", (n) -> { this.setEnableOnBehalfRequestorsToAddAccess(n.getBooleanValue()); });
        deserializerMap.put("enableOnBehalfRequestorsToRemoveAccess", (n) -> { this.setEnableOnBehalfRequestorsToRemoveAccess(n.getBooleanValue()); });
        deserializerMap.put("enableOnBehalfRequestorsToUpdateAccess", (n) -> { this.setEnableOnBehalfRequestorsToUpdateAccess(n.getBooleanValue()); });
        deserializerMap.put("enableTargetsToSelfAddAccess", (n) -> { this.setEnableTargetsToSelfAddAccess(n.getBooleanValue()); });
        deserializerMap.put("enableTargetsToSelfRemoveAccess", (n) -> { this.setEnableTargetsToSelfRemoveAccess(n.getBooleanValue()); });
        deserializerMap.put("enableTargetsToSelfUpdateAccess", (n) -> { this.setEnableTargetsToSelfUpdateAccess(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onBehalfRequestors", (n) -> { this.setOnBehalfRequestors(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
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
     * Gets the onBehalfRequestors property value. The principals who can request on-behalf-of others.
     * @return a {@link java.util.List<SubjectSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getOnBehalfRequestors() {
        return this.backingStore.get("onBehalfRequestors");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCustomAssignmentSchedule", this.getAllowCustomAssignmentSchedule());
        writer.writeBooleanValue("enableOnBehalfRequestorsToAddAccess", this.getEnableOnBehalfRequestorsToAddAccess());
        writer.writeBooleanValue("enableOnBehalfRequestorsToRemoveAccess", this.getEnableOnBehalfRequestorsToRemoveAccess());
        writer.writeBooleanValue("enableOnBehalfRequestorsToUpdateAccess", this.getEnableOnBehalfRequestorsToUpdateAccess());
        writer.writeBooleanValue("enableTargetsToSelfAddAccess", this.getEnableTargetsToSelfAddAccess());
        writer.writeBooleanValue("enableTargetsToSelfRemoveAccess", this.getEnableTargetsToSelfRemoveAccess());
        writer.writeBooleanValue("enableTargetsToSelfUpdateAccess", this.getEnableTargetsToSelfUpdateAccess());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("onBehalfRequestors", this.getOnBehalfRequestors());
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
     * Sets the allowCustomAssignmentSchedule property value. False indicates that the requestor isn't permitted to include a schedule in their request.
     * @param value Value to set for the allowCustomAssignmentSchedule property.
     */
    public void setAllowCustomAssignmentSchedule(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCustomAssignmentSchedule", value);
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
     * Sets the enableOnBehalfRequestorsToAddAccess property value. True allows on-behalf-of requestors to create a request to add access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToAddAccess property.
     */
    public void setEnableOnBehalfRequestorsToAddAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableOnBehalfRequestorsToAddAccess", value);
    }
    /**
     * Sets the enableOnBehalfRequestorsToRemoveAccess property value. True allows on-behalf-of requestors to create a request to remove access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToRemoveAccess property.
     */
    public void setEnableOnBehalfRequestorsToRemoveAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableOnBehalfRequestorsToRemoveAccess", value);
    }
    /**
     * Sets the enableOnBehalfRequestorsToUpdateAccess property value. True allows on-behalf-of requestors to create a request to update access for another principal.
     * @param value Value to set for the enableOnBehalfRequestorsToUpdateAccess property.
     */
    public void setEnableOnBehalfRequestorsToUpdateAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableOnBehalfRequestorsToUpdateAccess", value);
    }
    /**
     * Sets the enableTargetsToSelfAddAccess property value. True allows requestors to create a request to add access for themselves.
     * @param value Value to set for the enableTargetsToSelfAddAccess property.
     */
    public void setEnableTargetsToSelfAddAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableTargetsToSelfAddAccess", value);
    }
    /**
     * Sets the enableTargetsToSelfRemoveAccess property value. True allows requestors to create a request to remove their access.
     * @param value Value to set for the enableTargetsToSelfRemoveAccess property.
     */
    public void setEnableTargetsToSelfRemoveAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableTargetsToSelfRemoveAccess", value);
    }
    /**
     * Sets the enableTargetsToSelfUpdateAccess property value. True allows requestors to create a request to update their access.
     * @param value Value to set for the enableTargetsToSelfUpdateAccess property.
     */
    public void setEnableTargetsToSelfUpdateAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableTargetsToSelfUpdateAccess", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the onBehalfRequestors property value. The principals who can request on-behalf-of others.
     * @param value Value to set for the onBehalfRequestors property.
     */
    public void setOnBehalfRequestors(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("onBehalfRequestors", value);
    }
}
