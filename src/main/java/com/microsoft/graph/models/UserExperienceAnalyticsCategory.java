package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics category entity contains the scores and insights for the various metrics of a category.
 */
public class UserExperienceAnalyticsCategory extends Entity implements Parsable {
    /**
     * The insights for the category. Read-only.
     */
    private java.util.List<UserExperienceAnalyticsInsight> insights;
    /**
     * The metric values for the user experience analytics category. Read-only.
     */
    private java.util.List<UserExperienceAnalyticsMetric> metricValues;
    /**
     * Instantiates a new userExperienceAnalyticsCategory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("metricValues", (n) -> { this.setMetricValues(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetric::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. The insights for the category. Read-only.
     * @return a userExperienceAnalyticsInsight
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsight> getInsights() {
        return this.insights;
    }
    /**
     * Gets the metricValues property value. The metric values for the user experience analytics category. Read-only.
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetric> getMetricValues() {
        return this.metricValues;
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
        writer.writeCollectionOfObjectValues("insights", this.getInsights());
        writer.writeCollectionOfObjectValues("metricValues", this.getMetricValues());
    }
    /**
     * Sets the insights property value. The insights for the category. Read-only.
     * @param value Value to set for the insights property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInsights(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsight> value) {
        this.insights = value;
    }
    /**
     * Sets the metricValues property value. The metric values for the user experience analytics category. Read-only.
     * @param value Value to set for the metricValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetricValues(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetric> value) {
        this.metricValues = value;
    }
}
