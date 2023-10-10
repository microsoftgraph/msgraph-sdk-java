package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomTrainingSetting extends TrainingSetting implements Parsable {
    /**
     * The assignedTo property
     */
    private java.util.List<TrainingAssignedTo> assignedTo;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The durationInMinutes property
     */
    private Integer durationInMinutes;
    /**
     * The url property
     */
    private String url;
    /**
     * Instantiates a new CustomTrainingSetting and sets the default values.
     */
    public CustomTrainingSetting() {
        super();
        this.setOdataType("#microsoft.graph.customTrainingSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTrainingSetting
     */
    @jakarta.annotation.Nonnull
    public static CustomTrainingSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTrainingSetting();
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a java.util.List<TrainingAssignedTo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrainingAssignedTo> getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the durationInMinutes property value. The durationInMinutes property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInMinutes() {
        return this.durationInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getCollectionOfEnumValues(TrainingAssignedTo.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("durationInMinutes", (n) -> { this.setDurationInMinutes(n.getIntegerValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the url property value. The url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("assignedTo", this.getAssignedTo());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("durationInMinutes", this.getDurationInMinutes());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final java.util.List<TrainingAssignedTo> value) {
        this.assignedTo = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the durationInMinutes property value. The durationInMinutes property
     * @param value Value to set for the durationInMinutes property.
     */
    public void setDurationInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.durationInMinutes = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
