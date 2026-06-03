package com.microsoft.graph.security.alerts_v2.microsoftgraphsecuritymovealerts;

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
public class MoveAlertsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MoveAlertsPostRequestBody} and sets the default values.
     */
    public MoveAlertsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MoveAlertsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static MoveAlertsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoveAlertsPostRequestBody();
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
     * Gets the alertComment property value. The alertComment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlertComment() {
        return this.backingStore.get("alertComment");
    }
    /**
     * Gets the alertIds property value. The alertIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlertIds() {
        return this.backingStore.get("alertIds");
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
        deserializerMap.put("alertComment", (n) -> { this.setAlertComment(n.getStringValue()); });
        deserializerMap.put("alertIds", (n) -> { this.setAlertIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("incidentId", (n) -> { this.setIncidentId(n.getStringValue()); });
        deserializerMap.put("newCorrelationReasons", (n) -> { this.setNewCorrelationReasons(n.getEnumSetValue(CorrelationReason::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incidentId property value. The incidentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncidentId() {
        return this.backingStore.get("incidentId");
    }
    /**
     * Gets the newCorrelationReasons property value. The newCorrelationReasons property
     * @return a {@link EnumSet<CorrelationReason>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CorrelationReason> getNewCorrelationReasons() {
        return this.backingStore.get("newCorrelationReasons");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alertComment", this.getAlertComment());
        writer.writeCollectionOfPrimitiveValues("alertIds", this.getAlertIds());
        writer.writeStringValue("incidentId", this.getIncidentId());
        writer.writeEnumSetValue("newCorrelationReasons", this.getNewCorrelationReasons());
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
     * Sets the alertComment property value. The alertComment property
     * @param value Value to set for the alertComment property.
     */
    public void setAlertComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertComment", value);
    }
    /**
     * Sets the alertIds property value. The alertIds property
     * @param value Value to set for the alertIds property.
     */
    public void setAlertIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("alertIds", value);
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
     * Sets the incidentId property value. The incidentId property
     * @param value Value to set for the incidentId property.
     */
    public void setIncidentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentId", value);
    }
    /**
     * Sets the newCorrelationReasons property value. The newCorrelationReasons property
     * @param value Value to set for the newCorrelationReasons property.
     */
    public void setNewCorrelationReasons(@jakarta.annotation.Nullable final EnumSet<CorrelationReason> value) {
        this.backingStore.set("newCorrelationReasons", value);
    }
}
