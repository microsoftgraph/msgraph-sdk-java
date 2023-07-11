package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkUserIdentity extends Identity implements Parsable {
    /**
     * Type of user. Possible values are: aadUser, onPremiseAadUser, anonymousGuest, federatedUser, personalMicrosoftAccountUser, skypeUser, phoneUser, unknownFutureValue and emailUser.
     */
    private TeamworkUserIdentityType userIdentityType;
    /**
     * Instantiates a new teamworkUserIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.teamworkUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nonnull
    public static TeamworkUserIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkUserIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userIdentityType", (n) -> { this.setUserIdentityType(n.getEnumValue(TeamworkUserIdentityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the userIdentityType property value. Type of user. Possible values are: aadUser, onPremiseAadUser, anonymousGuest, federatedUser, personalMicrosoftAccountUser, skypeUser, phoneUser, unknownFutureValue and emailUser.
     * @return a teamworkUserIdentityType
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentityType getUserIdentityType() {
        return this.userIdentityType;
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
        writer.writeEnumValue("userIdentityType", this.getUserIdentityType());
    }
    /**
     * Sets the userIdentityType property value. Type of user. Possible values are: aadUser, onPremiseAadUser, anonymousGuest, federatedUser, personalMicrosoftAccountUser, skypeUser, phoneUser, unknownFutureValue and emailUser.
     * @param value Value to set for the userIdentityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserIdentityType(@javax.annotation.Nullable final TeamworkUserIdentityType value) {
        this.userIdentityType = value;
    }
}
