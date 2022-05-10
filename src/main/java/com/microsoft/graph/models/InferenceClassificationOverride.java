package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InferenceClassificationOverride extends Entity implements Parsable {
    /** Specifies how incoming messages from a specific sender should always be classified as. Possible values are: focused, other. */
    private InferenceClassificationType _classifyAs;
    /** The email address information of the sender for whom the override is created. */
    private EmailAddress _senderEmailAddress;
    /**
     * Instantiates a new inferenceClassificationOverride and sets the default values.
     * @return a void
     */
    public InferenceClassificationOverride() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inferenceClassificationOverride
     */
    @javax.annotation.Nonnull
    public static InferenceClassificationOverride createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InferenceClassificationOverride();
    }
    /**
     * Gets the classifyAs property value. Specifies how incoming messages from a specific sender should always be classified as. Possible values are: focused, other.
     * @return a inferenceClassificationType
     */
    @javax.annotation.Nullable
    public InferenceClassificationType getClassifyAs() {
        return this._classifyAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InferenceClassificationOverride currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classifyAs", (n) -> { currentObject.setClassifyAs(n.getEnumValue(InferenceClassificationType.class)); });
            this.put("senderEmailAddress", (n) -> { currentObject.setSenderEmailAddress(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the senderEmailAddress property value. The email address information of the sender for whom the override is created.
     * @return a emailAddress
     */
    @javax.annotation.Nullable
    public EmailAddress getSenderEmailAddress() {
        return this._senderEmailAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classifyAs", this.getClassifyAs());
        writer.writeObjectValue("senderEmailAddress", this.getSenderEmailAddress());
    }
    /**
     * Sets the classifyAs property value. Specifies how incoming messages from a specific sender should always be classified as. Possible values are: focused, other.
     * @param value Value to set for the classifyAs property.
     * @return a void
     */
    public void setClassifyAs(@javax.annotation.Nullable final InferenceClassificationType value) {
        this._classifyAs = value;
    }
    /**
     * Sets the senderEmailAddress property value. The email address information of the sender for whom the override is created.
     * @param value Value to set for the senderEmailAddress property.
     * @return a void
     */
    public void setSenderEmailAddress(@javax.annotation.Nullable final EmailAddress value) {
        this._senderEmailAddress = value;
    }
}
