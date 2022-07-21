package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** telecomExpenseManagementPartner resources represent the metadata and status of a given TEM service. Once your organization has onboarded with a partner, the partner can be enabled or disabled to switch TEM functionality on or off. */
public class TelecomExpenseManagementPartner extends Entity implements Parsable {
    /** Whether the partner's AAD app has been authorized to access Intune. */
    private Boolean _appAuthorized;
    /** Display name of the TEM partner. */
    private String _displayName;
    /** Whether Intune's connection to the TEM service is currently enabled or disabled. */
    private Boolean _enabled;
    /** Timestamp of the last request sent to Intune by the TEM partner. */
    private OffsetDateTime _lastConnectionDateTime;
    /** URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service. */
    private String _url;
    /**
     * Instantiates a new telecomExpenseManagementPartner and sets the default values.
     * @return a void
     */
    public TelecomExpenseManagementPartner() {
        super();
        this.setOdataType("#microsoft.graph.telecomExpenseManagementPartner");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a telecomExpenseManagementPartner
     */
    @javax.annotation.Nonnull
    public static TelecomExpenseManagementPartner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TelecomExpenseManagementPartner();
    }
    /**
     * Gets the appAuthorized property value. Whether the partner's AAD app has been authorized to access Intune.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppAuthorized() {
        return this._appAuthorized;
    }
    /**
     * Gets the displayName property value. Display name of the TEM partner.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enabled property value. Whether Intune's connection to the TEM service is currently enabled or disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TelecomExpenseManagementPartner currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appAuthorized", (n) -> { currentObject.setAppAuthorized(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("lastConnectionDateTime", (n) -> { currentObject.setLastConnectionDateTime(n.getOffsetDateTimeValue()); });
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectionDateTime() {
        return this._lastConnectionDateTime;
    }
    /**
     * Gets the url property value. URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("appAuthorized", this.getAppAuthorized());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeOffsetDateTimeValue("lastConnectionDateTime", this.getLastConnectionDateTime());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the appAuthorized property value. Whether the partner's AAD app has been authorized to access Intune.
     * @param value Value to set for the appAuthorized property.
     * @return a void
     */
    public void setAppAuthorized(@javax.annotation.Nullable final Boolean value) {
        this._appAuthorized = value;
    }
    /**
     * Sets the displayName property value. Display name of the TEM partner.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enabled property value. Whether Intune's connection to the TEM service is currently enabled or disabled.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the lastConnectionDateTime property value. Timestamp of the last request sent to Intune by the TEM partner.
     * @param value Value to set for the lastConnectionDateTime property.
     * @return a void
     */
    public void setLastConnectionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConnectionDateTime = value;
    }
    /**
     * Sets the url property value. URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
}
