package com.microsoft.graph.models;

import com.microsoft.graph.models.IncomingCallOptions;
import com.microsoft.graph.models.OutgoingCallOptions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether to hide the app after the call is escalated. */
    private Boolean _hideBotAfterEscalation;
    /** Indicates whether content sharing notifications should be enabled for the call. */
    private Boolean _isContentSharingNotificationEnabled;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new callOptions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallOptions() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callOptions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callOptions
     */
    @javax.annotation.Nonnull
    public static CallOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.incomingCallOptions": return new IncomingCallOptions();
                case "#microsoft.graph.outgoingCallOptions": return new OutgoingCallOptions();
            }
        }
        return new CallOptions();
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
        final CallOptions currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("hideBotAfterEscalation", (n) -> { currentObject.setHideBotAfterEscalation(n.getBooleanValue()); });
            this.put("isContentSharingNotificationEnabled", (n) -> { currentObject.setIsContentSharingNotificationEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hideBotAfterEscalation property value. Indicates whether to hide the app after the call is escalated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideBotAfterEscalation() {
        return this._hideBotAfterEscalation;
    }
    /**
     * Gets the isContentSharingNotificationEnabled property value. Indicates whether content sharing notifications should be enabled for the call.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsContentSharingNotificationEnabled() {
        return this._isContentSharingNotificationEnabled;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hideBotAfterEscalation", this.getHideBotAfterEscalation());
        writer.writeBooleanValue("isContentSharingNotificationEnabled", this.getIsContentSharingNotificationEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the hideBotAfterEscalation property value. Indicates whether to hide the app after the call is escalated.
     * @param value Value to set for the hideBotAfterEscalation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideBotAfterEscalation(@javax.annotation.Nullable final Boolean value) {
        this._hideBotAfterEscalation = value;
    }
    /**
     * Sets the isContentSharingNotificationEnabled property value. Indicates whether content sharing notifications should be enabled for the call.
     * @param value Value to set for the isContentSharingNotificationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsContentSharingNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isContentSharingNotificationEnabled = value;
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
}
