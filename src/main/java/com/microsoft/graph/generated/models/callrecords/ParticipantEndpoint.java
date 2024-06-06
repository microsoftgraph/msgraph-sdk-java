package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ParticipantEndpoint extends Endpoint implements Parsable {
    /**
     * Instantiates a new {@link ParticipantEndpoint} and sets the default values.
     */
    public ParticipantEndpoint() {
        super();
        this.setOdataType("#microsoft.graph.callRecords.participantEndpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ParticipantEndpoint}
     */
    @jakarta.annotation.Nonnull
    public static ParticipantEndpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantEndpoint();
    }
    /**
     * Gets the associatedIdentity property value. Identity associated with the endpoint.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getAssociatedIdentity() {
        return this.backingStore.get("associatedIdentity");
    }
    /**
     * Gets the cpuCoresCount property value. CPU number of cores used by the media endpoint.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCpuCoresCount() {
        return this.backingStore.get("cpuCoresCount");
    }
    /**
     * Gets the cpuName property value. CPU name used by the media endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCpuName() {
        return this.backingStore.get("cpuName");
    }
    /**
     * Gets the cpuProcessorSpeedInMhz property value. CPU processor speed used by the media endpoint.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCpuProcessorSpeedInMhz() {
        return this.backingStore.get("cpuProcessorSpeedInMhz");
    }
    /**
     * Gets the feedback property value. The feedback provided by the user of this endpoint about the quality of the session.
     * @return a {@link UserFeedback}
     */
    @jakarta.annotation.Nullable
    public UserFeedback getFeedback() {
        return this.backingStore.get("feedback");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedIdentity", (n) -> { this.setAssociatedIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("cpuCoresCount", (n) -> { this.setCpuCoresCount(n.getIntegerValue()); });
        deserializerMap.put("cpuName", (n) -> { this.setCpuName(n.getStringValue()); });
        deserializerMap.put("cpuProcessorSpeedInMhz", (n) -> { this.setCpuProcessorSpeedInMhz(n.getIntegerValue()); });
        deserializerMap.put("feedback", (n) -> { this.setFeedback(n.getObjectValue(UserFeedback::createFromDiscriminatorValue)); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. Identity associated with the endpoint. The identity property is deprecated and will stop returning data on June 30, 2026. Going forward, use the associatedIdentity property.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Gets the name property value. Name of the device used by the media endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("associatedIdentity", this.getAssociatedIdentity());
        writer.writeIntegerValue("cpuCoresCount", this.getCpuCoresCount());
        writer.writeStringValue("cpuName", this.getCpuName());
        writer.writeIntegerValue("cpuProcessorSpeedInMhz", this.getCpuProcessorSpeedInMhz());
        writer.writeObjectValue("feedback", this.getFeedback());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the associatedIdentity property value. Identity associated with the endpoint.
     * @param value Value to set for the associatedIdentity property.
     */
    public void setAssociatedIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("associatedIdentity", value);
    }
    /**
     * Sets the cpuCoresCount property value. CPU number of cores used by the media endpoint.
     * @param value Value to set for the cpuCoresCount property.
     */
    public void setCpuCoresCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cpuCoresCount", value);
    }
    /**
     * Sets the cpuName property value. CPU name used by the media endpoint.
     * @param value Value to set for the cpuName property.
     */
    public void setCpuName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cpuName", value);
    }
    /**
     * Sets the cpuProcessorSpeedInMhz property value. CPU processor speed used by the media endpoint.
     * @param value Value to set for the cpuProcessorSpeedInMhz property.
     */
    public void setCpuProcessorSpeedInMhz(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cpuProcessorSpeedInMhz", value);
    }
    /**
     * Sets the feedback property value. The feedback provided by the user of this endpoint about the quality of the session.
     * @param value Value to set for the feedback property.
     */
    public void setFeedback(@jakarta.annotation.Nullable final UserFeedback value) {
        this.backingStore.set("feedback", value);
    }
    /**
     * Sets the identity property value. Identity associated with the endpoint. The identity property is deprecated and will stop returning data on June 30, 2026. Going forward, use the associatedIdentity property.
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("identity", value);
    }
    /**
     * Sets the name property value. Name of the device used by the media endpoint.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
}
