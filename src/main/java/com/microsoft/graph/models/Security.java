package com.microsoft.graph.models;

import com.microsoft.graph.models.security.Alert;
import com.microsoft.graph.models.security.CasesRoot;
import com.microsoft.graph.models.security.Incident;
import com.microsoft.graph.models.security.ThreatIntelligence;
import com.microsoft.graph.models.security.TriggersRoot;
import com.microsoft.graph.models.security.TriggerTypesRoot;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Security extends Entity implements Parsable {
    /**
     * The alerts property
     */
    private java.util.List<Alert> alerts;
    /**
     * A collection of alerts in Microsoft 365 Defender.
     */
    private java.util.List<Alert> alertsV2;
    /**
     * The attackSimulation property
     */
    private AttackSimulationRoot attackSimulation;
    /**
     * The cases property
     */
    private CasesRoot cases;
    /**
     * A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     */
    private java.util.List<Incident> incidents;
    /**
     * The secureScoreControlProfiles property
     */
    private java.util.List<SecureScoreControlProfile> secureScoreControlProfiles;
    /**
     * The secureScores property
     */
    private java.util.List<SecureScore> secureScores;
    /**
     * The threatIntelligence property
     */
    private ThreatIntelligence threatIntelligence;
    /**
     * The triggers property
     */
    private TriggersRoot triggers;
    /**
     * The triggerTypes property
     */
    private TriggerTypesRoot triggerTypes;
    /**
     * Instantiates a new security and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * Gets the alerts property value. The alerts property
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlertsV2() {
        return this.alertsV2;
    }
    /**
     * Gets the attackSimulation property value. The attackSimulation property
     * @return a attackSimulationRoot
     */
    @javax.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this.attackSimulation;
    }
    /**
     * Gets the cases property value. The cases property
     * @return a casesRoot
     */
    @javax.annotation.Nullable
    public CasesRoot getCases() {
        return this.cases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("alerts_v2", (n) -> { this.setAlertsV2(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("attackSimulation", (n) -> { this.setAttackSimulation(n.getObjectValue(AttackSimulationRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cases", (n) -> { this.setCases(n.getObjectValue(CasesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("incidents", (n) -> { this.setIncidents(n.getCollectionOfObjectValues(Incident::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScoreControlProfiles", (n) -> { this.setSecureScoreControlProfiles(n.getCollectionOfObjectValues(SecureScoreControlProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScores", (n) -> { this.setSecureScores(n.getCollectionOfObjectValues(SecureScore::createFromDiscriminatorValue)); });
        deserializerMap.put("threatIntelligence", (n) -> { this.setThreatIntelligence(n.getObjectValue(ThreatIntelligence::createFromDiscriminatorValue)); });
        deserializerMap.put("triggers", (n) -> { this.setTriggers(n.getObjectValue(TriggersRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("triggerTypes", (n) -> { this.setTriggerTypes(n.getObjectValue(TriggerTypesRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @return a incident
     */
    @javax.annotation.Nullable
    public java.util.List<Incident> getIncidents() {
        return this.incidents;
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a secureScoreControlProfile
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this.secureScoreControlProfiles;
    }
    /**
     * Gets the secureScores property value. The secureScores property
     * @return a secureScore
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this.secureScores;
    }
    /**
     * Gets the threatIntelligence property value. The threatIntelligence property
     * @return a threatIntelligence
     */
    @javax.annotation.Nullable
    public ThreatIntelligence getThreatIntelligence() {
        return this.threatIntelligence;
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a triggersRoot
     */
    @javax.annotation.Nullable
    public TriggersRoot getTriggers() {
        return this.triggers;
    }
    /**
     * Gets the triggerTypes property value. The triggerTypes property
     * @return a triggerTypesRoot
     */
    @javax.annotation.Nullable
    public TriggerTypesRoot getTriggerTypes() {
        return this.triggerTypes;
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
        writer.writeCollectionOfObjectValues("alerts_v2", this.getAlertsV2());
        writer.writeObjectValue("attackSimulation", this.getAttackSimulation());
        writer.writeObjectValue("cases", this.getCases());
        writer.writeCollectionOfObjectValues("incidents", this.getIncidents());
        writer.writeCollectionOfObjectValues("secureScoreControlProfiles", this.getSecureScoreControlProfiles());
        writer.writeCollectionOfObjectValues("secureScores", this.getSecureScores());
        writer.writeObjectValue("threatIntelligence", this.getThreatIntelligence());
        writer.writeObjectValue("triggers", this.getTriggers());
        writer.writeObjectValue("triggerTypes", this.getTriggerTypes());
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this.alerts = value;
    }
    /**
     * Sets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @param value Value to set for the alerts_v2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertsV2(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this.alertsV2 = value;
    }
    /**
     * Sets the attackSimulation property value. The attackSimulation property
     * @param value Value to set for the attackSimulation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimulation(@javax.annotation.Nullable final AttackSimulationRoot value) {
        this.attackSimulation = value;
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCases(@javax.annotation.Nullable final CasesRoot value) {
        this.cases = value;
    }
    /**
     * Sets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @param value Value to set for the incidents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidents(@javax.annotation.Nullable final java.util.List<Incident> value) {
        this.incidents = value;
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureScoreControlProfiles(@javax.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this.secureScoreControlProfiles = value;
    }
    /**
     * Sets the secureScores property value. The secureScores property
     * @param value Value to set for the secureScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureScores(@javax.annotation.Nullable final java.util.List<SecureScore> value) {
        this.secureScores = value;
    }
    /**
     * Sets the threatIntelligence property value. The threatIntelligence property
     * @param value Value to set for the threatIntelligence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatIntelligence(@javax.annotation.Nullable final ThreatIntelligence value) {
        this.threatIntelligence = value;
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTriggers(@javax.annotation.Nullable final TriggersRoot value) {
        this.triggers = value;
    }
    /**
     * Sets the triggerTypes property value. The triggerTypes property
     * @param value Value to set for the triggerTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTriggerTypes(@javax.annotation.Nullable final TriggerTypesRoot value) {
        this.triggerTypes = value;
    }
}
