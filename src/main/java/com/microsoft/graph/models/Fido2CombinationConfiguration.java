package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Fido2CombinationConfiguration extends AuthenticationCombinationConfiguration implements Parsable {
    /**
     * A list of AAGUIDs allowed to be used as part of the specified authentication method combinations.
     */
    private java.util.List<String> allowedAAGUIDs;
    /**
     * Instantiates a new fido2CombinationConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Fido2CombinationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.fido2CombinationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fido2CombinationConfiguration
     */
    @javax.annotation.Nonnull
    public static Fido2CombinationConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2CombinationConfiguration();
    }
    /**
     * Gets the allowedAAGUIDs property value. A list of AAGUIDs allowed to be used as part of the specified authentication method combinations.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedAAGUIDs() {
        return this.allowedAAGUIDs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAAGUIDs", (n) -> { this.setAllowedAAGUIDs(n.getCollectionOfPrimitiveValues(String.class)); });
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
        writer.writeCollectionOfPrimitiveValues("allowedAAGUIDs", this.getAllowedAAGUIDs());
    }
    /**
     * Sets the allowedAAGUIDs property value. A list of AAGUIDs allowed to be used as part of the specified authentication method combinations.
     * @param value Value to set for the allowedAAGUIDs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedAAGUIDs(@javax.annotation.Nullable final java.util.List<String> value) {
        this.allowedAAGUIDs = value;
    }
}
