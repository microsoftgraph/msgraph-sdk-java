package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppUpgradedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Display name of the teamsApp.
     */
    private String teamsAppDisplayName;
    /**
     * Unique identifier of the teamsApp.
     */
    private String teamsAppId;
    /**
     * Instantiates a new teamsAppUpgradedEventMessageDetail and sets the default values.
     */
    public TeamsAppUpgradedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.teamsAppUpgradedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppUpgradedEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppUpgradedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppUpgradedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsAppDisplayName", (n) -> { this.setTeamsAppDisplayName(n.getStringValue()); });
        deserializerMap.put("teamsAppId", (n) -> { this.setTeamsAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the teamsAppDisplayName property value. Display name of the teamsApp.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTeamsAppDisplayName() {
        return this.teamsAppDisplayName;
    }
    /**
     * Gets the teamsAppId property value. Unique identifier of the teamsApp.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTeamsAppId() {
        return this.teamsAppId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("teamsAppDisplayName", this.getTeamsAppDisplayName());
        writer.writeStringValue("teamsAppId", this.getTeamsAppId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
    /**
     * Sets the teamsAppDisplayName property value. Display name of the teamsApp.
     * @param value Value to set for the teamsAppDisplayName property.
     */
    public void setTeamsAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.teamsAppDisplayName = value;
    }
    /**
     * Sets the teamsAppId property value. Unique identifier of the teamsApp.
     * @param value Value to set for the teamsAppId property.
     */
    public void setTeamsAppId(@jakarta.annotation.Nullable final String value) {
        this.teamsAppId = value;
    }
}
