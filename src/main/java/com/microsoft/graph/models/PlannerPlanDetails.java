package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerPlanDetails extends Entity implements Parsable {
    /** The categoryDescriptions property */
    private PlannerCategoryDescriptions _categoryDescriptions;
    /** The sharedWith property */
    private PlannerUserIds _sharedWith;
    /**
     * Instantiates a new plannerPlanDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerPlanDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerPlanDetails
     */
    @javax.annotation.Nonnull
    public static PlannerPlanDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanDetails();
    }
    /**
     * Gets the categoryDescriptions property value. The categoryDescriptions property
     * @return a plannerCategoryDescriptions
     */
    @javax.annotation.Nullable
    public PlannerCategoryDescriptions getCategoryDescriptions() {
        return this._categoryDescriptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerPlanDetails currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("categoryDescriptions", (n) -> { currentObject.setCategoryDescriptions(n.getObjectValue(PlannerCategoryDescriptions::createFromDiscriminatorValue)); });
            this.put("sharedWith", (n) -> { currentObject.setSharedWith(n.getObjectValue(PlannerUserIds::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the sharedWith property value. The sharedWith property
     * @return a plannerUserIds
     */
    @javax.annotation.Nullable
    public PlannerUserIds getSharedWith() {
        return this._sharedWith;
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
        writer.writeObjectValue("categoryDescriptions", this.getCategoryDescriptions());
        writer.writeObjectValue("sharedWith", this.getSharedWith());
    }
    /**
     * Sets the categoryDescriptions property value. The categoryDescriptions property
     * @param value Value to set for the categoryDescriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryDescriptions(@javax.annotation.Nullable final PlannerCategoryDescriptions value) {
        this._categoryDescriptions = value;
    }
    /**
     * Sets the sharedWith property value. The sharedWith property
     * @param value Value to set for the sharedWith property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedWith(@javax.annotation.Nullable final PlannerUserIds value) {
        this._sharedWith = value;
    }
}
