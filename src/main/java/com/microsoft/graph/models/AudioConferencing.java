package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudioConferencing implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The conference id of the online meeting.
     */
    private String conferenceId;
    /**
     * A URL to the externally-accessible web page that contains dial-in information.
     */
    private String dialinUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The tollFreeNumber property
     */
    private String tollFreeNumber;
    /**
     * List of toll-free numbers that are displayed in the meeting invite.
     */
    private java.util.List<String> tollFreeNumbers;
    /**
     * The tollNumber property
     */
    private String tollNumber;
    /**
     * List of toll numbers that are displayed in the meeting invite.
     */
    private java.util.List<String> tollNumbers;
    /**
     * Instantiates a new audioConferencing and sets the default values.
     */
    public AudioConferencing() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a audioConferencing
     */
    @jakarta.annotation.Nonnull
    public static AudioConferencing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudioConferencing();
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
     * Gets the conferenceId property value. The conference id of the online meeting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConferenceId() {
        return this.conferenceId;
    }
    /**
     * Gets the dialinUrl property value. A URL to the externally-accessible web page that contains dial-in information.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDialinUrl() {
        return this.dialinUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("conferenceId", (n) -> { this.setConferenceId(n.getStringValue()); });
        deserializerMap.put("dialinUrl", (n) -> { this.setDialinUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tollFreeNumber", (n) -> { this.setTollFreeNumber(n.getStringValue()); });
        deserializerMap.put("tollFreeNumbers", (n) -> { this.setTollFreeNumbers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tollNumber", (n) -> { this.setTollNumber(n.getStringValue()); });
        deserializerMap.put("tollNumbers", (n) -> { this.setTollNumbers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
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
     * Gets the tollFreeNumber property value. The tollFreeNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTollFreeNumber() {
        return this.tollFreeNumber;
    }
    /**
     * Gets the tollFreeNumbers property value. List of toll-free numbers that are displayed in the meeting invite.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTollFreeNumbers() {
        return this.tollFreeNumbers;
    }
    /**
     * Gets the tollNumber property value. The tollNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTollNumber() {
        return this.tollNumber;
    }
    /**
     * Gets the tollNumbers property value. List of toll numbers that are displayed in the meeting invite.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTollNumbers() {
        return this.tollNumbers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conferenceId", this.getConferenceId());
        writer.writeStringValue("dialinUrl", this.getDialinUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tollFreeNumber", this.getTollFreeNumber());
        writer.writeCollectionOfPrimitiveValues("tollFreeNumbers", this.getTollFreeNumbers());
        writer.writeStringValue("tollNumber", this.getTollNumber());
        writer.writeCollectionOfPrimitiveValues("tollNumbers", this.getTollNumbers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the conferenceId property value. The conference id of the online meeting.
     * @param value Value to set for the conferenceId property.
     */
    public void setConferenceId(@jakarta.annotation.Nullable final String value) {
        this.conferenceId = value;
    }
    /**
     * Sets the dialinUrl property value. A URL to the externally-accessible web page that contains dial-in information.
     * @param value Value to set for the dialinUrl property.
     */
    public void setDialinUrl(@jakarta.annotation.Nullable final String value) {
        this.dialinUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tollFreeNumber property value. The tollFreeNumber property
     * @param value Value to set for the tollFreeNumber property.
     */
    public void setTollFreeNumber(@jakarta.annotation.Nullable final String value) {
        this.tollFreeNumber = value;
    }
    /**
     * Sets the tollFreeNumbers property value. List of toll-free numbers that are displayed in the meeting invite.
     * @param value Value to set for the tollFreeNumbers property.
     */
    public void setTollFreeNumbers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tollFreeNumbers = value;
    }
    /**
     * Sets the tollNumber property value. The tollNumber property
     * @param value Value to set for the tollNumber property.
     */
    public void setTollNumber(@jakarta.annotation.Nullable final String value) {
        this.tollNumber = value;
    }
    /**
     * Sets the tollNumbers property value. List of toll numbers that are displayed in the meeting invite.
     * @param value Value to set for the tollNumbers property.
     */
    public void setTollNumbers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tollNumbers = value;
    }
}
