package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SignInActivity implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The last non-interactive sign-in date for a specific user. You can use this field to calculate the last time a client signed in to the directory on behalf of a user. Because some users may use clients to access tenant resources rather than signing into your tenant directly, you can use the non-interactive sign-in date to along with lastSignInDateTime to identify inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains non-interactive sign-ins going back to May 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD. */
    private OffsetDateTime lastNonInteractiveSignInDateTime;
    /** Request identifier of the last non-interactive sign-in performed by this user. */
    private String lastNonInteractiveSignInRequestId;
    /** The last interactive sign-in date and time for a specific user. You can use this field to calculate the last time a user signed in to the directory with an interactive authentication method. This field can be used to build reports, such as inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains interactive sign-ins going back to April 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD. */
    private OffsetDateTime lastSignInDateTime;
    /** Request identifier of the last interactive sign-in performed by this user. */
    private String lastSignInRequestId;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new signInActivity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SignInActivity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signInActivity
     */
    @javax.annotation.Nonnull
    public static SignInActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInActivity();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("lastNonInteractiveSignInDateTime", (n) -> { this.setLastNonInteractiveSignInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastNonInteractiveSignInRequestId", (n) -> { this.setLastNonInteractiveSignInRequestId(n.getStringValue()); });
        deserializerMap.put("lastSignInDateTime", (n) -> { this.setLastSignInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSignInRequestId", (n) -> { this.setLastSignInRequestId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastNonInteractiveSignInDateTime property value. The last non-interactive sign-in date for a specific user. You can use this field to calculate the last time a client signed in to the directory on behalf of a user. Because some users may use clients to access tenant resources rather than signing into your tenant directly, you can use the non-interactive sign-in date to along with lastSignInDateTime to identify inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains non-interactive sign-ins going back to May 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastNonInteractiveSignInDateTime() {
        return this.lastNonInteractiveSignInDateTime;
    }
    /**
     * Gets the lastNonInteractiveSignInRequestId property value. Request identifier of the last non-interactive sign-in performed by this user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastNonInteractiveSignInRequestId() {
        return this.lastNonInteractiveSignInRequestId;
    }
    /**
     * Gets the lastSignInDateTime property value. The last interactive sign-in date and time for a specific user. You can use this field to calculate the last time a user signed in to the directory with an interactive authentication method. This field can be used to build reports, such as inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains interactive sign-ins going back to April 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSignInDateTime() {
        return this.lastSignInDateTime;
    }
    /**
     * Gets the lastSignInRequestId property value. Request identifier of the last interactive sign-in performed by this user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastSignInRequestId() {
        return this.lastSignInRequestId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastNonInteractiveSignInDateTime", this.getLastNonInteractiveSignInDateTime());
        writer.writeStringValue("lastNonInteractiveSignInRequestId", this.getLastNonInteractiveSignInRequestId());
        writer.writeOffsetDateTimeValue("lastSignInDateTime", this.getLastSignInDateTime());
        writer.writeStringValue("lastSignInRequestId", this.getLastSignInRequestId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the lastNonInteractiveSignInDateTime property value. The last non-interactive sign-in date for a specific user. You can use this field to calculate the last time a client signed in to the directory on behalf of a user. Because some users may use clients to access tenant resources rather than signing into your tenant directly, you can use the non-interactive sign-in date to along with lastSignInDateTime to identify inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains non-interactive sign-ins going back to May 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD.
     * @param value Value to set for the lastNonInteractiveSignInDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastNonInteractiveSignInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastNonInteractiveSignInDateTime = value;
    }
    /**
     * Sets the lastNonInteractiveSignInRequestId property value. Request identifier of the last non-interactive sign-in performed by this user.
     * @param value Value to set for the lastNonInteractiveSignInRequestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastNonInteractiveSignInRequestId(@javax.annotation.Nullable final String value) {
        this.lastNonInteractiveSignInRequestId = value;
    }
    /**
     * Sets the lastSignInDateTime property value. The last interactive sign-in date and time for a specific user. You can use this field to calculate the last time a user signed in to the directory with an interactive authentication method. This field can be used to build reports, such as inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains interactive sign-ins going back to April 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD.
     * @param value Value to set for the lastSignInDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSignInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSignInDateTime = value;
    }
    /**
     * Sets the lastSignInRequestId property value. Request identifier of the last interactive sign-in performed by this user.
     * @param value Value to set for the lastSignInRequestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSignInRequestId(@javax.annotation.Nullable final String value) {
        this.lastSignInRequestId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
