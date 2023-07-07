package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserLastSignInRecommendationInsightSetting extends AccessReviewRecommendationInsightSetting implements Parsable {
    /**
     * The recommendationLookBackDuration property
     */
    private Period recommendationLookBackDuration;
    /**
     * The signInScope property
     */
    private UserSignInRecommendationScope signInScope;
    /**
     * Instantiates a new UserLastSignInRecommendationInsightSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserLastSignInRecommendationInsightSetting() {
        super();
        this.setOdataType("#microsoft.graph.userLastSignInRecommendationInsightSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserLastSignInRecommendationInsightSetting
     */
    @javax.annotation.Nonnull
    public static UserLastSignInRecommendationInsightSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserLastSignInRecommendationInsightSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recommendationLookBackDuration", (n) -> { this.setRecommendationLookBackDuration(n.getPeriodValue()); });
        deserializerMap.put("signInScope", (n) -> { this.setSignInScope(n.getEnumValue(UserSignInRecommendationScope.class)); });
        return deserializerMap;
    }
    /**
     * Gets the recommendationLookBackDuration property value. The recommendationLookBackDuration property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getRecommendationLookBackDuration() {
        return this.recommendationLookBackDuration;
    }
    /**
     * Gets the signInScope property value. The signInScope property
     * @return a userSignInRecommendationScope
     */
    @javax.annotation.Nullable
    public UserSignInRecommendationScope getSignInScope() {
        return this.signInScope;
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
        writer.writePeriodValue("recommendationLookBackDuration", this.getRecommendationLookBackDuration());
        writer.writeEnumValue("signInScope", this.getSignInScope());
    }
    /**
     * Sets the recommendationLookBackDuration property value. The recommendationLookBackDuration property
     * @param value Value to set for the recommendationLookBackDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendationLookBackDuration(@javax.annotation.Nullable final Period value) {
        this.recommendationLookBackDuration = value;
    }
    /**
     * Sets the signInScope property value. The signInScope property
     * @param value Value to set for the signInScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInScope(@javax.annotation.Nullable final UserSignInRecommendationScope value) {
        this.signInScope = value;
    }
}
