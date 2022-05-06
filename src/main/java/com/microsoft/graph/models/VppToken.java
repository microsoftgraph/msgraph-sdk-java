package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VppToken extends Entity implements Parsable {
    /** The apple Id associated with the given Apple Volume Purchase Program Token.  */
    private String _appleId;
    /** Whether or not apps for the VPP token will be automatically updated.  */
    private Boolean _automaticallyUpdateApps;
    /** Whether or not apps for the VPP token will be automatically updated.  */
    private String _countryOrRegion;
    /** The expiration date time of the Apple Volume Purchase Program Token.  */
    private OffsetDateTime _expirationDateTime;
    /** Last modification date time associated with the Apple Volume Purchase Program Token.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.  */
    private OffsetDateTime _lastSyncDateTime;
    /** Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.  */
    private VppTokenSyncStatus _lastSyncStatus;
    /** The organization associated with the Apple Volume Purchase Program Token  */
    private String _organizationName;
    /** Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM, duplicateLocationId.  */
    private VppTokenState _state;
    /** The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.  */
    private String _token;
    /** The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.  */
    private VppTokenAccountType _vppTokenAccountType;
    /**
     * Instantiates a new vppToken and sets the default values.
     * @return a void
     */
    public VppToken() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vppToken
     */
    @javax.annotation.Nonnull
    public static VppToken createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppToken();
    }
    /**
     * Gets the appleId property value. The apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleId() {
        return this._appleId;
    }
    /**
     * Gets the automaticallyUpdateApps property value. Whether or not apps for the VPP token will be automatically updated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutomaticallyUpdateApps() {
        return this._automaticallyUpdateApps;
    }
    /**
     * Gets the countryOrRegion property value. Whether or not apps for the VPP token will be automatically updated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegion() {
        return this._countryOrRegion;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date time of the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VppToken currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appleId", (n) -> { currentObject.setAppleId(n.getStringValue()); });
            this.put("automaticallyUpdateApps", (n) -> { currentObject.setAutomaticallyUpdateApps(n.getBooleanValue()); });
            this.put("countryOrRegion", (n) -> { currentObject.setCountryOrRegion(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncStatus", (n) -> { currentObject.setLastSyncStatus(n.getEnumValue(VppTokenSyncStatus.class)); });
            this.put("organizationName", (n) -> { currentObject.setOrganizationName(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(VppTokenState.class)); });
            this.put("token", (n) -> { currentObject.setToken(n.getStringValue()); });
            this.put("vppTokenAccountType", (n) -> { currentObject.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType.class)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification date time associated with the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the lastSyncStatus property value. Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
     * @return a vppTokenSyncStatus
     */
    @javax.annotation.Nullable
    public VppTokenSyncStatus getLastSyncStatus() {
        return this._lastSyncStatus;
    }
    /**
     * Gets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationName() {
        return this._organizationName;
    }
    /**
     * Gets the state property value. Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM, duplicateLocationId.
     * @return a vppTokenState
     */
    @javax.annotation.Nullable
    public VppTokenState getState() {
        return this._state;
    }
    /**
     * Gets the token property value. The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getToken() {
        return this._token;
    }
    /**
     * Gets the vppTokenAccountType property value. The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     * @return a vppTokenAccountType
     */
    @javax.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this._vppTokenAccountType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeBooleanValue("automaticallyUpdateApps", this.getAutomaticallyUpdateApps());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("lastSyncStatus", this.getLastSyncStatus());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("token", this.getToken());
        writer.writeEnumValue("vppTokenAccountType", this.getVppTokenAccountType());
    }
    /**
     * Sets the appleId property value. The apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the appleId property.
     * @return a void
     */
    public void setAppleId(@javax.annotation.Nullable final String value) {
        this._appleId = value;
    }
    /**
     * Sets the automaticallyUpdateApps property value. Whether or not apps for the VPP token will be automatically updated.
     * @param value Value to set for the automaticallyUpdateApps property.
     * @return a void
     */
    public void setAutomaticallyUpdateApps(@javax.annotation.Nullable final Boolean value) {
        this._automaticallyUpdateApps = value;
    }
    /**
     * Sets the countryOrRegion property value. Whether or not apps for the VPP token will be automatically updated.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this._countryOrRegion = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date time of the Apple Volume Purchase Program Token.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification date time associated with the Apple Volume Purchase Program Token.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the lastSyncStatus property value. Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
     * @param value Value to set for the lastSyncStatus property.
     * @return a void
     */
    public void setLastSyncStatus(@javax.annotation.Nullable final VppTokenSyncStatus value) {
        this._lastSyncStatus = value;
    }
    /**
     * Sets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the organizationName property.
     * @return a void
     */
    public void setOrganizationName(@javax.annotation.Nullable final String value) {
        this._organizationName = value;
    }
    /**
     * Sets the state property value. Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM, duplicateLocationId.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final VppTokenState value) {
        this._state = value;
    }
    /**
     * Sets the token property value. The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     * @param value Value to set for the token property.
     * @return a void
     */
    public void setToken(@javax.annotation.Nullable final String value) {
        this._token = value;
    }
    /**
     * Sets the vppTokenAccountType property value. The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     * @param value Value to set for the vppTokenAccountType property.
     * @return a void
     */
    public void setVppTokenAccountType(@javax.annotation.Nullable final VppTokenAccountType value) {
        this._vppTokenAccountType = value;
    }
}
