package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the appCatalogs singleton. */
public class AppCatalogs extends Entity implements Parsable {
    /** The teamsApps property */
    private java.util.List<TeamsApp> _teamsApps;
    /**
     * Instantiates a new appCatalogs and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppCatalogs() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appCatalogs
     */
    @javax.annotation.Nonnull
    public static AppCatalogs createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppCatalogs();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppCatalogs currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("teamsApps", (n) -> { currentObject.setTeamsApps(n.getCollectionOfObjectValues(TeamsApp::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the teamsApps property value. The teamsApps property
     * @return a teamsApp
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsApp> getTeamsApps() {
        return this._teamsApps;
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
        writer.writeCollectionOfObjectValues("teamsApps", this.getTeamsApps());
    }
    /**
     * Sets the teamsApps property value. The teamsApps property
     * @param value Value to set for the teamsApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsApps(@javax.annotation.Nullable final java.util.List<TeamsApp> value) {
        this._teamsApps = value;
    }
}
