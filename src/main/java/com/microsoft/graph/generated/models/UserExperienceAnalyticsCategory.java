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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsCategory extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsCategory} and sets the default values.
     */
    public UserExperienceAnalyticsCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsCategory}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("metricValues", (n) -> { this.setMetricValues(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetric::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. The insights for the category. Read-only.
     * @return a {@link java.util.List<UserExperienceAnalyticsInsight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsight> getInsights() {
        return this.backingStore.get("insights");
    }
    /**
     * Gets the metricValues property value. The metric values for the user experience analytics category. Read-only.
     * @return a {@link java.util.List<UserExperienceAnalyticsMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetric> getMetricValues() {
        return this.backingStore.get("metricValues");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("insights", this.getInsights());
        writer.writeCollectionOfObjectValues("metricValues", this.getMetricValues());
    }
    /**
     * Sets the insights property value. The insights for the category. Read-only.
     * @param value Value to set for the insights property.
     */
    public void setInsights(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsight> value) {
        this.backingStore.set("insights", value);
    }
    /**
     * Sets the metricValues property value. The metric values for the user experience analytics category. Read-only.
     * @param value Value to set for the metricValues property.
     */
    public void setMetricValues(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetric> value) {
        this.backingStore.set("metricValues", value);
    }
}
