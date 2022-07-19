package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A termsAndConditionsAcceptanceStatus entity represents the acceptance status of a given Terms and Conditions (T&C) policy by a given user. Users must accept the most up-to-date version of the terms in order to retain access to the Company Portal. */
public class TermsAndConditionsAcceptanceStatus extends Entity implements Parsable {
    /** DateTime when the terms were last accepted by the user. */
    private OffsetDateTime _acceptedDateTime;
    /** Most recent version number of the T&C accepted by the user. */
    private Integer _acceptedVersion;
    /** Navigation link to the terms and conditions that are assigned. */
    private TermsAndConditions _termsAndConditions;
    /** Display name of the user whose acceptance the entity represents. */
    private String _userDisplayName;
    /** The userPrincipalName of the User that accepted the term. */
    private String _userPrincipalName;
    /**
     * Instantiates a new termsAndConditionsAcceptanceStatus and sets the default values.
     * @return a void
     */
    public TermsAndConditionsAcceptanceStatus() {
        super();
        this.setOdataType("#microsoft.graph.termsAndConditionsAcceptanceStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termsAndConditionsAcceptanceStatus
     */
    @javax.annotation.Nonnull
    public static TermsAndConditionsAcceptanceStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditionsAcceptanceStatus();
    }
    /**
     * Gets the acceptedDateTime property value. DateTime when the terms were last accepted by the user.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAcceptedDateTime() {
        return this._acceptedDateTime;
    }
    /**
     * Gets the acceptedVersion property value. Most recent version number of the T&C accepted by the user.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAcceptedVersion() {
        return this._acceptedVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TermsAndConditionsAcceptanceStatus currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("acceptedDateTime", (n) -> { currentObject.setAcceptedDateTime(n.getOffsetDateTimeValue()); });
            this.put("acceptedVersion", (n) -> { currentObject.setAcceptedVersion(n.getIntegerValue()); });
            this.put("termsAndConditions", (n) -> { currentObject.setTermsAndConditions(n.getObjectValue(TermsAndConditions::createFromDiscriminatorValue)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @return a termsAndConditions
     */
    @javax.annotation.Nullable
    public TermsAndConditions getTermsAndConditions() {
        return this._termsAndConditions;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user whose acceptance the entity represents.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName of the User that accepted the term.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("acceptedDateTime", this.getAcceptedDateTime());
        writer.writeIntegerValue("acceptedVersion", this.getAcceptedVersion());
        writer.writeObjectValue("termsAndConditions", this.getTermsAndConditions());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the acceptedDateTime property value. DateTime when the terms were last accepted by the user.
     * @param value Value to set for the acceptedDateTime property.
     * @return a void
     */
    public void setAcceptedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._acceptedDateTime = value;
    }
    /**
     * Sets the acceptedVersion property value. Most recent version number of the T&C accepted by the user.
     * @param value Value to set for the acceptedVersion property.
     * @return a void
     */
    public void setAcceptedVersion(@javax.annotation.Nullable final Integer value) {
        this._acceptedVersion = value;
    }
    /**
     * Sets the termsAndConditions property value. Navigation link to the terms and conditions that are assigned.
     * @param value Value to set for the termsAndConditions property.
     * @return a void
     */
    public void setTermsAndConditions(@javax.annotation.Nullable final TermsAndConditions value) {
        this._termsAndConditions = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user whose acceptance the entity represents.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName of the User that accepted the term.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
