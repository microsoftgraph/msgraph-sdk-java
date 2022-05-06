package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppInstallation extends Entity implements Parsable {
    /** The app that is installed.  */
    private TeamsApp _teamsApp;
    /** The details of this version of the app.  */
    private TeamsAppDefinition _teamsAppDefinition;
    /**
     * Instantiates a new teamsAppInstallation and sets the default values.
     * @return a void
     */
    public TeamsAppInstallation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppInstallation
     */
    @javax.annotation.Nonnull
    public static TeamsAppInstallation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppInstallation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamsAppInstallation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("teamsApp", (n) -> { currentObject.setTeamsApp(n.getObjectValue(TeamsApp::createFromDiscriminatorValue)); });
            this.put("teamsAppDefinition", (n) -> { currentObject.setTeamsAppDefinition(n.getObjectValue(TeamsAppDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the teamsApp property value. The app that is installed.
     * @return a teamsApp
     */
    @javax.annotation.Nullable
    public TeamsApp getTeamsApp() {
        return this._teamsApp;
    }
    /**
     * Gets the teamsAppDefinition property value. The details of this version of the app.
     * @return a teamsAppDefinition
     */
    @javax.annotation.Nullable
    public TeamsAppDefinition getTeamsAppDefinition() {
        return this._teamsAppDefinition;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("teamsApp", this.getTeamsApp());
        writer.writeObjectValue("teamsAppDefinition", this.getTeamsAppDefinition());
    }
    /**
     * Sets the teamsApp property value. The app that is installed.
     * @param value Value to set for the teamsApp property.
     * @return a void
     */
    public void setTeamsApp(@javax.annotation.Nullable final TeamsApp value) {
        this._teamsApp = value;
    }
    /**
     * Sets the teamsAppDefinition property value. The details of this version of the app.
     * @param value Value to set for the teamsAppDefinition property.
     * @return a void
     */
    public void setTeamsAppDefinition(@javax.annotation.Nullable final TeamsAppDefinition value) {
        this._teamsAppDefinition = value;
    }
}
