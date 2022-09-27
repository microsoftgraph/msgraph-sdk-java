package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInactiveUsersQueryScope extends AccessReviewQueryScope implements Parsable {
    /** Defines the duration of inactivity. Inactivity is based on the last sign in date of the user compared to the access review instance's start date. If this property is not specified, it's assigned the default value PT0S. */
    private Period _inactiveDuration;
    /**
     * Instantiates a new AccessReviewInactiveUsersQueryScope and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static AccessReviewInactiveUsersQueryScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInactiveUsersQueryScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewInactiveUsersQueryScope currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("inactiveDuration", (n) -> { currentObject.setInactiveDuration(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the inactiveDuration property value. Defines the duration of inactivity. Inactivity is based on the last sign in date of the user compared to the access review instance's start date. If this property is not specified, it's assigned the default value PT0S.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getInactiveDuration() {
        return this._inactiveDuration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodValue("inactiveDuration", this.getInactiveDuration());
    }
    /**
     * Sets the inactiveDuration property value. Defines the duration of inactivity. Inactivity is based on the last sign in date of the user compared to the access review instance's start date. If this property is not specified, it's assigned the default value PT0S.
     * @param value Value to set for the inactiveDuration property.
     * @return a void
     */
    public void setInactiveDuration(@javax.annotation.Nullable final Period value) {
        this._inactiveDuration = value;
    }
}
