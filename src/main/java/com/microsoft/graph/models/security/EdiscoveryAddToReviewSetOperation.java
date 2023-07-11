package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryAddToReviewSetOperation extends CaseOperation implements Parsable {
    /**
     * eDiscovery review set to which items matching source collection query gets added.
     */
    private EdiscoveryReviewSet reviewSet;
    /**
     * eDiscovery search that gets added to review set.
     */
    private EdiscoverySearch search;
    /**
     * Instantiates a new ediscoveryAddToReviewSetOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryAddToReviewSetOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryAddToReviewSetOperation
     */
    @javax.annotation.Nonnull
    public static EdiscoveryAddToReviewSetOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryAddToReviewSetOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reviewSet property value. eDiscovery review set to which items matching source collection query gets added.
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this.reviewSet;
    }
    /**
     * Gets the search property value. eDiscovery search that gets added to review set.
     * @return a ediscoverySearch
     */
    @javax.annotation.Nullable
    public EdiscoverySearch getSearch() {
        return this.search;
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
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("search", this.getSearch());
    }
    /**
     * Sets the reviewSet property value. eDiscovery review set to which items matching source collection query gets added.
     * @param value Value to set for the reviewSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSet(@javax.annotation.Nullable final EdiscoveryReviewSet value) {
        this.reviewSet = value;
    }
    /**
     * Sets the search property value. eDiscovery search that gets added to review set.
     * @param value Value to set for the search property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearch(@javax.annotation.Nullable final EdiscoverySearch value) {
        this.search = value;
    }
}
