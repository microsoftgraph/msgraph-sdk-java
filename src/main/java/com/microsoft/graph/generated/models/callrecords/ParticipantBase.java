package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.CommunicationsIdentitySet;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ParticipantBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ParticipantBase} and sets the default values.
     */
    public ParticipantBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ParticipantBase}
     */
    @jakarta.annotation.Nonnull
    public static ParticipantBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.callRecords.organizer": return new Organizer();
                case "#microsoft.graph.callRecords.participant": return new Participant();
            }
        }
        return new ParticipantBase();
    }
    /**
     * Gets the administrativeUnitInfos property value. List of administrativeUnitInfo objects for the call participant.
     * @return a {@link java.util.List<AdministrativeUnitInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdministrativeUnitInfo> getAdministrativeUnitInfos() {
        return this.backingStore.get("administrativeUnitInfos");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnitInfos", (n) -> { this.setAdministrativeUnitInfos(n.getCollectionOfObjectValues(AdministrativeUnitInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(CommunicationsIdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. The identity of the call participant.
     * @return a {@link CommunicationsIdentitySet}
     */
    @jakarta.annotation.Nullable
    public CommunicationsIdentitySet getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("administrativeUnitInfos", this.getAdministrativeUnitInfos());
        writer.writeObjectValue("identity", this.getIdentity());
    }
    /**
     * Sets the administrativeUnitInfos property value. List of administrativeUnitInfo objects for the call participant.
     * @param value Value to set for the administrativeUnitInfos property.
     */
    public void setAdministrativeUnitInfos(@jakarta.annotation.Nullable final java.util.List<AdministrativeUnitInfo> value) {
        this.backingStore.set("administrativeUnitInfos", value);
    }
    /**
     * Sets the identity property value. The identity of the call participant.
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final CommunicationsIdentitySet value) {
        this.backingStore.set("identity", value);
    }
}
