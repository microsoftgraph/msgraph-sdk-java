package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecordingInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The identities of the recording initiator. */
    private IdentitySet _initiator;
    /** The OdataType property */
    private String _odataType;
    /** The recordingStatus property */
    private RecordingStatus _recordingStatus;
    /**
     * Instantiates a new recordingInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecordingInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.recordingInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recordingInfo
     */
    @javax.annotation.Nonnull
    public static RecordingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordingInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecordingInfo currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("recordingStatus", (n) -> { currentObject.setRecordingStatus(n.getEnumValue(RecordingStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. The identities of the recording initiator.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this._initiator;
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
     * Gets the recordingStatus property value. The recordingStatus property
     * @return a recordingStatus
     */
    @javax.annotation.Nullable
    public RecordingStatus getRecordingStatus() {
        return this._recordingStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("recordingStatus", this.getRecordingStatus());
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
     * Sets the initiator property value. The identities of the recording initiator.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
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
     * Sets the recordingStatus property value. The recordingStatus property
     * @param value Value to set for the recordingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordingStatus(@javax.annotation.Nullable final RecordingStatus value) {
        this._recordingStatus = value;
    }
}
