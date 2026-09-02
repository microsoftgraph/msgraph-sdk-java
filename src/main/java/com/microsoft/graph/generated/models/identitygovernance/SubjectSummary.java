package com.microsoft.graph.models.identitygovernance;

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
public class SubjectSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SubjectSummary} and sets the default values.
     */
    public SubjectSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubjectSummary}
     */
    @jakarta.annotation.Nonnull
    public static SubjectSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectSummary();
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
     * Gets the failedSubjects property value. The number of subjects with at least one failed task in a subject summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedSubjects() {
        return this.backingStore.get("failedSubjects");
    }
    /**
     * Gets the failedTasks property value. The number of failed tasks for subjects in a subject summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasks() {
        return this.backingStore.get("failedTasks");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("failedSubjects", (n) -> { this.setFailedSubjects(n.getIntegerValue()); });
        deserializerMap.put("failedTasks", (n) -> { this.setFailedTasks(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulSubjects", (n) -> { this.setSuccessfulSubjects(n.getIntegerValue()); });
        deserializerMap.put("totalSubjects", (n) -> { this.setTotalSubjects(n.getIntegerValue()); });
        deserializerMap.put("totalTasks", (n) -> { this.setTotalTasks(n.getIntegerValue()); });
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
     * Gets the successfulSubjects property value. The number of subjects where all tasks succeeded in a subject summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulSubjects() {
        return this.backingStore.get("successfulSubjects");
    }
    /**
     * Gets the totalSubjects property value. The total number of subjects in a subject summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalSubjects() {
        return this.backingStore.get("totalSubjects");
    }
    /**
     * Gets the totalTasks property value. The total tasks of subjects in a subject summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasks() {
        return this.backingStore.get("totalTasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedSubjects", this.getFailedSubjects());
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulSubjects", this.getSuccessfulSubjects());
        writer.writeIntegerValue("totalSubjects", this.getTotalSubjects());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
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
     * Sets the failedSubjects property value. The number of subjects with at least one failed task in a subject summary.
     * @param value Value to set for the failedSubjects property.
     */
    public void setFailedSubjects(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedSubjects", value);
    }
    /**
     * Sets the failedTasks property value. The number of failed tasks for subjects in a subject summary.
     * @param value Value to set for the failedTasks property.
     */
    public void setFailedTasks(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedTasks", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the successfulSubjects property value. The number of subjects where all tasks succeeded in a subject summary.
     * @param value Value to set for the successfulSubjects property.
     */
    public void setSuccessfulSubjects(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulSubjects", value);
    }
    /**
     * Sets the totalSubjects property value. The total number of subjects in a subject summary.
     * @param value Value to set for the totalSubjects property.
     */
    public void setTotalSubjects(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalSubjects", value);
    }
    /**
     * Sets the totalTasks property value. The total tasks of subjects in a subject summary.
     * @param value Value to set for the totalTasks property.
     */
    public void setTotalTasks(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalTasks", value);
    }
}
