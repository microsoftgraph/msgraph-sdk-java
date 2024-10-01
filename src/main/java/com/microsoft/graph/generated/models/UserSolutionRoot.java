package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSolutionRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserSolutionRoot} and sets the default values.
     */
    public UserSolutionRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserSolutionRoot}
     */
    @jakarta.annotation.Nonnull
    public static UserSolutionRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSolutionRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("workingTimeSchedule", (n) -> { this.setWorkingTimeSchedule(n.getObjectValue(WorkingTimeSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the workingTimeSchedule property value. The working time schedule entity associated with the solution.
     * @return a {@link WorkingTimeSchedule}
     */
    @jakarta.annotation.Nullable
    public WorkingTimeSchedule getWorkingTimeSchedule() {
        return this.backingStore.get("workingTimeSchedule");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("workingTimeSchedule", this.getWorkingTimeSchedule());
    }
    /**
     * Sets the workingTimeSchedule property value. The working time schedule entity associated with the solution.
     * @param value Value to set for the workingTimeSchedule property.
     */
    public void setWorkingTimeSchedule(@jakarta.annotation.Nullable final WorkingTimeSchedule value) {
        this.backingStore.set("workingTimeSchedule", value);
    }
}
