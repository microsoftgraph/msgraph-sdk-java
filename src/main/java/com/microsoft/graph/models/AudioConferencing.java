package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AudioConferencing implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The conference id of the online meeting. */
    private String _conferenceId;
    /** A URL to the externally-accessible web page that contains dial-in information. */
    private String _dialinUrl;
    /** The OdataType property */
    private String _odataType;
    /** The tollFreeNumber property */
    private String _tollFreeNumber;
    /** List of toll-free numbers that are displayed in the meeting invite. */
    private java.util.List<String> _tollFreeNumbers;
    /** The tollNumber property */
    private String _tollNumber;
    /** List of toll numbers that are displayed in the meeting invite. */
    private java.util.List<String> _tollNumbers;
    /**
     * Instantiates a new audioConferencing and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AudioConferencing() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a audioConferencing
     */
    @javax.annotation.Nonnull
    public static AudioConferencing createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudioConferencing();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the conferenceId property value. The conference id of the online meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConferenceId() {
        return this._conferenceId;
    }
    /**
     * Gets the dialinUrl property value. A URL to the externally-accessible web page that contains dial-in information.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDialinUrl() {
        return this._dialinUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
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
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the tollFreeNumber property value. The tollFreeNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTollFreeNumber() {
        return this._tollFreeNumber;
    }
    /**
     * Gets the tollFreeNumbers property value. List of toll-free numbers that are displayed in the meeting invite.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTollFreeNumbers() {
        return this._tollFreeNumbers;
    }
    /**
     * Gets the tollNumber property value. The tollNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTollNumber() {
        return this._tollNumber;
    }
    /**
     * Gets the tollNumbers property value. List of toll numbers that are displayed in the meeting invite.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTollNumbers() {
        return this._tollNumbers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the conferenceId property value. The conference id of the online meeting.
     * @param value Value to set for the conferenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConferenceId(@javax.annotation.Nullable final String value) {
        this._conferenceId = value;
    }
    /**
     * Sets the dialinUrl property value. A URL to the externally-accessible web page that contains dial-in information.
     * @param value Value to set for the dialinUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDialinUrl(@javax.annotation.Nullable final String value) {
        this._dialinUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tollFreeNumber property value. The tollFreeNumber property
     * @param value Value to set for the tollFreeNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTollFreeNumber(@javax.annotation.Nullable final String value) {
        this._tollFreeNumber = value;
    }
    /**
     * Sets the tollFreeNumbers property value. List of toll-free numbers that are displayed in the meeting invite.
     * @param value Value to set for the tollFreeNumbers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTollFreeNumbers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tollFreeNumbers = value;
    }
    /**
     * Sets the tollNumber property value. The tollNumber property
     * @param value Value to set for the tollNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTollNumber(@javax.annotation.Nullable final String value) {
        this._tollNumber = value;
    }
    /**
     * Sets the tollNumbers property value. List of toll numbers that are displayed in the meeting invite.
     * @param value Value to set for the tollNumbers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTollNumbers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tollNumbers = value;
    }
}
