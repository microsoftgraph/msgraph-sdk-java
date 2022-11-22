package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkApplicationIdentity extends Identity implements Parsable {
    /** Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector, outgoingWebhook, and unknownFutureValue. */
    private TeamworkApplicationIdentityType _applicationIdentityType;
    /**
     * Instantiates a new TeamworkApplicationIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkApplicationIdentity() {
        super();
        this.setOdataType("#microsoft.graph.teamworkApplicationIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkApplicationIdentity
     */
    @javax.annotation.Nonnull
    public static TeamworkApplicationIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkApplicationIdentity();
    }
    /**
     * Gets the applicationIdentityType property value. Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector, outgoingWebhook, and unknownFutureValue.
     * @return a teamworkApplicationIdentityType
     */
    @javax.annotation.Nullable
    public TeamworkApplicationIdentityType getApplicationIdentityType() {
        return this._applicationIdentityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationIdentityType", (n) -> { this.setApplicationIdentityType(n.getEnumValue(TeamworkApplicationIdentityType.class)); });
        return deserializerMap;
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
        writer.writeEnumValue("applicationIdentityType", this.getApplicationIdentityType());
    }
    /**
     * Sets the applicationIdentityType property value. Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector, outgoingWebhook, and unknownFutureValue.
     * @param value Value to set for the applicationIdentityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationIdentityType(@javax.annotation.Nullable final TeamworkApplicationIdentityType value) {
        this._applicationIdentityType = value;
    }
}
