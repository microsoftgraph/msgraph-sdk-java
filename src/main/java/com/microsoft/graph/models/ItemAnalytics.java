package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemAnalytics extends Entity implements Parsable {
    /**
     * The allTime property
     */
    private ItemActivityStat allTime;
    /**
     * The itemActivityStats property
     */
    private java.util.List<ItemActivityStat> itemActivityStats;
    /**
     * The lastSevenDays property
     */
    private ItemActivityStat lastSevenDays;
    /**
     * Instantiates a new itemAnalytics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemAnalytics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemAnalytics
     */
    @javax.annotation.Nonnull
    public static ItemAnalytics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemAnalytics();
    }
    /**
     * Gets the allTime property value. The allTime property
     * @return a itemActivityStat
     */
    @javax.annotation.Nullable
    public ItemActivityStat getAllTime() {
        return this.allTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allTime", (n) -> { this.setAllTime(n.getObjectValue(ItemActivityStat::createFromDiscriminatorValue)); });
        deserializerMap.put("itemActivityStats", (n) -> { this.setItemActivityStats(n.getCollectionOfObjectValues(ItemActivityStat::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSevenDays", (n) -> { this.setLastSevenDays(n.getObjectValue(ItemActivityStat::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemActivityStats property value. The itemActivityStats property
     * @return a itemActivityStat
     */
    @javax.annotation.Nullable
    public java.util.List<ItemActivityStat> getItemActivityStats() {
        return this.itemActivityStats;
    }
    /**
     * Gets the lastSevenDays property value. The lastSevenDays property
     * @return a itemActivityStat
     */
    @javax.annotation.Nullable
    public ItemActivityStat getLastSevenDays() {
        return this.lastSevenDays;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("allTime", this.getAllTime());
        writer.writeCollectionOfObjectValues("itemActivityStats", this.getItemActivityStats());
        writer.writeObjectValue("lastSevenDays", this.getLastSevenDays());
    }
    /**
     * Sets the allTime property value. The allTime property
     * @param value Value to set for the allTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllTime(@javax.annotation.Nullable final ItemActivityStat value) {
        this.allTime = value;
    }
    /**
     * Sets the itemActivityStats property value. The itemActivityStats property
     * @param value Value to set for the itemActivityStats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemActivityStats(@javax.annotation.Nullable final java.util.List<ItemActivityStat> value) {
        this.itemActivityStats = value;
    }
    /**
     * Sets the lastSevenDays property value. The lastSevenDays property
     * @param value Value to set for the lastSevenDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSevenDays(@javax.annotation.Nullable final ItemActivityStat value) {
        this.lastSevenDays = value;
    }
}
