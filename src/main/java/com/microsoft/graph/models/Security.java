package com.microsoft.graph.models;

import com.microsoft.graph.models.security.CasesRoot;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Security extends Entity implements Parsable {
    /** The alerts property */
    private java.util.List<Alert> _alerts;
    /** The attackSimulation property */
    private AttackSimulationRoot _attackSimulation;
    /** The cases property */
    private CasesRoot _cases;
    /** The secureScoreControlProfiles property */
    private java.util.List<SecureScoreControlProfile> _secureScoreControlProfiles;
    /** The secureScores property */
    private java.util.List<SecureScore> _secureScores;
    /**
     * Instantiates a new Security and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Security() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Security
     */
    @javax.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this._alerts;
    }
    /**
     * Gets the attackSimulation property value. The attackSimulation property
     * @return a attackSimulationRoot
     */
    @javax.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this._attackSimulation;
    }
    /**
     * Gets the cases property value. The cases property
     * @return a casesRoot
     */
    @javax.annotation.Nullable
    public CasesRoot getCases() {
        return this._cases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("attackSimulation", (n) -> { this.setAttackSimulation(n.getObjectValue(AttackSimulationRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cases", (n) -> { this.setCases(n.getObjectValue(CasesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScoreControlProfiles", (n) -> { this.setSecureScoreControlProfiles(n.getCollectionOfObjectValues(SecureScoreControlProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScores", (n) -> { this.setSecureScores(n.getCollectionOfObjectValues(SecureScore::createFromDiscriminatorValue)); });
        return deserializerMap;
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeObjectValue("attackSimulation", this.getAttackSimulation());
        writer.writeObjectValue("cases", this.getCases());
        writer.writeCollectionOfObjectValues("secureScoreControlProfiles", this.getSecureScoreControlProfiles());
        writer.writeCollectionOfObjectValues("secureScores", this.getSecureScores());
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this._alerts = value;
    }
    /**
     * Sets the attackSimulation property value. The attackSimulation property
     * @param value Value to set for the attackSimulation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimulation(@javax.annotation.Nullable final AttackSimulationRoot value) {
        this._attackSimulation = value;
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCases(@javax.annotation.Nullable final CasesRoot value) {
        this._cases = value;
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureScoreControlProfiles(@javax.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this._secureScoreControlProfiles = value;
    }
    /**
     * Sets the secureScores property value. The secureScores property
     * @param value Value to set for the secureScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureScores(@javax.annotation.Nullable final java.util.List<SecureScore> value) {
        this._secureScores = value;
    }
}
