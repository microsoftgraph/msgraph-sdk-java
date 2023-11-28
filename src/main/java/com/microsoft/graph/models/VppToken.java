package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * You purchase multiple licenses for iOS apps through the Apple Volume Purchase Program for Business or Education. This involves setting up an Apple VPP account from the Apple website and uploading the Apple VPP Business or Education token to Intune. You can then synchronize your volume purchase information with Intune and track your volume-purchased app use. You can upload multiple Apple VPP Business or Education tokens.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VppToken extends Entity implements Parsable {
    /**
     * Instantiates a new VppToken and sets the default values.
     */
    public VppToken() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VppToken
     */
    @jakarta.annotation.Nonnull
    public static VppToken createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppToken();
    }
    /**
     * Gets the appleId property value. The apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppleId() {
        return this.backingStore.get("appleId");
    }
    /**
     * Gets the automaticallyUpdateApps property value. Whether or not apps for the VPP token will be automatically updated.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutomaticallyUpdateApps() {
        return this.backingStore.get("automaticallyUpdateApps");
    }
    /**
     * Gets the countryOrRegion property value. Whether or not apps for the VPP token will be automatically updated.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountryOrRegion() {
        return this.backingStore.get("countryOrRegion");
    }
    /**
     * Gets the expirationDateTime property value. The expiration date time of the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleId", (n) -> { this.setAppleId(n.getStringValue()); });
        deserializerMap.put("automaticallyUpdateApps", (n) -> { this.setAutomaticallyUpdateApps(n.getBooleanValue()); });
        deserializerMap.put("countryOrRegion", (n) -> { this.setCountryOrRegion(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncStatus", (n) -> { this.setLastSyncStatus(n.getEnumValue(VppTokenSyncStatus::forValue)); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(VppTokenState::forValue)); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        deserializerMap.put("vppTokenAccountType", (n) -> { this.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modification date time associated with the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastSyncDateTime property value. The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the lastSyncStatus property value. Possible sync statuses associated with an Apple Volume Purchase Program token.
     * @return a VppTokenSyncStatus
     */
    @jakarta.annotation.Nullable
    public VppTokenSyncStatus getLastSyncStatus() {
        return this.backingStore.get("lastSyncStatus");
    }
    /**
     * Gets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.backingStore.get("organizationName");
    }
    /**
     * Gets the state property value. Possible states associated with an Apple Volume Purchase Program token.
     * @return a VppTokenState
     */
    @jakarta.annotation.Nullable
    public VppTokenState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the token property value. The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.backingStore.get("token");
    }
    /**
     * Gets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @return a VppTokenAccountType
     */
    @jakarta.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this.backingStore.get("vppTokenAccountType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appleId", value);
    }
    /**
     * Sets the automaticallyUpdateApps property value. Whether or not apps for the VPP token will be automatically updated.
     * @param value Value to set for the automaticallyUpdateApps property.
     */
    public void setAutomaticallyUpdateApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("automaticallyUpdateApps", value);
    }
    /**
     * Sets the countryOrRegion property value. Whether or not apps for the VPP token will be automatically updated.
     * @param value Value to set for the countryOrRegion property.
     */
    public void setCountryOrRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryOrRegion", value);
    }
    /**
     * Sets the expirationDateTime property value. The expiration date time of the Apple Volume Purchase Program Token.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modification date time associated with the Apple Volume Purchase Program Token.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastSyncDateTime property value. The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the lastSyncStatus property value. Possible sync statuses associated with an Apple Volume Purchase Program token.
     * @param value Value to set for the lastSyncStatus property.
     */
    public void setLastSyncStatus(@jakarta.annotation.Nullable final VppTokenSyncStatus value) {
        this.backingStore.set("lastSyncStatus", value);
    }
    /**
     * Sets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationName", value);
    }
    /**
     * Sets the state property value. Possible states associated with an Apple Volume Purchase Program token.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final VppTokenState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the token property value. The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("token", value);
    }
    /**
     * Sets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @param value Value to set for the vppTokenAccountType property.
     */
    public void setVppTokenAccountType(@jakarta.annotation.Nullable final VppTokenAccountType value) {
        this.backingStore.set("vppTokenAccountType", value);
    }
}
