package com.microsoft.graph.models.teamsadministration;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TelephoneNumberManagementRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TelephoneNumberManagementRoot} and sets the default values.
     */
    public TelephoneNumberManagementRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TelephoneNumberManagementRoot}
     */
    @jakarta.annotation.Nonnull
    public static TelephoneNumberManagementRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TelephoneNumberManagementRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("numberAssignments", (n) -> { this.setNumberAssignments(n.getCollectionOfObjectValues(NumberAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(TelephoneNumberLongRunningOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numberAssignments property value. Represents a collection of synchronous telephone number management operations.
     * @return a {@link java.util.List<NumberAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NumberAssignment> getNumberAssignments() {
        return this.backingStore.get("numberAssignments");
    }
    /**
     * Gets the operations property value. Represents a collection of asynchronous telephone number management operations.
     * @return a {@link java.util.List<TelephoneNumberLongRunningOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TelephoneNumberLongRunningOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("numberAssignments", this.getNumberAssignments());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
    }
    /**
     * Sets the numberAssignments property value. Represents a collection of synchronous telephone number management operations.
     * @param value Value to set for the numberAssignments property.
     */
    public void setNumberAssignments(@jakarta.annotation.Nullable final java.util.List<NumberAssignment> value) {
        this.backingStore.set("numberAssignments", value);
    }
    /**
     * Sets the operations property value. Represents a collection of asynchronous telephone number management operations.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<TelephoneNumberLongRunningOperation> value) {
        this.backingStore.set("operations", value);
    }
}
