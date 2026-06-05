package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Original name: PrivilegedAccessGroupAssignmentScheduleInstanceCollectionResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupAssignmentScheduleInstanceCollecti_ac334b75 extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedAccessGroupAssignmentScheduleInstanceCollecti_ac334b75} and sets the default values.
     */
    public PrivilegedAccessGroupAssignmentScheduleInstanceCollecti_ac334b75() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleInstanceCollecti_ac334b75}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessGroupAssignmentScheduleInstanceCollecti_ac334b75 createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessGroupAssignmentScheduleInstanceCollecti_ac334b75();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(PrivilegedAccessGroupAssignmentScheduleInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<PrivilegedAccessGroupAssignmentScheduleInstance> value) {
        this.backingStore.set("value", value);
    }
}
