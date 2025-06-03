package com.microsoft.graph.groups.item.team.schedule.timecards.clockin;

import com.microsoft.graph.models.ItemBody;
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
public class ClockInPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ClockInPostRequestBody} and sets the default values.
     */
    public ClockInPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClockInPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ClockInPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClockInPostRequestBody();
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
        deserializerMap.put("isAtApprovedLocation", (n) -> { this.setIsAtApprovedLocation(n.getBooleanValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("onBehalfOfUserId", (n) -> { this.setOnBehalfOfUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAtApprovedLocation property value. The isAtApprovedLocation property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAtApprovedLocation() {
        return this.backingStore.get("isAtApprovedLocation");
    }
    /**
     * Gets the notes property value. The notes property
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the onBehalfOfUserId property value. The onBehalfOfUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnBehalfOfUserId() {
        return this.backingStore.get("onBehalfOfUserId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isAtApprovedLocation", this.getIsAtApprovedLocation());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("onBehalfOfUserId", this.getOnBehalfOfUserId());
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
     * Sets the isAtApprovedLocation property value. The isAtApprovedLocation property
     * @param value Value to set for the isAtApprovedLocation property.
     */
    public void setIsAtApprovedLocation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAtApprovedLocation", value);
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the onBehalfOfUserId property value. The onBehalfOfUserId property
     * @param value Value to set for the onBehalfOfUserId property.
     */
    public void setOnBehalfOfUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onBehalfOfUserId", value);
    }
}
