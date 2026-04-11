package com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.microsoftgraphteamsadministrationassignnumber;

import com.microsoft.graph.models.teamsadministration.AssignmentCategory;
import com.microsoft.graph.models.teamsadministration.NumberType;
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
public class AssignNumberPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AssignNumberPostRequestBody} and sets the default values.
     */
    public AssignNumberPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AssignNumberPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static AssignNumberPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignNumberPostRequestBody();
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
     * Gets the assignmentCategory property value. The assignmentCategory property
     * @return a {@link AssignmentCategory}
     */
    @jakarta.annotation.Nullable
    public AssignmentCategory getAssignmentCategory() {
        return this.backingStore.get("assignmentCategory");
    }
    /**
     * Gets the assignmentTargetId property value. The assignmentTargetId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentTargetId() {
        return this.backingStore.get("assignmentTargetId");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assignmentCategory", (n) -> { this.setAssignmentCategory(n.getEnumValue(AssignmentCategory::forValue)); });
        deserializerMap.put("assignmentTargetId", (n) -> { this.setAssignmentTargetId(n.getStringValue()); });
        deserializerMap.put("locationId", (n) -> { this.setLocationId(n.getStringValue()); });
        deserializerMap.put("numberType", (n) -> { this.setNumberType(n.getEnumValue(NumberType::forValue)); });
        deserializerMap.put("telephoneNumber", (n) -> { this.setTelephoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locationId property value. The locationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationId() {
        return this.backingStore.get("locationId");
    }
    /**
     * Gets the numberType property value. The numberType property
     * @return a {@link NumberType}
     */
    @jakarta.annotation.Nullable
    public NumberType getNumberType() {
        return this.backingStore.get("numberType");
    }
    /**
     * Gets the telephoneNumber property value. The telephoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTelephoneNumber() {
        return this.backingStore.get("telephoneNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentCategory", this.getAssignmentCategory());
        writer.writeStringValue("assignmentTargetId", this.getAssignmentTargetId());
        writer.writeStringValue("locationId", this.getLocationId());
        writer.writeEnumValue("numberType", this.getNumberType());
        writer.writeStringValue("telephoneNumber", this.getTelephoneNumber());
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
     * Sets the assignmentCategory property value. The assignmentCategory property
     * @param value Value to set for the assignmentCategory property.
     */
    public void setAssignmentCategory(@jakarta.annotation.Nullable final AssignmentCategory value) {
        this.backingStore.set("assignmentCategory", value);
    }
    /**
     * Sets the assignmentTargetId property value. The assignmentTargetId property
     * @param value Value to set for the assignmentTargetId property.
     */
    public void setAssignmentTargetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentTargetId", value);
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
     * Sets the locationId property value. The locationId property
     * @param value Value to set for the locationId property.
     */
    public void setLocationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locationId", value);
    }
    /**
     * Sets the numberType property value. The numberType property
     * @param value Value to set for the numberType property.
     */
    public void setNumberType(@jakarta.annotation.Nullable final NumberType value) {
        this.backingStore.set("numberType", value);
    }
    /**
     * Sets the telephoneNumber property value. The telephoneNumber property
     * @param value Value to set for the telephoneNumber property.
     */
    public void setTelephoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("telephoneNumber", value);
    }
}
