package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenTypeExtension extends Extension implements Parsable {
    /**
     * A unique text identifier for an open type data extension. Optional.
     */
    private String extensionName;
    /**
     * Instantiates a new OpenTypeExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OpenTypeExtension() {
        super();
        this.setOdataType("#microsoft.graph.openTypeExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenTypeExtension
     */
    @javax.annotation.Nonnull
    public static OpenTypeExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenTypeExtension();
    }
    /**
     * Gets the extensionName property value. A unique text identifier for an open type data extension. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionName() {
        return this.extensionName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("extensionName", (n) -> { this.setExtensionName(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("extensionName", this.getExtensionName());
    }
    /**
     * Sets the extensionName property value. A unique text identifier for an open type data extension. Optional.
     * @param value Value to set for the extensionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensionName(@javax.annotation.Nullable final String value) {
        this.extensionName = value;
    }
}
