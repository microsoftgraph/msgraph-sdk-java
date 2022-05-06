package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserActivity extends Entity implements Parsable {
    /** Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.  */
    private String _activationUrl;
    /** Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.  */
    private String _activitySourceHost;
    /** Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.  */
    private String _appActivityId;
    /** Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the user’s local device.  */
    private String _appDisplayName;
    /** Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.  */
    private Json _contentInfo;
    /** Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).  */
    private String _contentUrl;
    /** Set by the server. DateTime in UTC when the object was created on the server.  */
    private OffsetDateTime _createdDateTime;
    /** Set by the server. DateTime in UTC when the object expired on the server.  */
    private OffsetDateTime _expirationDateTime;
    /** Optional. URL used to launch the activity in a web-based app, if available.  */
    private String _fallbackUrl;
    /** Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.  */
    private java.util.List<ActivityHistoryItem> _historyItems;
    /** Set by the server. DateTime in UTC when the object was modified on the server.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.  */
    private Status _status;
    /** Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.  */
    private String _userTimezone;
    /** The visualElements property  */
    private VisualInfo _visualElements;
    /**
     * Instantiates a new userActivity and sets the default values.
     * @return a void
     */
    public UserActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userActivity
     */
    @javax.annotation.Nonnull
    public static UserActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserActivity();
    }
    /**
     * Gets the activationUrl property value. Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivationUrl() {
        return this._activationUrl;
    }
    /**
     * Gets the activitySourceHost property value. Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivitySourceHost() {
        return this._activitySourceHost;
    }
    /**
     * Gets the appActivityId property value. Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppActivityId() {
        return this._appActivityId;
    }
    /**
     * Gets the appDisplayName property value. Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the user’s local device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the contentInfo property value. Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getContentInfo() {
        return this._contentInfo;
    }
    /**
     * Gets the contentUrl property value. Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentUrl() {
        return this._contentUrl;
    }
    /**
     * Gets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. Set by the server. DateTime in UTC when the object expired on the server.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * Gets the fallbackUrl property value. Optional. URL used to launch the activity in a web-based app, if available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFallbackUrl() {
        return this._fallbackUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserActivity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activationUrl", (n) -> { currentObject.setActivationUrl(n.getStringValue()); });
            this.put("activitySourceHost", (n) -> { currentObject.setActivitySourceHost(n.getStringValue()); });
            this.put("appActivityId", (n) -> { currentObject.setAppActivityId(n.getStringValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("contentInfo", (n) -> { currentObject.setContentInfo(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("contentUrl", (n) -> { currentObject.setContentUrl(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("fallbackUrl", (n) -> { currentObject.setFallbackUrl(n.getStringValue()); });
            this.put("historyItems", (n) -> { currentObject.setHistoryItems(n.getCollectionOfObjectValues(ActivityHistoryItem::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(Status.class)); });
            this.put("userTimezone", (n) -> { currentObject.setUserTimezone(n.getStringValue()); });
            this.put("visualElements", (n) -> { currentObject.setVisualElements(n.getObjectValue(VisualInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the historyItems property value. Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     * @return a activityHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<ActivityHistoryItem> getHistoryItems() {
        return this._historyItems;
    }
    /**
     * Gets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @return a status
     */
    @javax.annotation.Nullable
    public Status getStatus() {
        return this._status;
    }
    /**
     * Gets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserTimezone() {
        return this._userTimezone;
    }
    /**
     * Gets the visualElements property value. The visualElements property
     * @return a visualInfo
     */
    @javax.annotation.Nullable
    public VisualInfo getVisualElements() {
        return this._visualElements;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setActivationUrl(@javax.annotation.Nullable final String value) {
        this._activationUrl = value;
    }
    /**
     * Sets the activitySourceHost property value. Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     * @param value Value to set for the activitySourceHost property.
     * @return a void
     */
    public void setActivitySourceHost(@javax.annotation.Nullable final String value) {
        this._activitySourceHost = value;
    }
    /**
     * Sets the appActivityId property value. Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     * @param value Value to set for the appActivityId property.
     * @return a void
     */
    public void setAppActivityId(@javax.annotation.Nullable final String value) {
        this._appActivityId = value;
    }
    /**
     * Sets the appDisplayName property value. Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the user’s local device.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the contentInfo property value. Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     * @param value Value to set for the contentInfo property.
     * @return a void
     */
    public void setContentInfo(@javax.annotation.Nullable final Json value) {
        this._contentInfo = value;
    }
    /**
     * Sets the contentUrl property value. Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    public void setContentUrl(@javax.annotation.Nullable final String value) {
        this._contentUrl = value;
    }
    /**
     * Sets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. Set by the server. DateTime in UTC when the object expired on the server.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the fallbackUrl property value. Optional. URL used to launch the activity in a web-based app, if available.
     * @param value Value to set for the fallbackUrl property.
     * @return a void
     */
    public void setFallbackUrl(@javax.annotation.Nullable final String value) {
        this._fallbackUrl = value;
    }
    /**
     * Sets the historyItems property value. Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     * @param value Value to set for the historyItems property.
     * @return a void
     */
    public void setHistoryItems(@javax.annotation.Nullable final java.util.List<ActivityHistoryItem> value) {
        this._historyItems = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final Status value) {
        this._status = value;
    }
    /**
     * Sets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     * @param value Value to set for the userTimezone property.
     * @return a void
     */
    public void setUserTimezone(@javax.annotation.Nullable final String value) {
        this._userTimezone = value;
    }
    /**
     * Sets the visualElements property value. The visualElements property
     * @param value Value to set for the visualElements property.
     * @return a void
     */
    public void setVisualElements(@javax.annotation.Nullable final VisualInfo value) {
        this._visualElements = value;
    }
}
