package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics overview entity contains the overall score and the scores and insights of every metric of all categories.
 */
public class UserExperienceAnalyticsOverview extends Entity implements Parsable {
    /**
     * The user experience analytics insights. Read-only.
     */
    private java.util.List<UserExperienceAnalyticsInsight> insights;
    /**
     * Instantiates a new userExperienceAnalyticsOverview and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsOverview
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsOverview();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. The user experience analytics insights. Read-only.
     * @return a userExperienceAnalyticsInsight
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsight> getInsights() {
        return this.insights;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("insights", this.getInsights());
    }
    /**
     * Sets the insights property value. The user experience analytics insights. Read-only.
     * @param value Value to set for the insights property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInsights(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsight> value) {
        this.insights = value;
    }
}
