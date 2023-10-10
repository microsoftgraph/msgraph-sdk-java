package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserActivity extends Entity implements Parsable {
    /**
     * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.
     */
    private String activationUrl;
    /**
     * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     */
    private String activitySourceHost;
    /**
     * Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     */
    private String appActivityId;
    /**
     * Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the users local device.
     */
    private String appDisplayName;
    /**
     * Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     */
    private Json contentInfo;
    /**
     * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     */
    private String contentUrl;
    /**
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Set by the server. DateTime in UTC when the object expired on the server.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Optional. URL used to launch the activity in a web-based app, if available.
     */
    private String fallbackUrl;
    /**
     * Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     */
    private java.util.List<ActivityHistoryItem> historyItems;
    /**
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     */
    private Status status;
    /**
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     */
    private String userTimezone;
    /**
     * The visualElements property
     */
    private VisualInfo visualElements;
    /**
     * Instantiates a new UserActivity and sets the default values.
     */
    public UserActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserActivity
     */
    @jakarta.annotation.Nonnull
    public static UserActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserActivity();
    }
    /**
     * Gets the activationUrl property value. Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivationUrl() {
        return this.activationUrl;
    }
    /**
     * Gets the activitySourceHost property value. Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivitySourceHost() {
        return this.activitySourceHost;
    }
    /**
     * Gets the appActivityId property value. Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppActivityId() {
        return this.appActivityId;
    }
    /**
     * Gets the appDisplayName property value. Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the users local device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the contentInfo property value. Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getContentInfo() {
        return this.contentInfo;
    }
    /**
     * Gets the contentUrl property value. Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }
    /**
     * Gets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. Set by the server. DateTime in UTC when the object expired on the server.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * Gets the fallbackUrl property value. Optional. URL used to launch the activity in a web-based app, if available.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFallbackUrl() {
        return this.fallbackUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationUrl", (n) -> { this.setActivationUrl(n.getStringValue()); });
        deserializerMap.put("activitySourceHost", (n) -> { this.setActivitySourceHost(n.getStringValue()); });
        deserializerMap.put("appActivityId", (n) -> { this.setAppActivityId(n.getStringValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("contentInfo", (n) -> { this.setContentInfo(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fallbackUrl", (n) -> { this.setFallbackUrl(n.getStringValue()); });
        deserializerMap.put("historyItems", (n) -> { this.setHistoryItems(n.getCollectionOfObjectValues(ActivityHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(Status.class)); });
        deserializerMap.put("userTimezone", (n) -> { this.setUserTimezone(n.getStringValue()); });
        deserializerMap.put("visualElements", (n) -> { this.setVisualElements(n.getObjectValue(VisualInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the historyItems property value. Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     * @return a java.util.List<ActivityHistoryItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivityHistoryItem> getHistoryItems() {
        return this.historyItems;
    }
    /**
     * Gets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @return a Status
     */
    @jakarta.annotation.Nullable
    public Status getStatus() {
        return this.status;
    }
    /**
     * Gets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserTimezone() {
        return this.userTimezone;
    }
    /**
     * Gets the visualElements property value. The visualElements property
     * @return a VisualInfo
     */
    @jakarta.annotation.Nullable
    public VisualInfo getVisualElements() {
        return this.visualElements;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activationUrl", this.getActivationUrl());
        writer.writeStringValue("activitySourceHost", this.getActivitySourceHost());
        writer.writeStringValue("appActivityId", this.getAppActivityId());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeObjectValue("contentInfo", this.getContentInfo());
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("fallbackUrl", this.getFallbackUrl());
        writer.writeCollectionOfObjectValues("historyItems", this.getHistoryItems());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userTimezone", this.getUserTimezone());
        writer.writeObjectValue("visualElements", this.getVisualElements());
    }
    /**
     * Sets the activationUrl property value. Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.
     * @param value Value to set for the activationUrl property.
     */
    public void setActivationUrl(@jakarta.annotation.Nullable final String value) {
        this.activationUrl = value;
    }
    /**
     * Sets the activitySourceHost property value. Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     * @param value Value to set for the activitySourceHost property.
     */
    public void setActivitySourceHost(@jakarta.annotation.Nullable final String value) {
        this.activitySourceHost = value;
    }
    /**
     * Sets the appActivityId property value. Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     * @param value Value to set for the appActivityId property.
     */
    public void setAppActivityId(@jakarta.annotation.Nullable final String value) {
        this.appActivityId = value;
    }
    /**
     * Sets the appDisplayName property value. Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the users local device.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the contentInfo property value. Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     * @param value Value to set for the contentInfo property.
     */
    public void setContentInfo(@jakarta.annotation.Nullable final Json value) {
        this.contentInfo = value;
    }
    /**
     * Sets the contentUrl property value. Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.contentUrl = value;
    }
    /**
     * Sets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. Set by the server. DateTime in UTC when the object expired on the server.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the fallbackUrl property value. Optional. URL used to launch the activity in a web-based app, if available.
     * @param value Value to set for the fallbackUrl property.
     */
    public void setFallbackUrl(@jakarta.annotation.Nullable final String value) {
        this.fallbackUrl = value;
    }
    /**
     * Sets the historyItems property value. Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     * @param value Value to set for the historyItems property.
     */
    public void setHistoryItems(@jakarta.annotation.Nullable final java.util.List<ActivityHistoryItem> value) {
        this.historyItems = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Status value) {
        this.status = value;
    }
    /**
     * Sets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     * @param value Value to set for the userTimezone property.
     */
    public void setUserTimezone(@jakarta.annotation.Nullable final String value) {
        this.userTimezone = value;
    }
    /**
     * Sets the visualElements property value. The visualElements property
     * @param value Value to set for the visualElements property.
     */
    public void setVisualElements(@jakarta.annotation.Nullable final VisualInfo value) {
        this.visualElements = value;
    }
}
