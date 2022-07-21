package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InferenceClassification extends Entity implements Parsable {
    /** A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable. */
    private java.util.List<InferenceClassificationOverride> _overrides;
    /**
     * Instantiates a new inferenceClassification and sets the default values.
     * @return a void
     */
    public InferenceClassification() {
        super();
        this.setOdataType("#microsoft.graph.inferenceClassification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inferenceClassification
     */
    @javax.annotation.Nonnull
    public static InferenceClassification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InferenceClassification();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InferenceClassification currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("overrides", (n) -> { currentObject.setOverrides(n.getCollectionOfObjectValues(InferenceClassificationOverride::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the overrides property value. A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable.
     * @return a inferenceClassificationOverride
     */
    @javax.annotation.Nullable
    public java.util.List<InferenceClassificationOverride> getOverrides() {
        return this._overrides;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("overrides", this.getOverrides());
    }
    /**
     * Sets the overrides property value. A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable.
     * @param value Value to set for the overrides property.
     * @return a void
     */
    public void setOverrides(@javax.annotation.Nullable final java.util.List<InferenceClassificationOverride> value) {
        this._overrides = value;
    }
}
