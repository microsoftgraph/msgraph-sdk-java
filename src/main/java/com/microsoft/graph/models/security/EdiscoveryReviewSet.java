package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryReviewSet extends DataSet implements Parsable {
    /**
     * Represents queries within the review set.
     */
    private java.util.List<EdiscoveryReviewSetQuery> queries;
    /**
     * Instantiates a new EdiscoveryReviewSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSet() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryReviewSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryReviewSet
     */
    @javax.annotation.Nonnull
    public static EdiscoveryReviewSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryReviewSet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("queries", (n) -> { this.setQueries(n.getCollectionOfObjectValues(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the queries property value. Represents queries within the review set.
     * @return a ediscoveryReviewSetQuery
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewSetQuery> getQueries() {
        return this.queries;
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
        writer.writeCollectionOfObjectValues("queries", this.getQueries());
    }
    /**
     * Sets the queries property value. Represents queries within the review set.
     * @param value Value to set for the queries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueries(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewSetQuery> value) {
        this.queries = value;
    }
}
