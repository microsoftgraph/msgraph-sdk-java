package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsLicensingDetails extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsLicensingDetails} and sets the default values.
     */
    public TeamsLicensingDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsLicensingDetails}
     */
    @jakarta.annotation.Nonnull
    public static TeamsLicensingDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsLicensingDetails();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hasTeamsLicense", (n) -> { this.setHasTeamsLicense(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasTeamsLicense property value. Indicates whether the user has a valid license to use Microsoft Teams.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasTeamsLicense() {
        return this.backingStore.get("hasTeamsLicense");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("hasTeamsLicense", this.getHasTeamsLicense());
    }
    /**
     * Sets the hasTeamsLicense property value. Indicates whether the user has a valid license to use Microsoft Teams.
     * @param value Value to set for the hasTeamsLicense property.
     */
    public void setHasTeamsLicense(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasTeamsLicense", value);
    }
}
