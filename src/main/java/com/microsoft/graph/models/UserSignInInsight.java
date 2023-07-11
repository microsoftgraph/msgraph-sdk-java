package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSignInInsight extends GovernanceInsight implements Parsable {
    /**
     * Indicates when the user last signed in.
     */
    private OffsetDateTime lastSignInDateTime;
    /**
     * Instantiates a new userSignInInsight and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserSignInInsight() {
        super();
        this.setOdataType("#microsoft.graph.userSignInInsight");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSignInInsight
     */
    @javax.annotation.Nonnull
    public static UserSignInInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSignInInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastSignInDateTime", (n) -> { this.setLastSignInDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSignInDateTime property value. Indicates when the user last signed in.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSignInDateTime() {
        return this.lastSignInDateTime;
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
        writer.writeOffsetDateTimeValue("lastSignInDateTime", this.getLastSignInDateTime());
    }
    /**
     * Sets the lastSignInDateTime property value. Indicates when the user last signed in.
     * @param value Value to set for the lastSignInDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSignInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSignInDateTime = value;
    }
}
