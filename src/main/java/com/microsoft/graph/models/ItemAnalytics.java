package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemAnalytics extends Entity implements Parsable {
    /**
     * Instantiates a new ItemAnalytics and sets the default values.
     */
    public ItemAnalytics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemAnalytics
     */
    @jakarta.annotation.Nonnull
    public static ItemAnalytics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemAnalytics();
    }
    /**
     * Gets the allTime property value. The allTime property
     * @return a ItemActivityStat
     */
    @jakarta.annotation.Nullable
    public ItemActivityStat getAllTime() {
        return this.backingStore.get("allTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allTime", (n) -> { this.setAllTime(n.getObjectValue(ItemActivityStat::createFromDiscriminatorValue)); });
        deserializerMap.put("itemActivityStats", (n) -> { this.setItemActivityStats(n.getCollectionOfObjectValues(ItemActivityStat::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSevenDays", (n) -> { this.setLastSevenDays(n.getObjectValue(ItemActivityStat::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemActivityStats property value. The itemActivityStats property
     * @return a java.util.List<ItemActivityStat>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemActivityStat> getItemActivityStats() {
        return this.backingStore.get("itemActivityStats");
    }
    /**
     * Gets the lastSevenDays property value. The lastSevenDays property
     * @return a ItemActivityStat
     */
    @jakarta.annotation.Nullable
    public ItemActivityStat getLastSevenDays() {
        return this.backingStore.get("lastSevenDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("allTime", this.getAllTime());
        writer.writeCollectionOfObjectValues("itemActivityStats", this.getItemActivityStats());
        writer.writeObjectValue("lastSevenDays", this.getLastSevenDays());
    }
    /**
     * Sets the allTime property value. The allTime property
     * @param value Value to set for the allTime property.
     */
    public void setAllTime(@jakarta.annotation.Nullable final ItemActivityStat value) {
        this.backingStore.set("allTime", value);
    }
    /**
     * Sets the itemActivityStats property value. The itemActivityStats property
     * @param value Value to set for the itemActivityStats property.
     */
    public void setItemActivityStats(@jakarta.annotation.Nullable final java.util.List<ItemActivityStat> value) {
        this.backingStore.set("itemActivityStats", value);
    }
    /**
     * Sets the lastSevenDays property value. The lastSevenDays property
     * @param value Value to set for the lastSevenDays property.
     */
    public void setLastSevenDays(@jakarta.annotation.Nullable final ItemActivityStat value) {
        this.backingStore.set("lastSevenDays", value);
    }
}
