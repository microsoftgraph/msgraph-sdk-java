package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryEstimateOperation extends CaseOperation implements Parsable {
    /** The estimated count of items for the search that matched the content query. */
    private Long indexedItemCount;
    /** The estimated size of items for the search that matched the content query. */
    private Long indexedItemsSize;
    /** The number of mailboxes that had search hits. */
    private Integer mailboxCount;
    /** eDiscovery search. */
    private EdiscoverySearch search;
    /** The number of mailboxes that had search hits. */
    private Integer siteCount;
    /** The estimated count of unindexed items for the collection. */
    private Long unindexedItemCount;
    /** The estimated size of unindexed items for the collection. */
    private Long unindexedItemsSize;
    /**
     * Instantiates a new EdiscoveryEstimateOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryEstimateOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryEstimateOperation
     */
    @javax.annotation.Nonnull
    public static EdiscoveryEstimateOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryEstimateOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("indexedItemCount", (n) -> { this.setIndexedItemCount(n.getLongValue()); });
        deserializerMap.put("indexedItemsSize", (n) -> { this.setIndexedItemsSize(n.getLongValue()); });
        deserializerMap.put("mailboxCount", (n) -> { this.setMailboxCount(n.getIntegerValue()); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        deserializerMap.put("siteCount", (n) -> { this.setSiteCount(n.getIntegerValue()); });
        deserializerMap.put("unindexedItemCount", (n) -> { this.setUnindexedItemCount(n.getLongValue()); });
        deserializerMap.put("unindexedItemsSize", (n) -> { this.setUnindexedItemsSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the indexedItemCount property value. The estimated count of items for the search that matched the content query.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIndexedItemCount() {
        return this.indexedItemCount;
    }
    /**
     * Gets the indexedItemsSize property value. The estimated size of items for the search that matched the content query.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIndexedItemsSize() {
        return this.indexedItemsSize;
    }
    /**
     * Gets the mailboxCount property value. The number of mailboxes that had search hits.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMailboxCount() {
        return this.mailboxCount;
    }
    /**
     * Gets the search property value. eDiscovery search.
     * @return a ediscoverySearch
     */
    @javax.annotation.Nullable
    public EdiscoverySearch getSearch() {
        return this.search;
    }
    /**
     * Gets the siteCount property value. The number of mailboxes that had search hits.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSiteCount() {
        return this.siteCount;
    }
    /**
     * Gets the unindexedItemCount property value. The estimated count of unindexed items for the collection.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnindexedItemCount() {
        return this.unindexedItemCount;
    }
    /**
     * Gets the unindexedItemsSize property value. The estimated size of unindexed items for the collection.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnindexedItemsSize() {
        return this.unindexedItemsSize;
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
        writer.writeLongValue("indexedItemCount", this.getIndexedItemCount());
        writer.writeLongValue("indexedItemsSize", this.getIndexedItemsSize());
        writer.writeIntegerValue("mailboxCount", this.getMailboxCount());
        writer.writeObjectValue("search", this.getSearch());
        writer.writeIntegerValue("siteCount", this.getSiteCount());
        writer.writeLongValue("unindexedItemCount", this.getUnindexedItemCount());
        writer.writeLongValue("unindexedItemsSize", this.getUnindexedItemsSize());
    }
    /**
     * Sets the indexedItemCount property value. The estimated count of items for the search that matched the content query.
     * @param value Value to set for the indexedItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndexedItemCount(@javax.annotation.Nullable final Long value) {
        this.indexedItemCount = value;
    }
    /**
     * Sets the indexedItemsSize property value. The estimated size of items for the search that matched the content query.
     * @param value Value to set for the indexedItemsSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndexedItemsSize(@javax.annotation.Nullable final Long value) {
        this.indexedItemsSize = value;
    }
    /**
     * Sets the mailboxCount property value. The number of mailboxes that had search hits.
     * @param value Value to set for the mailboxCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailboxCount(@javax.annotation.Nullable final Integer value) {
        this.mailboxCount = value;
    }
    /**
     * Sets the search property value. eDiscovery search.
     * @param value Value to set for the search property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearch(@javax.annotation.Nullable final EdiscoverySearch value) {
        this.search = value;
    }
    /**
     * Sets the siteCount property value. The number of mailboxes that had search hits.
     * @param value Value to set for the siteCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteCount(@javax.annotation.Nullable final Integer value) {
        this.siteCount = value;
    }
    /**
     * Sets the unindexedItemCount property value. The estimated count of unindexed items for the collection.
     * @param value Value to set for the unindexedItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnindexedItemCount(@javax.annotation.Nullable final Long value) {
        this.unindexedItemCount = value;
    }
    /**
     * Sets the unindexedItemsSize property value. The estimated size of unindexed items for the collection.
     * @param value Value to set for the unindexedItemsSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnindexedItemsSize(@javax.annotation.Nullable final Long value) {
        this.unindexedItemsSize = value;
    }
}
