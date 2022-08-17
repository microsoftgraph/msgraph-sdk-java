package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParticipantInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call. Read-only. */
    private String _countryCode;
    /** The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or skypeForBusinessVoipPhone. Read-only. */
    private EndpointType _endpointType;
    /** The identity property */
    private IdentitySet _identity;
    /** The language culture string. Read-only. */
    private String _languageId;
    /** The OdataType property */
    private String _odataType;
    /** The participant ID of the participant. Read-only. */
    private String _participantId;
    /** The home region of the participant. This can be a country, a continent, or a larger geographic region. This does not change based on the participant's current physical location. Read-only. */
    private String _region;
    /**
     * Instantiates a new participantInfo and sets the default values.
     * @return a void
     */
    public ParticipantInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.participantInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a participantInfo
     */
    @javax.annotation.Nonnull
    public static ParticipantInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantInfo();
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
     * Gets the countryCode property value. The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryCode() {
        return this._countryCode;
    }
    /**
     * Gets the endpointType property value. The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or skypeForBusinessVoipPhone. Read-only.
     * @return a endpointType
     */
    @javax.annotation.Nullable
    public EndpointType getEndpointType() {
        return this._endpointType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ParticipantInfo currentObject = this;
        return new HashMap<>(7) {{
            this.put("countryCode", (n) -> { currentObject.setCountryCode(n.getStringValue()); });
            this.put("endpointType", (n) -> { currentObject.setEndpointType(n.getEnumValue(EndpointType.class)); });
            this.put("identity", (n) -> { currentObject.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("languageId", (n) -> { currentObject.setLanguageId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("participantId", (n) -> { currentObject.setParticipantId(n.getStringValue()); });
            this.put("region", (n) -> { currentObject.setRegion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identity property value. The identity property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getIdentity() {
        return this._identity;
    }
    /**
     * Gets the languageId property value. The language culture string. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageId() {
        return this._languageId;
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
     * Gets the participantId property value. The participant ID of the participant. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParticipantId() {
        return this._participantId;
    }
    /**
     * Gets the region property value. The home region of the participant. This can be a country, a continent, or a larger geographic region. This does not change based on the participant's current physical location. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this._region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeEnumValue("endpointType", this.getEndpointType());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeStringValue("languageId", this.getLanguageId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("participantId", this.getParticipantId());
        writer.writeStringValue("region", this.getRegion());
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
     * Sets the countryCode property value. The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call. Read-only.
     * @param value Value to set for the countryCode property.
     * @return a void
     */
    public void setCountryCode(@javax.annotation.Nullable final String value) {
        this._countryCode = value;
    }
    /**
     * Sets the endpointType property value. The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or skypeForBusinessVoipPhone. Read-only.
     * @param value Value to set for the endpointType property.
     * @return a void
     */
    public void setEndpointType(@javax.annotation.Nullable final EndpointType value) {
        this._endpointType = value;
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     * @return a void
     */
    public void setIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this._identity = value;
    }
    /**
     * Sets the languageId property value. The language culture string. Read-only.
     * @param value Value to set for the languageId property.
     * @return a void
     */
    public void setLanguageId(@javax.annotation.Nullable final String value) {
        this._languageId = value;
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
     * Sets the participantId property value. The participant ID of the participant. Read-only.
     * @param value Value to set for the participantId property.
     * @return a void
     */
    public void setParticipantId(@javax.annotation.Nullable final String value) {
        this._participantId = value;
    }
    /**
     * Sets the region property value. The home region of the participant. This can be a country, a continent, or a larger geographic region. This does not change based on the participant's current physical location. Read-only.
     * @param value Value to set for the region property.
     * @return a void
     */
    public void setRegion(@javax.annotation.Nullable final String value) {
        this._region = value;
    }
}
