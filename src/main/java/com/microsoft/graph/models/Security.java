package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the security singleton. */
public class Security extends Entity implements Parsable {
    /** Notifications for suspicious or potential security issues in a customer’s tenant. */
    private java.util.List<Alert> _alerts;
    /** The secureScoreControlProfiles property */
    private java.util.List<SecureScoreControlProfile> _secureScoreControlProfiles;
    /** The secureScores property */
    private java.util.List<SecureScore> _secureScores;
    /**
     * Instantiates a new security and sets the default values.
     * @return a void
     */
    public Security() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a security
     */
    @javax.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * Gets the alerts property value. Notifications for suspicious or potential security issues in a customer’s tenant.
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this._alerts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Security currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alerts", (n) -> { currentObject.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
            this.put("secureScoreControlProfiles", (n) -> { currentObject.setSecureScoreControlProfiles(n.getCollectionOfObjectValues(SecureScoreControlProfile::createFromDiscriminatorValue)); });
            this.put("secureScores", (n) -> { currentObject.setSecureScores(n.getCollectionOfObjectValues(SecureScore::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a secureScoreControlProfile
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this._secureScoreControlProfiles;
    }
    /**
     * Gets the secureScores property value. The secureScores property
     * @return a secureScore
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this._secureScores;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeCollectionOfObjectValues("secureScoreControlProfiles", this.getSecureScoreControlProfiles());
        writer.writeCollectionOfObjectValues("secureScores", this.getSecureScores());
    }
    /**
     * Sets the alerts property value. Notifications for suspicious or potential security issues in a customer’s tenant.
     * @param value Value to set for the alerts property.
     * @return a void
     */
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this._alerts = value;
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     * @return a void
     */
    public void setSecureScoreControlProfiles(@javax.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this._secureScoreControlProfiles = value;
    }
    /**
     * Sets the secureScores property value. The secureScores property
     * @param value Value to set for the secureScores property.
     * @return a void
     */
    public void setSecureScores(@javax.annotation.Nullable final java.util.List<SecureScore> value) {
        this._secureScores = value;
    }
}
