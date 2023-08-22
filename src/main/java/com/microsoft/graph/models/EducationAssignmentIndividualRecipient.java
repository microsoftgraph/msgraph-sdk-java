package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentIndividualRecipient extends EducationAssignmentRecipient implements Parsable {
    /**
     * A collection of IDs of the recipients.
     */
    private java.util.List<String> recipients;
    /**
     * Instantiates a new educationAssignmentIndividualRecipient and sets the default values.
     */
    public EducationAssignmentIndividualRecipient() {
        super();
        this.setOdataType("#microsoft.graph.educationAssignmentIndividualRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationAssignmentIndividualRecipient
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentIndividualRecipient createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentIndividualRecipient();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the recipients property value. A collection of IDs of the recipients.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this.recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
    }
    /**
     * Sets the recipients property value. A collection of IDs of the recipients.
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.recipients = value;
    }
}
