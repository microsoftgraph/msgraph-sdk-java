package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryReviewSet extends DataSet implements Parsable {
    /** Represents queries within the review set. */
    private java.util.List<EdiscoveryReviewSetQuery> _queries;
    /**
     * Instantiates a new EdiscoveryReviewSet and sets the default values.
     * @return a void
     */
    public EdiscoveryReviewSet() {
        super();
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryReviewSet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("queries", (n) -> { currentObject.setQueries(n.getCollectionOfObjectValues(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the queries property value. Represents queries within the review set.
     * @return a ediscoveryReviewSetQuery
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewSetQuery> getQueries() {
        return this._queries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setQueries(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewSetQuery> value) {
        this._queries = value;
    }
}
