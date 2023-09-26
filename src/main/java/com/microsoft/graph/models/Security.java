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
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * The subjectRightsRequests property
     */
    private java.util.List<SubjectRightsRequest> subjectRightsRequests;
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
     * Instantiates a new Security and sets the default values.
     */
    public Security() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Security
     */
    @jakarta.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a java.util.List<Alert>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @return a java.util.List<Alert>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlertsV2() {
        return this.alertsV2;
    }
    /**
     * Gets the attackSimulation property value. The attackSimulation property
     * @return a AttackSimulationRoot
     */
    @jakarta.annotation.Nullable
    public AttackSimulationRoot getAttackSimulation() {
        return this.attackSimulation;
    }
    /**
     * Gets the cases property value. The cases property
     * @return a CasesRoot
     */
    @jakarta.annotation.Nullable
    public CasesRoot getCases() {
        return this.cases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("alerts_v2", (n) -> { this.setAlertsV2(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("attackSimulation", (n) -> { this.setAttackSimulation(n.getObjectValue(AttackSimulationRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("cases", (n) -> { this.setCases(n.getObjectValue(CasesRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("incidents", (n) -> { this.setIncidents(n.getCollectionOfObjectValues(Incident::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScoreControlProfiles", (n) -> { this.setSecureScoreControlProfiles(n.getCollectionOfObjectValues(SecureScoreControlProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("secureScores", (n) -> { this.setSecureScores(n.getCollectionOfObjectValues(SecureScore::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectRightsRequests", (n) -> { this.setSubjectRightsRequests(n.getCollectionOfObjectValues(SubjectRightsRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("threatIntelligence", (n) -> { this.setThreatIntelligence(n.getObjectValue(ThreatIntelligence::createFromDiscriminatorValue)); });
        deserializerMap.put("triggers", (n) -> { this.setTriggers(n.getObjectValue(TriggersRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("triggerTypes", (n) -> { this.setTriggerTypes(n.getObjectValue(TriggerTypesRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @return a java.util.List<Incident>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Incident> getIncidents() {
        return this.incidents;
    }
    /**
     * Gets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @return a java.util.List<SecureScoreControlProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScoreControlProfile> getSecureScoreControlProfiles() {
        return this.secureScoreControlProfiles;
    }
    /**
     * Gets the secureScores property value. The secureScores property
     * @return a java.util.List<SecureScore>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScore> getSecureScores() {
        return this.secureScores;
    }
    /**
     * Gets the subjectRightsRequests property value. The subjectRightsRequests property
     * @return a java.util.List<SubjectRightsRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectRightsRequest> getSubjectRightsRequests() {
        return this.subjectRightsRequests;
    }
    /**
     * Gets the threatIntelligence property value. The threatIntelligence property
     * @return a ThreatIntelligence
     */
    @jakarta.annotation.Nullable
    public ThreatIntelligence getThreatIntelligence() {
        return this.threatIntelligence;
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a TriggersRoot
     */
    @jakarta.annotation.Nullable
    public TriggersRoot getTriggers() {
        return this.triggers;
    }
    /**
     * Gets the triggerTypes property value. The triggerTypes property
     * @return a TriggerTypesRoot
     */
    @jakarta.annotation.Nullable
    public TriggerTypesRoot getTriggerTypes() {
        return this.triggerTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeCollectionOfObjectValues("alerts_v2", this.getAlertsV2());
        writer.writeObjectValue("attackSimulation", this.getAttackSimulation());
        writer.writeObjectValue("cases", this.getCases());
        writer.writeCollectionOfObjectValues("incidents", this.getIncidents());
        writer.writeCollectionOfObjectValues("secureScoreControlProfiles", this.getSecureScoreControlProfiles());
        writer.writeCollectionOfObjectValues("secureScores", this.getSecureScores());
        writer.writeCollectionOfObjectValues("subjectRightsRequests", this.getSubjectRightsRequests());
        writer.writeObjectValue("threatIntelligence", this.getThreatIntelligence());
        writer.writeObjectValue("triggers", this.getTriggers());
        writer.writeObjectValue("triggerTypes", this.getTriggerTypes());
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.alerts = value;
    }
    /**
     * Sets the alerts_v2 property value. A collection of alerts in Microsoft 365 Defender.
     * @param value Value to set for the alerts_v2 property.
     */
    public void setAlertsV2(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.alertsV2 = value;
    }
    /**
     * Sets the attackSimulation property value. The attackSimulation property
     * @param value Value to set for the attackSimulation property.
     */
    public void setAttackSimulation(@jakarta.annotation.Nullable final AttackSimulationRoot value) {
        this.attackSimulation = value;
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     */
    public void setCases(@jakarta.annotation.Nullable final CasesRoot value) {
        this.cases = value;
    }
    /**
     * Sets the incidents property value. A collection of incidents in Microsoft 365 Defender, each of which is a set of correlated alerts and associated metadata that reflects the story of an attack.
     * @param value Value to set for the incidents property.
     */
    public void setIncidents(@jakarta.annotation.Nullable final java.util.List<Incident> value) {
        this.incidents = value;
    }
    /**
     * Sets the secureScoreControlProfiles property value. The secureScoreControlProfiles property
     * @param value Value to set for the secureScoreControlProfiles property.
     */
    public void setSecureScoreControlProfiles(@jakarta.annotation.Nullable final java.util.List<SecureScoreControlProfile> value) {
        this.secureScoreControlProfiles = value;
    }
    /**
     * Sets the secureScores property value. The secureScores property
     * @param value Value to set for the secureScores property.
     */
    public void setSecureScores(@jakarta.annotation.Nullable final java.util.List<SecureScore> value) {
        this.secureScores = value;
    }
    /**
     * Sets the subjectRightsRequests property value. The subjectRightsRequests property
     * @param value Value to set for the subjectRightsRequests property.
     */
    public void setSubjectRightsRequests(@jakarta.annotation.Nullable final java.util.List<SubjectRightsRequest> value) {
        this.subjectRightsRequests = value;
    }
    /**
     * Sets the threatIntelligence property value. The threatIntelligence property
     * @param value Value to set for the threatIntelligence property.
     */
    public void setThreatIntelligence(@jakarta.annotation.Nullable final ThreatIntelligence value) {
        this.threatIntelligence = value;
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     */
    public void setTriggers(@jakarta.annotation.Nullable final TriggersRoot value) {
        this.triggers = value;
    }
    /**
     * Sets the triggerTypes property value. The triggerTypes property
     * @param value Value to set for the triggerTypes property.
     */
    public void setTriggerTypes(@jakarta.annotation.Nullable final TriggerTypesRoot value) {
        this.triggerTypes = value;
    }
}
