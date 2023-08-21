package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LearningProvider extends Entity implements Parsable {
    /**
     * The display name that appears in Viva Learning. Required.
     */
    private String displayName;
    /**
     * Indicates whether a provider can ingest learning course activity records. The default value is false. Set to true to make learningCourseActivities available for this provider.
     */
    private Boolean isCourseActivitySyncEnabled;
    /**
     * Learning catalog items for the provider.
     */
    private java.util.List<LearningContent> learningContents;
    /**
     * The learningCourseActivities property
     */
    private java.util.List<LearningCourseActivity> learningCourseActivities;
    /**
     * Authentication URL to access the courses for the provider. Optional.
     */
    private String loginWebUrl;
    /**
     * The long logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    private String longLogoWebUrlForDarkTheme;
    /**
     * The long logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    private String longLogoWebUrlForLightTheme;
    /**
     * The square logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    private String squareLogoWebUrlForDarkTheme;
    /**
     * The square logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    private String squareLogoWebUrlForLightTheme;
    /**
     * Instantiates a new learningProvider and sets the default values.
     */
    public LearningProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a learningProvider
     */
    @jakarta.annotation.Nonnull
    public static LearningProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningProvider();
    }
    /**
     * Gets the displayName property value. The display name that appears in Viva Learning. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isCourseActivitySyncEnabled", (n) -> { this.setIsCourseActivitySyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("learningContents", (n) -> { this.setLearningContents(n.getCollectionOfObjectValues(LearningContent::createFromDiscriminatorValue)); });
        deserializerMap.put("learningCourseActivities", (n) -> { this.setLearningCourseActivities(n.getCollectionOfObjectValues(LearningCourseActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("loginWebUrl", (n) -> { this.setLoginWebUrl(n.getStringValue()); });
        deserializerMap.put("longLogoWebUrlForDarkTheme", (n) -> { this.setLongLogoWebUrlForDarkTheme(n.getStringValue()); });
        deserializerMap.put("longLogoWebUrlForLightTheme", (n) -> { this.setLongLogoWebUrlForLightTheme(n.getStringValue()); });
        deserializerMap.put("squareLogoWebUrlForDarkTheme", (n) -> { this.setSquareLogoWebUrlForDarkTheme(n.getStringValue()); });
        deserializerMap.put("squareLogoWebUrlForLightTheme", (n) -> { this.setSquareLogoWebUrlForLightTheme(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCourseActivitySyncEnabled property value. Indicates whether a provider can ingest learning course activity records. The default value is false. Set to true to make learningCourseActivities available for this provider.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCourseActivitySyncEnabled() {
        return this.isCourseActivitySyncEnabled;
    }
    /**
     * Gets the learningContents property value. Learning catalog items for the provider.
     * @return a learningContent
     */
    @jakarta.annotation.Nullable
    public java.util.List<LearningContent> getLearningContents() {
        return this.learningContents;
    }
    /**
     * Gets the learningCourseActivities property value. The learningCourseActivities property
     * @return a learningCourseActivity
     */
    @jakarta.annotation.Nullable
    public java.util.List<LearningCourseActivity> getLearningCourseActivities() {
        return this.learningCourseActivities;
    }
    /**
     * Gets the loginWebUrl property value. Authentication URL to access the courses for the provider. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLoginWebUrl() {
        return this.loginWebUrl;
    }
    /**
     * Gets the longLogoWebUrlForDarkTheme property value. The long logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLongLogoWebUrlForDarkTheme() {
        return this.longLogoWebUrlForDarkTheme;
    }
    /**
     * Gets the longLogoWebUrlForLightTheme property value. The long logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLongLogoWebUrlForLightTheme() {
        return this.longLogoWebUrlForLightTheme;
    }
    /**
     * Gets the squareLogoWebUrlForDarkTheme property value. The square logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSquareLogoWebUrlForDarkTheme() {
        return this.squareLogoWebUrlForDarkTheme;
    }
    /**
     * Gets the squareLogoWebUrlForLightTheme property value. The square logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSquareLogoWebUrlForLightTheme() {
        return this.squareLogoWebUrlForLightTheme;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isCourseActivitySyncEnabled", this.getIsCourseActivitySyncEnabled());
        writer.writeCollectionOfObjectValues("learningContents", this.getLearningContents());
        writer.writeCollectionOfObjectValues("learningCourseActivities", this.getLearningCourseActivities());
        writer.writeStringValue("loginWebUrl", this.getLoginWebUrl());
        writer.writeStringValue("longLogoWebUrlForDarkTheme", this.getLongLogoWebUrlForDarkTheme());
        writer.writeStringValue("longLogoWebUrlForLightTheme", this.getLongLogoWebUrlForLightTheme());
        writer.writeStringValue("squareLogoWebUrlForDarkTheme", this.getSquareLogoWebUrlForDarkTheme());
        writer.writeStringValue("squareLogoWebUrlForLightTheme", this.getSquareLogoWebUrlForLightTheme());
    }
    /**
     * Sets the displayName property value. The display name that appears in Viva Learning. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isCourseActivitySyncEnabled property value. Indicates whether a provider can ingest learning course activity records. The default value is false. Set to true to make learningCourseActivities available for this provider.
     * @param value Value to set for the isCourseActivitySyncEnabled property.
     */
    public void setIsCourseActivitySyncEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCourseActivitySyncEnabled = value;
    }
    /**
     * Sets the learningContents property value. Learning catalog items for the provider.
     * @param value Value to set for the learningContents property.
     */
    public void setLearningContents(@jakarta.annotation.Nullable final java.util.List<LearningContent> value) {
        this.learningContents = value;
    }
    /**
     * Sets the learningCourseActivities property value. The learningCourseActivities property
     * @param value Value to set for the learningCourseActivities property.
     */
    public void setLearningCourseActivities(@jakarta.annotation.Nullable final java.util.List<LearningCourseActivity> value) {
        this.learningCourseActivities = value;
    }
    /**
     * Sets the loginWebUrl property value. Authentication URL to access the courses for the provider. Optional.
     * @param value Value to set for the loginWebUrl property.
     */
    public void setLoginWebUrl(@jakarta.annotation.Nullable final String value) {
        this.loginWebUrl = value;
    }
    /**
     * Sets the longLogoWebUrlForDarkTheme property value. The long logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @param value Value to set for the longLogoWebUrlForDarkTheme property.
     */
    public void setLongLogoWebUrlForDarkTheme(@jakarta.annotation.Nullable final String value) {
        this.longLogoWebUrlForDarkTheme = value;
    }
    /**
     * Sets the longLogoWebUrlForLightTheme property value. The long logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @param value Value to set for the longLogoWebUrlForLightTheme property.
     */
    public void setLongLogoWebUrlForLightTheme(@jakarta.annotation.Nullable final String value) {
        this.longLogoWebUrlForLightTheme = value;
    }
    /**
     * Sets the squareLogoWebUrlForDarkTheme property value. The square logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @param value Value to set for the squareLogoWebUrlForDarkTheme property.
     */
    public void setSquareLogoWebUrlForDarkTheme(@jakarta.annotation.Nullable final String value) {
        this.squareLogoWebUrlForDarkTheme = value;
    }
    /**
     * Sets the squareLogoWebUrlForLightTheme property value. The square logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     * @param value Value to set for the squareLogoWebUrlForLightTheme property.
     */
    public void setSquareLogoWebUrlForLightTheme(@jakarta.annotation.Nullable final String value) {
        this.squareLogoWebUrlForLightTheme = value;
    }
}
