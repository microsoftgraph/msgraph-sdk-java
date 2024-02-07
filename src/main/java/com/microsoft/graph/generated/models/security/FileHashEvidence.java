package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileHashEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new FileHashEvidence and sets the default values.
     */
    public FileHashEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.fileHashEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileHashEvidence
     */
    @jakarta.annotation.Nonnull
    public static FileHashEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileHashEvidence();
    }
    /**
     * Gets the algorithm property value. The algorithm property
     * @return a FileHashAlgorithm
     */
    @jakarta.annotation.Nullable
    public FileHashAlgorithm getAlgorithm() {
        return this.backingStore.get("algorithm");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("algorithm", (n) -> { this.setAlgorithm(n.getEnumValue(FileHashAlgorithm::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("algorithm", this.getAlgorithm());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the algorithm property value. The algorithm property
     * @param value Value to set for the algorithm property.
     */
    public void setAlgorithm(@jakarta.annotation.Nullable final FileHashAlgorithm value) {
        this.backingStore.set("algorithm", value);
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
