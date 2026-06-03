package com.microsoft.graph.security.incidents.microsoftgraphsecuritymergeincidents;

import com.microsoft.graph.models.security.CorrelationReason;
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
public class MergeIncidentsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MergeIncidentsPostRequestBody} and sets the default values.
     */
    public MergeIncidentsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MergeIncidentsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static MergeIncidentsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MergeIncidentsPostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("incidentComment", (n) -> { this.setIncidentComment(n.getStringValue()); });
        deserializerMap.put("incidentIds", (n) -> { this.setIncidentIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mergeReasons", (n) -> { this.setMergeReasons(n.getEnumSetValue(CorrelationReason::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incidentComment property value. The incidentComment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncidentComment() {
        return this.backingStore.get("incidentComment");
    }
    /**
     * Gets the incidentIds property value. The incidentIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncidentIds() {
        return this.backingStore.get("incidentIds");
    }
    /**
     * Gets the mergeReasons property value. The mergeReasons property
     * @return a {@link EnumSet<CorrelationReason>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CorrelationReason> getMergeReasons() {
        return this.backingStore.get("mergeReasons");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("incidentComment", this.getIncidentComment());
        writer.writeCollectionOfPrimitiveValues("incidentIds", this.getIncidentIds());
        writer.writeEnumSetValue("mergeReasons", this.getMergeReasons());
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
     * Sets the incidentComment property value. The incidentComment property
     * @param value Value to set for the incidentComment property.
     */
    public void setIncidentComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentComment", value);
    }
    /**
     * Sets the incidentIds property value. The incidentIds property
     * @param value Value to set for the incidentIds property.
     */
    public void setIncidentIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("incidentIds", value);
    }
    /**
     * Sets the mergeReasons property value. The mergeReasons property
     * @param value Value to set for the mergeReasons property.
     */
    public void setMergeReasons(@jakarta.annotation.Nullable final EnumSet<CorrelationReason> value) {
        this.backingStore.set("mergeReasons", value);
    }
}
