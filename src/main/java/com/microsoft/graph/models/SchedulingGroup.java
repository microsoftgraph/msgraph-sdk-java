package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SchedulingGroup extends ChangeTrackedEntity implements Parsable {
    /** The display name for the schedulingGroup. Required. */
    private String displayName;
    /** Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones. Required. */
    private Boolean isActive;
    /** The list of user IDs that are a member of the schedulingGroup. Required. */
    private java.util.List<String> userIds;
    /**
     * Instantiates a new SchedulingGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SchedulingGroup() {
        super();
        this.setOdataType("#microsoft.graph.schedulingGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SchedulingGroup
     */
    @javax.annotation.Nonnull
    public static SchedulingGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SchedulingGroup();
    }
    /**
     * Gets the displayName property value. The display name for the schedulingGroup. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("userIds", (n) -> { this.setUserIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones. Required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the userIds property value. The list of user IDs that are a member of the schedulingGroup. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUserIds() {
        return this.userIds;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("userIds", this.getUserIds());
    }
    /**
     * Sets the displayName property value. The display name for the schedulingGroup. Required.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones. Required.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the userIds property value. The list of user IDs that are a member of the schedulingGroup. Required.
     * @param value Value to set for the userIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.userIds = value;
    }
}
