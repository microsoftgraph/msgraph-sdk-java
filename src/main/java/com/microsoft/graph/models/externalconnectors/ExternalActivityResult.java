package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.PublicError;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalActivityResult extends ExternalActivity implements Parsable {
    /**
     * Error information that explains the failure to process an external activity.
     */
    private PublicError error;
    /**
     * Instantiates a new externalActivityResult and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ExternalActivityResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalActivityResult
     */
    @jakarta.annotation.Nonnull
    public static ExternalActivityResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalActivityResult();
    }
    /**
     * Gets the error property value. Error information that explains the failure to process an external activity.
     * @return a publicError
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
    }
    /**
     * Sets the error property value. Error information that explains the failure to process an external activity.
     * @param value Value to set for the error property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.error = value;
    }
}
