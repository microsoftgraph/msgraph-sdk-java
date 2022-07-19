package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessGrantControls implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice, domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue. */
    private java.util.List<String> _builtInControls;
    /** List of custom controls IDs required by the policy. To learn more about custom control, see Custom controls (preview). */
    private java.util.List<String> _customAuthenticationFactors;
    /** The OdataType property */
    private String _odataType;
    /** Defines the relationship of the grant controls. Possible values: AND, OR. */
    private String _operator;
    /** List of terms of use IDs required by the policy. */
    private java.util.List<String> _termsOfUse;
    /**
     * Instantiates a new conditionalAccessGrantControls and sets the default values.
     * @return a void
     */
    public ConditionalAccessGrantControls() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.conditionalAccessGrantControls");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessGrantControls
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessGrantControls createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessGrantControls();
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
     * Gets the builtInControls property value. List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice, domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBuiltInControls() {
        return this._builtInControls;
    }
    /**
     * Gets the customAuthenticationFactors property value. List of custom controls IDs required by the policy. To learn more about custom control, see Custom controls (preview).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCustomAuthenticationFactors() {
        return this._customAuthenticationFactors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessGrantControls currentObject = this;
        return new HashMap<>(5) {{
            this.put("builtInControls", (n) -> { currentObject.setBuiltInControls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("customAuthenticationFactors", (n) -> { currentObject.setCustomAuthenticationFactors(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("operator", (n) -> { currentObject.setOperator(n.getStringValue()); });
            this.put("termsOfUse", (n) -> { currentObject.setTermsOfUse(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
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
     * Gets the operator property value. Defines the relationship of the grant controls. Possible values: AND, OR.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperator() {
        return this._operator;
    }
    /**
     * Gets the termsOfUse property value. List of terms of use IDs required by the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTermsOfUse() {
        return this._termsOfUse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("builtInControls", this.getBuiltInControls());
        writer.writeCollectionOfPrimitiveValues("customAuthenticationFactors", this.getCustomAuthenticationFactors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operator", this.getOperator());
        writer.writeCollectionOfPrimitiveValues("termsOfUse", this.getTermsOfUse());
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
     * Sets the builtInControls property value. List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice, domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue.
     * @param value Value to set for the builtInControls property.
     * @return a void
     */
    public void setBuiltInControls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._builtInControls = value;
    }
    /**
     * Sets the customAuthenticationFactors property value. List of custom controls IDs required by the policy. To learn more about custom control, see Custom controls (preview).
     * @param value Value to set for the customAuthenticationFactors property.
     * @return a void
     */
    public void setCustomAuthenticationFactors(@javax.annotation.Nullable final java.util.List<String> value) {
        this._customAuthenticationFactors = value;
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
     * Sets the operator property value. Defines the relationship of the grant controls. Possible values: AND, OR.
     * @param value Value to set for the operator property.
     * @return a void
     */
    public void setOperator(@javax.annotation.Nullable final String value) {
        this._operator = value;
    }
    /**
     * Sets the termsOfUse property value. List of terms of use IDs required by the policy.
     * @param value Value to set for the termsOfUse property.
     * @return a void
     */
    public void setTermsOfUse(@javax.annotation.Nullable final java.util.List<String> value) {
        this._termsOfUse = value;
    }
}
