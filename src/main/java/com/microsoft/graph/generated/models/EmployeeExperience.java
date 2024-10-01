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
/**
 * Represents a container that exposes navigation properties for employee experience resources.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmployeeExperience implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EmployeeExperience} and sets the default values.
     */
    public EmployeeExperience() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmployeeExperience}
     */
    @jakarta.annotation.Nonnull
    public static EmployeeExperience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmployeeExperience();
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
     * Gets the communities property value. A collection of communities in Viva Engage.
     * @return a {@link java.util.List<Community>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Community> getCommunities() {
        return this.backingStore.get("communities");
    }
    /**
     * Gets the engagementAsyncOperations property value. A collection of long-running, asynchronous operations related to Viva Engage.
     * @return a {@link java.util.List<EngagementAsyncOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementAsyncOperation> getEngagementAsyncOperations() {
        return this.backingStore.get("engagementAsyncOperations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("communities", (n) -> { this.setCommunities(n.getCollectionOfObjectValues(Community::createFromDiscriminatorValue)); });
        deserializerMap.put("engagementAsyncOperations", (n) -> { this.setEngagementAsyncOperations(n.getCollectionOfObjectValues(EngagementAsyncOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("learningCourseActivities", (n) -> { this.setLearningCourseActivities(n.getCollectionOfObjectValues(LearningCourseActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("learningProviders", (n) -> { this.setLearningProviders(n.getCollectionOfObjectValues(LearningProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the learningCourseActivities property value. The learningCourseActivities property
     * @return a {@link java.util.List<LearningCourseActivity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LearningCourseActivity> getLearningCourseActivities() {
        return this.backingStore.get("learningCourseActivities");
    }
    /**
     * Gets the learningProviders property value. A collection of learning providers.
     * @return a {@link java.util.List<LearningProvider>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LearningProvider> getLearningProviders() {
        return this.backingStore.get("learningProviders");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("communities", this.getCommunities());
        writer.writeCollectionOfObjectValues("engagementAsyncOperations", this.getEngagementAsyncOperations());
        writer.writeCollectionOfObjectValues("learningCourseActivities", this.getLearningCourseActivities());
        writer.writeCollectionOfObjectValues("learningProviders", this.getLearningProviders());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the communities property value. A collection of communities in Viva Engage.
     * @param value Value to set for the communities property.
     */
    public void setCommunities(@jakarta.annotation.Nullable final java.util.List<Community> value) {
        this.backingStore.set("communities", value);
    }
    /**
     * Sets the engagementAsyncOperations property value. A collection of long-running, asynchronous operations related to Viva Engage.
     * @param value Value to set for the engagementAsyncOperations property.
     */
    public void setEngagementAsyncOperations(@jakarta.annotation.Nullable final java.util.List<EngagementAsyncOperation> value) {
        this.backingStore.set("engagementAsyncOperations", value);
    }
    /**
     * Sets the learningCourseActivities property value. The learningCourseActivities property
     * @param value Value to set for the learningCourseActivities property.
     */
    public void setLearningCourseActivities(@jakarta.annotation.Nullable final java.util.List<LearningCourseActivity> value) {
        this.backingStore.set("learningCourseActivities", value);
    }
    /**
     * Sets the learningProviders property value. A collection of learning providers.
     * @param value Value to set for the learningProviders property.
     */
    public void setLearningProviders(@jakarta.annotation.Nullable final java.util.List<LearningProvider> value) {
        this.backingStore.set("learningProviders", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
