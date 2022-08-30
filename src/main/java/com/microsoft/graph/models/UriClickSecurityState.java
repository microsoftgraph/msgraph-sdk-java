package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UriClickSecurityState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The clickAction property */
    private String _clickAction;
    /** The clickDateTime property */
    private OffsetDateTime _clickDateTime;
    /** The id property */
    private String _id;
    /** The OdataType property */
    private String _odataType;
    /** The sourceId property */
    private String _sourceId;
    /** The uriDomain property */
    private String _uriDomain;
    /** The verdict property */
    private String _verdict;
    /**
     * Instantiates a new uriClickSecurityState and sets the default values.
     * @return a void
     */
    public UriClickSecurityState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.uriClickSecurityState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uriClickSecurityState
     */
    @javax.annotation.Nonnull
    public static UriClickSecurityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UriClickSecurityState();
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
     * Gets the clickAction property value. The clickAction property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClickAction() {
        return this._clickAction;
    }
    /**
     * Gets the clickDateTime property value. The clickDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClickDateTime() {
        return this._clickDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UriClickSecurityState currentObject = this;
        return new HashMap<>(7) {{
            this.put("clickAction", (n) -> { currentObject.setClickAction(n.getStringValue()); });
            this.put("clickDateTime", (n) -> { currentObject.setClickDateTime(n.getOffsetDateTimeValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
            this.put("uriDomain", (n) -> { currentObject.setUriDomain(n.getStringValue()); });
            this.put("verdict", (n) -> { currentObject.setVerdict(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
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
     * Gets the sourceId property value. The sourceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the uriDomain property value. The uriDomain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUriDomain() {
        return this._uriDomain;
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerdict() {
        return this._verdict;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clickAction", this.getClickAction());
        writer.writeOffsetDateTimeValue("clickDateTime", this.getClickDateTime());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("uriDomain", this.getUriDomain());
        writer.writeStringValue("verdict", this.getVerdict());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the clickAction property value. The clickAction property
     * @param value Value to set for the clickAction property.
     * @return a void
     */
    public void setClickAction(@javax.annotation.Nullable final String value) {
        this._clickAction = value;
    }
    /**
     * Sets the clickDateTime property value. The clickDateTime property
     * @param value Value to set for the clickDateTime property.
     * @return a void
     */
    public void setClickDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._clickDateTime = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the sourceId property value. The sourceId property
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the uriDomain property value. The uriDomain property
     * @param value Value to set for the uriDomain property.
     * @return a void
     */
    public void setUriDomain(@javax.annotation.Nullable final String value) {
        this._uriDomain = value;
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     * @return a void
     */
    public void setVerdict(@javax.annotation.Nullable final String value) {
        this._verdict = value;
    }
}
