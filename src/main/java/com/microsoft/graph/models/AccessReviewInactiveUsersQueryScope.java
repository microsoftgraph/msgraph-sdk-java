package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInactiveUsersQueryScope extends AccessReviewQueryScope implements Parsable {
    /**
     * Instantiates a new AccessReviewInactiveUsersQueryScope and sets the default values.
     */
    public AccessReviewInactiveUsersQueryScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInactiveUsersQueryScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInactiveUsersQueryScope
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInactiveUsersQueryScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInactiveUsersQueryScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inactiveDuration", (n) -> { this.setInactiveDuration(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactiveDuration property value. Defines the duration of inactivity. Inactivity is based on the last sign in date of the user compared to the access review instance's start date. If this property is not specified, it's assigned the default value PT0S.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getInactiveDuration() {
        return this.backingStore.get("inactiveDuration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("inactiveDuration", this.getInactiveDuration());
    }
    /**
     * Sets the inactiveDuration property value. Defines the duration of inactivity. Inactivity is based on the last sign in date of the user compared to the access review instance's start date. If this property is not specified, it's assigned the default value PT0S.
     * @param value Value to set for the inactiveDuration property.
     */
    public void setInactiveDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("inactiveDuration", value);
    }
}
