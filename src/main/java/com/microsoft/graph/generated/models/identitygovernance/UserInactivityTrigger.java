package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserInactivityTrigger extends WorkflowExecutionTrigger implements Parsable {
    /**
     * Instantiates a new {@link UserInactivityTrigger} and sets the default values.
     */
    public UserInactivityTrigger() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.userInactivityTrigger");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserInactivityTrigger}
     */
    @jakarta.annotation.Nonnull
    public static UserInactivityTrigger createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserInactivityTrigger();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inactivityPeriodInDays", (n) -> { this.setInactivityPeriodInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactivityPeriodInDays property value. The number of days a user must be inactive before triggering workflow execution.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInactivityPeriodInDays() {
        return this.backingStore.get("inactivityPeriodInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("inactivityPeriodInDays", this.getInactivityPeriodInDays());
    }
    /**
     * Sets the inactivityPeriodInDays property value. The number of days a user must be inactive before triggering workflow execution.
     * @param value Value to set for the inactivityPeriodInDays property.
     */
    public void setInactivityPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inactivityPeriodInDays", value);
    }
}
