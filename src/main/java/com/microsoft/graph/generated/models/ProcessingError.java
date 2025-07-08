package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProcessingError extends ClassificationError implements Parsable {
    /**
     * Instantiates a new {@link ProcessingError} and sets the default values.
     */
    public ProcessingError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessingError}
     */
    @jakarta.annotation.Nonnull
    public static ProcessingError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessingError();
    }
    /**
     * Gets the errorType property value. The errorType property
     * @return a {@link ContentProcessingErrorType}
     */
    @jakarta.annotation.Nullable
    public ContentProcessingErrorType getErrorType() {
        return this.backingStore.get("errorType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorType", (n) -> { this.setErrorType(n.getEnumValue(ContentProcessingErrorType::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("errorType", this.getErrorType());
    }
    /**
     * Sets the errorType property value. The errorType property
     * @param value Value to set for the errorType property.
     */
    public void setErrorType(@jakarta.annotation.Nullable final ContentProcessingErrorType value) {
        this.backingStore.set("errorType", value);
    }
}
