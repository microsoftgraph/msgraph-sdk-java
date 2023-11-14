package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommunicationsApplicationIdentity extends Identity implements Parsable {
    /**
     * First-party Microsoft application that presents this identity.
     */
    private String applicationType;
    /**
     * True if the participant shouldn't be shown in other participants' rosters.
     */
    private Boolean hidden;
    /**
     * Instantiates a new CommunicationsApplicationIdentity and sets the default values.
     */
    public CommunicationsApplicationIdentity() {
        super();
        this.setOdataType("#microsoft.graph.communicationsApplicationIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommunicationsApplicationIdentity
     */
    @jakarta.annotation.Nonnull
    public static CommunicationsApplicationIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsApplicationIdentity();
    }
    /**
     * Gets the applicationType property value. First-party Microsoft application that presents this identity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApplicationType() {
        return this.applicationType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationType", (n) -> { this.setApplicationType(n.getStringValue()); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hidden property value. True if the participant shouldn't be shown in other participants' rosters.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationType", this.getApplicationType());
        writer.writeBooleanValue("hidden", this.getHidden());
    }
    /**
     * Sets the applicationType property value. First-party Microsoft application that presents this identity.
     * @param value Value to set for the applicationType property.
     */
    public void setApplicationType(@jakarta.annotation.Nullable final String value) {
        this.applicationType = value;
    }
    /**
     * Sets the hidden property value. True if the participant shouldn't be shown in other participants' rosters.
     * @param value Value to set for the hidden property.
     */
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
}
