package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Fido2KeyRestrictions implements AdditionalDataHolder, Parsable {
    /** A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers. */
    private java.util.List<String> _aaGuids;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Enforcement type. Possible values are: allow, block. */
    private Fido2RestrictionEnforcementType _enforcementType;
    /** Determines if the configured key enforcement is enabled. */
    private Boolean _isEnforced;
    /**
     * Instantiates a new fido2KeyRestrictions and sets the default values.
     * @return a void
     */
    public Fido2KeyRestrictions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fido2KeyRestrictions
     */
    @javax.annotation.Nonnull
    public static Fido2KeyRestrictions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2KeyRestrictions();
    }
    /**
     * Gets the aaGuids property value. A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAaGuids() {
        return this._aaGuids;
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
     * Gets the enforcementType property value. Enforcement type. Possible values are: allow, block.
     * @return a fido2RestrictionEnforcementType
     */
    @javax.annotation.Nullable
    public Fido2RestrictionEnforcementType getEnforcementType() {
        return this._enforcementType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Fido2KeyRestrictions currentObject = this;
        return new HashMap<>(3) {{
            this.put("aaGuids", (n) -> { currentObject.setAaGuids(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("enforcementType", (n) -> { currentObject.setEnforcementType(n.getEnumValue(Fido2RestrictionEnforcementType.class)); });
            this.put("isEnforced", (n) -> { currentObject.setIsEnforced(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isEnforced property value. Determines if the configured key enforcement is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnforced() {
        return this._isEnforced;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aaGuids", this.getAaGuids());
        writer.writeEnumValue("enforcementType", this.getEnforcementType());
        writer.writeBooleanValue("isEnforced", this.getIsEnforced());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the aaGuids property value. A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     * @param value Value to set for the aaGuids property.
     * @return a void
     */
    public void setAaGuids(@javax.annotation.Nullable final java.util.List<String> value) {
        this._aaGuids = value;
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
     * Sets the enforcementType property value. Enforcement type. Possible values are: allow, block.
     * @param value Value to set for the enforcementType property.
     * @return a void
     */
    public void setEnforcementType(@javax.annotation.Nullable final Fido2RestrictionEnforcementType value) {
        this._enforcementType = value;
    }
    /**
     * Sets the isEnforced property value. Determines if the configured key enforcement is enabled.
     * @param value Value to set for the isEnforced property.
     * @return a void
     */
    public void setIsEnforced(@javax.annotation.Nullable final Boolean value) {
        this._isEnforced = value;
    }
}
