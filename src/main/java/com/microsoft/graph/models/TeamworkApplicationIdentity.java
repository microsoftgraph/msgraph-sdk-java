package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkApplicationIdentity extends Identity implements Parsable {
    /**
     * Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector, outgoingWebhook, and unknownFutureValue.
     */
    private TeamworkApplicationIdentityType applicationIdentityType;
    /**
     * Instantiates a new teamworkApplicationIdentity and sets the default values.
     */
    public TeamworkApplicationIdentity() {
        super();
        this.setOdataType("#microsoft.graph.teamworkApplicationIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkApplicationIdentity
     */
    @jakarta.annotation.Nonnull
    public static TeamworkApplicationIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkApplicationIdentity();
    }
    /**
     * Gets the applicationIdentityType property value. Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector, outgoingWebhook, and unknownFutureValue.
     * @return a teamworkApplicationIdentityType
     */
    @jakarta.annotation.Nullable
    public TeamworkApplicationIdentityType getApplicationIdentityType() {
        return this.applicationIdentityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationIdentityType", (n) -> { this.setApplicationIdentityType(n.getEnumValue(TeamworkApplicationIdentityType.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("applicationIdentityType", this.getApplicationIdentityType());
    }
    /**
     * Sets the applicationIdentityType property value. Type of application that is referenced. Possible values are: aadApplication, bot, tenantBot, office365Connector, outgoingWebhook, and unknownFutureValue.
     * @param value Value to set for the applicationIdentityType property.
     */
    public void setApplicationIdentityType(@jakarta.annotation.Nullable final TeamworkApplicationIdentityType value) {
        this.applicationIdentityType = value;
    }
}
