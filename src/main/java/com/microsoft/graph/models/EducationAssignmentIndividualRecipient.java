package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationAssignmentIndividualRecipient extends EducationAssignmentRecipient implements Parsable {
    /** A collection of ids of the recipients. */
    private java.util.List<String> _recipients;
    /**
     * Instantiates a new EducationAssignmentIndividualRecipient and sets the default values.
     * @return a void
     */
    public EducationAssignmentIndividualRecipient() {
        super();
        this.setOdataType("#microsoft.graph.educationAssignmentIndividualRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignmentIndividualRecipient
     */
    @javax.annotation.Nonnull
    public static EducationAssignmentIndividualRecipient createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentIndividualRecipient();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationAssignmentIndividualRecipient currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("recipients", (n) -> { currentObject.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the recipients property value. A collection of ids of the recipients.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this._recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
    }
    /**
     * Sets the recipients property value. A collection of ids of the recipients.
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final java.util.List<String> value) {
        this._recipients = value;
    }
}
