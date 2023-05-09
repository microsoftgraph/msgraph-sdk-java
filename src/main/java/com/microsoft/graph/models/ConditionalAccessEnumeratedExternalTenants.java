package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessEnumeratedExternalTenants extends ConditionalAccessExternalTenants implements Parsable {
    /** A collection of tenant IDs that define the scope of a policy targeting conditional access for guests and external users. */
    private java.util.List<String> members;
    /**
     * Instantiates a new ConditionalAccessEnumeratedExternalTenants and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessEnumeratedExternalTenants() {
        super();
        this.setOdataType("#microsoft.graph.conditionalAccessEnumeratedExternalTenants");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessEnumeratedExternalTenants
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessEnumeratedExternalTenants createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessEnumeratedExternalTenants();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. A collection of tenant IDs that define the scope of a policy targeting conditional access for guests and external users.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMembers() {
        return this.members;
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
        writer.writeCollectionOfPrimitiveValues("members", this.getMembers());
    }
    /**
     * Sets the members property value. A collection of tenant IDs that define the scope of a policy targeting conditional access for guests and external users.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.members = value;
    }
}
