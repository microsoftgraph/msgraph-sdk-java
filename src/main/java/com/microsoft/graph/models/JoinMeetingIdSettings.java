package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class JoinMeetingIdSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether a passcode is required to join a meeting when using joinMeetingId. Optional.
     */
    private Boolean isPasscodeRequired;
    /**
     * The meeting ID to be used to join a meeting. Optional. Read-only.
     */
    private String joinMeetingId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The passcode to join a meeting.  Optional. Read-only.
     */
    private String passcode;
    /**
     * Instantiates a new joinMeetingIdSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public JoinMeetingIdSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a joinMeetingIdSettings
     */
    @jakarta.annotation.Nonnull
    public static JoinMeetingIdSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinMeetingIdSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isPasscodeRequired", (n) -> { this.setIsPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("joinMeetingId", (n) -> { this.setJoinMeetingId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPasscodeRequired property value. Indicates whether a passcode is required to join a meeting when using joinMeetingId. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPasscodeRequired() {
        return this.isPasscodeRequired;
    }
    /**
     * Gets the joinMeetingId property value. The meeting ID to be used to join a meeting. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJoinMeetingId() {
        return this.joinMeetingId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the passcode property value. The passcode to join a meeting.  Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPasscode() {
        return this.passcode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isPasscodeRequired", this.getIsPasscodeRequired());
        writer.writeStringValue("joinMeetingId", this.getJoinMeetingId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("passcode", this.getPasscode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isPasscodeRequired property value. Indicates whether a passcode is required to join a meeting when using joinMeetingId. Optional.
     * @param value Value to set for the isPasscodeRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsPasscodeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isPasscodeRequired = value;
    }
    /**
     * Sets the joinMeetingId property value. The meeting ID to be used to join a meeting. Optional. Read-only.
     * @param value Value to set for the joinMeetingId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJoinMeetingId(@jakarta.annotation.Nullable final String value) {
        this.joinMeetingId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the passcode property value. The passcode to join a meeting.  Optional. Read-only.
     * @param value Value to set for the passcode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPasscode(@jakarta.annotation.Nullable final String value) {
        this.passcode = value;
    }
}
