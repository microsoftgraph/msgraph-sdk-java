package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecuritypurgedata;

import com.microsoft.graph.models.security.PurgeAreas;
import com.microsoft.graph.models.security.PurgeType;
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
public class PurgeDataPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new PurgeDataPostRequestBody and sets the default values.
     */
    public PurgeDataPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PurgeDataPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PurgeDataPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurgeDataPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("purgeAreas", (n) -> { this.setPurgeAreas(n.getEnumSetValue(PurgeAreas.class)); });
        deserializerMap.put("purgeType", (n) -> { this.setPurgeType(n.getEnumValue(PurgeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the purgeAreas property value. The purgeAreas property
     * @return a EnumSet<PurgeAreas>
     */
    @jakarta.annotation.Nullable
    public EnumSet<PurgeAreas> getPurgeAreas() {
        return this.BackingStore.get("purgeAreas");
    }
    /**
     * Gets the purgeType property value. The purgeType property
     * @return a PurgeType
     */
    @jakarta.annotation.Nullable
    public PurgeType getPurgeType() {
        return this.BackingStore.get("purgeType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("purgeAreas", this.getPurgeAreas());
        writer.writeEnumValue("purgeType", this.getPurgeType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the purgeAreas property value. The purgeAreas property
     * @param value Value to set for the purgeAreas property.
     */
    public void setPurgeAreas(@jakarta.annotation.Nullable final EnumSet<PurgeAreas> value) {
        this.BackingStore.set("purgeAreas", value);
    }
    /**
     * Sets the purgeType property value. The purgeType property
     * @param value Value to set for the purgeType property.
     */
    public void setPurgeType(@jakarta.annotation.Nullable final PurgeType value) {
        this.BackingStore.set("purgeType", value);
    }
}
