package com.microsoft.graph.solutions.backuprestore.restorepoints.search;

import com.microsoft.graph.models.ArtifactQuery;
import com.microsoft.graph.models.RestorePointPreference;
import com.microsoft.graph.models.RestorePointTags;
import com.microsoft.graph.models.TimePeriod;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SearchPostRequestBody} and sets the default values.
     */
    public SearchPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SearchPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SearchPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchPostRequestBody();
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
     * Gets the artifactQuery property value. The artifactQuery property
     * @return a {@link ArtifactQuery}
     */
    @jakarta.annotation.Nullable
    public ArtifactQuery getArtifactQuery() {
        return this.backingStore.get("artifactQuery");
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
        deserializerMap.put("artifactQuery", (n) -> { this.setArtifactQuery(n.getObjectValue(ArtifactQuery::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionTimePeriod", (n) -> { this.setProtectionTimePeriod(n.getObjectValue(TimePeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionUnitIds", (n) -> { this.setProtectionUnitIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("restorePointPreference", (n) -> { this.setRestorePointPreference(n.getEnumValue(RestorePointPreference::forValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getEnumSetValue(RestorePointTags::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the protectionTimePeriod property value. The protectionTimePeriod property
     * @return a {@link TimePeriod}
     */
    @jakarta.annotation.Nullable
    public TimePeriod getProtectionTimePeriod() {
        return this.backingStore.get("protectionTimePeriod");
    }
    /**
     * Gets the protectionUnitIds property value. The protectionUnitIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProtectionUnitIds() {
        return this.backingStore.get("protectionUnitIds");
    }
    /**
     * Gets the restorePointPreference property value. The restorePointPreference property
     * @return a {@link RestorePointPreference}
     */
    @jakarta.annotation.Nullable
    public RestorePointPreference getRestorePointPreference() {
        return this.backingStore.get("restorePointPreference");
    }
    /**
     * Gets the tags property value. The tags property
     * @return a {@link EnumSet<RestorePointTags>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<RestorePointTags> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("artifactQuery", this.getArtifactQuery());
        writer.writeObjectValue("protectionTimePeriod", this.getProtectionTimePeriod());
        writer.writeCollectionOfPrimitiveValues("protectionUnitIds", this.getProtectionUnitIds());
        writer.writeEnumValue("restorePointPreference", this.getRestorePointPreference());
        writer.writeEnumSetValue("tags", this.getTags());
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
     * Sets the artifactQuery property value. The artifactQuery property
     * @param value Value to set for the artifactQuery property.
     */
    public void setArtifactQuery(@jakarta.annotation.Nullable final ArtifactQuery value) {
        this.backingStore.set("artifactQuery", value);
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
     * Sets the protectionTimePeriod property value. The protectionTimePeriod property
     * @param value Value to set for the protectionTimePeriod property.
     */
    public void setProtectionTimePeriod(@jakarta.annotation.Nullable final TimePeriod value) {
        this.backingStore.set("protectionTimePeriod", value);
    }
    /**
     * Sets the protectionUnitIds property value. The protectionUnitIds property
     * @param value Value to set for the protectionUnitIds property.
     */
    public void setProtectionUnitIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("protectionUnitIds", value);
    }
    /**
     * Sets the restorePointPreference property value. The restorePointPreference property
     * @param value Value to set for the restorePointPreference property.
     */
    public void setRestorePointPreference(@jakarta.annotation.Nullable final RestorePointPreference value) {
        this.backingStore.set("restorePointPreference", value);
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final EnumSet<RestorePointTags> value) {
        this.backingStore.set("tags", value);
    }
}
