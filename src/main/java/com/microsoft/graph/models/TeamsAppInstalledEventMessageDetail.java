package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppInstalledEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /** Display name of the teamsApp. */
    private String _teamsAppDisplayName;
    /** Unique identifier of the teamsApp. */
    private String _teamsAppId;
    /**
     * Instantiates a new TeamsAppInstalledEventMessageDetail and sets the default values.
     * @return a void
     */
    public TeamsAppInstalledEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.teamsAppInstalledEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsAppInstalledEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static TeamsAppInstalledEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppInstalledEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamsAppInstalledEventMessageDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("teamsAppDisplayName", (n) -> { currentObject.setTeamsAppDisplayName(n.getStringValue()); });
            this.put("teamsAppId", (n) -> { currentObject.setTeamsAppId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this._initiator;
    }
    /**
     * Gets the teamsAppDisplayName property value. Display name of the teamsApp.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsAppDisplayName() {
        return this._teamsAppDisplayName;
    }
    /**
     * Gets the teamsAppId property value. Unique identifier of the teamsApp.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsAppId() {
        return this._teamsAppId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("teamsAppDisplayName", this.getTeamsAppDisplayName());
        writer.writeStringValue("teamsAppId", this.getTeamsAppId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
    /**
     * Sets the teamsAppDisplayName property value. Display name of the teamsApp.
     * @param value Value to set for the teamsAppDisplayName property.
     * @return a void
     */
    public void setTeamsAppDisplayName(@javax.annotation.Nullable final String value) {
        this._teamsAppDisplayName = value;
    }
    /**
     * Sets the teamsAppId property value. Unique identifier of the teamsApp.
     * @param value Value to set for the teamsAppId property.
     * @return a void
     */
    public void setTeamsAppId(@javax.annotation.Nullable final String value) {
        this._teamsAppId = value;
    }
}
